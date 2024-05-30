package org.example.SeleniumPracticeMKT;

import org.example.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumMKT16 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement search_shoe = driver.findElement(By.xpath("//input [@id ='twotabsearchtextbox']"));
        search_shoe.sendKeys("shoes");
        Thread.sleep(2000);
        List<WebElement> suggest = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
        int count = suggest.size();
        System.out.println(count);
        suggest.get(4).click();
    }
}
