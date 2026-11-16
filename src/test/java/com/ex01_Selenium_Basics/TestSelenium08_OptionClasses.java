package com.ex01_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium08_OptionClasses {
    public static void main(String[] args) {
        ChromeOptions option= new ChromeOptions();
//        option.addArguments("--headless");
//        option.addArguments("--window-size=800*600");
        option.addArguments("--start-maximized");
        option.addArguments("--incognito");
        option.addArguments("--guest");

        WebDriver driver= new ChromeDriver(option);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());


        driver.quit();
    }
}
