package selenium_brushup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandle {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		String parent= driver.getWindowHandle();
		
		
		WebElement button = driver.findElement(By.name("145newbrowsertab234"));
		Actions a= new Actions(driver);
		
		a.moveToElement(button).click().build().perform();
		
		
		Set<String> id= driver.getWindowHandles();
	
		 Iterator<String> it= id.iterator();
		
	
		 while(it.hasNext())
		 {
			 String child =it.next();
			 if(!(child.equals(parent))) {
				 
				
				 driver.switchTo().window(child );
				 
				
				 
			 }
		 }
		
       
         
		 System.out.println(driver.getCurrentUrl());
       
         driver.switchTo().window(parent);
         
         Thread.sleep(2000);
         
         System.out.println(driver.getCurrentUrl());
         
         
         driver.quit();
         
		
	}
}
