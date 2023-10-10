package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElementDemo extends BaseTest{

    @Test
    void demo1234() throws InterruptedException {

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

        WebElement submit = driver.findElement(By.id("submit"));


//        submit.click();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        js.executeScript("arguments[0].click()",submit);

        Actions actions = new Actions(driver);

        actions.moveToElement(submit).perform();

        Thread.sleep(7000);

    }
}
