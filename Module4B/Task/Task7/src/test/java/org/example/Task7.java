package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aminatbello/Desktop/Meenah_class/Module4B/Task/Task3/src/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://worldweather.wmo.int/en/home.html");

        driver.findElement(By.xpath("//input[@id='q_search']")).sendKeys("Lagos");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        //div[@class='city_forecast_day_object']
        //div[@class='city_fc_date fs0']

        List<WebElement> getWeatherForDays = driver.findElements(By.xpath("//div[@class='city_forecast_day_object']"));
        System.out.println(getWeatherForDays);

        for (WebElement element : getWeatherForDays) {
            String daysReturned = element.findElement(By.xpath(".//div[@class='city_fc_date fs0']")).getText();
            daysReturned = daysReturned.substring(8 ,11);

            String weatherForEachDay = element.findElement(By.xpath(".//div[@class='city_fc_temp fs0']")).getText();

            System.out.println("The weather for " + daysReturned + " is " + weatherForEachDay );
        }

        driver.quit();


    }
}
