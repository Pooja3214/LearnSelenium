package com.ex08_Actions_Class;

import com.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab22_moveToElement extends CommonToAll {

    @Test
    public static void test_actions(){
        WebDriver driver= new ChromeDriver();
        String URL= "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement inputFrom= driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions= new Actions(driver);

        WebElement inputDestination= driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));

        actions.moveToElement(inputFrom).click().sendKeys("BLR").build().perform();
        actions.moveToElement(inputDestination).click().sendKeys("DEL").build().perform();

        closeBrowser(driver);
    }
}
