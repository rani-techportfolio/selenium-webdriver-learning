package webelementbasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutosuggestDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		driver.manage().window().maximize();

		// Locate the Auto suggestion Country field
		WebElement counrtySelection = driver.findElement(By.id("autosuggest"));
		counrtySelection.sendKeys("Be");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> countryOptions = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("li.ui-menu-item a")));

		for (WebElement country : countryOptions) {
			if (country.getText().equalsIgnoreCase("Belgium")) {
				country.click();
			}

		}
		driver.quit();
	}

}
