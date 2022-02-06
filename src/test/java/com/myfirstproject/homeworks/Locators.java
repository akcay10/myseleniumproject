package com.myfirstproject.homeworks;

import com.myfirstproject.utilities.TestBase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Locators extends TestBase {


    @Test
    public void verify(){
        driver.get("https://www.saucedemo.com/");

        WebElement user=driver.findElement(By.id("user-name"));
        user.sendKeys("standard_user");

        WebElement passw= driver.findElement(By.id("password"));
        passw.sendKeys("secret_sauce");

        WebElement login= driver.findElement(By.id("login-button"));

        login.click();
WebElement product=driver.findElement(By.className("title"));
        Assert.assertTrue(product.isDisplayed());


        List<WebElement> allprices=driver.findElements(By.className("inventory_item_price"));
        List<String> strinpricelist= new ArrayList<>();


        for (WebElement tektek:allprices
             ) {
            strinpricelist.add((tektek.getText()));
           // System.out.println("unique ones: "+strinpricelist.stream().distinct().count());
        }System.out.println(strinpricelist);

//The verifies the minimum price is greater than $5
        List<Double>  doublePrice= new ArrayList<>();
        for(String price : strinpricelist){
            price = price.substring(1);
            Double a = Double.parseDouble(price);
            doublePrice.add(a);
        }
        System.out.println("Price =>" +doublePrice);
        Collections.sort(doublePrice);
        System.out.println("Order Price =>" +doublePrice);
        Assert.assertTrue("The minimum price is not greater than $5 " ,doublePrice.get(0)>5);


        //The verifies the maximum price is less than $50
        Assert.assertTrue("The verifies the maximum price is not less than $50" ,doublePrice.get(doublePrice.size()-1)<50);
    }

    }
