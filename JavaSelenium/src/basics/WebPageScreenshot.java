package basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		//write a path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//instantiate the browser according to OOAD
		WebDriver driver=new ChromeDriver();
		//maximize the method
		driver.manage().window().maximize();
		//pass the main url
driver.get("https://www.royalchallengers.com/");
//Typecasting to TakesScreenshot bcz driver is webdriver type 
TakesScreenshot ts = (TakesScreenshot)driver;
//choose any one from base64,bytes,file
File tempFile = ts.getScreenshotAs(OutputType.FILE);
//store in string type also replace colon 
String timestamp = LocalDateTime.now().toString().replace(':', '-');

File destFile = new File("./errorshots/facebookloginpage"+timestamp+".png");

String tempFileAddress = tempFile.getAbsolutePath();
System.out.println(tempFileAddress);
FileUtils.copyFile(tempFile,destFile);
Thread.sleep(2000);
driver.manage().window().minimize();
driver.quit();
	}
}
