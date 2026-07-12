package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SimpleAlert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		// Locate the JS Alert button
		WebElement simpleAlertBtn = driver.findElement(By.xpath("//button[contains(text(),'JS Alert')]"));
		simpleAlertBtn.click();
		
		//Switching to the alert and handling it
		Alert salert = driver.switchTo().alert();
		String alertMsg = salert.getText();
		System.out.println("Message on the alert pop up: " + alertMsg);

		salert.accept();

		// Verify the on screen message after handling the alert
		String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
		String expectedText = "You successfully clicked an alert";
		Assert.assertEquals(expectedText, actualText);

		driver.quit();

	}

}
