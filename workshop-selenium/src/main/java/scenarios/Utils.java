package scenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

  static void scrollDown(WebDriver driver, int pixels) throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0," + pixels + ")");
    Thread.sleep(2000);
  }

  public static void highlightElement(WebDriver driver, WebElement... elements) throws InterruptedException {
    for (WebElement element : elements) {
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].style.border='2px solid red'", element);
    }
    Thread.sleep(2000);
  }
}
