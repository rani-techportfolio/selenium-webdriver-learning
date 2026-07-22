package mousekeyboardinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement doubleclickField1 = driver.findElement(By.id("field1"));

		WebElement doubleclickField2 = driver.findElement(By.id("field2"));

		WebElement coptTextBtn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		Actions action = new Actions(driver);

		String text = "Hello Rani!!!";

		/*
		 * Enter a text in field 1 and copy the text in field 1 to field 2 by double
		 * clicking on the Copy Text button
		 */

		doubleclickField1.clear();
		doubleclickField1.sendKeys(text);

		action.doubleClick(coptTextBtn).perform();

		// verify the text is correctly copied to field 2

		Assert.assertEquals(text, doubleclickField2.getAttribute("value"));

		driver.quit();

	}

}
