package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task12/src/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://jqueryui.com/");

        driver.findElement(By.xpath("//h3[text()= 'Interactions']/following::li[3]")).click();

        Thread.sleep(6000);

        //switch to an iframe
        WebElement theFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(theFrame);

        driver.findElement(By.xpath("//div[@id='resizable']")).click();

        //resize element
        Thread.sleep(5000);


        Actions action = new Actions(driver);
        //get the drag icon
        WebElement dragElement = driver.findElement(By.xpath("//div[@id='resizable']/child::div[3]"));
        dragElement.click();
        action.clickAndHold(dragElement).moveByOffset(534,353).build().perform();

        driver.quit();



    }
}
