package selenium_brushup;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsandSS {

	static WebDriver driver;
	static String parent;

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
//		String title = WindowsandSS.windowsHandle();
		Set<String> id = driver.getWindowHandles();

		Iterator<String> it = id.iterator();

		String pageTitle = null;
		while (it.hasNext()) {
			String child = it.next();
			
			System.out.println(child);
			if (child != parent) {

				driver.switchTo().window(child);
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				pageTitle = driver.getTitle();

			}

		}

		Thread.sleep(3000);
		driver.switchTo().window(parent);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(pageTitle);
		File file = name.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("name.png"));

		System.out.println(name.getText());

		driver.quit();

	}

}
