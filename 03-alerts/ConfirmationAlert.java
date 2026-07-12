package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ConfirmationAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Locate the JS Confirm Alert button
		WebElement confirmAlertBtn = driver.findElement(By.xpath("//button[contains(text(),'JS Confirm')]"));
		confirmAlertBtn.click();
		
		//Switching to the alert and handling it		
		Alert comfirmAlert = driver.switchTo().alert();
		String calertMsg = comfirmAlert.getText();
		System.out.println("Message on the alert pop up: "+calertMsg);
		
		comfirmAlert.accept();
		
		//Verify the on screen message after handling the alert
		String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
		String expectedText = "You clicked: Ok";
		Assert.assertEquals(expectedText, actualText);
		
		driver.quit();
		

	}

}
