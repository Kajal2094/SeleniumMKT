package org.example.SeleniumPracticeMKT;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMKT14 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        WebElement selection = driver.findElement(By.name("q"));
        if (selection.isDisplayed()&& selection.isSelected())
        {
            System.out.println("Enabled and selected");
        }
        else {
            System.out.println("Not Enabled and selected");

        }
    }
}
