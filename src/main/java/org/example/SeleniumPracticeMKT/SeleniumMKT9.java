package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Goto Amazon.in locate shoe with relative xpath
public class SeleniumMKT9 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement search = driver.findElement(By.xpath("//input[@type ='text']"));
        search.sendKeys("shoe");
        WebElement submit = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        submit.click();
    }
}
