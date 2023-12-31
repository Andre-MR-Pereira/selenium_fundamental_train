import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public FormPage() {}
    public static void submitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("Andre");
        driver.findElement(By.id("last-name")).sendKeys("Pereira");

        driver.findElement(By.id("job-title")).sendKeys("Junior Release Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("10/31/2023");

        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}