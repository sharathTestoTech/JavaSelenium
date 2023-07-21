package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageofSendKeys {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	 driver.get("https://www.facebook.com/");
	 WebElement emailTextField = driver.findElement(By.id("email"));
//emailTextField.sendKeys("a");
//emailTextField.sendKeys(Keys.TAB);
//Thread.sleep(2000);
	//emailTextField.sendKeys("123");
	//driver.switchTo().activeElement().sendKeys("12334");
//driver.switchTo().activeElement().sendKeys(Keys.TAB);
//Thread.sleep(2000);
//driver.switchTo().activeElement().sendKeys("1");
	 
	 //driver.switchTo().activeElement();
		Actions actions = new Actions(driver);
		//actions.sendKeys("ABCD").sendKeys(Keys.TAB).sendKeys("1234").perform();
	 
	// actions.sendKeys(emailTextField, "1234").sendKeys(Keys.TAB).sendKeys("1234").perform();
	//actions.sendKeys(driver.switchTo().activeElement(), "1234").sendKeys(Keys.TAB).sendKeys("1234").perform();
		actions.sendKeys(driver.switchTo().activeElement(),"1234").sendKeys(Keys.TAB).pause(2000).sendKeys(driver.switchTo().activeElement(), "abcd").perform();

	
	}

}
