package com.myfirstproject.homeworks;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
public class SignInHomework {
    WebDriver driver;
    //Faker faker;
    Faker faker=new Faker();
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(" http://automationpractice.com/index.php");
    }

    @After
    public void tearDown () {
//driver.close();
    }


    @Test
    public void signLink() throws InterruptedException {
        //faker=new Faker;

        //sign click
        WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
        sign.click();

        //email send
        WebElement emailButton = driver.findElement(By.xpath("//input[@id='email_create']"));
        emailButton.sendKeys(faker.name().firstName()+"@gmail.com");
        //submit
        WebElement createButton = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
        createButton.click();
        //verifiying
        //create account

        WebElement createAccountCheck = driver.findElement(By.xpath("//*[.='Create an account']"));
        String expectedtext = "CREATE AN ACCOUNT";
        String actual = createAccountCheck.getText();
        Assert.assertEquals("not expected", expectedtext, actual);
        //  Assert.assertTrue(createAccountCheck.isDisplayed());
        //personal info
        WebElement check = driver.findElement(By.xpath("//*[.='Your personal information']"));
        String checkInfo = "YOUR PERSONAL INFORMATION";
        String actualCheck = check.getText();
        Assert.assertEquals("not expected", checkInfo, actualCheck);
        // Assert.assertTrue(check.isDisplayed());
        //title
        WebElement check1 = driver.findElement(By.xpath("//*[.='Title']"));
        String checkInfo1 = "Title";
        String actualCheck1 = check1.getText();
        Assert.assertEquals("not expected", checkInfo, actualCheck);
        // Assert.assertTrue(check.isDisplayed());
        //filling the fields
        WebElement click1 = driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
        click1.click();
        //name
        WebElement firstName = driver.findElement(By.xpath("//*[@id='customer_firstname']"));
        firstName.sendKeys("Unal");
        //firstName.sendKeys("Unal"+Keys.ENTER);
        //lastname
        WebElement lastName = driver.findElement(By.xpath("//*[@id='customer_lastname']"));
        lastName.sendKeys(faker.name().lastName());
        //empty mail""
        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("");

        //pasword
        WebElement pswd = driver.findElement(By.xpath("//*[@id='passwd']"));
        pswd.sendKeys(faker.lorem().characters(5,10));
        //dateOfBirthhDropbox
        //days
        Thread.sleep(3000);
        WebElement day =driver.findElement(By.id("days"));
        Select daySelect = new Select(day);
        daySelect.selectByIndex(20);
        //month
        System.out.println(daySelect.getFirstSelectedOption().getText());// write on console
        WebElement month1 = driver.findElement(By.id("months"));
        //year
        Select monthSelect1 = new Select(month1);
        monthSelect1.selectByValue("5");
        WebElement year = driver.findElement(By.id("years"));
        Select yearselect = new Select(year);
        yearselect.selectByValue("1988");
        //signUp news letter
        WebElement kutu= driver.findElement(By.xpath("//input[@name='newsletter']"));
        kutu.click();

        WebElement Name = driver.findElement(By.id("firstname"));
        Name.sendKeys("");
        //firstName.sendKeys("Unal"+Keys.ENTER);
        WebElement last = driver.findElement(By.id("lastname"));
        last.sendKeys("");
        //company
        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("cag");
        //city
        WebElement address = driver.findElement(By.id("address1"));
        address.sendKeys("baku");
        //state DropDown
        WebElement state = driver.findElement(By.id("id_state"));
        Select stateSelect = new Select(state);
        stateSelect.selectByVisibleText("Alaska");
        //zipcode
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("baku");
        WebElement Zip = driver.findElement(By.id("postcode"));
        Zip.sendKeys("99503");
        //Zip.sendKeys(faker.number().digits(5));
        //country dropdown
        WebElement country=driver.findElement(By.id("id_country"));
        Select countrySelect=new Select(country);
        countrySelect.selectByVisibleText("United States");
        //additional info
        WebElement additional = driver.findElement(By.id("other"));
        additional.sendKeys("selam sizlere");
        //home phone
        WebElement phone = driver.findElement(By.id("phone"));
        phone.sendKeys("4036074568");
        phone.sendKeys(faker.phoneNumber().cellPhone());
        //mobile phone
        WebElement mobilephone = driver.findElement(By.id("phone_mobile"));
        mobilephone.sendKeys("5036076060");
        //assign reference name
        WebElement refname = driver.findElement(By.id("alias"));
        refname.clear();
        refname.sendKeys("baska adres");
        //submit acoount
        WebElement register = driver.findElement(By.id("submitAccount"));
        register.click();
        //verify account
        WebElement myaccount= driver.findElement(By.className("page-heading"));
        String control=myaccount.getText();
        Thread.sleep(2000);
        String account="MY ACCOUNT";
        Assert.assertTrue(myaccount.isDisplayed());
        //Assert.assertEquals("hi","MY ACCOUNT",myaccount.getText());
        //Assert.assertEquals("hi",control,control);
    }
    @Test
    public void signIn() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("email")).sendKeys("un1234@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("ak1234");
        driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
        WebElement sigIn = driver.findElement(By.xpath("//h1[@class='page-heading']"));
        Assert.assertTrue(sigIn.isDisplayed());
    }

}
