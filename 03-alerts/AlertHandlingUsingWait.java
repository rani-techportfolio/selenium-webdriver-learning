package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//Handling an alert using Explicit wait
public class AlertHandlingUsingWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();

		// Locate the Click Me button to prompt an alert that appears after 5 seconds
		WebElement clickMeBtn = driver.findElement(By.xpath("(//button[text()='Click Me'])[1]"));
		clickMeBtn.click();

		try {
			WebDriverWait alertwait = new WebDriverWait(driver, Duration.ofSeconds(5));
			
			Alert alert = alertwait.until(ExpectedConditions.alertIsPresent());
			
			System.out.println(alert.getText());
			
			alert.accept();
			
		} catch (NoAlertPresentException e) {
			System.out.println("No alert appears after 5 seconds");
		}

		driver.quit();

	}

}
