package com.ex04_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TestSelenium14_ExplicitWait {

    public static void main(String[] args) {

        //Explicit wait- wait for certain amount of time and specific condition to met

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver= new ChromeDriver(options);
        driver.get("https://app.vwo.com");

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("12345");

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        //Explicit wait
        WebDriverWait wait= (new WebDriverWait(driver, Duration.ofSeconds(3)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@className='notification-box-description"))));

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        // Step 6, we have added the TestNG assertion to verify.
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();





    }
}
