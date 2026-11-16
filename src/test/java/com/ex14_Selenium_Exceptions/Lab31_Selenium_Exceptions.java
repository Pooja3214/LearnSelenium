package com.ex14_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab31_Selenium_Exceptions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");

        try{
            driver.findElement(By.id("Pooja"));
        }catch (NoSuchElementException e){
            System.out.println("Element not found");
        }
    }
}
