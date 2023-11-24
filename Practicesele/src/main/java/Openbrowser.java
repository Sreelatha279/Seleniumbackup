import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openbrowser {

	public static void main(String[] args) {
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c-s.yarragudi\\SreeAutomationTesting\\Practicesele\\Softwares\\chromedriver.exe");
         WebDriver driver1 = new ChromeDriver();// we cannot create object for interface and Abstract class but we can create a reference variable of interface type for upcasting
        //Webdriver is a interface 
         
         //launch firefox browser
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\c-s.yarragudi\\SreeAutomationTesting\\Practicesele\\Softwares\\geckodriver.exe");
         WebDriver driver2 = new FirefoxDriver();
	}

}
