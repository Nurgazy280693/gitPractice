package com.digital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ButtonsPage extends BasePage{

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickBtn;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickBtn;

    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement clickMeBtn;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy(id = "rightClickMessage")
    public WebElement rightClickMessage;

    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;

    public  ButtonsPage doubleClickButtonTest(){
        elementActions.doubleClickTheButtonActions(doubleClickBtn);
        Assert.assertTrue(doubleClickMessage.getText().contains("You have done a double click"));
        return this;
    }

    public  ButtonsPage rightClickButtonTest(){
        elementActions.rightClickTheButtonActions(rightClickBtn);
        Assert.assertTrue(rightClickMessage.getText().contains("You have done a right click"));
        return this;
    }

    public  ButtonsPage clickMeButtonTest(){
        elementActions.clickTheButtonActions(clickMeBtn);
        Assert.assertTrue(dynamicClickMessage.getText().contains("You have done a dynamic click"));
        return this;
    }
}
