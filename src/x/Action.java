package x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.com/index.php");	
		driver.manage().window().maximize();
		Actions	cc=new Actions (driver);
		WebElement dd = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		cc.moveToElement(dd).build().perform();
		Thread.sleep(3000);
		WebElement ee =driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a"));
		cc.contextClick(ee).build().perform();
		cc.moveToElement(dd);
		WebElement gg = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		cc.doubleClick(gg).build().perform();
		Thread.sleep(2000);
		WebElement bb = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a"));
		cc.doubleClick();
		cc.contextClick(bb).build().perform();
		
		  
		//cc.moveToElement(dd).build().perform(); 
}}
//<a class="_6WOcW9 _3YpNQe" href="https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&amp;fm=neo%2Fmerchandising&amp;iid=M_a2535539-11d0-49fc-8e59-7236b0b6d81a_1_372UD5BXDFYS_MC.IF56C41VGEYS&amp;otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C41VGEYS&amp;otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&amp;cid=IF56C41VGEYS">Men's T-Shirts</a>