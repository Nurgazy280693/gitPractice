package com.digital.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.nio.file.WatchEvent;

public class RadioButtonPage extends BasePage{

    @FindBy(id = "yesRadio")
    public WebElement yesRadioButton;

    @FindBy(id = "impressiveRadio")
    public WebElement impressiveRadioButton;

    @FindBy(xpath = "//label[@class='custom-control-label disabled']")
    public WebElement clickNoBtn;


    @FindBy(xpath = "//span[@class='text-success']")
    public WebElement resultBtnYes;

    @FindBy(xpath = "(//label[@class='custom-control-label'])[2]")
    public WebElement resultImpressiveBtn;

    String expectedTextYes = "Yes";

    String expectedTextImpressive = "impressive";

    public RadioButtonPage clickYesRadioButton(){
        elementActions.jsClickToTheElement(yesRadioButton);
        return this;
    }

    public RadioButtonPage clickImpressiveRadioButton(){
        elementActions.jsClickToTheElement(impressiveRadioButton);
        return this;
    }

    public RadioButtonPage checkClickYesRadioButton(){
        Assert.assertTrue(resultBtnYes.getText().contains(expectedTextYes));
        return this;
    }

    public RadioButtonPage checkClickImpressiveRadioButton(){
        Assert.assertTrue(resultImpressiveBtn.getText().contains(expectedTextImpressive));
        return this;
    }

}
