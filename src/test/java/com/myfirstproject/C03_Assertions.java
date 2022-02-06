package com.myfirstproject;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C03_Assertions {
    static WebDriver driver;

    @BeforeClass

    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");



    }
    @Test
    public void gecersizMailTesti() throws InterruptedException {
driver.findElement(By.partialLinkText("Sign in")).click();

Thread.sleep(3000);
        WebElement emaigiriskutusu= driver.findElement(By.id("email_create"));
        emaigiriskutusu.sendKeys("merhabetelevole"+ Keys.ENTER);

        Thread.sleep(3000);
WebElement hatayazisi= driver.findElement(By.id("create_account_error"));

        Assert.assertTrue("mesaj gorulmedi", hatayazisi.isDisplayed());
    }



//@AfterClass
    //public static void tearDown(){

    //   driver.close();

}

