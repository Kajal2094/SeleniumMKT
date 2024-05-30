package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownGrotech {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://grotechminds.com/dropdown/");
        driver.manage().window().maximize();
        WebElement choice1 = driver.findElement(By.id("select2-Choice1-container"));
        Select s1 = new Select(choice1);
        s1.selectByVisibleText("Demo1");


    }
}
