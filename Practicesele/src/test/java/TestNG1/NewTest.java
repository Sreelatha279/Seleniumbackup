package TestNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\c-s.yarragudi\\SreeAutomationTesting\\Practicesele\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");// enter url
		driver.manage().window().maximize();// maximize the browser
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void verifyTitle() 
	{
		String actTitle=driver.getTitle();
		String expTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		assertEquals(actTitle, expTitle);
	}
	
	@Test
	public void getPageSource()
	{
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		
		driver.close();
		
	}
}
