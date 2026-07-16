package webelementbasics;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FileDownload {

	public static void main(String[] args) {
		
		HashMap<String,Object> prefs = new HashMap<>();
		
		//String downloadPath = System.getProperty("user.dir");
		String downloadPath = "C:\\Users\\hp\\Downloads";
		String fileName = "sampleFile.jpeg";
		
		prefs.put("download.default_directory", downloadPath);
		prefs.put("download.prompt_for_download", false);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(Exception.class);
		
		WebElement downloadBtn = fwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("downloadButton"))));
		downloadBtn.click();
		
		File downloadedFile = new File(downloadPath+"\\"+fileName);
		
		fwait.until(d -> downloadedFile.exists());
	
		if(downloadedFile.exists()) {
			
			System.out.println("File downloaded successfully.");
			
			if(downloadedFile.getName().endsWith(".jpeg")) {
				System.out.println("Correct File type downloaded.");
			}
			else {
				System.out.println("File type is not expected one.");
			}
		}
		else {
			System.out.println("File not downloaded.");
		}
	}

}
