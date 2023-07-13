import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ReportsPage {
    private WebDriver driver;
    private By reportsContainer = By.id("container_reports");

    public ReportsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.example.com/reports");
        driver.manage().window().maximize();
    }

    public void clickReportsContainer() {
        driver.findElement(reportsContainer).click();
    }
}
