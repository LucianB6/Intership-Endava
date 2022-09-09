package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LaptopPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"card_grid\"]/div[1]")
    private WebElement firstLaptop;

    @FindBy(xpath = "//*[@id=\"card_grid\"]/div[1]/div/div/div[3]/a")
    private WebElement firstXbox;

    public LaptopPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage clickOnLaptop() {
        moveToElement(firstLaptop);
        firstLaptop.click();
        return PageFactory.initElements(driver, ProductPage.class);
    }

    @Override
    public boolean isOpened() {
        return firstLaptop.isDisplayed();
    }
}
