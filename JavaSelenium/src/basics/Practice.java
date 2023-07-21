package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Instantiate the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Dimension size = driver.manage().window().getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		
		System.out.println("height"+ height);
		System.out.println("width"+ width);
		
	}

}
