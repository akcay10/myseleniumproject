package com.myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Cssselector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");
Thread.sleep(2000);
        WebElement emailtexbox = driver.findElement(By.cssSelector(".form-control"));

        emailtexbox.sendKeys("ali");

       // WebElement passwordtextbox1 = driver.findElement(By.cssSelector("input[id='session_password']"));
        //css selector ile uzun sekild eyazilis.


        WebElement passwordtextbox1 = driver.findElement(By.cssSelector("#session_password"));
             //css selector ile kisa sekild eyazilis.

       // WebElement passwordtexbox=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
//xpath ile yazilish
        passwordtextbox1.sendKeys("12345");//css deger yazidirma
        //passwordtextbox.sendKeys("123456");//xpath deger yazidirma

// css  input[type='submit']     xpath    //input[@type='submit']


        //WebElement submitbutton=driver.findElement(By.cssSelector("input[type='submit'])");
        WebElement submitbutton=driver.findElement(By.xpath("//input[@type='submit']"));

        submitbutton.click();


    }
}
