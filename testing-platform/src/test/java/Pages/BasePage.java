package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;
    protected static final String HOMEPAGE_URL = "http://www.emag.ro/homepage";
    public static final String HOMEPAGE_TITLE = "eMAG.ro - Libertate în fiecare zi";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isOpened() {
        return false;
    }

    public void moveToElement(WebElement element) {
        ((JavascriptExecutor) driver)
            .executeScript("arguments[0].scrollIntoView();", element);
    }
}
