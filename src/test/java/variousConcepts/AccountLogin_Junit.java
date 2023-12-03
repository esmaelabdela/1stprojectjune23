package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountLogin_Junit {

	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();

		//// Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void createAccount() throws InterruptedException {

		// Login
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		//// Navigate to the desired page
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")).click();
		

//////Filling the form
		driver.findElement(By.id("account")).sendKeys("Esmael");
		driver.findElement(By.id("description")).sendKeys("saving_account");
		driver.findElement(By.id("account_number")).sendKeys("12345");
		driver.findElement(By.id("contact_person")).sendKeys("yusra");
		driver.findElement(By.id("contact_phone")).sendKeys("4326533486");

////	//Submitting form
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")).click();

	}

//  @After
//	 public void closeBrowser() {
//		     driver.close();
//	}

}
