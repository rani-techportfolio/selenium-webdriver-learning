package webelementbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://practice-automation.com/file-upload/");
		driver.manage().window().maximize();

		// Locate the Choose File button
		WebElement chooseFileBtn = driver.findElement(By.id("file-upload"));
		// chooseFileBtn.click();--------->InvalidArgumentException

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", chooseFileBtn);

		// StringSelection to store the file path to system clipboard
		StringSelection selection = new StringSelection("C:\\Users\\hp\\Desktop\\selenium Questions.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		// Copy the file path from System clipboard
		Robot rb = new Robot();

		rb.delay(500);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_CONTROL);

		// Press Enter Key

		rb.delay(500);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		// Locate the upload button and click it
		WebElement uploadBtn = driver.findElement(By.id("upload-btn"));

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", uploadBtn);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement message = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'response-output')]")));

		String postMessage = message.getText();

		Assert.assertTrue(postMessage.equals("Thank you for your message. It has been sent."));

		driver.quit();
	}

}
