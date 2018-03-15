package Paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
	
	 WebDriver driver;
	   String projectLocation = System.getProperty("user.dir");

  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", projectLocation+"\\Chromedriver\\chromedriver.exe");
      driver = new ChromeDriver();

      JavascriptExecutor js = (JavascriptExecutor) driver;

      // Launch the application		
     // driver.get("http://demo.guru99.com/test/guru99home/");
      driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
      WebElement Element = driver.findElement(By.linkText("VBScript"));

      //This will scroll the page Horizontally till the element is found		
      js.executeScript("arguments[0].scrollIntoView();", Element);
      

      //This will scroll the web page till end.		
     // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		System.out.println("scroll test");
		

  }
}
