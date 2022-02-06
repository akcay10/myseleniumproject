package com.myfirstproject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day04_CssSelector {

    /*  css selector: This is similar to xpath
    tag[attribute='value']
    . = class
    # = id
    <input id="btnSubmit" type="submit" value="Log in" class="btn btn-primary py-3 px-5">
    css = .btn-primary
    css =  #btnSubmit


 */
    WebDriver driver;
    @Before
    public void setUp(){
    //    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver"); //MAC
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");// WINDOWS
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.carettahotel.com/Account/Logon");
    }
    @Test
    public void cssTest(){
/*css selector: This is similar to xpath
tag[attribute='value']
. = class
# = id
<input id="btnSubmit" type="submit" value="Log in" class="btn-primary">
css = input[id='btnSubmit']
css = .btn-primary
css = #btnSubmit
* */
//        username
        driver.findElement(By.cssSelector("input[id='UserName']")).sendKeys("manager");
//        password
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Manager1!");
//        login button
        driver.findElement(By.cssSelector("#btnSubmit")).click();


    }
   @After
   public void yearDown(){
       driver.close();
   }
}