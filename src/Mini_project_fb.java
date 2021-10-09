import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Mini_project_fb {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();															
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement fb=driver.findElement(By.xpath("(//*[@role='button'])[2]"));															//to select the webElement we have to put syntax like this
		fb.click();			
		Thread.sleep(3000);
		
		WebElement fbname=driver.findElement(By.xpath("//*[@name='firstname']"));												//to select the box
		fbname.sendKeys("Ratheesh");
		WebElement surename=driver.findElement(By.xpath("//*[@name='lastname']"));
		surename.sendKeys("kumar");
		
		WebElement email=driver.findElement(By.xpath("//*[@aria-label='Mobile number or email address']"));
		email.sendKeys("8122967378");
		
		WebElement re=driver.findElement(By.xpath("//*[@aria-label='New password']"));					
		re.sendKeys("12345678");
		
		WebElement gender=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		gender.click();
		
		WebElement signup=driver.findElement(By.xpath("(//*[@name='websubmit'])[1]"));
		signup.click();
		Thread.sleep(12000);
		
		TakesScreenshot ss= (TakesScreenshot) driver ;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File Destination = new File ("C:\\Users\\rathe\\eclipse-workspace\\Selenium\\Screenshot002.png");
		FileUtils.copyFile(source, Destination);
	}


	
	
		
	}


