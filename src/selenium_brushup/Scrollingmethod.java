package selenium_brushup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollingmethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,2800)");
		
		WebElement mobileTopDeal = driver.findElement(By.xpath("//span[text()='Top deals on mobile accessories']"));
		
		js.executeScript("arguments[0].scrollIntoView();", mobileTopDeal);
		
		Thread.sleep(3000);
		
		String xpathName= "(//div[contains(@id,'CardInstance')]//span[@class='a-list-item'])[8]";
		
		WebElement screenProtector = driver.findElement(By.xpath(xpathName));
		
		js.executeScript("arguments[0].scrollIntoView();", screenProtector);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOf(screenProtector));
		
		System.out.println(screenProtector.getText());
		
		screenProtector.click();
		
		
//    Scroll vertically till page end		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
