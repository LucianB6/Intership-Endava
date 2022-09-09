package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BasicSelenium extends Utility {

    @BeforeClass
    public void openPage() {
        Utility.getInstance();
        System.out.println("S1. Open Emag");
        driver.get("https://www.emag.ro/homepage");
        driver.manage().window().maximize();
        System.out.println("R1. Page is opened");
        Assert.assertEquals(driver.getTitle(), "eMAG.ro - Libertate în fiecare zi", "Emag Page Is Opened");
    }

    @Test
    public void testCase1() {

        System.out.println("S2. Go To Laptops and accessories ");
        // WebElement laptopTableteTelefoane = driver.findElement();
        WebElement laptopTableteTelefoane =
            driver.findElement(By.xpath("//span[text()='Laptop, Tablete & Telefoane']"));
        laptopTableteTelefoane.click();
        new WebDriverWait(driver, 5)
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Laptopuri si accesorii']")));
        driver.findElement(By.xpath("//a[text()='Laptopuri si accesorii']")).click();

        System.out.println("R2. Laptop and accessories page is opened");
        Assert.assertEquals("Laptopuri si accesorii - eMAG.ro", driver.getTitle(),
            "Laptop and accessories page is opened");

        System.out.println("S3. Go To Laptops");
        WebElement laptops = driver.findElement(By.xpath("//a[text()='Laptopuri']"));
        laptops.click();

        System.out.println("R3. Laptop page is opened");
        // verify the page is opened
        Assert.assertEquals(driver.getTitle(), "Laptopuri - eMAG.ro", "Laptop Page title is correct");

        System.out.println("S4. Click a laptop");
        driver.findElement(By.cssSelector("#card_grid a img")).click();

        System.out.println("R4. “Adauga la Favorite” button is displayed");
        // verify the button is displayed
        WebElement addToFavoritesButton = driver.findElement(By.cssSelector(".flex-item button.add-to-favorites"));
        Assert.assertTrue("Button is displayed", addToFavoritesButton.isDisplayed());
    }

    @Test
    public void testCase2() {

    }


    @AfterClass
    public void tearDown() {
        super.tearDown();
    }
}
