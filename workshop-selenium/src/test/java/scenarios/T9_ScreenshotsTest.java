package scenarios;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import org.openqa.selenium.WebElement;

public class T9_ScreenshotsTest extends Base {

    @Test
    public void testFileScreenshot() throws Exception {
        driver.get("https://endava.com");
        try {
            driver.findElement(By.id("invalid"));
        }
        catch (Exception e) {
            File myScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(myScreenshotFile, new File("c:/temp/fileScreenshot.png"));
        }
    }

    @Test
    public void testElementScreenshot() throws Exception {
        driver.get("https://www.todaysoftmag.ro/");
        WebElement logo = driver.findElement(By.className("logo"));

        File elementScreenshot = logo.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(elementScreenshot, new File("c:/temp/elementScreenshot.png"));

    }
}
