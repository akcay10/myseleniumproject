package com.myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_LocatorsIntro {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        WebElement sign = driver.findElement(By.linkText("Sign in"));

        sign.click();
Thread.sleep(2000);
        WebElement email = driver.findElement(By.id("session_email"));

        WebElement password= driver.findElement(By.id("session_password"));

        WebElement signIn= driver.findElement(By.name("commit"));

        email.sendKeys("testtechproed@gmail.com");


        password.sendKeys("Test1234!");


         signIn.click();

WebElement dogru= driver.findElement(By.className("navbar-text"));


         String username= "testtechproed@gmail.com";

         if(dogru.getText().equals(username)){


             System.out.println("dogru kullanic testi PASS");

         }else{

             System.out.println("dogru kullanic testi PASS");
         }

WebElement adres= driver.findElement(By.linkText("Addresses"));
WebElement signOut= driver.findElement(By.linkText("Sign out"));

if(adres.isDisplayed()){
    System.out.println("adres link gorunuyor, test pass");


}else{

    System.out.println("adres link gorunmuyor, test failed");
}
        if(signOut.isDisplayed()){
            System.out.println("adres link gorunuyor, test pass");


        }else{

            System.out.println("adres link gorunmuyor, test failed");
        }


      List<WebElement> linkler= driver.findElements(By.tagName("a"));

        System.out.println("Stenin grisi sayfasindaki lnk sayisi" + linkler.size());

        for(WebElement each:linkler){

            System.out.println(each.getText());


        }


driver.close();
    }
}
