package basics;

import java.io.File;
import java.time.LocalDateTime;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {
	public static void main(String[] args) throws IOException {
		//Set the path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Instantiate the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement loginButton = driver.findElement(By.name("login"));
		File tempFile = loginButton.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(tempFile, new File("./errorshots/loginbutton"+LocalDateTime.now().toString().replace(':','-')+".png"));
		//FileUtils.copyFile(tempFile,newFile("./errorshots/loginbutton"+LocalDateTime.now().toString().replace(':','-')+".png"));
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
