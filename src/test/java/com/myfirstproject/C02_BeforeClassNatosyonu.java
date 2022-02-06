package com.myfirstproject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C02_BeforeClassNatosyonu {//3 method ,5 defa,(Before class-method-method-method-after class)

   static  WebDriver driver;
    WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));

    @AfterClass//works according to notation
    public static void tearDown(){

        driver.close();
    }

    @BeforeClass//better to use for one website and for different tests.
    public static void setup() {//must be static in Junit

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");

    }

     @Test// in Junit there is no order
        public  void test1() {

searchBox.clear();
         searchBox.sendKeys("Nutella"+ Keys.ENTER);

     }
    @Test
    public void test2() {
        searchBox.clear();

        searchBox.sendKeys("bycicle"+ Keys.ENTER);

    }
    @Test
    public void test3() {
        searchBox.clear();

        searchBox.sendKeys("java"+ Keys.ENTER);

    }

    }


