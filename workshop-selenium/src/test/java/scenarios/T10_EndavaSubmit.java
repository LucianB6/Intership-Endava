package scenarios;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T10_EndavaSubmit extends Base{
    @Test
    public void bonus() throws InterruptedException {
        driver.get("https://www.endava.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        WebElement mail = driver.findElement(By.xpath("//*[@id=\"contact-buttons\"]/ul/li[1]/a"));
        mail.click();

        WebElement circle1 = driver.findElement(By.id("LblmktoRadio_4798_0"));
        circle1.click();

        WebElement circle2 = driver.findElement(By.id("LblmktoRadio_4798_1"));
        circle2.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName")));
        WebElement firstName = driver.findElement(By.id("FirstName"));
        Utils.highlightElement(driver,firstName);

        firstName.sendKeys("Lucian");

        WebElement lastName = driver.findElement(By.id("LastName"));

        lastName.sendKeys("Baciu");

        WebElement email = driver.findElement(By.id("Email"));

        email.sendKeys("lucianbaciu2@gmail.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("MobilePhone")));
        WebElement phone = driver.findElement(By.id("MobilePhone"));

        phone.sendKeys("078986285");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("new_companyname")));
        WebElement company = driver.findElement(By.id("new_companyname"));

        company.sendKeys("Endava");

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mktoForm_1291\"]/div[3]/div[3]/div[2]/div[2]/div[1]")));
        WebElement country = driver.findElement(By.xpath("//*[@id=\"mktoForm_1291\"]/div[3]/div[3]/div[2]/div[2]/div[1]"));
        country.click();
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//*[@id=\"mCSB_2_container\"]/ul/li[1]")));
        WebElement country2 = driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/ul/li[1]"));
        country2.click();
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mktoForm_1291\"]/div[5]/div[1]/div[2]/div[2]/div[1]/span[1]")));
        WebElement jobTitle = driver.findElement(By.xpath("//*[@id=\"mktoForm_1291\"]/div[5]/div[1]/div[2]/div[2]/div[1]/span[1]"));
        jobTitle.click();
        Thread.sleep(2000);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mCSB_3_container\"]/ul/li[10]")));
        WebElement titleJob = driver.findElement(By.xpath("//*[@id=\"mCSB_3_container\"]/ul/li[3]"));
        titleJob.click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formCustomMessage")));
        WebElement message = driver.findElement(By.id("formCustomMessage"));
        message.sendKeys("Sper sa va uitati cat de curand");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mktoForm_1291\"]/div[7]/div[1]/div[1]/div[2]/div[2]")));
        WebElement casuta1 = driver.findElement(By.xpath("//*[@id=\"mktoForm_1291\"]/div[7]/div[1]/div[1]/div[2]/div[2]"));
        casuta1.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mktoForm_1291\"]/div[7]/div[2]/div[1]/div[2]/div[2]")));
        WebElement casuta2 = driver.findElement(By.xpath("//*[@id=\"mktoForm_1291\"]/div[7]/div[2]/div[1]/div[2]/div[2]"));
        casuta2.click();

    }
}
