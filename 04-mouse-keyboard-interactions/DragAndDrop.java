package mousekeyboardinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://vinothqaacademy.com/mouse-event/");

		driver.manage().window().maximize();

		WebElement draggable = driver.findElement(By.id("dragItem"));

		WebElement droppable = driver.findElement(By.id("dropZone"));

		Actions actn = new Actions(driver);

		actn.dragAndDrop(draggable, droppable).perform();

		WebElement status = driver.findElement(By.id("dragStatus"));

		String statusMsg = status.getText();

		Assert.assertTrue(statusMsg.contains("Dropped Successfully"));

		driver.quit();

	}

}
