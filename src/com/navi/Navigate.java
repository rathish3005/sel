package com.navi;
																																

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
			ChromeOptions chrome  = new ChromeOptions();
			WebDriver driver=new ChromeDriver(chrome);
			driver.manage().window().maximize();
			String com="https://www.google.com/";
			driver.get(com);
			String site1=driver.getCurrentUrl();
			System.out.println("g url is:: " +site1);
			
			String website="https://www.instagram.com/";
			driver.get(website);
			String site2=driver.getCurrentUrl();
			Thread.sleep(2000);
			System.out.println("insta url is:" +site2);
			driver.navigate().to ("https://www.linkedin.com/");
			
			
			String site3=driver.getCurrentUrl();
			System.out.println("site url is:" +site3);
			driver.navigate().back();
			String pageSource = driver.getPageSource();
			System.out.println(pageSource);
			
			driver.manage().window().maximize();
			driver.navigate().to(com);
		
			//Dimension z=new Dimension(440,420);
			//driver.manage().window().setSize(z);
			driver.navigate().refresh();
			driver.navigate().forward();
			driver.close();
			
			
			
			
			
		
				
			//String url =	driver.getCurrentUrl();
			//System.out.println(url);
			
			//String title = driver.getTitle();
			//System.out.println("Title");
			//driver.close();

}}