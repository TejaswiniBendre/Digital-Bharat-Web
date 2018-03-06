package sampleProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxsetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.digitalbharatweb.com/");


	}

}
