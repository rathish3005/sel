import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exofalert {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
		
		Thread.sleep(2000);
		Alert x = driver.switchTo().alert();
		x.accept();
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		WebElement z=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		z.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("hii");
		Thread.sleep(2000);
		x.accept();
		//driver.switchTo().alert().accept();
		
	
	//	driver.close();
		
	}

}

