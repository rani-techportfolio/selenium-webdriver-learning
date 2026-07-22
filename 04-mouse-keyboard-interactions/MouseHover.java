package mousekeyboardinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement ponitMeBtn = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		
		WebElement mobileOptn = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ponitMeBtn).moveToElement(mobileOptn).click().perform();
		
		driver.quit();
		

	}

}
