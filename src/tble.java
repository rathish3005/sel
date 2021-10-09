import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tble {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("incognito");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://time.is/");
		
		List<WebElement> time = driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[2]/div"));
		for (WebElement acc : time) {
			String cc = acc.getTagName();
			
			System.out.println(acc.getText());
			
			}
		Thread.sleep(1000);
		driver.get("https://www.moneycontrol.com/");
		List<WebElement> nifty = driver.findElements(By.xpath("/html/body/div[1]/section/div/div[3]/aside/div[10]/div[1]/div[3]/div/div[1]/div/table/tbody/tr[1]/td[1]/h3/a"));
		
		for (WebElement trade : nifty)
			
	{
			String tr = trade.getTagName();
			System.out.println(trade.isDisplayed());
			System.out.println(trade.getText());
			
			
			
		}
		
		
	}

}
