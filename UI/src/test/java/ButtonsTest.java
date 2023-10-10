import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{

    @Test
    void ButtonsTestPage(){
        driver.get("https://demoqa.com/buttons");
        buttonsPage.doubleClickButtonTest()
                .rightClickButtonTest()
                .clickMeButtonTest();
    }
}
