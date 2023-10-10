import com.digital.driver.Driver;
import com.digital.pages.*;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public PracticeForm practiceForm;
    public FakeDataProvider fakeDataProvider;
    public RegistrationPage registrationPage;
    public RadioButtonPage radioButtonPage;
    public ButtonsPage buttonsPage;
    public AlertsPage alertsPage;

    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
        practiceForm = new PracticeForm();
        fakeDataProvider = new FakeDataProvider();
        registrationPage = new RegistrationPage();
        radioButtonPage = new RadioButtonPage();
        buttonsPage = new ButtonsPage();
        alertsPage = new AlertsPage();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        Driver.closeDriver();
    }
}
