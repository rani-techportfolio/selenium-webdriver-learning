package mousekeyboardinteractions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://academy.postman.com/path/api-testing-path-v12");
		driver.manage().window().maximize();

		String parentHandle = driver.getWindowHandle();

		// Open the Learn link in a new Tab

		WebElement learn = driver.findElement(By.xpath("//div[contains(@class,'header-links-container')]/a[1]"));

		action.moveToElement(learn).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		
		//Wait until the window handled by this driver instance is 2

		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> windowHandles = driver.getWindowHandles();

		for (String handle : windowHandles) {
			driver.switchTo().window(handle);
			if (!handle.equals(parentHandle)) {
				if (driver.getCurrentUrl().contains("www.postman.com/learn/"))
					;
				System.out.println("Link successfully opened in new Tab");
				
				//Closing the child window and switching back to parent window
				driver.close();
				driver.switchTo().window(parentHandle);

			}

		}

		//Printing the parent window URL
		System.out.println(driver.getCurrentUrl());

		driver.quit();

	}

}
