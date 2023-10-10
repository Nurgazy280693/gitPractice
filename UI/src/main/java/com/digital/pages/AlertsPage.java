//package com.digital.pages;
//
//import com.digital.helper.AlertHelper;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.testng.Assert;
//
//public class AlertsPage extends BasePage{
//
//    AlertHelper alertHelper = new AlertHelper();
//
//    @FindBy(id = "alertButton")
//    public WebElement alertButton;
//
//    @FindBy(id = "timerAlertButton")
//    public WebElement timerAlertButton;
//
//    @FindBy(id = "confirmButton")
//    public WebElement confirmButton;
//
//    @FindBy(id = "promtButton")
//    public WebElement promtButton;
//
//    @FindBy(id = "confirmResult")
//    public WebElement confirmResult;
//
//    @FindBy(id = "promptResult")
//    public WebElement promptResult;
//
//    public AlertsPage clickToAlertButton(){
//        elementActions.clickTheButton(alertButton);
//        alertHelper.acceptAlert();
//        return this;
//    }
//
//    public AlertsPage clickToTimerAlertButton(){
//        elementActions.clickTheButton(timerAlertButton);
//        alertHelper.waitAlertToBePresent();
//        return this;
//    }
//
//    public AlertsPage clickToConfirmButton(){
//        elementActions.clickTheButtonActions(confirmButton);
////        alertHelper.dismissAlert();
////        Assert.assertTrue(confirmResult.getText().contains("Cancel"));
//        return this;
//    }
//
//    public AlertsPage clickPromtButton(){
//        elementActions.clickTheButton(promtButton);
//        alertHelper.senKeysAlert("Nurik");
//        Assert.assertTrue(promptResult.getText().contains("Nurik"));
//        return this;
//    }
//}
    package com.digital.pages;

import com.digital.driver.Driver;
import com.digital.helper.AlertHelper;
import com.digital.helper.ScreenShotMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

    public class AlertsPage extends BasePage{
        AlertHelper alertHelper = new AlertHelper();
        @FindBy (id="alertButton")
        public WebElement alertButton;
        @FindBy(id= "timerAlertButton")
        public WebElement timerAlertButton;
        @FindBy(id= "confirmButton")
        public WebElement confirmButton;
        @FindBy(id="promtButton" )
        public WebElement promtButton;
        @FindBy(id= "confirmResult")
        public WebElement confirmResult;
        @FindBy(id= "promptResult")
        public WebElement promptResult;

        public AlertsPage clickAlertBtn(){
            elementActions.clickTheButton(alertButton);
            alertHelper.acceptAlert();
            return this;
        }
        public AlertsPage clickTimerAlertBtn(){
            elementActions.clickTheButton(timerAlertButton);
            alertHelper.acceptAlert();
            return this;
        }
        public AlertsPage clickConfirmButton(){
            elementActions.clickTheButton(confirmButton);
            alertHelper.dismissAlert();
            Assert.assertTrue(confirmResult.getText().contains("Cancel"));
            return this;
        }
        public AlertsPage testpromtBtn(){
            elementActions.clickTheButton(promtButton);
            alertHelper.senKeysAlert("Jika");
            Assert.assertTrue(promptResult.getText().contains("Jika"));
            return this;
        }

}
