package com.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium10_LinkText_Partial_Text_TagName {

    @Description("Verify site")
    @Test

    public void test_login_vwo(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        WebElement link= driver.findElement(By.linkText("Start a free trial"));
        link.click();

        WebElement partialLink= driver.findElement(By.partialLinkText("trial"));
    partialLink.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
