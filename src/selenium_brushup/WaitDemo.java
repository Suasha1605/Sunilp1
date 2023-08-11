package selenium_brushup;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDemo {
	
       static WebDriver driver;
       
     
	
	
	public static void main(String[] args) {
		
	
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		WaitDemo.fluentWaitMethod();
		WebElement userName= driver.findElement(By.cssSelector("input#inputUsername"));
		
		
		
		WebElement password= driver.findElement(By.cssSelector("input[name='inputPassword']"));
		
		WebElement signInButton = driver.findElement(By.cssSelector("button[type='submit']"));
		
		WaitDemo wt = new WaitDemo();
		wt.sendKeyMethod(5, userName,"Rahulshetty");
		wt.sendKeyMethod(5, password,"rahulshettyacademy");
		
		wt.clickMethod(2, signInButton);
		
		
		System.out.println("Logged in");
		
		driver.close();
	
		
		
		

	}
	
	
	public static void fluentWaitMethod() {
		
	 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
			 .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
	
		WebElement ele= wait.until(new Function<WebDriver, WebElement>(){
			
			
			public WebElement apply(WebDriver driver) {
				
				WebElement pr= driver.findElement(By.cssSelector("input#inputUsername"));
				if(pr.isDisplayed())
				return pr;
				
				else {
					
					return null;
				}
			}
			
			
			
		});
	}
	
	
	public void sendKeyMethod(int time, WebElement element, String value ){
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		element.sendKeys(value);
		
	}
	
	public void clickMethod(int time, WebElement element ){
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		element.click();
	}

}
