package webelementbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();

		// Checkbox2 is selected by default

		// Check if Checkbox 1 is selected and select it if not selected
		WebElement chkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		if (!chkBox1.isSelected()) {
			System.out.println("Checkbox1 is NOT selected..so selecting Checkbox1");
			chkBox1.click();
		} else
			System.out.println("Checkbox1 is selected");

		// Uncheck Checkbox 2 if selected.
		WebElement chkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		if (chkBox2.isSelected()) {
			System.out.println("Checkbox1 is Selected..so unchecking Checkbox2");
			chkBox2.click();
		}
		// Verify both checkbox states
		Assert.assertTrue(chkBox1.isSelected(), "Checkbox1 should be selected");
		Assert.assertFalse(chkBox2.isSelected(), "Checkbox2 should NOT be selected");

		driver.quit();

	}

}
