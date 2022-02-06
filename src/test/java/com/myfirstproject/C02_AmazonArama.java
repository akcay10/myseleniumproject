package com.myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {

    public static void main(String[] args) {

        System.setProperty ("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        WebElement arama = driver.findElement(By.id("twotabsearchtextbox"));
        arama.sendKeys("java" + Keys.ENTER);//could be use search button instead ?


WebElement sonuc= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));//arama is object. WebElement is datatype

        System.out.println(sonuc.getText());//to see string over the web element use getText() method.











    }


}
