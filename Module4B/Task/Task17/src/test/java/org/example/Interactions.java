package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Interactions {
    WebDriver driver = null;
    SoftAssert sa = new SoftAssert();


    @BeforeClass
    public void launchDemoQA(){
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task17/src/chromedriver-mac-arm64/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com ");

    }

    @Test
    public void interactionsTile() throws InterruptedException {
        //locate for elements tile
        WebElement element = driver.findElement(By.xpath("//h5[contains(text(),'Interactions')]"));
        String nameOfTheTile = element.getText();

        //assert to verify the name of the column is Contact
        sa.assertEquals(nameOfTheTile, "Interactions");

        element.click();

        String interactionsUsURL = driver.getCurrentUrl();
        sa.assertEquals(interactionsUsURL, "https://demoqa.com/forms");
        System.out.println("I am in the Interactions page : " + interactionsUsURL);

        //another assertion to confirm we are in the correct page
        WebElement pageName = driver.findElement(By.xpath("//div[@class = 'pattern-backgound playgound-header']/div[contains(text(),'Interactions')]"));
        String pageNameText = pageName.getText();
        sa.assertEquals(pageNameText, "Interactions");

    }

    @AfterClass
    public void quitBrowser(){
        driver.quit();
    }

}
