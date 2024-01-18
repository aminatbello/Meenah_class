package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task3/src/chromedriver-mac-arm64/chromedriver");

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

        //check if I have items saved in cart already

        try {
            if (driver.findElement(By.cssSelector("a[class = 'shopping_cart_link']")).isDisplayed()) {
                int itemList = (driver.findElements(By.cssSelector("button[class='btn btn_secondary btn_small cart_button']")).size());

                int i = 1;
                while (i <= itemList) {
                    driver.findElement(By.cssSelector("button[class='btn btn_secondary btn_small cart_button']")).click();
                    i++;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Cart link not found, or not displayed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click(); // adding an item to cart

        driver.findElement(By.cssSelector("a[class = 'shopping_cart_link']")).click(); // viewing the cart

        driver.findElement(By.cssSelector("#checkout")).click(); //checking out item for payment

        driver.quit();


    }
}
