import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/AndrePereiraNational/Documents/NBI/drivers_selenium/chromedriver/chromedriver_v118.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();

        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();

        confirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertText(driver));

        driver.quit();
    }
}