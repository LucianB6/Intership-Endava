package Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchPage extends BasePage {

    @FindBy(xpath = "//*[@id='card_grid']/div[1]")
    private WebElement anItem;

    @FindBy(xpath = "//div[contains(@class, 'listing-sorting-dropdown')]/ul")
    private WebElement sortingList;

    @FindBy(xpath = "//div[contains(@class, 'listing-sorting-dropdown')]/ul/li[@class= ' active']/a")
    private WebElement sortingListActive;

    @FindBy(xpath = "//div[contains(@class,'sort-control-btn-dropdown hidden-xs')]/button[contains(@class, 'btn btn-sm btn-alt sort-control-btn')]")
    private WebElement sortDropdownBtn;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return sortingList.isDisplayed();
    }

    public boolean isSelected(String text) {
        return sortingListActive.getAttribute("data-sort-dir").contains(text);
    }

    public ProductPage clickAnItem() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(anItem));
        new Actions(driver).moveToElement(anItem).doubleClick().build().perform();
//        anItem.click();
        return PageFactory.initElements(driver, ProductPage.class);
    }

    public SearchPage sortBy(String text) {
        sortDropdownBtn.click();
        List<WebElement> optionsList = sortingList.findElements(By.tagName("li"));
        for (WebElement li : optionsList) {
            if (li.getText().contains(text)) {
                li.click();
            }
        }
        return PageFactory.initElements(driver, SearchPage.class);
    }
}
