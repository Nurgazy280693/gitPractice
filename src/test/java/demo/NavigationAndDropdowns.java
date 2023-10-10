package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class NavigationAndDropdowns extends BaseTest{

    @Test
    void demo1() throws InterruptedException {

        driver.navigate().to("https://nambafood.kg/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//a[@href='/food'])[1]")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(4000);

    }


    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement selectColor = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(selectColor);
        select.selectByVisibleText("Green");
        Thread.sleep(3000);

        select.selectByValue("4");
        Thread.sleep(3000);

        select.selectByIndex(7);
        Thread.sleep(3000);


        List<WebElement> selectedOptions = select.getOptions();

        for(WebElement options: selectedOptions){
            System.out.println(options.getText());
        }

        selectRandomColor(select, selectedOptions);

        WebElement selectReact = driver.findElement(By.id("react-select-4-input"));

        selectReact.sendKeys("Group 1, option 1");
        Thread.sleep(3000);

    }
    @Test
    public void selectRandomColor(Select select, List<WebElement> selectedOptions) throws InterruptedException {
        Random randomColor = new Random();
        int indexColor = randomColor.nextInt(selectedOptions.size());
        select.selectByIndex(indexColor);
        System.out.println(indexColor);

        Thread.sleep(3000);
    }
    @Test
    void demo3() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

        WebElement selectReact = driver.findElement(By.id("react-select-2-input"));

        selectReact.sendKeys("Select Option");

        Thread.sleep(3000);




    }

}
