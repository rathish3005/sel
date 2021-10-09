package org.fb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;		//
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
public class fb {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();															
		
		driver.get("https://en-gb.facebook.com/");
		driver.navigate().to("https://www.youtube.com");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		//	WebElement fb=driver.findElement(By.xpath("(//*[@role='button'])[2]"));															//to select the webElement we have to put syntax like this
		//fb.click();
		//Thread.sleep(3000);
		//WebElement fbname=driver.findElement(By.xpath("//*[@name='firstname']"));												//to select the box
		//fbname.sendKeys("Ratheesh");
		
		//WebElement surename=driver.findElement(By.xpath("//*[@name='lastname']"));
		//surename.sendKeys("kumar");
		
			
	}

	
	}
	
	

