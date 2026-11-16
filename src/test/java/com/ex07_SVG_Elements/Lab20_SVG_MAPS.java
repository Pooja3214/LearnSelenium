package com.ex07_SVG_Elements;

import com.ex06_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.util.List;

public class Lab20_SVG_MAPS {

    @Test
    public void test_India_map_SVG(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String URL = "https://www.amcharts.com/svg-maps/india/";
        driver.get(URL);

        WaitHelpers waitHelpers= new WaitHelpers();
        waitHelpers.waitForVisibility(driver, 5, "//*[name()='svg']/*[name()='path']");

        List<WebElement> states= driver.findElements(By.xpath("//*[name()='svg']/*[name()='path']"));
        for(WebElement state: states){
            System.out.println(state.getDomAttribute("data-name"));
            if(state.getDomAttribute("data-name").contains("Manipur")){
                state.click();
            }

        }
        driver.quit();
    }
}
