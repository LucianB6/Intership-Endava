package scenarios;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class T4_GetInfoTest extends Base {

    @Test
    public void testElementInfo()  throws InterruptedException {
        driver.get("https://www.todaysoftmag.ro/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".lang_sel.current")));

        WebElement element = driver.findElement(By.cssSelector(".lang_sel.current"));
        assertEquals(element.getText(), "RO");

        Utils.highlightElement(driver, element);

        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
    }
}
