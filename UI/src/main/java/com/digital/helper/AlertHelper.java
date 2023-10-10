package com.digital.helper;

import lombok.Data;
import com.digital.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
@Data
public class AlertHelper {

    Alert alert;

    public AlertHelper switchToAlert(){
        alert = Driver.getDriver().switchTo().alert();
        return this;
    }
    public AlertHelper waitAlertToBePresent(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8))
                .until(ExpectedConditions.alertIsPresent());
        return this;
    }
    public AlertHelper acceptAlert(){
        waitAlertToBePresent();
        switchToAlert();
        alert.accept();
        return this;
    }
    public AlertHelper dismissAlert(){
        waitAlertToBePresent();
        switchToAlert();
        alert.dismiss();
        return this;
    }
    public AlertHelper senKeysAlert(String Keys){
        waitAlertToBePresent();
        switchToAlert();
        alert.sendKeys(Keys);
        alert.accept();
        return this;
    }
}
