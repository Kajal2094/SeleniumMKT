package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MKTSelenium17 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.get ("https://www.1mg.com/");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.xpath("//input [@id ='srchBarShwInfo']"));
        search.sendKeys("Health");
        Thread.sleep(2000);
        List<WebElement> autosuggestion = driver.findElements(By.xpath("//div [@class='styles__search-results-container___3OUHy']/ul/li"));
        int count = autosuggestion.size();
        System.out.println(count);
        autosuggestion.get(4).click();
    }
}
