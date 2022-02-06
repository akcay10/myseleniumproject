package com.myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class c02_Test01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.ca");

        driver.manage().window().maximize();

        driver.navigate().refresh();

        String actualTitle = driver.getTitle();
        String arananKelime = "Low Prices";
        if (actualTitle.contains(arananKelime)) {

            System.out.println("title" + arananKelime + "kelimesi iceriyor,test pass");


        } else {
            System.out.println("title" + arananKelime + "kelimesini icermiyor,test failed");

        }
        String actualUrl = driver.getCurrentUrl();
        String UrlAraran = "https://www.amazon.ca/";

        if (actualUrl.contains(UrlAraran)) {

            System.out.println("url" + UrlAraran + "kelimesi iceriyor,test pass");


        } else {

            System.out.println("url" + UrlAraran + "kelimesi icermiyor");

        }
        WebElement searchIphone13 = driver.findElement(By.xpath("//input[@type='text']"));
        searchIphone13.sendKeys("samsung headphones" + Keys.ENTER);
        Thread.sleep(3000);

        WebElement search = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        System.out.println(search.getText());


        WebElement searchIphone13kactane1element = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[10]"));
        searchIphone13kactane1element.click();

         driver.navigate().back();
        List<WebElement> urunlerListesi = driver.findElements(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])"));

        for (WebElement each : urunlerListesi
        ) {
            System.out.println(each.getText());
        }


    }

}

