package selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

    WebDriver driver;

    @Test
    public void testChrome() {
        System.setProperty("webdriver.chrome.driver", "./src/main/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.yahoo.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
