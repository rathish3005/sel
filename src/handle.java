import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handle {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		ChromeOptions cc=new ChromeOptions();
		cc.addArguments("incognito");
		cc.addArguments("handle");
		
		WebDriver driver=new ChromeDriver(cc);
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String parent = driver.getWindowHandle();
		
		WebElement step1 = driver.findElement(By.xpath("//*[@id=\"home\"]"));
		step1.click();
		
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		
		//
		
		for (String newWindow : windowHandles) {
			driver.switchTo().window(newWindow);
			}
		WebElement step2 = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		step2.click();
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		WebElement step0 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		step0.click();
		Thread.sleep(2000);
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		Thread.sleep(2000);

		WebElement step3 = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		step3.click();
		Set<String> windowH = driver.getWindowHandles();
		for (String allwindow : windowH) {
		if (!allwindow.equals(parent)) {
			Thread.sleep(2000);		
		driver.switchTo().window(allwindow);
		
		driver.close();
				
			}
			
		}
	}

}
