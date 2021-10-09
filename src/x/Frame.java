package x;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("incognito");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");	
	
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("hii");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		WebElement outter_frame= driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outter_frame);
		
		WebElement inner_frame=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(inner_frame);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("hello");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[7]/a")).click();
		
		
		}
}