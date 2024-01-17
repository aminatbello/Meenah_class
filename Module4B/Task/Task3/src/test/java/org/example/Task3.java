package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task3/src/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");

        driver.findElement(By.xpath("//img[@alt='Google']")); //1
        driver.findElement(By.xpath("//span[contains(@class, 'ktL')]")); //2
        driver.findElements(By.xpath("//div[@class='a4bIc']")); //3

        driver.close();



    }
}
