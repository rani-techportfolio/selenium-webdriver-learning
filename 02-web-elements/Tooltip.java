package webelementbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Tooltip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2019/08/tooltip-in-selenium-or-help-text-example.html");
		driver.manage().window().maximize();
		
		WebElement tooltip =driver.findElement(By.cssSelector("div.tooltip"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(tooltip).perform();
		
		WebElement tooltipText =driver.findElement(By.cssSelector("span.tooltiptext"));
		
		String infoText = tooltipText.getText();
		
		System.out.println("Text on tooltip:" +infoText);
		
		Assert.assertEquals(infoText, "Tooltip text");
		
		driver.quit();

	}

}
