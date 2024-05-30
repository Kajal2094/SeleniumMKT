package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMKT12_dropdown {
    public static void main(String[] args) {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement all = driver.findElement(By.id("nav-search-label-id"));
        Select s1 = new Select(all);
        s1.selectByVisibleText("Deals");

    }
}
