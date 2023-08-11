package testNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicationLaunch {

	WebDriver driver;
	
	SoftAssert sa;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	
	
	@BeforeClass
	void beforeClass() {
   
		System.out.println("Before Class");
	}
	

	@Test (priority=1)
	void openApp() {
	WebDriverManager.chromedriver().setup();	
		
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Assert.assertEquals(true, true);
	System.out.println("application luanched");
	}
	
	@Test (priority=2, dependsOnMethods={"openApp"}, dataProvider="DP")
	void login(String username, String pwd) {
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//button[type='submit']")));
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		sa= new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		
		sa.assertAll();
		
		
	}
	
	@DataProvider(name="DP")
	String[][]  data() {
		
		String[][] cred= {{"admin","admin234"},{"admin","admin123"}};
		
		return cred;
	}
	
	@Test (priority=3, dependsOnMethods={"openApp"})
	void closeApp() {
		
		driver.close();
		Assert.assertEquals(true, true);
	}
	
	@AfterClass
	void AfterClass() {
   
		System.out.println("After Class");
	}
	
	@AfterTest
	void beforeTest() {
   
		System.out.println("After Test");
	}
	
	@AfterSuite
	void beforeSuite() {
   
		System.out.println("After Suite");
	}
	
}
