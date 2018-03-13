package secsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Secdemo {
	
	static int browser=2;
			
			static WebDriver driver;
	
			static String projectLocation=System.getProperty("user.dir");

	public static void main(String[] args) {
		
		
		switch (browser) {
		case 1:
			System.out.println("code is executed in chrome browser");
			System.out.println(projectLocation);
			
			System.setProperty("webdriver.chrome.driver",projectLocation+"\\Chromedriver\\chromedriver.exe");
			
			driver=new ChromeDriver();
			break;

		case 2:
			System.out.println("code is executed in firefox browser");
			System.out.println(projectLocation);
			
			System.setProperty("webdriver.gecko.driver",projectLocation+"\\Geckodriver\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			break;
			
		
		}

		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
	//	System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Java\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.digitalbharatweb.com/");
	}

}
