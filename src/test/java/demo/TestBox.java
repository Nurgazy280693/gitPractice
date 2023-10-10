package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBox extends BaseTest{

    @Test
    void fillUpTheFormTest1() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");

        WebElement fulNameInputField = driver.findElement(By.id("userName"));

        String expectedFulName = "John Done";

        fulNameInputField.sendKeys(expectedFulName);

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "john@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        String expectedCurrentAdd = "Bishkek";

        currentAddress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        String expectedPermanentAdd = "New York";

        permanentAddress.sendKeys(expectedPermanentAdd);

        WebElement submitBth = driver.findElement(By.id("submit"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBth);

        submitBth.click();

        Thread.sleep(5000);

        WebElement resultName = driver.findElement(By.id("name"));

        Assert.assertTrue(resultName.getText().contains(expectedFulName));

        WebElement resultEmail = driver.findElement(By.id("email"));

        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains(expectedCurrentAdd));

        WebElement resultPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAddress.getText().contains(expectedPermanentAdd));



    }
    @Test
    void fillUpTheFormTest2() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");

        WebElement fulNameInputField = driver.findElement(By.id("userName"));

        String expectedFulName = "John Done";

        fulNameInputField.sendKeys(expectedFulName);

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "john@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        String expectedCurrentAdd = "Bishkek";

        currentAddress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        String expectedPermanentAdd = "New York";

        permanentAddress.sendKeys(expectedPermanentAdd);

        WebElement submitBth = driver.findElement(By.id("submit"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBth);

        submitBth.click();

        Thread.sleep(5000);

        WebElement resultName = driver.findElement(By.id("name"));

        Assert.assertTrue(resultName.getText().contains(expectedFulName));

        WebElement resultEmail = driver.findElement(By.id("email"));

        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains(expectedCurrentAdd));

        WebElement resultPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAddress.getText().contains(expectedPermanentAdd));


    }
    @Test
    void fillUpTheFormTest3() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");

        WebElement fulNameInputField = driver.findElement(By.id("userName"));

        String expectedFulName = "John Done";

        fulNameInputField.sendKeys(expectedFulName);

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "john@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        String expectedCurrentAdd = "Bishkek";

        currentAddress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        String expectedPermanentAdd = "New York";

        permanentAddress.sendKeys(expectedPermanentAdd);

        WebElement submitBth = driver.findElement(By.id("submit"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBth);

        submitBth.click();

        Thread.sleep(5000);

        WebElement resultName = driver.findElement(By.id("name"));

        Assert.assertTrue(resultName.getText().contains(expectedFulName));

        WebElement resultEmail = driver.findElement(By.id("email"));

        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains(expectedCurrentAdd));

        WebElement resultPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAddress.getText().contains(expectedPermanentAdd));



    }
    @Test
    void fillUpTheFormTest4() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");

        WebElement fulNameInputField = driver.findElement(By.id("userName"));

        String expectedFulName = "John Done";

        fulNameInputField.sendKeys(expectedFulName);

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "john@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        String expectedCurrentAdd = "Bishkek";

        currentAddress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        String expectedPermanentAdd = "New York";

        permanentAddress.sendKeys(expectedPermanentAdd);

        WebElement submitBth = driver.findElement(By.id("submit"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBth);

        submitBth.click();

        Thread.sleep(5000);

        WebElement resultName = driver.findElement(By.id("name"));

        Assert.assertTrue(resultName.getText().contains(expectedFulName));

        WebElement resultEmail = driver.findElement(By.id("email"));

        Assert.assertT(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains(expectedCurrentAdd));

        WebElement resultPrueermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAddress.getText().contains(expectedPermanentAdd));




    }
}
