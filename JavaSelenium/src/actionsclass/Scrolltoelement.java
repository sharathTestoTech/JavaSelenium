package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolltoelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 Actions action = new Actions(driver);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 WebElement loginbutton = driver.findElement(By.linkText("Log in"));
		 WebElement helpbutton = driver.findElement(By.linkText("Help"));
		 action.scrollToElement(loginbutton).pause(2000).scrollToElement(helpbutton).perform();
		// WebElement login = driver.findElement(By.linkText("Log in"));
			//WebElement help = driver.findElement(By.linkText("Help"));
			//action.scrollToElement(login).pause(2000).scrollToElement(help).perform();

	}
}

