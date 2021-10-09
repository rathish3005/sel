import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javaScriptExecutor {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("incognito");
		
		WebDriver driver=new ChromeDriver(co);
		String url=("https://www.netflix.com/");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor  x=(JavascriptExecutor) driver;
		
		WebElement speed=driver.findElement(By.xpath("//Span[text()='Speed Test']"));
		x.executeScript("window.scroll(0,3500)", "");
		speed.click();
		
		Thread.sleep(2000);
		TakesScreenshot ss= (TakesScreenshot) driver ;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File Destination = new File ("C:\\Users\\rathe\\eclipse-workspace\\Selenium\\Screenshot126.png");
		FileUtils.copyFile(source, Destination);
		
	}
}
//data-uia="data-uia-footer-label"
//*[data-uia()='data-uia-footer-label']