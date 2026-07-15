package webelementbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		driver.manage().window().maximize();

		// Locate the Departure city dropdown and select the departure city
		WebElement departCity = driver.findElement(By.xpath("//input[contains(@id,'originStation1_CTXT')]"));
		departCity.click();

		
		WebElement departureCity = wait
				.until(ExpectedConditions.elementToBeClickable(
		                By.xpath("//a[text()=' Chennai (MAA)']")));
		departureCity.click();
		

		// Locate the Arrival city dropdown and select the arrival city
		WebElement arriveCity = driver.findElement(By.xpath("//input[contains(@id,'destinationStation1_CTXT')]"));
		arriveCity.click();

		WebElement arrivalCity = driver.findElement(By.xpath("(//a[text()=' Hyderabad (HYD)'])[2]"));
		arrivalCity.click();
		
		driver.quit();

	}

}
