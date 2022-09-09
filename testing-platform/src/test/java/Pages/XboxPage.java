package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XboxPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"card_grid\"]/div[1]/div/div/div[3]/a")
    private WebElement firstXbox;

    @FindBy(xpath = "//*[@id=\"main-container\"]/section[1]/div/div[2]/div[2]/div/div[2]/div[2]/form/div/div[3]/div[2]/div[1]/button")
    private WebElement adaugaInCos;

    @FindBy(xpath = "/html/body/div[14]/div/div/div[2]/div/div[3]/a")
    private WebElement cosDeCumparaturi;


    public XboxPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage clickOnXbox(){
        moveToElement(firstXbox);
        firstXbox.click();
        return PageFactory.initElements(driver, ProductPage.class);
    }
//    public CartPage navigareSpreCos(){
//        adaugaInCos.click();
//        cosDeCumparaturi.click();
//        return PageFactory.initElements(driver, CartPage.class);
//    }

    @Override
    public boolean isOpened(){
        return firstXbox.isDisplayed();
    }
}
