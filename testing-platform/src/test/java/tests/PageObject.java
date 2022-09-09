package tests;


import Pages.HomePage;
import Pages.LaptopPage;
import Pages.ProductPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageObject extends tests.Utility {
    HomePage homePage;

    @BeforeClass
    public void openPage() {
        super.getInstance();
        System.out.println("S1. Open Emag");
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.manage().window().maximize();
        System.out.println("R1. Page is opened");
        Assert.assertTrue(homePage.isOpened(), "Emag Page Is Opened");
    }

    @Test
    public void testCase1() {
        System.out.println("S2. Go To Laptops");
        LaptopPage laptops = homePage.goToLaptops();

        System.out.println("R2. Laptop page is opened");
        //verify the page is opened
        Assert.assertTrue(laptops.isOpened(), "Laptop page should be open.");

        System.out.println("S3. Click a laptop");
        ProductPage itemPage = laptops.clickOnLaptop();

        System.out.println("R3. “Adauga la Favorite” button is displayed");
        //verify the button is displayed
        Assert.assertTrue(itemPage.hasAdaugaLaFavorite(), "Button should be displayed.");
    }

    @Test
    public void testCase2() {

    }

    @AfterClass
    public void tearDown() {
        super.tearDown();
    }

}
