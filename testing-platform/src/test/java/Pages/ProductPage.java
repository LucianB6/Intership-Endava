package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    @FindBy(css = "div.product-page-actions .flex-item button.add-to-favorites")
    private WebElement adaugaLaFavorite;

    @FindBy(css = "#main-container > section:nth-child(1) > div > div.row.product-main-area.mrg-btm-xs > div.col-sm-5.col-md-8.col-lg-8 > div > div.row.highlights-container > div:nth-child(2) > form > div > div.product-highlight.product-page-actions.js-product-page-actions > div.product-buy-area-wrapper > div:nth-child(1) > button")
    private WebElement adaugaInCos;

    @FindBy(css = "body > div.ph-modal.modal.fade.product-purchased-modal.modal-version-.in > div > div > div.modal-body.modal-content-extra-padding.pad-sep-xs.hidden-xs > div > div.table-cell.col-xs-12.col-sm-2.col-md-2.hidden-xs.hidden-sm > a")
    private WebElement veziDetalii;

    @FindBy(xpath = "//*[@id=\"my_cart\"]")
    private WebElement cosDeCumparaturi;

    @FindBy(xpath = "//*[@id=\"vendorsContainer\"]/div/div[2]/div/div[1]/span[2]/span[1]")
    private WebElement pretProdusIntreg;

    @FindBy(xpath = "//*[@id=\"vendorsContainer\"]/div/div[1]/div/div[2]/div[1]/div[3]/div/p[2]/sup")
    private WebElement pretProdusDecimal;

    @FindBy(xpath = "//*[@id=\"vendorsContainer\"]/div/div[2]/div/div[2]/span[2]/span[1]")
    private WebElement pretTaxeIntreg;

    @FindBy(xpath = "//*[@id=\"vendorsContainer\"]/div/div[2]/div/div[2]/span[2]/sup")
    private WebElement pretTaxeDecimal;

    @FindBy(xpath = "//*[@id=\"vendorsContainer\"]/div/div[2]/div/div[3]/span[2]/span[1]")
    private WebElement pretSiteIntreg;

    @FindBy(xpath = "//*[@id=\"vendorsContainer\"]/div/div[2]/div/div[3]/span[2]/sup")
    private WebElement pretSiteDecimal;

    public double productCost(){
        String value1 = pretProdusIntreg.getText().replace(".","");
        String value2 = pretProdusDecimal.getText().replace(",","");
        String pretProdusFinal = value1 + "." + value2;

        return Double.parseDouble(pretProdusFinal);
    }

    public double productTaxes(){
        String valueT1 = pretTaxeIntreg.getText().replace(".","");
        String valueT2 = pretTaxeDecimal.getText().replace(",","");
        String pretTaxaFinal = valueT1 + "." + valueT2;

        return Double.parseDouble(pretTaxaFinal);
    }

    public double productTrue(){
        String value1 = pretSiteIntreg.getText().replace(".","");
        String value2 = pretSiteDecimal.getText().replace(",","");
        String pretSiteFinal = value1 + "." + value2;

        return Double.parseDouble(pretSiteFinal);
    }

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasAdaugaLaFavorite() {
        return adaugaLaFavorite.isDisplayed();
    }

    public ProductPage navigateToCart(){
        adaugaInCos.click();
        return PageFactory.initElements(driver, ProductPage.class);
    }

    public CartPage seeDetails(){
        veziDetalii.click();
        return PageFactory.initElements(driver, CartPage.class);
    }
}
