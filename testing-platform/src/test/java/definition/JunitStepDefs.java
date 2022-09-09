package definition;

import Pages.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class JunitStepDefs {

    public WebDriver driver;
    private HomePage homePage;
    private ProductPage productPage;
    private LaptopPage laptopPage;
    private SearchPage searchPage;

    private CartPage cartPage;

    private XboxPage xboxPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/main/java/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.setHeadless(true);
        driver = new ChromeDriver(chromeOptions);

//        System.setProperty("webdriver.gecko.driver", "./src/main/java/resources/geckodriver.exe");
//        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("^that i am on emag page$")
    public void thatIAmOnEmagPage() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue("Emag Page Is Opened", homePage.isOpened());
    }

    @When("^I search for \"([^\"]*)\" text")
    public void iSearchFor(String stringText) {
        searchPage = homePage.searchFor(stringText);
    }

    @When("^I see the details for a laptop$")
    public void iSeeTheDetailsForALaptop() {
        driver.findElement(By.id("imgb1222671")).click();
    }

    @When("^I go to the Laptops page")
    public void iGoToTheLaptopsPage() {
        laptopPage = homePage.goToLaptops();
        Assert.assertEquals("Laptop Page title is correct", laptopPage.isOpened(), true);
    }

    @And("^I click on the first item")
    public void iClickOnTheFirstItem() {
        productPage = searchPage.clickAnItem();
    }

    @And("^I click on the first laptop")
    public void iClickOnTheFirstLaptop() {
        productPage = laptopPage.clickOnLaptop();
    }

    @Then("^The Item Page will display the \"([^\"]*)\" button")
    public void theItemPageWillDisplayTheButton(String arg0) {
        Assert.assertTrue(arg0 + " button is displayed", productPage.hasAdaugaLaFavorite());
    }

    @When("^I order the results by \"([^\"]*)\"")
    public void iOrderTheResultsBy(String text) {
        searchPage = searchPage.sortBy(text);
        searchPage.isOpened();
    }

    @Then("^Order list was changed$")
    public void orderListWasChanged() {
        Assert.assertTrue("Selected option is correct", searchPage.isSelected("desc"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @And("^I click on adauga in cos")
    public void iClickOn(){
        productPage.navigateToCart();
    }

    @Then("^The page will display the total price$")
    public void thePageWillDiplayTheTotalPrice() {
        double sum = cartPage.productCost() + cartPage.productTaxes();
        Assert.assertEquals(sum, cartPage.productTrue(), 0.0001d);
    }

    @And("^I click on the first xbox$")
    public void iClickOnTheFirstXbox() {
        productPage = xboxPage.clickOnXbox();
    }

    @And("^I click on see details$")
    public void iClickOnSeeDetails() {
        cartPage = productPage.seeDetails();
    }
}
