package com.ex01_Selenium_Basics;


import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium01 {
    public static void main(String[] args) {
        // start and stop itself.
        //  If it was a Selenium 3, then we have to do this.

        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S
//        SearchContext driver= new ChromeDriver();
//        SearchContext driver1= new EdgeDriver();
//        SearchContext driver2= new FirefoxDriver();

        WebDriver driver= new ChromeDriver();
//        RemoteWebDriver driver1= new FirefoxDriver();
//        ChromeDriver driver2= new ChromeDriver();

        driver.get("https://app.vwo.com");


    }
}
