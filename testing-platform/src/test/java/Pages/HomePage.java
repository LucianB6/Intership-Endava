package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(css = "ul.megamenu-list li.megamenu-list-department ~ li a")
    private WebElement laptopsTableteTelefoane;

    @FindBy(css = "aside.emg-menu-wrapper ul.emg-aside-links li a")
    private WebElement laptopuriSiAaccesorii;

    @FindBy(css = "aside.emg-menu-wrapper ul.emg-aside-links li a")
    private WebElement laptopuri;

    @FindBy(id = "searchboxTrigger")
    private WebElement search;

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(BasePage.HOMEPAGE_URL);
        driver.manage().window().maximize();
    }


    public LaptopPage goToLaptops() {
        laptopsTableteTelefoane.click();
        laptopuriSiAaccesorii.click();
        laptopuri.click();
        return PageFactory.initElements(driver, LaptopPage.class);
    }

    public SearchPage searchFor(String text) {
        search.sendKeys(text);
        search.sendKeys(Keys.ENTER);
        return PageFactory.initElements(driver, SearchPage.class);
    }

    @Override
    public boolean isOpened() {
        return search.isDisplayed();
    }
}
