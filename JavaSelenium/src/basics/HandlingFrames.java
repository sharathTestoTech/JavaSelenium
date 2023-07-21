package basics;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingFrames {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	WebElement parentFrame = driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']"));
		driver.switchTo().frame(parentFrame);
		WebElement nestedFrame = driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
		driver.switchTo().frame(nestedFrame);
		WebElement nestedFrameTextField = driver.findElement(By.cssSelector("input[type='text']"));
		nestedFrameTextField.sendKeys("Selenium");
		//switch back the control to the immediate parent frame
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.tagName("h5")).getText());
		//switch back the control to the default content area
		driver.switchTo().defaultContent();
		//driver reference has a limited scope with in the nested frame
		WebElement degaultContentElement = driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
		degaultContentElement.click();

	}
	}

