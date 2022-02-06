package com.myfirstproject;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C02_AsssertionsYouTube {
    static  WebDriver driver;

 @BeforeClass

 public static void setUp(){
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.get("https://www.youtube.com");

        }

        @Test
    public void titleTest(){
String expectedTitle="YouTube";
String actualTitle= driver.getTitle();
Assert.assertEquals("bekleneden farkli",expectedTitle,actualTitle);

        }
        @Test
    public void titleTest2(){
            WebElement logo=driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
            Assert.assertTrue("logo gorunmuyor",logo.isDisplayed());
            System.out.println("bu satir calisir");

        }


        @Test

        public void search(){

    WebElement search= driver.findElement(By.xpath("//input[@name='search_query']"));

    Assert.assertTrue("ulasilamiyor",search.isEnabled());

        }

        @Test
        public void yanlsihTitleTesti(){

     String istenmeyen="youtube";
     String actualTitle=driver.getTitle();

     Assert.assertNotEquals("istenmeyen kelimeye esit",istenmeyen,actualTitle);

     //Assert.assertFalse("false mesaji",istenmeyen.equals(actualTitle));
            //Assert.assertTrue("true mesaji",!istenmeyen.equals(actualTitle));



        }
        @AfterClass
    public static void tearDown(){
     driver.close();
        }
}