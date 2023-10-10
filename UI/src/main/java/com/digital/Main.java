package com.digital;

import com.digital.helper.AlertHelper;
import com.digital.pages.PracticeForm;
import com.digital.pages.TextBoxPage;
import com.digital.driver.Driver;
import com.digital.helper.FrameHelper;
import com.digital.helper.ScreenShotMethods;
import com.digital.models.Student;
import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    WebDriver driver = Driver.getDriver();
    @Test
    public void testTextBoxPage (){
        driver.get("https://demoqa.com/text-box");
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.fillUpTheFullName("Nurik")
                .fillUpTheEmail("nurik@mail.ru")
                .fillUpTheCurrentAddress("Bishkek")
                .fillUpThePermanentAddress("Bishkek")
                 .submitClick().testTextBoxPage();
    }
    @Test
    public void testPracticeForm(){
        driver.get("https://demoqa.com/automation-practice-form");
        PracticeForm student1 = new PracticeForm();
        student1.fillUpTheFirstName("Nurgazy")
                .fillUpTheLastName("Omorbekov")
                .fillUpTheUserEmail("nurik--5@mail.ru")
                .clickGender()
                .fillUpTheUserNumber("0700102950")
                .selectSubject()
                .fillUpTheCurrentAddress("Bishkek")
                .clickHobbies()
                .uploadThePicture()
                .selectState()
                .clickSubmitBtn();
    }

    @Test
    public void testPracticeFormPart2() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");
        Student student = new Student();
        student.setFirsName("Nurgazy");
        student.setLastName("Omorbekov");
        student.setEmail("nurik--5@mail.ru");
        student.setCurrentAddress("Bishkek");
        student.setPhoneNumber("0700102950");

        PracticeForm practiceForm = new PracticeForm();
        practiceForm.fillUpTheForm(student).checkTheStudentDetails(student);

    }
    @Test
    public void testPart3() {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.id("timerAlertButton")).click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss();

        driver.findElement(By.id("promtButton")).click();

        alert.sendKeys("Nurgazy");
        alert.accept();
    }

    @Test
    public void testToAlertElements() {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.acceptAlert();

        driver.findElement(By.id("timerAlertButton")).click();
        alertHelper.acceptAlert();

        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dismissAlert();

        driver.findElement(By.id("promtButton")).click();
        alertHelper.senKeysAlert("Nurgazy");
    }

    @Test
    void test12(){
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        WebElement div = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(div);
    }
    @Test
    void test13(){
        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1");
        driver.switchTo().frame(0);

        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "Child Iframe");
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
    }

    @Test
    void test14() throws InterruptedException {
        FrameHelper frameHelper = new FrameHelper();
        driver.get("https://demoqa.com/nestedframes");
        frameHelper.switchToFrameById("frame1");
        System.out.println(driver.findElement(By.tagName("body")).getText());
        frameHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.xpath("//div[@id='framesWrapper']/div")).getText());
//                  .switchToFrameByIndex(0);
//                .switchToDefaultContentFrame();
//                .switchToFrameWebElement(driver.findElement(By.tagName("frame1")));
        Thread.sleep(3000);
    }
    @Test
    void test15() throws InterruptedException, IOException {
        ScreenShotMethods screenShotMethods = new ScreenShotMethods();
        FrameHelper frameHelper = new FrameHelper();
        driver.get("https://demoqa.com/nestedframes");
//        frameHelper.switchToFrameById("frame1");
        frameHelper.switchToFrameByIndex(0);
        System.out.println(driver.findElement(By.tagName("body")).getText());
//        frameHelper.switchToParentFrame();

//        System.out.println(driver.findElement(By.xpath("//div[@id='framesWrapper']/div")).getText());

//                .switchToDefaultContentFrame();
//                .switchToFrameWebElement(driver.findElement(By.tagName("frame1")));
        Thread.sleep(3000);
//        screenShotMethods.takeScreenShot();
        Driver.closeDriver();
    }

    @Test
    void test16(){
        driver.get("https://www.amazon.com");

        WebElement search = driver.findElement(By.xpath("twotabsearchtextbox"));
        search.sendKeys("iphone");

        search.sendKeys(Keys.ENTER);


        List<WebElement> brands = driver.findElements(By.cssSelector("li[id^='p_89']"));

        for (WebElement brand:brands) {
            System.out.println(brand.getText());
            WebElement checkbox = brand.findElement(By.tagName("i"));
            checkbox.click();
            //StaleElementReferenceException: - ссылка на устаревший элемент
        }
    }

}