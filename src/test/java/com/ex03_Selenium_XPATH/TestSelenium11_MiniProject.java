package com.ex03_Selenium_XPATH;

import com.utils.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium11_MiniProject extends CommonToAll {

    @Description("Verify login is working")
    @Severity(SeverityLevel.CRITICAL)
    @Test

    public void test_OHRM_login() throws InterruptedException {

        openBrowser(driver, "https://opensource-demo.orangehrmlive.com/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement input_user= driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement loginBtn= driver.findElement(By.xpath("//button[@type='submit']"));


        input_user.sendKeys("Admin");
        input_password.sendKeys("admin123");
        loginBtn.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement h6= driver.findElement(By.xpath("//span[text()='PIM']"));

        Assert.assertEquals(h6.getText(),"PIM");

        closeBrowser(driver);

    }
}
