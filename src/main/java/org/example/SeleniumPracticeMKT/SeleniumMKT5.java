package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Automate below scenario
//1.launch browser
//2.goto other website like amazon/flipcart
//3.type ""sample eg text"" on search textfield
//4.click on search button"
public class SeleniumMKT5 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement search = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
        search.sendKeys("Shoe");
        search.sendKeys(Keys.ENTER);
    }
}
