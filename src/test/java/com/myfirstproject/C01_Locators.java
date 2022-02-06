package com.myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        WebElement mailKutu = driver.findElement(By.id("email"));

        mailKutu.sendKeys("akcay10@hotmail.com");
        Thread.sleep(2000);
        mailKutu.clear();

        WebElement mailkutuname= driver.findElement(By.name("email"));
        mailkutuname.sendKeys("aciz1978@yahoo.com");
        //class,name,id,tagName,link,halflink

        WebElement giris= driver.findElement(By.tagName("button"));
        System.out.println(giris.isEnabled());
        giris.click();





    }
}
