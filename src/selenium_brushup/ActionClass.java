package selenium_brushup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	
	static WebDriver driver;
	static Actions a;
	
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement signIn= driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1"));
		
		WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		ActionClass.mouseHover(searchBox); 
		

	}
	
	public static void mouseHover(WebElement element) {
		
		 a= new Actions(driver);
		
//		a.moveToElement(element).build().perform();
//		a.contextClick(element).build().perform();
//		a.doubleClick(element).build().perform();
		a.moveToElement(element).click(element).keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
	}

}
