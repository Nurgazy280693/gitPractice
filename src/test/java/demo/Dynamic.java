package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dynamic extends demo.BaseTest {

    @FindBy(id = "enableAfter")
    public WebElement enableAfter;

    @FindBy(xpath = "//button[@id='colorChange']")
    public WebElement colorChange;

    @FindBy(id = "visibleAfter")
    public WebElement visibleAfter;

    @Test(priority = 1)
    public void clickclick() throws InterruptedException {
        driver.get("https://demoqa.com/dynamic-properties");
        new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")))
                .click();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void visibleA() throws InterruptedException {
        new WebDriverWait(driver,Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")))
                .click();
        Thread.sleep(3000);
    }

}
