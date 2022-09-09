package scenarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T7_AlertsAndFramesTest extends Base {

    private static WebDriver driver1;
    @Test
    public void testAlerts() throws InterruptedException {
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        driver.findElement(By.id("cookieChoiceDismiss")).click();

        WebElement button = driver.findElement(By.id("alertBox"));
        Utils.highlightElement(driver, button);
        button.click();

        Alert simpleAlert  = driver.switchTo().alert();
        assertEquals(simpleAlert.getText(), "I am an alert box!");
        Thread.sleep(3000);

        simpleAlert.accept();
        Thread.sleep(2000);
    }

    @Test
    public void confirmPopOut() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        WebElement button = driver.findElement(By.id("confirmBox"));
        Utils.highlightElement(driver, button);
        button.click();

        Alert simpleAlert  = driver.switchTo().alert();
        assertEquals(simpleAlert.getText(), "Press a button!");
        Thread.sleep(3000);


        simpleAlert.accept();

    }

    @Test
    public void promptBox() throws InterruptedException {

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        WebElement cookies = driver.findElement(By.id("cookieChoiceDismiss"));
        cookies.click();

        WebElement button = driver.findElement(By.id("promptBox"));
        Utils.highlightElement(driver, button);
        button.click();

        Alert simpleAlert  = driver.switchTo().alert();
        assertEquals(simpleAlert.getText(), "Please enter your name:");
        Thread.sleep(2000);

        simpleAlert.sendKeys("Lucian Baciu");//daca scriem doar numele, avem test failed
        Thread.sleep(1000);

        simpleAlert.accept();
        Thread.sleep(5000);

        WebElement result = driver.findElement(By.id("output"));

        assertEquals(result.getText(), "You entered text Lucian Baciu in propmt popup");
        Thread.sleep(1000);
    }

    @Test
    public void testFrames() throws InterruptedException {
        driver.get("https://jsfiddle.net/westonruter/6mSuK/");
        Thread.sleep(5000);

        driver.switchTo().frame("result").switchTo().frame(0);

        WebElement searchIcon = driver.findElement(By.cssSelector("a[class*='search-toggle']"));
        searchIcon.click();

        WebElement element = driver.findElement(By.name("search"));
        Utils.highlightElement(driver, element);
        Thread.sleep(2000);


        WebElement elementReloaded = driver.findElement(By.name("search"));
        elementReloaded.sendKeys("SOFTWARE TESTING");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
    }
}
