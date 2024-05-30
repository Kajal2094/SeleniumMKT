package org.example.SeleniumPracticeMKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFacebook {
    public static void main(String[] args) {

        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2Fcampaign%2Flanding.php%3Fcampaign_id%3D14884913640%26extra_1%3Ds%257Cc%257C550525804791%257Cb%257Cfacebook%257C%26placement%26creative%3D550525804791%26keyword%3Dfacebook%26partner_id%3Dgooglesem%26extra_2%3Dcampaignid%253D14884913640%2526adgroupid%253D128696220912%2526matchtype%253Db%2526network%253Dg%2526source%253Dnotmobile%2526search_or_content%253Ds%2526device%253Dc%2526devicemodel%253D%2526adposition%253D%2526target%253D%2526targetid%253Dkwd-592856129%2526loc_physical_ms%253D1007751%2526loc_interest_ms%253D%2526feeditemid%253D%2526param1%253D%2526param2%253D%26gad_source%3D1%26gclid%3DCjwKCAjw9cCyBhBzEiwAJTUWNXkTVVQsbUnW-jRArFoehgjoLT7u02fFivwDTwVVlyJEIataL227shoCf28QAvD_BwE&locale=en_GB&display=page");
        driver.manage().window().maximize();
        WebElement day = driver.findElement(By.id("day"));
        Select s1 = new Select(day);
        s1.selectByValue("20");
        WebElement month = driver.findElement(By.id("month"));
        Select s2 = new Select(month);
        s2.selectByValue("11");
       WebElement year = driver.findElement(By.id("year"));
        Select s3= new Select(year);
        s3.selectByValue("1999");

    }
}
