import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class OpenbrowserTest {
	WebDriver driver1;
	@BeforeTest
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c-s.yarragudi\\SreeAutomationTesting\\Practicesele\\Softwares\\chromedriver.exe");
        driver1 = new ChromeDriver();
        driver1.get("https://www.google.com/");
	}
	
  @Test
  
  public void f() throws InterruptedException {
	 WebElement ele= driver1.findElement(By.xpath("//textarea[@jsname='yZiJbe']"));
	Thread.sleep(2000);
	ele.sendKeys("Heloo google"); 
	Thread.sleep(2000);
  }
  @Test
  
  public void verifyTitle()
  {
	  String ActTitle=driver1.getTitle();
	  String ExpTitle="https://www.google.com/search?q=Heloo+google&sca_esv=578870548&sxsrf=AM9HkKmaLKCtT5U82wkujVLckCCtrN8sCg%3A1698945849426&ei=OdtDZbPVGZCD8gK266-ACQ&ved=0ahUKEwjz1eO-6qWCAxWQgVwKHbb1C5AQ4dUDCBA&uact=5&oq=Heloo+google&gs_lp=Egxnd3Mtd2l6LXNlcnAiDEhlbG9vIGdvb2dsZUjpAVAAWABwAHgBkAEAmAEAoAEAqgEAuAEDyAEA-AEC-AEB4gMEGAAgQYgGAQ&sclient=gws-wiz-serp";
	  assertEquals(ExpTitle, ActTitle);
  }
  

@AfterTest
  public void tearDown()
  {
	  driver1.close();
  }
  
  
}
