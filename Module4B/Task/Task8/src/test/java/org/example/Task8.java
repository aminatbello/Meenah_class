package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task8/src/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://idorenyinankoh.github.io/loginPage/");

        //check if create account button is enabled

        Boolean createButton = driver.findElement(By.xpath("//button[text()='Create Account']")).isEnabled();
        System.out.println(createButton);

        //filling form
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ola");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Brown");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@123.com");
        driver.findElement(By.xpath("//input[@id='female']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass11");
        driver.findElement(By.xpath("//input[@id='confirmPass']")).sendKeys("Pass11");
        driver.findElement(By.xpath("//input[@id='xpLevel']")).sendKeys("Explanation");

        Thread.sleep(5000);


        //creating account
        //driver.findElement(By.xpath("//button[text()='Create Account']")).click();

        Boolean createButtonAgain = driver.findElement(By.xpath("//button[text()='Create Account']")).isEnabled();
        System.out.println(createButtonAgain);


        driver.quit();


    }
}
