package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//driver type,driver path
        WebDriver driver = new ChromeDriver();//webdriver object(driver)constructor
        driver.get("https://www.amazon.com/");
//
//        System.out.println("suanda"+  driver.getCurrentUrl());
//        driver.manage().window().fullscreen();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        driver.navigate().to("https://www.youtube.com/");
//        Thread.sleep(2000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//
//        driver.navigate().refresh();
//
//driver.quit();
//
//
//driver.close();

    }
}
