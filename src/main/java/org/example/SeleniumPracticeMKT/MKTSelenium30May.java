package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MKTSelenium30May {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.get ("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.xpath("//input [@id ='twotabsearchtextbox']"));
        search.sendKeys("shoes");
        Thread.sleep(2000);
    }
}
