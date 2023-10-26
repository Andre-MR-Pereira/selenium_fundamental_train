import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/AndrePereiraNational/Documents/NBI/drivers_selenium/chromedriver/chromedriver_v118.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("3009 Lake Dr, Citywest, Dublin, D24 H6RR");

        Thread.sleep(1000);
        WebElement autocompleteResult = driver.findElement(By.className("dismissButton"));

        autocompleteResult.click();

        driver.quit();
    }
}
