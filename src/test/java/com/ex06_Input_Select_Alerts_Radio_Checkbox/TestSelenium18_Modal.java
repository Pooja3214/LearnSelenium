package com.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.ex06_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium18_Modal {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");

        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        new WaitHelpers().waitForVisibility(driver, 5000, "//span[@data-cy='closeModal']");
        WebElement e= driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        e.click();

        driver.quit();
    }
}
