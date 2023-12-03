package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	static WebDriver driver;

	public static void main(String[] args) {

		init();
		positiveLoginTesting();
		closeBrowser();

		init();
		negLoginTesting();
		closeBrowser();
   
	}

	public static void init() {
		// set system property
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\sitra\\selenium2019\\crm\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		// launch the browser
		driver = new ChromeDriver();
		// delete coockies
		driver.manage().deleteAllCookies();
		// go to website
		driver.get("https://codefios.com/ebilling/login");
		// maximize
		driver.manage().window().maximize();
		// wait
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void positiveLoginTesting() {

		// identify the element and insert value
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();

	}

	public static void negLoginTesting() {

		// identify the element and insert value
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123456");
		driver.findElement(By.id("login_submit")).click();

	}

	public static void closeBrowser() {

		driver.close();
	}

}
