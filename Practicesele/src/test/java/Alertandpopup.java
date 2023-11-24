import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertandpopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement Cus_id=driver.findElement(By.name("cusid"));
		Cus_id.sendKeys("53920");
		
		WebElement Submit=driver.findElement(By.name("submit"));
		Submit.click();
		
		Alert ale=driver.switchTo().alert();
		
		String ale_msg=ale.getText();
		
		System.out.println(ale_msg);
		
		ale.accept();
		
		//ale.dismiss(); //NoAlertpresentexception
		
		
		
		
		
		
	}
	

}
