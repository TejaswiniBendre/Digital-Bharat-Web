package secsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Secdemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
	//	System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Java\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.digitalbharatweb.com/");
	}

}
