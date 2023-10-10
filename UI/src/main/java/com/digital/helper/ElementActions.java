package com.digital.helper;

import com.digital.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ElementActions {


    Actions actions = new Actions(Driver.getDriver());

    public ElementActions waitButtonBeClickAble(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public ElementActions waitElementToBeVisible(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public ElementActions clickTheButton(WebElement element){
        waitButtonBeClickAble(element);
        element.click();
        return this;
    }

    public ElementActions writeText(WebElement element, String txt){
        waitElementToBeVisible(element);
        element.sendKeys(txt);
        return this;
    }

    public ElementActions scrollToTheElement(WebElement element){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});", element);
        return this;
    }
    public ElementActions clickToRandomElement(List<WebElement> element){
        int randomIndex = new Random().nextInt(element.size());
        WebElement randomLabel = element.get(randomIndex);
        randomLabel.click();
        return this;
    }

    public ElementActions setTextAndEnterElement(String txt,WebElement element){
        writeText(element,txt);
        element.sendKeys(Keys.ENTER);
        return this;
    }

    public ElementActions jsClickToTheElement(WebElement element){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
        return this;
    }

    public ElementActions clickTheButtonActions(WebElement element) {
        waitButtonBeClickAble(element);
        actions.moveToElement(element).perform();
        element.click();
        return this;
    }

    public ElementActions doubleClickTheButtonActions(WebElement element) {
        waitButtonBeClickAble(element);
        actions.moveToElement(element).doubleClick(element).perform();
        return this;
    }

    public ElementActions rightClickTheButtonActions(WebElement element) {
        waitButtonBeClickAble(element);
        actions.moveToElement(element).contextClick(element).perform();
        return this;
    }

}
