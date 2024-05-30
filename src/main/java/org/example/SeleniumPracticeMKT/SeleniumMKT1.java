package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMKT1 {
        public static void main(String[] args) throws InterruptedException {
            ChromeDriver driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "/Users/kajalsingh/Downloads/chromedriver_mac_arm64/chromedriver");
            driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
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
