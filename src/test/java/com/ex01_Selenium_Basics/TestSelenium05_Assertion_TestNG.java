package com.ex01_Selenium_Basics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.assertj.core.api.Assertions.assertThat;

public class TestSelenium05_Assertion_TestNG {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");

        // TestNG Assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        //AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();

    }
}
