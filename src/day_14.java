import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class day_14 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("incognito");
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	driver.get("http://demo.automationtesting.in/Alerts.html");;
	
	List<WebElement> etc1 = driver.findElements(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[9]/a"));
	
	for (WebElement sample : etc1) {
		
		String  text = sample.getText();
		System.out.println(text);
		Dimension size = sample.getSize();
		System.out.println(size);
	}
	driver.close();
	
	
}
}
