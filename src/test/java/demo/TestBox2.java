package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestBox2 extends  BaseTest{

    @Test
    void studentRegistration() throws InterruptedException {

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstNameInputField = driver.findElement(By.id("firstName"));
        String expectedFirstName = "John";
        firstNameInputField.sendKeys(expectedFirstName);

        WebElement lastNameInputField = driver.findElement(By.id("lastName"));
        String expectedLastName = "Doe";
        lastNameInputField.sendKeys(expectedLastName);

        WebElement emailInputField = driver.findElement(By.id("userEmail"));
        String expectedEmail = "John@mail.ru";
        emailInputField.sendKeys(expectedEmail);

        WebElement genderField = driver.findElement(By.id("gender-radio-1"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", genderField);

        WebElement mobileField = driver.findElement(By.id("userNumber"));
        String expectedMobile = "0700091860";
        mobileField.sendKeys(expectedMobile);

        WebElement dateOfBirthField = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthField.click();

        WebElement dateOfBirthFieldMonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']/option[@value='5']"));
        dateOfBirthFieldMonth.click();

        WebElement dateOfBirthFieldYear = driver.findElement(By.xpath("//div[@class='react-datepicker__header']/div[2]/div[2]/select/option[@value='1993']"));
        dateOfBirthFieldYear.click();

        WebElement datePickerDaySelect = driver.findElement(By.className("react-datepicker__month"));
        WebElement dayElement = datePickerDaySelect.findElement(By.xpath(".//*[text()='18']"));
        dayElement.click();

        WebElement subjectsField = driver.findElement(By.id("subjectsInput"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", subjectsField, "border: 2px dashed red");

        subjectsField.sendKeys("Maths");
        subjectsField.sendKeys(Keys.ENTER);

        subjectsField.sendKeys("English");
        subjectsField.sendKeys(Keys.ENTER);

        WebElement hobbiesField = driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div/input"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", hobbiesField);

        WebElement pictureField = driver.findElement(By.id("uploadPicture"));
        pictureField.sendKeys("\\\\dc\\Office\\Docs\\n.omorbekov\\Рабочий стол\\Новая папка");

        WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
        currentAddressField.sendKeys("Bishkek");

        WebElement stateAndCityField = driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stateAndCityField);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", stateAndCityField);







        Thread.sleep(7000);
    }
}
