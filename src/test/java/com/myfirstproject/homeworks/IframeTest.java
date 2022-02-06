package com.myfirstproject.homeworks;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IframeTest extends TestBase {
    @Test
    public void iframeTest() throws InterruptedException {

        driver.get("https://html.com/tags/iframe/");

        Actions actions=new Actions(driver);

        //Need to scroll down the page, otherwise the iframe of play button is not displayed
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Locating and switching to the iframe. Because play button is inside the frame
        WebElement firstIFrame=driver.findElement(By.xpath("//iframe[@class='lazy-loaded']"));
        driver.switchTo().frame(firstIFrame);

        //Locating and clicking teh play button
        WebElement playButton=driver.findElement(By.xpath("//button[@aria-label='Play']"));
        playButton.click();

        Thread.sleep(5000);
        WebElement stop=driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
        stop.click();


    }
}
