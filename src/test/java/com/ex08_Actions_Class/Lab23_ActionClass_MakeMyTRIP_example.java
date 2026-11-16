package com.ex08_Actions_Class;

import com.ex06_WaitHelper.WaitHelpers;
import com.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Lab23_ActionClass_MakeMyTRIP_example extends CommonToAll {

    @Test

    public static void test_actions(){

        WebDriver driver= new ChromeDriver();
        String URL= "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        // We need to wait for the modal and close it
        new WaitHelpers().waitForVisibility(driver, 5, "//span[@data-cy=\"closeModal\"]");

        WebElement closeModal= driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModal.click();

        new WaitHelpers().waitJVM(5000);

        WebElement fromCity= driver.findElement(By.xpath("//label//input[@data-cy=\"fromCity\"]"));
        WebElement toCity= driver.findElement(By.xpath("//label//input[@data-cy=\"toCity\"]"));

        Actions actions= new Actions(driver);

        actions.moveToElement(fromCity).click().sendKeys("DEL").build().perform();

        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        try {
            for (WebElement e : list_auto_complete) {

                if (e.getText().contains("Chandigarh")) {
                    e.click();
                }


            }
        } catch (Exception e) {
            System.out.println("oK");
        }


        closeBrowser(driver);

    }
}
