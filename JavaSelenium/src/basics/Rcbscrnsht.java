package basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rcbscrnsht {
	public static void main(String[] args) throws IOException {
		//Set the path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Instantiate the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.royalchallengers.com/");
		WebElement Rcb = driver.findElement(By.cssSelector("img[src='/themes/custom/rcbbase/images/rcb-logo-new.png']"));
File temp = Rcb.getScreenshotAs(OutputType.FILE);
String time = LocalDateTime.now().toString().replace(':', '-');
File dest = new File("./errorshots/rcb"+time+".png");
FileUtils.copyFile(temp, dest);
driver.quit();
}
}