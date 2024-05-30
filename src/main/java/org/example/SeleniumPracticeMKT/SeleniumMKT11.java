package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Login to  Amazon Application using Relative Xpath.
public class SeleniumMKT11 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement login = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        login.click();
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("9559500126");
        WebElement  submit = driver.findElement(By.xpath(" //input[@id='continue']"));
        submit.click();
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Kajal2094");
        WebElement  signin = driver.findElement(By.xpath("//input[@type='submit'][1]"));
        signin.click();



    }
}
