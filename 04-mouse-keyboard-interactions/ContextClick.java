package mousekeyboardinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ContextClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://vinothqaacademy.com/mouse-event/");

		driver.manage().window().maximize();

		WebElement rightClickMeBtn = driver.findElement(By.id("rightBtn"));

		WebElement rightClickEditOption = driver
				.findElement(By.xpath("//div[@id='contextMenu']/button[text()='Edit']"));

		// div[@id='contextMenu']/button[text()='Edit']

		Actions actn = new Actions(driver);

		actn.contextClick(rightClickMeBtn).perform();

		actn.moveToElement(rightClickEditOption).click().perform();

		String msgOnScreen = driver.findElement(By.xpath("//span[@id='rightStatus' and contains(text(),'Edit')]"))
				.getText();

		// Verifying the right click operation by checking the on screen message

		Assert.assertTrue(msgOnScreen.contains("Edit"));

		driver.quit();

	}

}
