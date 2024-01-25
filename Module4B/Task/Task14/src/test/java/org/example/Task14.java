package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Task14 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task14/src/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.toolsqa.com/");

        Thread.sleep(6000);

        driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();


       driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]")).click();

       driver.quit();


    }
}
