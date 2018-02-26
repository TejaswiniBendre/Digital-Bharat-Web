package com.testng.ex;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
	public WebDriver driver;
  @Test
  public void test1() {
	  WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("tcbendre26@gmail.com");

		WebElement inputtext = driver.findElement(By.name("pass"));
		inputtext.sendKeys("prernateju");

		// WebElement Login = driver.findElement(By.id("u_0_2"));
		// Login.click();

		WebElement inputtext_58mg_5dba_2ph = driver.findElement(By.id("u_0_l"));
		inputtext_58mg_5dba_2ph.sendKeys("Tejaswini");

		WebElement lastname = driver.findElement(By.id("u_0_n"));
		lastname.sendKeys("Bendre");

		// WebElement Mobilenumber =driver.findElement(By.id("u_0_q"));
		// Mobilenumber.sendKeys("8623885359");

		WebElement emailaddress = driver.findElement(By.id("u_0_q"));
		emailaddress.sendKeys("tcbendre26@gmail.com");

		WebElement Reenteremailaddress = driver.findElement(By.id("u_0_t"));
		Reenteremailaddress.sendKeys("tcbendre26@gmail.com");

		WebElement Newpassword = driver.findElement(By.id("u_0_x"));
		Newpassword.sendKeys("tejuprerna");

		Select Birthday = new Select(driver.findElement(By.id("day")));
		Birthday.selectByVisibleText("26");

		// Select month= new Select(driver.findElement(By.id("month")));
		// month.selectByVisibleText("Sept");

		// Select month= new Select(driver.findElement(By.id("month")));
		// month.selectByIndex(9);

		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("9");

		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1994");

		WebElement radioBtn = driver.findElement(By.id("u_0_b"));
		radioBtn.click();

		WebElement createaccount = driver.findElement(By.id("u_0_13"));
		createaccount.click();

		// String baseUrl=("https\\www.digitalbharatweb.com");
		// driver.get(baseUrl);

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\java\\chromedriver.exe");
	  driver =new ChromeDriver();
	  
	  driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");

  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
