package com.myfirstproject.homeworks;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonDropdown extends TestBase {
    /*
    Create A Class: AmazonDropdown
●
● Create A Method dropdownTest
●
● Go to https://www.amazon.com/
●
● Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
●
● Print the first selected option and assert if it equals “All Departments”
●
● Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you
select you to need to use the get first selected option method)
●
● Print all of the dropdown options
●
● Print the total number of options in the dropdown
●
● Check if Appliances is a drop-down option. Print true if “Appliances” is an option. Print false
otherwise.
●
● BONUS: Check if the dropdown is in Alphabetical Order
     */

@Test
    public void dropdownTest() throws InterruptedException {

        driver.get(" https://www.amazon.com/");

        WebElement dropDown= driver.findElement(By.id("searchDropdownBox"));

    Actions action=new Actions(driver);

    action.moveToElement(dropDown).perform();

    Select select=new Select(dropDown);

    select.selectByVisibleText("All Departments");
select.getFirstSelectedOption();
String newnew2=select.getFirstSelectedOption().getText();
    //WebElement selected=select.getFirstSelectedOption();

Assert.assertEquals("degil","All Departments",newnew2);



    select.selectByIndex(3);
    select.getFirstSelectedOption();
    String new3=select.getFirstSelectedOption().getText();

    String amazon="Amazon Devices";
    //Assert.assertEquals("degil 2","amazon",new3);


    List<WebElement> alloptions=select.getOptions();

    for(WebElement eachOne:alloptions){

        System.out.println(eachOne.getText());
    }

    int numberOfOption = alloptions.size();
    System.out.println("numberof options " + numberOfOption);


   if(select.getOptions().contains("Appliances")) {
       System.out.println("True");

   }else{

       System.out.println("false");


   }



    }

    @Test
    public void bonus() throws InterruptedException {
        Thread.sleep(2000);
        driver.get(" https://www.amazon.com/");
        WebElement dropDown= driver.findElement(By.id("searchDropdownBox"));
        Select se = new Select(dropDown);

        List<String> originalList = new ArrayList();
        List<String> tempList = new ArrayList();

        for (WebElement e : se.getOptions()) {
            originalList.add(e.getText());
            tempList.add(e.getText());
        }
        System.out.println(" this is originalList before Sorting tempList"+ originalList);
        Collections.sort(tempList,String.CASE_INSENSITIVE_ORDER);
        System.out.println(" this is originalList after sorting tempList"+ originalList);
        System.out.println(" this is tempList"+ tempList);
       // Assert.assertEquals(tempList,originalList);

        if(tempList.equals(originalList)){

            System.out.println("Sorted");

        }else{

            System.out.println("NOt sorted");
        }

    }
}
