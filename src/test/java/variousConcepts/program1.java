package variousConcepts;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {
	
   // To open Chromebrowser
   // and navigate to google home page
   // print the title
	
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		System.out.println(driver.getTitle());
		
	}
	
	
	
	
}
