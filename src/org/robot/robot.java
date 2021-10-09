package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class robot {
	public static void main(String[] args) throws AWTException, InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		ChromeOptions x=new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(x);	
		
		driver.get("https://www.flipkart.com");
		WebElement aa = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		aa.click();
		Actions act=new Actions(driver);
		Robot rbt=new Robot();
		
		WebElement Grocery = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img"));
		
		act.contextClick(Grocery).build().perform();
		
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_T);
		Thread.sleep(1000);
		rbt.keyRelease(KeyEvent.VK_T);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobiles = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]"));
		act.contextClick(mobiles).build().perform();
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_T);
		Thread.sleep(1000);
		rbt.keyRelease(KeyEvent.VK_T);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		WebElement offers = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[2]"));
		act.contextClick(offers).build().perform();
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement Travel = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[8]/a/div[2]"));
		act.contextClick(Travel).build().perform();
		
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);

		int size = driver.getWindowHandles().size();
		System.out.println(size);
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> allwindow = driver.getWindowHandles();
		for (String abc : allwindow) {
			//String title = driver.switchTo().window(abc).getTitle();
			System.out.println(abc);
		
			}
		Thread.sleep(3000);
			List<String>list=new ArrayList <String> (allwindow);
			driver.switchTo().window(list.get(3));
			
			WebElement s1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
			s1.click();
			s1.sendKeys("samsung mobiles");
			rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
			rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
			rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
			rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
			s1.clear();
		
			Thread.sleep(3000);
			
			x.addArguments("incognito");
			List<String>list1=new ArrayList <String> (allwindow);
			driver.switchTo().window(list1.get(3));
			
			WebElement s2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
			s2.click();
			s2.sendKeys("iphone");
			
			rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
			rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
			rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
			rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		
		
		}
		
		
	}


