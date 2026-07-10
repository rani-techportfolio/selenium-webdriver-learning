package webelementbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		// Locate and find how many radio buttons are present
		List<WebElement> radioBtns = driver.findElements(By.xpath("//input[contains(@value,'radio')]"));
		System.out.println("No. of radio buttons present: " + radioBtns.size());

		for (WebElement radioBtn : radioBtns) {
			Assert.assertTrue(radioBtn.isDisplayed());
		}

		// select Radio Button 2 if not selected
		WebElement radio2 = driver.findElement(By.xpath("//label[normalize-space()='Radio2']"));
		if (!radio2.isSelected()) {
			radio2.click();
		}

		// select Radio Button 1 and confirm that Radio Button 2 is not selected
		WebElement radio1 = driver.findElement(By.xpath("//label[normalize-space()='Radio1']"));
		radio1.click();
		Assert.assertFalse(radio2.isSelected(), "Radio Button 2 should not be selected after selecting Radio Button 1");

		driver.quit();
	}

}
