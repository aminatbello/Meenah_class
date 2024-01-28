package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class Elements {
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
    public void elementTile() throws InterruptedException {
        //locate for elements tile
        WebElement element = driver.findElement(By.xpath("//h5[contains(text(),'Elements')]"));
        String nameOfTheTile = element.getText();

        //assert to verify the name of the column is Contact
        sa.assertEquals(nameOfTheTile, "Elements");

        element.click();

        String elementsUsURL = driver.getCurrentUrl();
        sa.assertEquals(elementsUsURL, "https://demoqa.com/elements");
        System.out.println("I am in the elements page : " + elementsUsURL);

        //another assertion to confirm we are in the correct page
        WebElement pageName = driver.findElement(By.xpath("//div[@class = 'pattern-backgound playgound-header']/div[contains(text(),'Elements')]"));
        String pageNameText = pageName.getText();
        sa.assertEquals(pageNameText, "Elements");

    }

        @AfterClass
        public void quitBrowser(){
        driver.quit();
        }


    }
