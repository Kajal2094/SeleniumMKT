package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMKT1 {
        public static void main(String[] args) throws InterruptedException {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://facebook.com/");
            driver.manage().window().maximize();
            WebElement login = driver.findElement(By.id("//input[@id='email']"));
            login.sendKeys("kool.kajal20@gmail.com");
            WebElement password = driver.findElement(By.id("//input[@id='pass']"));
            password.sendKeys("kajal20942019");
            WebElement submit = driver.findElement(By.id("//input[@id='loginbutton']"));
            submit.click();
            Thread.sleep(5000);
            driver.quit();

        }
}
