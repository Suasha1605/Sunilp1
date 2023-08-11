package selenium_brushup;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltips {

//       static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://jqueryui.com/tooltip/");
		
		
		WebElement logo= driver.findElement(By.linkText("jQuery UI"));
		
		System.out.println(logo.getLocation());
		
		System.out.println(logo.getRect().getHeight());
		System.out.println(logo.getRect().getWidth());
		System.out.println(logo.getSize());
		
		driver.switchTo().frame(0);

		WebElement element = driver.findElement(By.linkText("ThemeRoller"));

		System.out.println(element.getAttribute("title"));
		
		
		element.click();
		
		Thread.sleep(3000);

		driver.close();

	}

}
