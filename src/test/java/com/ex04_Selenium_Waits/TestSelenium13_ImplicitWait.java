package com.ex04_Selenium_Waits;

import com.utils.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestSelenium13_ImplicitWait extends CommonToAll {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        //Implicit wait- Apply to all
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make_apt = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_apt.click();

        driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");

        driver.findElement(By.xpath("//button[@id='btn-login']")).click();


        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");

        WebElement h2 = driver.findElement(By.xpath("//h2[text()=\"Make Appointment\"]"));
        Assert.assertEquals(h2.getText(), "Make Appointment");
        Assert.assertTrue(h2.isDisplayed());

        driver.quit();
    }
}
