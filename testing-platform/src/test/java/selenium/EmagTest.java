package selenium;


import Pages.CartPage;
import Pages.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;


public class EmagTest {

    WebDriver driver;
    CartPage cartPage;
    HomePage homePage;

    @Before
    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "./src/main/java/resources/chromedriver.exe");
//        driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "./src/main/java/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyPrice() {

        driver.get("http://www.emag.ro");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchboxTrigger")));

        WebElement searchBox = driver.findElement(By.id("searchboxTrigger"));
        searchBox.sendKeys("iphone 13");
        searchBox.submit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#card_grid > div a img")));

        WebElement iphoneImage = driver.findElement(By.cssSelector("#card_grid > div a img"));
        iphoneImage.click();

        WebElement iphonePrice = driver.findElement(By.xpath("(.//*[@class='product-new-price'])[2]"));
        System.out.println(iphonePrice.getText());
        assertTrue(iphonePrice.getText().contains(" Lei"));
    }

    @Test
    public void verifyPriceXbox(){

        driver.get("http://www.emag.ro");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchboxTrigger")));

        WebElement searchBox = driver.findElement(By.id("searchboxTrigger"));
        searchBox.sendKeys("Xbox");
        searchBox.submit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"card_grid\"]/div[1]/div/div/div[4]/div[2]/form/button")));

        WebElement xboxImg = driver.findElement(By.xpath("//*[@id=\"card_grid\"]/div[1]/div/div/div[4]/div[2]/form/button"));
        xboxImg.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.ph-modal.modal.fade.product-purchased-modal.modal-version-.in > div > div > div.modal-header > button")));

        WebElement closePage = driver.findElement(By.cssSelector("body > div.ph-modal.modal.fade.product-purchased-modal.modal-version-.in > div > div > div.modal-header > button"));
        closePage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("my_cart")));

        WebElement cart = driver.findElement(By.id("my_cart"));
        cart.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vendorsContainer\"]/div/div[1]/div/div[2]/div[1]/div[3]/div/p[2]/span[1]")));
        WebElement integer = driver.findElement(By.xpath("//*[@id=\"vendorsContainer\"]/div/div[1]/div/div[2]/div[1]/div[3]/div/p[2]/span[1]"));
        WebElement decimal = driver.findElement(By.xpath("//*[@id=\"vendorsContainer\"]/div/div[1]/div/div[2]/div[1]/div[3]/div/p[2]/sup"));

        WebElement integerTaxes = driver.findElement(By.xpath("//*[@id=\"vendorsContainer\"]/div/div[2]/div/div[2]/span[2]/span[1]"));
        WebElement decimalTaxes = driver.findElement(By.xpath("//*[@id=\"vendorsContainer\"]/div/div[2]/div/div[2]/span[2]/sup"));
        WebElement total = driver.findElement(By.xpath("//*[@id=\"vendorsContainer\"]/div[1]/div[2]/div/div[3]/span[2]"));

        String value1 = integer.getText().replace("Lei","").replace(".","");//1499,00
        String value2 = decimal.getText().replace("Lei","").replace(",","");//1.49900
        String value3 = value1 + "." + value2;
        double priceProduct = Double.parseDouble(value3);

        String valueTax1 = integerTaxes.getText().replace("Lei","").replace(".","");
        String valueTax2 = decimalTaxes.getText().replace("Lei","").replace(",","");
        String valueTax3 = valueTax1 + "." + valueTax2;
        double taxProduct = Double.parseDouble(valueTax3);

        String result = total.getText();
        double taxTotal = Double.parseDouble(result.replace("Lei", "").replace(".","").replace(",","."));


        double sum = priceProduct + taxProduct;
        Assert.assertEquals(sum, taxTotal, 0.00001d);

    }

    @Test
    public void verificareCalculProdus(){
        homePage.searchFor("Xbox");
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
