package x;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class leaf {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("incognito");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("http:/www.leafground.com");	
		
		Thread.sleep(2000);
		JavascriptExecutor x= (JavascriptExecutor) driver;
		x.executeScript("window.scroll(0,500)","");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[10]/a/img")).click();
		Thread.sleep(2000);
		
//		driver.switchTo().frame("outerframe");
//		WebElement x1=driver.findElement(By.xpath("//*[@id=\"wrapframe\"]"));
//		driver.switchTo().frame(x1);
//		Thread.sleep(2000);
//
//		driver.switchTo().frame("innerframe");
//		WebElement x2=driver.findElement(By.xpath("/html/body"));
//		driver.switchTo().frame(x2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Click\"]")).click();
		
		
//		WebElement outter_frame= driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
//		driver.switchTo().frame(outter_frame);
//		
//		WebElement inner_frame=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
//		driver.switchTo().frame(inner_frame);
//		
//		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("hello");
//		driver.switchTo().defaultContent();
//		
//		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[7]/a")).click();
//		
//		
		
	}

}
