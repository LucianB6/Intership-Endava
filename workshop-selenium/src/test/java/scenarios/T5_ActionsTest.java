package scenarios;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class T5_ActionsTest extends Base {

    @Test
    public void testHover() throws InterruptedException {
        driver.get("https://www.endava.com");

        Thread.sleep(3000);
        WebElement acceptAllCookiesBtn = driver.findElement(By.id("onetrust-accept-btn-handler"));
        acceptAllCookiesBtn.click();

        WebElement element = driver.findElement(By.id("selected-lang"));
        Utils.highlightElement(driver, element);
        Thread.sleep(2000);

        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        Thread.sleep(2000);
    }

    @Test
    public void testDragAndDrop() throws InterruptedException {
        driver.get("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
        Thread.sleep(3000);
        Utils.scrollDown(driver, 400);
        WebElement frameId = driver.findElement(By.xpath("//iframe[@class='js-iframe active']"));
        driver.switchTo().frame(frameId);
        WebElement from = driver.findElement(
            By.cssSelector("#treeSource > ul > li:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(4) > div > span"));
        WebElement to = driver.findElement(By.xpath("//*[@id=\"treeTarget\"]"));
        Utils.highlightElement(driver, from, to);

        Actions action = new Actions(driver);
        action.dragAndDrop(from, to);
        action.build().perform();
        Thread.sleep(2000);
    }
}
