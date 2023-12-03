package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLogin {

	WebDriver driver;
	

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
  
	@Test
	public void posLoging() throws InterruptedException {

		// Login Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")).click();

		// filling the form
		driver.findElement(By.id("account")).sendKeys("smith");
		driver.findElement(By.id("description")).sendKeys("saving");
		driver.findElement(By.id("balance")).sendKeys("4000000");
		driver.findElement(By.id("account_number")).sendKeys("234678");
		driver.findElement(By.id("contact_person")).sendKeys("manjiri");
		driver.findElement(By.id("contact_phone")).sendKeys("87659423269");
		driver.findElement(By.id("ib_url")).sendKeys("www.abc.com");
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")).click();

	}

}
