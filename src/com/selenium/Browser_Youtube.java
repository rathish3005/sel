package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Youtube {
public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
	    	String website = "https://www.youtube.com/";
			
			driver.manage().window().maximize();	
			
			driver.get(website);
		
		
			
		String url =	driver.getCurrentUrl();
		System.out.println(url);
			
			String title = driver.getTitle();
			System.out.println("Title");
			
		driver.close();
			
			
			
			
}
}
