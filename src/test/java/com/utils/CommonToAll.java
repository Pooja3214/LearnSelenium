package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonToAll
{

        public WebDriver driver= new ChromeDriver();

        public static void openBrowser(WebDriver driver, String url){

            driver.manage().window().maximize();
            driver.get(url);


        }

        public static void closeBrowser(WebDriver driver){
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

            driver.quit();
        }

        public WebElement findElementsByPartialLinkText(WebDriver driver, String text){
            return driver.findElement(By.partialLinkText(text));
        }




    }
