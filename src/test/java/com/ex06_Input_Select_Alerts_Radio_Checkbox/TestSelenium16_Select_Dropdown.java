package com.ex06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TestSelenium16_Select_Dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement dropdown= driver.findElement(By.id("dropdown"));
        Select select= new Select(dropdown);

        select.selectByIndex(1);
      //  select.selectByVisibleText("Option 2");
       // select.selectByContainsVisibleText("2");
//        select.selectByValue("2");

        driver.quit();


    }
}
