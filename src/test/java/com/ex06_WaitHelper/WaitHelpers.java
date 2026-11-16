package com.ex06_WaitHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class WaitHelpers {

    public static void waitJVM(int i){try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public static void waitImplicitWait(WebDriver driver,int time){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public static void checkVisibility(WebDriver driver,int time, By locator){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void checkVisibilityOfAndTextToBePresentInElement(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.textToBePresentInElement(element, "Your email, password, IP address or location did not match"));

    }

    public void waitForVisibility(WebDriver driver,int timeInSeconds, String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

    }

    public static void waitFluentVisibility(WebDriver driver, int time, int interval, String xpath){
        FluentWait<WebDriver> wait= new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(interval))
                .ignoring(NoSuchElementException.class);

        WebElement error_message= wait.until(new Function<WebDriver, WebElement>(){

            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath(xpath));
            }
        });
    }
}
