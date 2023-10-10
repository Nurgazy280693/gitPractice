package demo;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class nambaFood extends BaseTest{

    @Test
    void orderingFood() throws InterruptedException {
        driver.get("https://nambafood.kg/");

        WebElement food = driver.findElement(By.xpath("(//a[@href='/food'])[1]"));
        food.click();

        WebElement nationalFood = driver.findElement(By.xpath("html/body/div[2]/main/section[3]/div/a"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nationalFood);

        nationalFood.click();

        WebElement arabesk = driver.findElement(By.xpath("//div[@class='catalog-wrap']/a[2]"));

//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arabesk);

        arabesk.click();

        WebElement plusBlinchik = driver.findElement(By.xpath("(//div[@class='card--item-action']/div[2]/div[@class='count-button count-up'])[1]"));

        plusBlinchik.click();
        plusBlinchik.click();

        WebElement orderBlinshik = driver.findElement(By.xpath("//div[@data-item-id='114588']/button"));

        orderBlinshik.click();

        WebElement plusKasha = driver.findElement(By.xpath("(//div[@class='card--item-action']/div[2]/div[@class='count-button count-up'])[5]"));

        plusKasha.click();
        plusKasha.click();

        WebElement orderKasha = driver.findElement(By.xpath("//div[@data-item-id='114588']/button"));

        orderKasha.click();

        WebElement coca_cola = driver.findElement(By.xpath("//div[@data-item-id='18556']/div[2]/div[2]"));

        coca_cola.click();

        WebElement orderCoca_cola = driver.findElement(By.xpath("//div[@data-item-id='18556']/button"));

        orderCoca_cola.click();

//        WebElement basket = driver.findElement(By.xpath("//div[@id='cart']"));
        WebElement basket = driver.findElement(By.id("cart"));

        basket.click();

        WebElement checkOut = driver.findElement(By.xpath("//a[@href='/arabesk/checkout']"));

        checkOut.click();

        WebElement nameField = driver.findElement(By.id("food_order_client_name"));

        String expectedFulName = "John Doe";

        nameField.sendKeys(expectedFulName);

        WebElement addressField = driver.findElement(By.id("food_order_address"));

        String address = "Юнусалиева 5";

        addressField.sendKeys(address);

        Thread.sleep(7000);





    }
}
