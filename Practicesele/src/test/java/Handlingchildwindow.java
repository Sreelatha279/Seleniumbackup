import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingchildwindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Click_here=driver.findElement(By.xpath("//a[text()='Click Here']"));
		Click_here.click();
		
		String Parent_id=driver.getWindowHandle();
		
		Set<String> S1=driver.getWindowHandles();
		Iterator<String> I1=S1.iterator();
		
		while (I1.hasNext()) {
			String Child_id=I1.next();
			System.out.println(Child_id);
			
			if(!Parent_id.equalsIgnoreCase(Child_id))
			{
				driver.switchTo().window(Child_id);
				System.out.println("switched to child window");
				WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("gaurav.2n@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
			}
			
		}
		
		
		driver.switchTo().window(Parent_id);
		
		
	}

}
