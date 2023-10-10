import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest{

    @Test
    void fillUpTheFormTest(){

        driver.get("");
        textBoxPage.fillUpTheCurrentAddress("dfsgdgf");
    }
}
