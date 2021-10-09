import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class muldrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
			WebElement ss = driver.findElement(By.xpath("//*[@id=\"multi-select\"]"));
			Select	s=new Select(ss);
				List<WebElement> options = s.getOptions();
				for (WebElement ne : options) {
					String text = ne.getText();
					System.out.println(text);
	}
				
				List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
				
				for (WebElement all : allSelectedOptions) {
					
					String text = all.getText();
					System.out.println(text);
				}
					
				}
		
			

}	
