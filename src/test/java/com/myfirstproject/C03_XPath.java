package com.myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_XPath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //WebElement buton=driver.findElement(By.tagName("button"));
        Thread.sleep(2000);
        //WebElement buton=driver.findElement(By.xpath("//button"));
       // WebElement buton=driver.findElement(By.xpath("//button[text()='Add Element']"));//most common
        //WebElement buton=driver.findElement(By.xpath("//*[text()='Add Element']"));
        WebElement buton=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        buton.click();
        WebElement deleteButton=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        if(deleteButton.isDisplayed()){
            System.out.println("delete buton test pass");

        }else{

            System.out.println("delete buton test failed");
        }
        deleteButton.click();//after clcik delete button you cannot test it because it disappers and test case cannot find it.driver o elemente ulasamaz.

        if(!deleteButton.isDisplayed()){//exceptions/#stale_element_reference
            System.out.println("delete buton gorunmuyor test pass");

        }else{

            System.out.println("delete buton gorunmuyor test failed");
        }
//deleteElement()

        //buton.click();

//driver.close();


    }
}
