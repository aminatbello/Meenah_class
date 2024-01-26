package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


public class Task15 {
    WebDriver driver = null;

    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/task new/src/chromedriver-mac-arm64/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void googleSearch() { //test to open google and search for testify
        driver.navigate().to("https://www.google.com/");

        //searching for testify
        WebElement searchBox = driver.findElement(By.cssSelector("#APjFqb"));
        searchBox.click();
        searchBox.sendKeys("testify");
        searchBox.sendKeys(Keys.ENTER);

        }

        @Test
        public void mcDonalds(){
            //Navigating to the mcDonalds site
            driver.navigate().to("https://www.mcdonalds.com/us/en-us.html");


            //Locating the order now button
            WebElement buttonColour = driver.findElement(By.cssSelector("#button-ordernow"));
            //getting the colour of the button
            buttonColour.getCssValue("colour");

            System.out.println("The colour of the Order Now button is: " + buttonColour);

        }

        @AfterMethod
        public void quitBrowser(){
            driver.quit();
        }


    }
