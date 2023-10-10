package com.digital.pages;

import com.digital.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CheckBoxPage extends BasePage {
    @FindBy(xpath = "//button[@aria-label='Expand all']")
    public WebElement checkHome;

    @FindBy(xpath = "//div[@id='tree-node']//span[@class='rct-checkbox']")
    public List<WebElement> chooseAllBoxes;

    @FindBy(id = "result")
    public WebElement resultText;

    public CheckBoxPage clickCheckHome(){
        checkHome.click();
        return this;
    }

    public CheckBoxPage chooseElement() {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", checkHome);


        for (int i = 0; i < chooseAllBoxes.size(); i++) {
            if (i == 0 || i == 1 || i == 4 || i == 5 || i == 9 || i == 14) {
            } else {
                System.out.println(i);
                WebElement tootle = chooseAllBoxes.get(i);
                tootle.click();
            }
        }
        return this;
    }

    public CheckBoxPage testAssert() {

        String text = "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        Assert.assertTrue(resultText.getText().contains(text));
        return this;
    }
}