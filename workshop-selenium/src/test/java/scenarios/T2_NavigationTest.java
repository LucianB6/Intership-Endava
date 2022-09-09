package scenarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class T2_NavigationTest extends Base {

    public static WebDriver driver1;
    @Test
    public void testNavigation() throws InterruptedException {
        driver.get("https://www.todaysoftmag.ro/");
        assertEquals("Today Software Magazine",driver.getTitle());

        driver.get("https://www.unilever.com/");
        driver.navigate().back();
        Thread.sleep(2000);

        driver.manage().window().setSize(new Dimension(500, 500));
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void testNavigationEdge() throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080", "--disable-extensions", "--incognito");
        driver1 = new EdgeDriver(edgeOptions);

        driver1.get("https://www.todaysoftmag.ro/");
        assertEquals("Today Software Magazine",driver1.getTitle());

        Thread.sleep(1000);

        driver1.get("https://www.unilever.com/");
        driver1.navigate().back();
        Thread.sleep(1000);

        driver1.get("https://www.browserstack.com/guide/run-selenium-tests-using-firefox-driver");
        driver1.navigate().forward();
        Thread.sleep(1000);

        driver1.navigate().refresh();
        Thread.sleep(1000);


        driver1.close();
        driver1.quit();

    }
}
