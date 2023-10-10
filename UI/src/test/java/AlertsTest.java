import org.testng.annotations.Test;

public class AlertsTest extends BaseTest{

    @Test
    void AlertsTest(){
        driver.get("https://demoqa.com/alerts");
        alertsPage.clickAlertBtn()
                .clickTimerAlertBtn()
                .clickConfirmButton()
                .testpromtBtn();
    }
}
