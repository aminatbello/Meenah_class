package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class Task16 {
    WebDriver driver = null;
    SoftAssert sa = new SoftAssert();


    @BeforeClass
    public void launchTestify(){
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task16/src/chromedriver-mac-arm64/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://testifyltd.com/");

    }

    @Test
    public void contactFooter() throws InterruptedException {
        //scrolling to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //locate for contact column
        WebElement contactColumn = driver.findElement(By.xpath("//h3[contains(text(),'Learn')]"));
        String nameOfTheColumn = contactColumn.getText();

        //assert to verify the name of the column is Contact

        sa.assertEquals(nameOfTheColumn, "Learn");

        //assert to verify contact us link exist and redirects to a new page
        WebElement contactUs = driver.findElement(By.partialLinkText("Contact Us"));
        contactUs.click();

        Thread.sleep(3000);

        String contactUsURL = driver.getCurrentUrl();
        sa.assertEquals(contactUsURL, "https://testifyltd.com/contact");


        //assert that the correct email address displays
        WebElement emailAddress = driver.findElement(By.xpath("//span[contains(text(),'info')]"));
        String getEmailAddress = emailAddress.getText();

        sa.assertEquals(getEmailAddress, "info@testifyltd.co.uk");
        sa.assertAll();
    }

        @Test
        public void verifyLocation(){
            //assert that the correct location is displayed
            WebElement location = driver.findElement(By.xpath("//span[contains(text(),'Nigeria')]"));
            String getLocation = location.getText();

            sa.assertEquals(getLocation, "Nigeria");
            sa.assertAll();

        }

        @Test
        public void verifyPhoneNumber(){
            //assert that the correct phone number is displayed
            WebElement phoneNumber = driver.findElement(By.xpath("//span[contains(text(),'234')]"));
            String getPhoneNumber = phoneNumber.getText();

            sa.assertEquals(getPhoneNumber, "(+234)904-882-0971");
            sa.assertAll();

    }

        @AfterClass
        public void quitBrowser(){
        driver.quit();
        }


    }
