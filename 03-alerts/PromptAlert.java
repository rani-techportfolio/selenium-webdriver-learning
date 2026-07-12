package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PromptAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Locate the JS Prompt Alert button
		WebElement confirmAlertBtn = driver.findElement(By.xpath("//button[contains(text(),'JS Prompt')]"));
		confirmAlertBtn.click();
		
		//Switching to the alert and handling it		
		Alert promptAlert = driver.switchTo().alert();
		
		String msg = "Hello..Prompt Alert Handling in Progress";		
		
		promptAlert.sendKeys(msg);		
		promptAlert.accept();
		
		//Verify the on screen message after handling the alert
		String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		Assert.assertTrue(actualText.contains(msg));
		
		driver.quit();

	}

}
