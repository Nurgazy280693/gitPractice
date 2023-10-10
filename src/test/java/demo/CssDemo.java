package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.nio.file.Watchable;
import java.util.List;

public class CssDemo extends BaseTest{

    @Test
    void cssDemo1() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        search.sendKeys("iphone");
        search.sendKeys(Keys.ENTER);

        List<WebElement> brands = driver.findElements(By.cssSelector("li[id^='p_89']"));

        for(WebElement brand:brands){
            System.out.println(brand.getText());
        }



        Thread.sleep(7000);

    }
}
