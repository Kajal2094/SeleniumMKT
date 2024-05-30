package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.chrome.ChromeDriver;
//Install selenium and demonstrate a basic program to launch empty browser

public class SeleniumMKT2 {
        public static void main(String[] args) {
          //  System.setProperty("webdriver.chrome.driver", "/Users/kajalsingh/Downloads/chromedriver_mac_arm64/chromedriver");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
        }
    }

