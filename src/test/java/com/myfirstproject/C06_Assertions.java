package com.myfirstproject;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C06_Assertions {

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.bestbuy.com");


    }
        String expectedURL="https://www.bestbuy.com";

    String actualURL= driver.getCurrentUrl();



    @Ignore
    public static void tearDown(){

        driver.close();// or   //driver.close() without @Ignore
    }
}
