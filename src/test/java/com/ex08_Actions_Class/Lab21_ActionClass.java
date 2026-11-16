package com.ex08_Actions_Class;

import com.ex06_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Lab21_ActionClass {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();

        //Action class- Keys up, down

        WaitHelpers.waitImplicitWait(driver,5);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions action= new Actions(driver);

        action.keyDown(Keys.SHIFT)
                .sendKeys(firstName,"Pooja Test")
                .keyUp(Keys.SHIFT).build().perform();

        Thread.sleep(5000);
        driver.quit();

    }
}
