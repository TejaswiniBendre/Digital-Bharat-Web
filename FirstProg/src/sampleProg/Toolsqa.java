package sampleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\java\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		
		WebElement partiallinktest= driver.findElement(By.partialLinkText("Partial Link Test"));
		partiallinktest.click();
		
		System.out.println("partial link test pass");
		
		driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.navigate().refresh();
		
		
		WebElement Linktest= driver.findElement(By.linkText("Link Test"));
		Linktest.click();
		
		System.out.println("Link Test pass");
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("tejaswini");
		
		
		WebElement Lastname=driver.findElement(By.name("lastname"));
		Lastname.sendKeys("bendre");
		
		

	}

}
