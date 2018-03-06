package sampleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Buttonpresence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=9_SUWq_fD7D98wfqxabwBQ&gws_rd=ssl");
		driver.get("http://www.digitalbharatweb.com/");
		
		boolean button=driver.findElement(By.xpath("//*[@id='input-search-term']")).isDisplayed();
		
		boolean searchanythinghere=driver.findElement(By.id("input-search-term")).isDisplayed();
		
		//boolean location = driver.findElement(By.id("location")).isDisplayed();
		System.out.println(button);

		if(searchanythinghere == true)
		{
			
		System.out.println("search anything here is present");
		}
		
	}

}
