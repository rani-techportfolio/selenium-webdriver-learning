package webelementbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		driver.manage().window().maximize();
		
		//Select One option drop down
		
		WebElement selectOne = driver.findElement(By.xpath("//select[@class='form-select']"));
		
		//Select an option from the Select One dropdown		
		Select selectTitle= new Select(selectOne);
		//selectTitle.selectByValue("3");
		selectTitle.selectByVisibleText("Mrs.");
		//selectTitle.selectByIndex(0);
		
		//Print the selected option
		System.out.println(selectTitle.getFirstSelectedOption());
		
		//See how many options are there
		List<WebElement> titleOptions = selectTitle.getOptions();
		System.out.println("No. of options in Select One dropdown: "+ titleOptions.size());
		
		//Prints each of the available options
		for(WebElement titleOption: titleOptions) {
			System.out.println(titleOption.getText());
		}
		
		driver.quit();

	}

}
