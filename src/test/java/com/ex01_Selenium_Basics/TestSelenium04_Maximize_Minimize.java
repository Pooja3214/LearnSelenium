package com.ex01_Selenium_Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium04_Maximize_Minimize {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
//        driver.manage().window().maximize();
//        driver.manage().window().minimize();

        Dimension size= new Dimension(1024,900);
        driver.manage().window().setSize(size);
        driver.quit();


    }
}
