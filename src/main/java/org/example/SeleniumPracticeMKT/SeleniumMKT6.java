package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Automate below scenario
//1.launch browser
//2.goto google.com
//3.type "india" on search textfield
//4.Search using Enter Key
public class SeleniumMKT6 {
    public static void main(String[] args) {

                ChromeDriver driver = new ChromeDriver();
                driver.get("https://www.google.com/");
                WebElement search = driver.findElement(By.xpath("//textarea[@aria-label ='Search']"));
                search.sendKeys("india");
                search.sendKeys(Keys.ENTER);

            }
    }

