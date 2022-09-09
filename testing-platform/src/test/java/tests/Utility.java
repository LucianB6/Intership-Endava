package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {


    //create account on Emag; test case(2) for saving an item(laptop) in wish list

    public static WebDriver driver;
    public static String currentDirectoryPath = System.getProperty("user.dir");

    public static WebDriver getInstance(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", currentDirectoryPath + "\\src\\main\\java\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void tearDown(){
        driver.quit();
    }
}
