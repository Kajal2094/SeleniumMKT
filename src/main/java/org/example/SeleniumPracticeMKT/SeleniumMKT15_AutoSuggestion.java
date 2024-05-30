package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMKT15_AutoSuggestion{
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        WebElement sendkeys = driver.findElement(By.xpath("//textarea [@aria-label='Search']"));



    }

}

