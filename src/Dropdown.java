import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("incognito");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		List<WebElement> x=driver.findElements(By.id("multi-select"));
	
		Select a=new Select(x.get(0));
		
		
		boolean b=a.isMultiple();
		System.out.println(b);
		System.out.println("--------------------------------------------");
		}
	List<WebElement> op=a.getOptions();
	for (List<WebElement>) rk=op) {
		System.out.println(rk.getText());
		
	}
	
	
	}			driver.findElements
	

