package scenarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T3_FindElementsTest extends Base {

  public static WebDriver driver1;

  @Test
  public void testFindElements() throws InterruptedException {
    driver.get("https://www.todaysoftmag.ro/");

    WebElement elementById = driver.findElement(By.id("search"));
    elementById.click();
    elementById.sendKeys("Selenium");
    Thread.sleep(3000);

    elementById.sendKeys(Keys.ENTER);
    Thread.sleep(3000);

    WebElement title = driver.findElement(By.cssSelector("h1>span"));
    assertEquals("Selenium", title.getText(), "Title is not the expected one.");
  }

  @Test
  public void testSearchEdge(){
    WebDriverManager.edgedriver().setup();
    EdgeOptions edgeOptions = new EdgeOptions();
    driver1 = new EdgeDriver(edgeOptions);

    driver1.get("https://www.todaysoftmag.ro/");

    //cautam searchBarul dupa cssSelector
    WebElement element = driver1.findElement(RelativeLocator.with(By.cssSelector("#search")));

    element.click();

    WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(4));

    element.sendKeys("Selenium");

    element.sendKeys(Keys.ENTER);

    WebElement title = driver1.findElement(By.cssSelector("h1>span"));
    assertEquals("Selenium", title.getText(), "Title is not the expected one.");

    driver1.close();
    driver1.quit();
  }

  @Test
  public void testFindElementsRelativeLocators() {
    driver.get("https://www.todaysoftmag.ro/");

    WebElement elementByRelativeLocator = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.cssSelector(".lang_sel.current")));
    elementByRelativeLocator.click();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.urlToBe("https://www.todaysoftmag.com/"));

    assertEquals("https://www.todaysoftmag.com/", driver.getCurrentUrl());
  }
}
