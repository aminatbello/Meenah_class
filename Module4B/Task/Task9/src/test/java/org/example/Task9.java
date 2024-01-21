package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task9/src/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");

        String userName = driver.findElement(By.cssSelector("div.login_credentials")).getText(); //getting username to use
        userName = userName.substring(53, 66);


        String passWord = driver.findElement(By.cssSelector("div.login_password")).getText();//getting password to use
        passWord = passWord.substring(24, 36);


        driver.findElement(By.cssSelector("#user-name")).sendKeys(userName); // send username in field

        driver.findElement(By.cssSelector("input[type= 'password']")).sendKeys(passWord); // send password in field

        driver.findElement(By.cssSelector("#login-button")).click(); //click on Login button

        Thread.sleep(5000);

        //navigate back to the login screen
        driver.navigate().back();

        //printing login attribute value
        System.out.println(driver.findElement(By.cssSelector("#login-button")).getAttribute("value"));

        //navigate forward to the home page
        driver.navigate().forward();
        System.out.println(driver.findElement(By.xpath("//a[@id='item_3_title_link']/descendant::*")).getText());



        driver.quit();


    }
}//
