package selenium_brushup;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement footer = driver.findElement(By.id("gf-BIG"));

//		List<WebElement> footerLink=footer.findElements(By.tagName("a"));

		List<WebElement> footerLink = driver.findElements(By.xpath("//li[@class='gf-li']/a"));

		System.out.println(footerLink.size());

		SoftAssert sa = new SoftAssert();

		for (int i = 0; i < footerLink.size(); i++) {
			String url = footerLink.get(i).getAttribute("href");

			HttpURLConnection link = (HttpURLConnection) new URL(url).openConnection();

			link.setRequestMethod("HEAD");
			link.connect();
			link.getResponseCode();

			sa.assertTrue(link.getResponseCode() < 400,
					footerLink.get(i).getText() + ": status Code= " + link.getResponseCode());

		}
		sa.assertAll();

		driver.quit();

	}

}
