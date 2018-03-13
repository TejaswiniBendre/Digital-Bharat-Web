package sampleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
		
		
		
		//driver.navigate().forward();
		
		//driver.navigate().refresh();
		
		
		WebElement Linktest= driver.findElement(By.linkText("Link Test"));
		Linktest.click();
		
		System.out.println("Link Test pass");
		
		driver.navigate().back();
		
		WebElement firstname=driver.findElement(By.name("firstname"));
	    firstname.sendKeys("Tejaswini");
		
		
		WebElement Lastname= driver.findElement(By.name("lastname"));
		Lastname.sendKeys("Bendre");
		
		
		WebElement radioBtn= driver.findElement(By.id("sex-1"));
		radioBtn.click();
		
		
		WebElement radioBtn1 = driver.findElement(By.id("exp-3"));
		radioBtn1.click();
		
		
		WebElement date=driver.findElement(By.id("datepicker"));
		date.sendKeys("18-02-2018");
		
		
		WebElement check1= driver.findElement(By.id("profession-0"));
		check1.click();
		
		
		WebElement check3=driver.findElement(By.id("tool-2"));
		check3.click();
		
		
		Select continents = new Select(driver.findElement(By.id("continents")));
		continents.selectByVisibleText("Australia");
		
		
		WebElement button=driver.findElement(By.id("submit"));
		button.click();
		

	}

}
