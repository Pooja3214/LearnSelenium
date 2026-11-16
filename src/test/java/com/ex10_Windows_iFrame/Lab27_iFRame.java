package com.ex10_Windows_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab27_iFRame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String URL = "https://demo.automationtesting.in/Frames.html";
        driver.get(URL);
        driver.manage().window().maximize();


        driver.switchTo().frame("SingleFrame");

        WebElement inputFrame=driver.findElement(By.xpath("//input[@type=\"text\"]"));
        inputFrame.sendKeys("Testing iFrame");

        driver.switchTo().defaultContent();
        driver.quit();

    }
}
