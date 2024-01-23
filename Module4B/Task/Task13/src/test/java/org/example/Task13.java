package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task13/src/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://selenium08.blogspot.com/");

        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
        Actions keyboard = new Actions(driver);

        WebElement search = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
        search.sendKeys("Demo dropdown");
        search.sendKeys(Keys.ENTER);

        //clicking on the search result
        driver.findElement(By.xpath("//a[contains(text(),'Demo')]")).click();

        Thread.sleep(5000);
        System.out.println(driver.getCurrentUrl());

        //check to confirm we are in the dropdown page
        if ( driver.getCurrentUrl().equals("https://selenium08.blogspot.com/2019/11/dropdown.html") ){
            // to scroll on the page
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,400)");

            WebElement country = driver.findElement(By.xpath("//select[@name='country']"));

            Thread.sleep(5000);

            //to select from the drop down
            Select list = new Select(country);
            list.selectByVisibleText("Nigeria");

            Thread.sleep(5000);

            //check if multiple selection is allowed
            WebElement month = driver.findElement(By.xpath("//select[@name='Month']"));
            Select selectMonths = new Select(driver.findElement(By.xpath("//select[@name='Month']")));

            month.sendKeys(Keys.CONTROL);
            month.sendKeys(Keys.ENTER);
            selectMonths.selectByVisibleText("January");
            selectMonths.selectByVisibleText("February");
            selectMonths.selectByVisibleText("March");


//            System.out.println("I got here");
//                keyboard.keyDown(Keys.CONTROL).keyDown(Keys.ENTER).keyDown(Keys.ARROW_DOWN)
//                        .keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).build().perform();

        }

        driver.quit();


    }
}
