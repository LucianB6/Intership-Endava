package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
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

    public CartPage(WebDriver driver) {
        super(driver);
    }

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
}
