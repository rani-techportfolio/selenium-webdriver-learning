package webelementbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MultiselectionDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://vinothqaacademy.com/drop-down/");
		driver.manage().window().maximize();

		// Locate the Multiselect Language dropdown
		WebElement programmingMultiselect = driver.findElement(By.name("programming"));
		Select pgmgSelect = new Select(programmingMultiselect);

		Assert.assertTrue(pgmgSelect.isMultiple(), "The droupdown should be multiselect dropdown");

		// Selecting multiple options
		pgmgSelect.selectByValue("PYTHON");
		pgmgSelect.selectByVisibleText("JavaScript");
		pgmgSelect.selectByIndex(5);

		// Get all the selected options and display them
		List<WebElement> selectedLanguages = pgmgSelect.getAllSelectedOptions();
		for (WebElement language : selectedLanguages)
			System.out.println(language.getText());

		driver.quit();
	}

}
