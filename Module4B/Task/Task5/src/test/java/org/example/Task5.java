package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task3/src/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");

        String userName = driver.findElement(By.xpath("//div[@id='login_credentials']")).getText(); //getting username to use
        userName = userName.substring(53,66);


        String passWord = driver.findElement(By.xpath("//div[@class='login_password']")).getText();//getting password to use
        passWord = passWord.substring(24,36);


        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName); // send username in field

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passWord); // send password in field

        driver.findElement(By.xpath("//input[@id='login-button']")).click(); //click on Login button

        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click(); // adding an item to cart

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click(); // viewing the cart

        driver.findElement(By.xpath("//button[text()='Checkout']")).click(); //checking out item for payment

        driver.quit();






    }
}
