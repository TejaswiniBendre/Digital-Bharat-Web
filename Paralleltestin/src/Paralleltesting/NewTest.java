package Paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	
	 public WebDriver driver;
     String projectLocation = System.getProperty("user.dir");
     @Parameters("myBrowser")
     @BeforeClass
     public void launchbrowser(String myBrowser)
     {
   	  if(myBrowser.equalsIgnoreCase("firefox")){
   		  System.setProperty("webdriver.gecko.driver",projectLocation+"\\Geckodriver\\geckodriver.EXE");
   		  driver = new FirefoxDriver();
   	  }
   	  else
   	  {
   		  System.setProperty("webdriver.chrome.driver",projectLocation+"\\Chromedriver\\chromedriver.exe");
   		  driver = new ChromeDriver();
   	  }
   	  
     }
  @Test
  public void f() {
	  
	  driver.get("https://www.fb.com");
	   boolean logo = driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")).isDisplayed();
	   System.out.println(logo);
  }
}
