package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class SeleniumMKT_4June {
    public static void main(String[] args) throws IOException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.xpath("//textarea[@aria-label ='Search']"));
        search.sendKeys("shoes");
        search.sendKeys(Keys.ENTER);
        TakesScreenshot a1 =  driver;
        File source = a1.getScreenshotAs(OutputType.FILE);
        File destination = new File ("/Users/kajalsingh/Documents/Screenshots/sc.png");
        FileHandler.copy(source,destination);
        }

    }

