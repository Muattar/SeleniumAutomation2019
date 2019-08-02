package com.Cybertek.Day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver",
//                      "//Users//Armada//Documents//selenium dependencies//drivers//Chromedriver");
//        WebDriver driver =new ChromeDriver();
//
//        driver.get("https://cybertekshool.com");
//        driver.get("http://amazon.com");

//        System.setProperty("webdriver.gecko.driver",
//                "/Users/Armada/Documents/selenium dependencies/drivers/geckodriver");
//
//        WebDriver driver2 = new FirefoxDriver();
//
//        driver2.get("http://practice.cybertekschool.com");

        System.setProperty("webdriver.chrome.driver",
                "/Users/Armada/Documents/selenium dependencies/drivers/chromdriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://www.bestbuy.com/");

    }
}
