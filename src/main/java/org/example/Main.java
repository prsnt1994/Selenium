package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIRAN\\Downloads\\Compressed\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");


        //to close an instance
        // driver.close();

        //to close all instances
        driver.quit();

        /*
        Locators to identify objects in a browser
        1.ID
        2.ClassName
        3.Name
        4.LinkText
        5.Xpath
        6.css
         */
    }
}