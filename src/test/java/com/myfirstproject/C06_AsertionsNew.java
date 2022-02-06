package com.myfirstproject;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C06_AsertionsNew {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.bestbuy.com");


    }

    @Test
    public void urlTest() {


        String expectedURL = "https://www.bestbuy.com/";
        // String expectedURL = "https://www.bestbuy1.com/";

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals("hi", expectedURL, actualURL);

    }

    @Test
    public void titleTest() {
        String istenmeyenKelime = "Rest";
        String actualTitle = driver.getTitle();
        Assert.assertFalse("istenmeyen kelime titleda var", actualTitle.contains(istenmeyenKelime));


    }

    @Test
    public void logoTest() {

        WebElement logo = driver.findElement(By.xpath("(//img[@class='logo'])[1]"));

        Assert.assertTrue("logo gorunmuyor", logo.isDisplayed());

}
@Test
    public void fransizcaTesti(){

        WebElement fransizcaTesti= driver.findElement(By.xpath("//button[text()='Français']"));
        Assert.assertTrue("frabsuzca linkiu gorunmuyor",fransizcaTesti.isDisplayed());
}


       @AfterClass
       public static void tearDown() {

           driver.close();// or   //driver.close() without @Ignore
       }
    }
