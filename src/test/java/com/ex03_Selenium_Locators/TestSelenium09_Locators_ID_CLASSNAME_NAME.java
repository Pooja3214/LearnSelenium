package com.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09_Locators_ID_CLASSNAME_NAME {

@Description("TC#1 - Verify that with invalid login, error message is displayed!")
@Test
    public void test_valid_invalid_login(){

    ChromeOptions option= new ChromeOptions();
    option.addArguments("--start-maximized");

    WebDriver driver= new ChromeDriver(option);
    driver.get("https://app.vwo.com");

    WebElement username= driver.findElement(By.name("username"));
    username.sendKeys("admin@admin.com");

    WebElement password= driver.findElement(By.name("password"));
    password.sendKeys("12345");

    WebElement loginBtn= driver.findElement(By.id("js-login-btn"));
    loginBtn.click();

    try{
        Thread.sleep(3000);
    }catch (InterruptedException e){
        System.out.println(e.getMessage());
    }

    WebElement error_message= driver.findElement(By.className("notification-box-description"));
    error_message.getText();

    Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

    try{
        Thread.sleep(3000);
    }catch (InterruptedException e){
        System.out.println(e.getMessage());
    }
    }
}
