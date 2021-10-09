import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cucu {
	
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://adactinhotelapp.com/");
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("neymer11");
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("123456");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		Thread.sleep(2000);
		
		WebElement loc = driver.findElement(By.id("location"));
		Select ss=new Select(loc);
		ss.selectByValue("London");
		loc.click();
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select hh=new Select(hotels);
		hh.selectByValue("Hotel Sunshine");
		hotels.click();
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select rr=new Select(room);
		rr.selectByValue("Deluxe");
		room.click();
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		WebElement cl = driver.findElement(By.id("radiobutton_0"));
		cl.click();
		
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		Thread.sleep(2000);
		
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys("ratheesh");
		
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys("karthick");
		
		WebElement address=driver.findElement(By.id("address"));
		address.sendKeys("125/5 besant nagar");
		
		WebElement card = driver.findElement(By.id("cc_num"));
		card.sendKeys("1234567890123456");
		
		WebElement type = driver.findElement(By.xpath("//*[@id=\"cc_type\"]"));
		Select ct=new Select(type);
		ct.selectByVisibleText("VISA");
		type.click();
		
		WebElement exp = driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]"));
		Select ex=new Select(exp);
		ex.selectByValue("12");
		exp.click();
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]"));
		Select cv=new Select(year);
		cv.selectByValue("2021");
		year.click();
		
		WebElement cvv = driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]"));
		cvv.sendKeys("123");
		
		WebElement Book = driver.findElement(By.id("book_now"));
		Book.click();
		
		Thread.sleep(4000);
		
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();	
		
		Thread.sleep(1000);
		TakesScreenshot ts= (TakesScreenshot) driver ;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File ("C:\\Users\\rathe\\eclipse-workspace\\Selenium\\Screenshot012.png");
		FileUtils.copyFile(source, Destination);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		

}
