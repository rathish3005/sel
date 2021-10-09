import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class base_EX {
	private static final TimeUnit TimeUnits = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		signin.click();
		
		WebElement create = driver.findElement(By.id("email_create"));
		create.sendKeys("rathishkumar.thiyagarajan@gmail.com");
		
		WebElement enter = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		enter.click();
		
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnits.SECONDS);
		
		WebElement gender =driver.findElement(By.name("id_gender"));
		gender.click();
		
		WebElement FirstName =driver.findElement(By.id("customer_firstname"));
		FirstName.sendKeys("Rathish");
		
		WebElement LastName =driver.findElement(By.id("customer_lastname"));
		LastName.sendKeys("Kumar");
		
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("ratheesh.karthick95gmail.com");
		
		WebElement passwrd =driver.findElement(By.id("passwd"));
		passwrd.sendKeys("123456");
		
		WebElement day = driver.findElement(By.id("days"));
		WebElement Month = driver.findElement(By.id("months"));
		WebElement Year = driver.findElement(By.id("years"));
	
		Select x=new Select(day);
		
		x.selectByValue("30");
		Select y=new Select(Month);
		y.selectByValue("5");
		Select z=new Select(Year);
		z.selectByValue("1995");
		
		WebElement sploffer =driver.findElement(By.id("optin"));
		sploffer.click();

		WebElement organization =driver.findElement(By.id("company"));
		organization.sendKeys("Ashoke Leyland");
		
		WebElement add =driver.findElement(By.name("address1"));
		add.sendKeys("125, annanagar");
		
		driver.findElement(By.id("city")).sendKeys("chennai");
	
		WebElement state = driver.findElement(By.id("id_state"));
		Select st=new Select (state);
		st.selectByValue("32");
		
		WebElement code = driver.findElement(By.id("postcode"));
		code.sendKeys("10010");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("8122967378");
		
		WebElement Register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
		Register.click();
		
		WebElement wishlist=driver.findElement(By.xpath("//*[@id=\'center_column\']/div/div[2]/ul/li/a/span"));
		wishlist.click();
		
		WebElement dress =driver.findElement(By.xpath("//*[@id=\'best-sellers_block_right\']/div/ul/li[1]/a/img"));
		dress.click();
		
		WebElement addcart = driver.findElement(By.xpath("//*[@id=\'add_to_cart\']/button/span"));
		addcart .click();
		
		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		proceed.click();
		
		WebElement checkout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		checkout.click();
		
		
		
		
	}

}
