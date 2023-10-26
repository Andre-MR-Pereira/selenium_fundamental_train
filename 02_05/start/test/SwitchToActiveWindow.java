import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/AndrePereiraNational/Documents/NBI/drivers_selenium/chromedriver/chromedriver_v118.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabBtn = driver.findElement(By.id("new-tab-button"));
        newTabBtn.click();

        String originalHandle = driver.getWindowHandle();

        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }

        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
