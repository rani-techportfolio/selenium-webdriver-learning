package webelementbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		driver.manage().window().maximize();

		//Name Field - normal textbox
		WebElement fullName = driver.findElement(By.id("fullname"));
		fullName.sendKeys("Malu Rahul");

		/* Value entered in the textbox - getAttribute("value")
		 System.out.println(fullName.getAttribute("value"));
		 */
		
		//Email Field 
		WebElement eMail = driver.findElement(By.id("email"));
		eMail.sendKeys("malur@yahoo.co.in");
		
		//Address Field - Text area
		WebElement currentAddress = driver.findElement(By.id("address"));
		currentAddress.sendKeys("Krishnatheetham\nCoventry\nWest Midlands\nUK");
		
		//Count of characters in the Address 
		String addressEntered = currentAddress.getAttribute("value");
		System.out.println("No. of charters in the address: " +addressEntered.length());
		
		
		//Password field
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("malur123#456");
		
		// Password masking enabled - getAttribute("type")
		 String pswdType = password.getAttribute("type");
		 
		 if(pswdType.equals("password")) {
			 System.out.println("Password making enabled");
		 }
		 
		 //Clicking the submit button
		 WebElement submitBtn = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		 submitBtn.click();
		 
		 driver.quit();
	}

}
