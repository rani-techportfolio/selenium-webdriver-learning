package webelementbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().window().maximize();

		
		//Locate the Click Me Button
		WebElement clickMeBtn = driver.findElement(By.cssSelector("button.btn.btn-primary"));
		
		//Identify the position of the Click Me button
		Point clickMePostn = clickMeBtn.getLocation();
		System.out.println("Location of 'Click Me' button: "+clickMePostn);
		
		//Identify the dimension of Click Me button
		Dimension clickMeSize = clickMeBtn.getSize();
		System.out.println("Size of 'Click Me' button: "+clickMeSize);
		
		//Identify button color
		System.out.println("'Click Me' button background color: "+clickMeBtn.getCssValue("background-color"));
		
		//Perform the click operation on the button
		clickMeBtn.click();
		
		driver.quit();
				
	}

}
