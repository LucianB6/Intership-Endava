package scenarios;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T8_WaitsTest extends Base {

    @Test
    public void testWaits() throws InterruptedException {
        driver.get("https://www.endava.com/en/Contact");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        WebElement burger = driver.findElement(By.xpath("//*[@id=\"menu-toggle\"]/span"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-toggle\"]/span")));
        burger.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-input")));
        WebElement search= driver.findElement(By.id("search-input"));

        search.sendKeys("Jobs");
        search.sendKeys(Keys.ENTER);

        Assertions.assertEquals("Jobs","Jobs");
    }

}
