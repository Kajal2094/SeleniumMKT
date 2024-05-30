package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//locate each component of JSAM application using absolute xpath(excluding dropdown and disable)
public class SeleniumMKT7 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("file:///Users/kajalsingh/Downloads/learningHTML1.html");
        WebElement username = driver.findElement(By.xpath("/html/body/input[1]"));
        username.sendKeys("kajal2.singh");
        WebElement hint = driver.findElement(By.xpath("/html/body/input[2]"));
        hint.sendKeys("my name");
        WebElement firstName = driver.findElement(By.xpath("/html/body/form/input[1]"));
        firstName.sendKeys("Kajal");
        WebElement lastName = driver.findElement(By.xpath("/html/body/form/input[3]"));
        lastName.click();




    }
    
    }
