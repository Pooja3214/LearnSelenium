package com.ex06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TestSelenium17_Alerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//        WebElement element= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        WebElement element= driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        element.click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert= driver.switchTo().alert();
        String name="Alert testing";
        alert.sendKeys(name);
        alert.accept();
//        alert.dismiss();

        String result= driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You entered: "+name);


    driver.quit();

    }
}
