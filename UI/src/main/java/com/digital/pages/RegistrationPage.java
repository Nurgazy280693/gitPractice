package com.digital.pages;

import com.digital.models.UserToRegister;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    @FindBy(id = "firstname")
    public WebElement firstNameInput;

    @FindBy(id = "lastname")
    public WebElement lastNameInput;

    @FindBy(id = "userName")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "recaptcha-anchor")
    public WebElement recaptchaAnchorClick;

    @FindBy(id = "register")
    public WebElement registerClick;

    public RegistrationPage fillUpTheFirstName(String FirstName){
        elementActions.writeText(firstNameInput, FirstName);
        return this;
    }

    public RegistrationPage fillUpTheLastName(String LastName){
        elementActions.writeText(lastNameInput, LastName);
        return this;
    }

    public RegistrationPage fillUpTheUserName(String UserName){
        elementActions.writeText(userNameInput, UserName);
        return this;
    }

    public RegistrationPage fillUpThePassword(String Password){
        elementActions.writeText(passwordInput, Password);
        return this;
    }

    public RegistrationPage clickRegisterBtn(){
        elementActions.clickTheButton(registerClick);
        return this;
    }

    public RegistrationPage fillUpTheFormRegistrationUser(UserToRegister user1) throws InterruptedException {
        fillUpTheFirstName(user1.getFirsName())
                .fillUpTheLastName(user1.getLastName())
                .fillUpTheUserName(user1.getUserName())
                .fillUpThePassword(user1.getPassword())
                .clickRegisterBtn();
        Thread.sleep(5000);
        return this;
    }
}
