package com.ex06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSelenium15_Input_Checkbox_Radio {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pooja");

        //Radio Button
        WebElement radio_btn= driver.findElement(By.id("sex-1"));
        radio_btn.click();

        //Checkbox
        WebElement checkbox= driver.findElement(By.xpath("//input[@id='exp-4']"));
        checkbox.click();

        driver.quit();
    }
}
