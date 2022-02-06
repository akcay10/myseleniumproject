package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Day10_Synchronization2 extends TestBase {

    @Test
    public void sync02(){
        // to https://the-internet.herokuapp.com/dynamic_controls

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //Click enable Button

        //
        //WebElement enableButton = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        WebElement enableButton = driver.findElement(By.xpath("(//button[@onclick='swapInput()'])"));
        enableButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //verify the message is equal to “It's enabled!”

        WebElement enabledMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertEquals("It's enabled!", enabledMessage.getText());

        //verify the textbox is enabled (I can type in the box)

        WebElement isEnable= driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertTrue(isEnable.isEnabled());

       // boolean isEnable = driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
        //Assert.assertTrue(isEnable);

        // click on Disable button

        WebElement disableButton = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        //WebElement disableButton = driver.findElement(By.xpath("(//button[@onclick='swapInput()'])"));
        disableButton.click();

        // verify the message is equal to “It's disabled!”


        WebElement disabledMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertEquals("It's disabled!", disabledMessage.getText());
        //And verify the textbox is disabled (I cannot type in the box)
       //boolean isDisabled = driver.findElement(By.xpath("//input[@type='text']")).isEnabled();

        //Assert.assertFalse(isDisabled);

        WebElement isDisabled= driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertFalse(isDisabled.isEnabled());
    }
}