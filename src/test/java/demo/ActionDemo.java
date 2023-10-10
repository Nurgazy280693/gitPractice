package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionDemo extends demo.BaseTest {

    @Test
    void demo1(){
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);

        actions.doubleClick(doubleClickButton).perform();

        WebElement doubleClickText = driver.findElement(By.xpath("//p[text()='You have done a double click']"));

        Assert.assertEquals(doubleClickText.getText(),"You have done a double click");

        WebElement rideClick = driver.findElement(By.id("rightClickBtn"));

        actions.contextClick(rideClick).perform();

//        Assert.assertEquals(rideClick.getText(),"You have done a right click");

//        WebElement clickBtn = driver.findElement(By.xpath("//button[text()=']"))






    }
}
