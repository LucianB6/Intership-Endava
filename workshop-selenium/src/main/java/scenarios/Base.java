package scenarios;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Base {

  public static WebDriver driver;

  @BeforeAll
  public static void baseBeforeClass() {
    System.setProperty("webdriver.chrome.driver", "./src/test/java/resources/chromedriver.exe");
    WebDriverManager.chromedriver().setup();
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--window-size=1920,1080", "--disable-extensions", "--incognito");
    driver = new ChromeDriver(chromeOptions);

//    WebDriverManager.edgedriver().setup();
//    EdgeOptions edgeOptions = new EdgeOptions();
//    edgeOptions.addArguments("--window-size=1920,1080", "--disable-extensions", "--incognito");
//    driver = new EdgeDriver(edgeOptions);
  }

  @AfterEach
  public void baseAfter() {
    driver.close();
  }

  @AfterAll
  public static void baseAfterClass() {
    driver.quit();
  }
}
