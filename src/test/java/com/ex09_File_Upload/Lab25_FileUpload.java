package com.ex09_File_Upload;

import com.ex06_WaitHelper.WaitHelpers;
import com.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.ex06_WaitHelper.WaitHelpers.waitJVM;

public class Lab25_FileUpload  extends CommonToAll {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        new WaitHelpers().waitJVM(5000);

        WebElement uploadFileInput= driver.findElement(By.id("fileToUpload"));
        String user_dir= System.getProperty("user.dir");
        String path= user_dir+ "/src/test/java/com/ex09_File_Upload/testData.txt";
        System.out.println(path);

        uploadFileInput.sendKeys(path);

        driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
    }
}
