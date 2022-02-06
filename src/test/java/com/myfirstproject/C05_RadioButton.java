package com.myfirstproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C05_RadioButton {

    WebDriver driver;
    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @Test
    public void test1() {

driver.get("https://www.facebook.com");
        WebElement search= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));

search.click();

WebElement button = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
if(!button.isSelected()){

    button.click();
}

    }
    @After
    public void tearDown(){

       driver.close();

   }
}
