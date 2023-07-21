package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageofModifiers {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	WebElement login = driver.findElement(By.name("email"));
	//act.keyUp(Keys.SHIFT).sendKeys("abcd").keyDown(Keys.SHIFT).sendKeys(d).perform();
	act.keyDown(Keys.SHIFT).sendKeys("abcd").sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).keyUp(Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT)
	.perform();

	
	}

}
