package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.chrome.ChromeDriver;
//Selenium program to get title of browser
public class SeleniumMKT3 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.getTitle();
    }
}

