package com.digital.driver;

import com.digital.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    public Driver(){
        // singel patter
    }

    private static WebDriver driver;

    public static  WebDriver getDriver(){
        if(driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FirefoxWebDriver.loadFirefoxWebDriver();
                    break;
                default:
                    throw new IllegalArgumentException("not");
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver!=null){
                driver.close();
                driver.quit();
                driver=null;
            }
        } catch (Exception e){
            System.err.println("Error while closing the driver");
        }
    }
}
