package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task10/src/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://jqueryui.com/dialog/");

        driver.findElement(By.xpath("//h3[text()= 'Widgets']/following::li[7]")).click();

        //switch to an iframe
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frameElement);

        driver.findElement(By.xpath("//button[@title='Close']")).click();

        Thread.sleep(3000);

        driver.quit();


    }
}
