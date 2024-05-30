package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMKT10 {
        public static void main(String[] args) {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();
            WebElement bestSeller = driver.findElement(By.partialLinkText("Best"));
            bestSeller.click();
        }
    }

