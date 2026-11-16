package com.ex08_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab24_DragDrop_Right_DoubleClick {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        Actions actions= new Actions(driver);

        WebElement dragFrom= driver.findElement(By.xpath("//div[@id=\"column-a\"]"));
        WebElement dragTo= driver.findElement(By.xpath("//div[@id=\"column-b\"]"));

        actions.dragAndDrop(dragFrom, dragTo);

//        actions.contextClick();-- Right Click
//        actions.doubleClick();

        driver.quit();

    }

}
