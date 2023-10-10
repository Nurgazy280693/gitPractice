package com.digital.helper;

import com.digital.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHelper {

    WebDriver driver = Driver.getDriver();

    public FrameHelper switchToFrameById(String frameId){
        driver.switchTo().frame(frameId);
        return this;
    }

    public FrameHelper switchToFrameByIndex(int index){
        driver.switchTo().frame(index);
        return this;
    }

    public FrameHelper switchToParentFrame(){
        driver.switchTo().parentFrame();
        return this;
    }

    public FrameHelper switchToDefaultContentFrame(){
        driver.switchTo().defaultContent();
        return this;
    }

    public FrameHelper switchToFrameWebElement(WebElement frameElement){
        driver.switchTo().frame(frameElement);
        return this;
    }
}
