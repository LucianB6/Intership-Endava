package scenarios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class T6_CheckboxAndSelectTest extends Base {

    @Test
    public void testCheckbox() throws InterruptedException {
        driver.get("https://www.w3schools.com/howto/howto_css_custom_checkbox.asp");

        Thread.sleep(3000);
        WebElement acceptAllBtn = driver.findElement(By.id("accept-choices"));
        acceptAllBtn.click();

        WebElement firstCheckBox = driver.findElement(By.xpath("//div[@class='w3-row']//input[@type='checkbox'][1]"));
        WebElement secondCheckBox = driver.findElement(By.xpath("//div[@class='w3-row']//input[@type='checkbox'][2]"));
        assertTrue(firstCheckBox.isSelected());
        assertFalse(secondCheckBox.isSelected());
        Thread.sleep(2000);

        secondCheckBox.click();
        assertTrue(secondCheckBox.isSelected());
        Thread.sleep(2000);
    }

    @Test
    public void testDropDown() throws InterruptedException {
        driver.get("https://www.w3schools.com/howto/howto_custom_select.asp");

        Thread.sleep(3000);
        WebElement acceptAllBtn = driver.findElement(By.id("accept-choices"));
        acceptAllBtn.click();

        WebElement element = driver.findElement(By.tagName("select"));
        Utils.highlightElement(driver, element);

        Select dropDown = new Select(element);
        dropDown.selectByVisibleText("Ford");
        Thread.sleep(2000);
    }
}
