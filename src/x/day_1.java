package x;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class day_1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("incognito");
	WebDriver driver=new ChromeDriver(co);
	
	driver.manage().window().maximize();
	driver.get("http://www.hotstar.com");

}
}
