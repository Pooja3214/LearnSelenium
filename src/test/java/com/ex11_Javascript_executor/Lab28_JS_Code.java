package com.ex11_Javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Lab28_JS_Code {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.google.com'");

        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement div_to_scroll= driver.findElement(By.xpath("//div[@id='userName']"));

        js.executeScript("window.scrollBy(0,1500);");


        String url= js.executeScript("return document.URL;").toString();
        String title= js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);

        driver.quit();

//**  executeScript methods
//        Click an element	js.executeScript("arguments[0].click();", element);
//        Enter text	js.executeScript("arguments[0].value='Selenium';", textBox);
//        Scroll by pixels	js.executeScript("window.scrollBy(0, 600);");
//        Scroll into view	js.executeScript("arguments[0].scrollIntoView(true);", element);
//        Scroll to page bottom	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//        Get page title	String title = (String) js.executeScript("return document.title;");
//        Generate an alert	js.executeScript("alert('Test Alert');");

    }
}
