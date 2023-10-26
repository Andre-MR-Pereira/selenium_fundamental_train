import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TestSample  {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/AndrePereiraNational/Documents/NBI/drivers_selenium/chromedriver/chromedriver_v118.exe");
        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("National Broadband Ireland");

        // Now submit the form
        element.submit();

        //Close the browser
        driver.quit();
    }
}


