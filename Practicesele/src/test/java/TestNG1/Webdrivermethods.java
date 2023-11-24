package TestNG1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\c-s.yarragudi\\SreeAutomationTesting\\Practicesele\\Softwares\\chromedriver.exe");// till selenium3
		WebDriver driver = new ChromeDriver();// selenium4 will take care system.setproperty
		
		//WEBDRIVER METHODS(13METHODS) 0R 16M
		
		driver.get("https://www.amazon.in/");// 1.enter url
		driver.manage().window().maximize();// 2.managing window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String title=driver.getTitle();//3.to get title
		System.out.println("*********");
		System.out.println(title);
		System.out.println(driver.getPageSource());//4. get page source
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));//5. locate 1 element
		Search.sendKeys("mobiles");
		System.out.println("list of all links");
		List<WebElement>  Alllinks=driver.findElements(By.tagName("a"));//6. locate all links
		
		
		for(WebElement a:Alllinks)
		{
			System.out.println(a.getText());
		}		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.flipkart.com/"); // 12. navigate to url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		System.out.println(driver.getCurrentUrl()); //7. get current url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.linkText("TVs & Appliances")).click();
		System.out.println(driver.getWindowHandle());// 8. get parent id of browser
		
		Set<String> childids=driver.getWindowHandles(); // 9. get all child id's
		
		
		for(String b:childids)
		{
			System.out.println(b);
		}	
		//driver.close(); // 10.close current tab
		driver.quit();// 11.close all tabs & terminates webdriver session
	}
		
		
}
