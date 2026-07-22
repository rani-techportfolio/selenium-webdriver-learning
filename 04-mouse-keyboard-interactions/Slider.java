package mousekeyboardinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://vinothqaacademy.com/mouse-event/");

		driver.manage().window().maximize();

		WebElement slider = driver.findElement(By.id("slider"));

		int width = slider.getSize().getWidth();

		System.out.println(width);

		WebElement sliderHandle = driver.findElement(By.id("handle_max"));

		// Current position 1000
		// Target position 2000

		// 2750 ----->650
		// 1000 ------> ?(Offset)

		Actions act = new Actions(driver);

		act.dragAndDropBy(sliderHandle, 236, 0).perform();

		// approximately moved to the required position as decimal is not allowed

		act.clickAndHold(sliderHandle).moveByOffset(236, 0).release().perform();

		driver.quit();

	}

}
