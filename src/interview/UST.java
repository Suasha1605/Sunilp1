package interview;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UST {
	static WebDriver driver;

	public static void waitDrivermethod() {

		WebElement ele = null;
		int i = 0;
		while (ele == null) {

			ele = driver.findElement(By.cssSelector("[name='name']"));

			if (ele.isDisplayed()) {

				ele.click();

				break;
			}

			i++;
		}

	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		UST.waitDrivermethod();

		UST.countString();

	}

	public static void countString() {
		String s = "This is a Java test Java is a very powerful language";

		String p[] = s.split(" ");

		ArrayList<String> a = new ArrayList<String>();

		for (int i = 0; i < p.length; i++) {
			int k = 0;

			if (!a.contains(p[i])) {

				a.add(p[i]);
				k++;

				for (int j = i + 1; j < p.length; j++) {

					if (p[i].equals(p[j])) {

						k++;
					}
				}

				System.out.println(p[i] + ": " + k);
			}

		}

	}

}
