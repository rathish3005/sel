package org.insta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaid {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.instagram.com/");
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/div/p/a/span"));
		signup.click();
		
		
	
	
	
	
	
	}

}
