package com.ex04_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.function.Function;

public class TestSelenium15_Fluent_Wait {

    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        WebDriver driver= new ChromeDriver(options);
        driver.get("https://app.vwo.com/#/login");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - Wingify");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        //1. Find the email inputbox and enter the email
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");


        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");


        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        //Fluent Wait- wait for certain condition and frequently check in some intervals

        FluentWait<WebDriver> wait= new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement error_message= wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement( By.className("notification-box-description"));
            }
        });

        driver.quit();

    }
}

