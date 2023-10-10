import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest{

    @Test
    void clickYesRadioButtonTest(){
        driver.get("https://demoqa.com/radio-button");
        radioButtonPage.clickYesRadioButton()
                .checkClickYesRadioButton();
    }

    @Test
    void clickImpressiveRadioButtonTest(){
        driver.get("https://demoqa.com/radio-button");
        radioButtonPage.clickImpressiveRadioButton()
                .checkClickImpressiveRadioButton();
    }
}
