package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIRAN\\Downloads\\Compressed\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://aa.com");
        driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[3]/div[1]/div/a/span[1]")).click();

        Select country = new Select(driver.findElement(By.xpath("//*[@id=\"countryCode\"]")));
        country.selectByValue("US");

        Select state = new Select(driver.findElement(By.xpath("//*[@id=\"stateCode\"]")));
        state.selectByValue("MO");


        driver.findElement(By.xpath("//*[@id=\"airport_CGI\"]/span[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[3]/div[2]/div/a/span[1]")).click();
        Select country2 = new Select(driver.findElement(By.xpath("//*[@id=\"countryCode\"]")));
        country2.selectByValue("US");

        Select state2 = new Select(driver.findElement(By.xpath("//*[@id=\"stateCode\"]")));
        state2.selectByValue("DC");
        driver.findElement(By.xpath("//*[@id=\"airport_IAD\"]/span[1]")).click();


        Select passenger = new Select(driver.findElement(By.xpath("//*[@id=\"flightSearchForm.adultOrSeniorPassengerCount\"]")));
        passenger.selectByValue("5");

        driver.findElement(By.xpath("//*[@id=\"aa-leavingOn\"]")).sendKeys("08/30/2023");
        driver.findElement(By.xpath("//*[@id=\"aa-returningFrom\"]")).sendKeys("08/31/2023");

        driver.findElement(By.xpath("//*[@id=\"flightSearchForm.button.reSubmit\"]")).click();

        //to close an instance
        // driver.close();

        //to close all instances
        //driver.quit();
    }
}