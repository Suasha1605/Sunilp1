package interview;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	
	public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
		
        WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		System.out.println("First code update from local to git branch");
		
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(file, new File(".\\screenShots\\HomePage.png"));

	}

}
