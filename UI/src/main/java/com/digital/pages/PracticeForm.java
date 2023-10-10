package com.digital.pages;

import com.digital.models.Student;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

public class PracticeForm extends BasePage{

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(xpath = "//div[contains(@class, 'custom-radio')]//label[@class='custom-control-label']")
    public List<WebElement> radioGenderButtons;

    @FindBy(id = "userNumber")
    public WebElement userNumberInput;

    @FindBy(id="subjectsInput")
    public WebElement subjects;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    public List<WebElement> hobbiesCheckboxList;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPictureInput;

    @FindBy(xpath = "//div[@id='state']//div[@aria-hidden='true']")
    public WebElement inputOpenState;

    @FindBy(id = "react-select-3-input")
    public WebElement inputForSetText;

    @FindBy(id = "react-select-4-input")
    public WebElement inputForSetCity;

    @FindBy (xpath = "//div[@id='state']//div[2]")
    public List<WebElement> containerForStateTexts;

    @FindBy(id= "submit")
    public WebElement submitBtn;

    @FindBy(id = "dateOfBirthInputField")
    public WebElement dataOfBirth;

    @FindBy(xpath = "//td[text()='Student Name']/../td[2]")
    public WebElement expectedName;

    @FindBy(xpath = "//td[text()='Student Email']/../td[2]")
    public WebElement expectedEmail;

    @FindBy(xpath = "//td[text()='Gender']/../td[2]")
    public WebElement expectedGender;

    @FindBy(xpath = "//td[text()='Mobile']/../td[2]")
    public WebElement expectedMobilePhone;

    @FindBy(xpath = "//td[text()='Date of Birth']/../td[2]")
    public WebElement expectedDate;

    @FindBy(xpath = "//td[text()='Subjects']/../td[2]")
    public WebElement expectedSubjects;

    @FindBy(xpath = "//td[text()='Hobbies']/../td[2]")
    public WebElement expectedHobbies;

    @FindBy(xpath = "//td[text()='Picture']/../td[2]")
    public WebElement expectedPicture;

    @FindBy(xpath = "//td[text()='Address']/../td[2]")
    public WebElement expectedAddress;

    @FindBy(xpath = "//td[text()='State and City']/../td[2]")
    public WebElement expectedStateAndCity;

    public PracticeForm fillUpTheFirstName(String txt) {
        elementActions.writeText(firstNameInput, txt);
        return this;
    }
    public PracticeForm fillUpTheLastName(String txt) {
        elementActions.writeText(lastNameInput, txt);
        return this;
    }
    public PracticeForm fillUpTheUserEmail(String txt) {
        elementActions.writeText(userEmailInput, txt);
        return this;
    }
    public PracticeForm clickGender() {
        elementActions.clickToRandomElement(radioGenderButtons);
        return this;
    }
    public PracticeForm fillUpTheCurrentAddress(String  txt) {
        elementActions.writeText(currentAddress, txt);
        return this;
    }
    public PracticeForm clickHobbies() {
        elementActions.clickToRandomElement(hobbiesCheckboxList);
        return this;
    }
    public PracticeForm fillUpTheUserNumber(String  txt) {
        elementActions.writeText(userNumberInput, txt);
        return this;
    }
    public PracticeForm uploadThePicture() {
        elementActions.writeText(uploadPictureInput,"\\\\dc\\Office\\Docs\\n.omorbekov\\Рабочий стол\\Новая папка\\Фото1.jpg");
        return this;
    }
    public PracticeForm selectState() {
        elementActions.scrollToTheElement(inputOpenState);
        elementActions.clickTheButton(inputOpenState);
        Map<String, String[]> stateAndCityList = new HashMap<>();
        stateAndCityList.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
        stateAndCityList.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
        stateAndCityList.put("Haryana", new String[]{"Karnal", "Panipat"});
        stateAndCityList.put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});
        Random random = new Random();
        String randomKey = new ArrayList<>(stateAndCityList.keySet()).get(random.nextInt(stateAndCityList.size()));
        String randomCity = stateAndCityList.get(randomKey)[random.nextInt(stateAndCityList.get(randomKey).length)];
        elementActions.setTextAndEnterElement(randomKey, inputForSetText);
        elementActions.setTextAndEnterElement(randomCity, inputForSetCity);
        return this;
    }

    public PracticeForm selectSubject() {
        elementActions.clickTheButton(subjects);
        List<String> subjectsList = new ArrayList<>();
        subjectsList.add("Accounting");
        subjectsList.add("Arts");
        subjectsList.add("Maths");
        subjectsList.add("Social Studies");
        subjectsList.add("Biology");
        subjectsList.add("Chemistry");
        subjectsList.add("Computer Science");
        subjectsList.add("Commerce");
        subjectsList.add("Hindi");
        subjectsList.add("English");
        subjectsList.add("Physics");
        subjectsList.add("Economics");
        subjectsList.add("History");

        Random random= new Random();

        String randomSubject = subjectsList.get(random.nextInt(subjectsList.size()));
        elementActions.writeText(subjects, randomSubject);
        elementActions.writeText(subjects, ""+ Keys.ENTER);
        return this;
    }
    public PracticeForm clickSubmitBtn(){
        elementActions.clickTheButton(submitBtn);
        return this;

    }

    public PracticeForm fillUpTheForm(Student student) throws InterruptedException, AWTException {
        Robot robot = new Robot();
//        System.out.println("About to zoom in");
//        for (int i = 0; i < 3; i++) {
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_ADD);
//            robot.keyRelease(KeyEvent.VK_ADD);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//        }
        System.out.println("About to zoom out");
        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        Thread.sleep(3000);
        fillUpTheFirstName(student.getFirsName())
                .fillUpTheLastName(student.getLastName())
                .fillUpTheUserEmail(student.getEmail())
                .fillUpTheUserNumber(student.getPhoneNumber())
                .fillUpTheCurrentAddress(student.getCurrentAddress())
                .clickGender()
                .clickHobbies()
                .uploadThePicture()
                .selectSubject()
                .selectState()
                .clickSubmitBtn();


        return this;
    }
    public PracticeForm checkTheStudentDetails(Student student){
        Assert.assertTrue(expectedName.getText().contains(student.getFirsName()));
        Assert.assertTrue(expectedName.getText().contains(student.getLastName()));
        Assert.assertTrue(expectedEmail.getText().contains(student.getEmail()));
        Assert.assertTrue(expectedAddress.getText().contains(student.getCurrentAddress()));
        Assert.assertTrue(expectedMobilePhone.getText().contains(student.getPhoneNumber()));
        return this;
    }
}
