package com.myfirstproject;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C03_Before_After {//3 methods,9 defa calisir,(before-method-after)

    //good for many web sites open web and close after method.
    WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }
    @Test
    public void amazonTesti(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
    }
    @Test
    public void techproedTesti(){
        driver.get("https://www.techproed.com");
        System.out.println(driver.getTitle());

    }
    @Test
    public void facebookTesti(){
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());



        }

    public void tearDown(){

        driver.close();
    }


}

