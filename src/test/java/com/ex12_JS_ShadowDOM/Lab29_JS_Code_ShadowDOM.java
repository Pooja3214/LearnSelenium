package com.ex12_JS_ShadowDOM;

import com.utils.CommonToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.ex06_WaitHelper.WaitHelpers.waitJVM;

public class Lab29_JS_Code_ShadowDOM extends CommonToAll {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        waitJVM(5000);

        JavascriptExecutor js= (JavascriptExecutor)driver;
        WebElement inputBoxPizza= (WebElement)js.executeScript("return document.querySelector(\"div#userName\")" +
                ".shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\") ");

        inputBoxPizza.sendKeys("farmhouse");

        closeBrowser(driver);

    }
}
