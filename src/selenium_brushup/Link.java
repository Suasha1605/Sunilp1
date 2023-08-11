 package selenium_brushup;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement footer= driver.findElement(By.id("gf-BIG"));
		
		List<WebElement> footerLink=footer.findElements(By.tagName("a"));
		
//		List<WebElement> footerLink = driver.findElements(By.xpath("//tbody/tr/td/ul/li"));
		
		System.out.println(footerLink.size());
		
       
		
	     for(int i=0; i<footerLink.size(); i++) {
	    	 footerLink.get(i).getAttribute("href");
			String linkOpen = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerLink.get(i).sendKeys(linkOpen);
			Link.windowsHandle();
		}
	
         driver.quit();
         
		
	}
	
	public static void windowsHandle() {
		
		String parent= driver.getWindowHandle();
		Set<String> id= driver.getWindowHandles();
		
		 Iterator<String> it= id.iterator();
		
	
		 while(it.hasNext())
		 {
			 String child =it.next();
			 if(!(child.equals(parent))) {
				 
				
				 driver.switchTo().window(child );
				 
				System.out.println(driver.getTitle());
				driver.close();
				
				driver.switchTo().window(parent);
				 
			 }
		 }
		
		
	}
}
