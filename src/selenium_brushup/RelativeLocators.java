package selenium_brushup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	static WebDriver driver;
	
	public static void main(String[] args) {

// TODO Auto-generated method stub

     WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		
		System.out.println(nameEditBox.getSize());
		System.out.println(nameEditBox.getRect().getDimension().getWidth());
		System.out.println(nameEditBox.getRect().getDimension().getHeight());
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		
		
		
		System.out.println(dateofBirth.getRect().getDimension().getWidth());
		
		System.out.println(dateofBirth.getRect().getDimension().getHeight());

		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();

		WebElement iceCreamLabel = driver
				.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

		WebElement rdb = driver.findElement(By.id("inlineRadio1"));

		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());

	}

}
