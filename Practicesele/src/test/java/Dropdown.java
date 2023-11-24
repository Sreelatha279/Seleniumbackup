import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement Country_drpdown= driver.findElement(By.name("country"));
		
		Select Dropdown=new Select(Country_drpdown);
		
		Dropdown.selectByVisibleText("ARMENIA");
		
		System.out.println(Dropdown.getFirstSelectedOption().getText());// how to get only text of selected option
		
		//to check whether dropdown is multiselect or singleselect
		boolean flag =Dropdown.isMultiple();
		
		if(flag)System.out.println("Multiselect dropdown");
		else System.out.println("Single select dropdown");
		
		Dropdown.selectByValue("ANGOLA");// value from html
		Dropdown.selectByIndex(6);// selecting from index
		
		// to get all dropdown options
		 List<WebElement> Options=Dropdown.getOptions();
		 
		 for(WebElement S:Options)
		 {
			 System.out.println("options are "+S.getText());
		 }
		
		
		driver.close();
		
		

	}

}
