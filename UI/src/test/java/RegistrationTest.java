import com.digital.models.UserToRegister;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{

    @Test
    void fillUpTheRegisterForm() throws InterruptedException {
        driver.get("https://demoqa.com/register");
        UserToRegister user1 = fakeDataProvider.createFakeUser();
        registrationPage.fillUpTheFormRegistrationUser(user1);
    }
    @Test
    void testFrame(){
        driver.get("https://demoqa.com/register");

    }
}
