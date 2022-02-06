package com.myfirstproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C04_CheckBox {


WebDriver driver;
    @Before
     public void setup(){

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
@Test
    public void test1(){

        driver.get("https://the-internet.herokuapp.com/checkboxes");

    WebElement kutu1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
    WebElement kutu2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

    if(!kutu1.isSelected()){

        kutu1.click();


    }
    if(!kutu2.isSelected()){

        kutu2.click();


    }


    }

    @After
    public void tearDown(){
        driver.close();

    }
}

