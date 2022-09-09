package scenarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class T1_DriversTest {
    @Test
    public void testChromeDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/test/java/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.todaysoftmag.ro/");
        Assertions.assertEquals("Today Software Magazine",driver.getTitle(), "The text is not the expected one");
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
    @Test
    public void testEdgeDriver() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./src/test/java/resources/edgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.todaysoftmag.ro/");
        Assertions.assertEquals("Today Software Magazine", webDriver.getTitle(), "The text is not expected");
        Thread.sleep(2000);
        webDriver.close();
        webDriver.quit();
    }

    @Test
    public void testFireFoxDriver() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "./src/test/java/resources/geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.todaysoftmag.ro/");
        Assertions.assertEquals("Today Software Magazine", webDriver.getTitle(), "This title is not expected");
        Thread.sleep(1000);
        webDriver.close();
        webDriver.quit();
    }
}
