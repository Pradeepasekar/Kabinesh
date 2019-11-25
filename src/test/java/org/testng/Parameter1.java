package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {

	static WebDriver driver;
	@BeforeClass
 private void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
	}
	@BeforeMethod
	private void starttime() {
  Date d=new Date();
  System.out.println(d);
	}
	
	@Test(dataProvider="login")
	private void tc2(String s1,String s2) {
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"));
		WebElement a = driver.findElement(By.id("email"));
		a.sendKeys(s1);

		WebElement b = driver.findElement(By.id("pass"));
		b.sendKeys(s2);
		Assert.assertEquals("752222", a.getAttribute("value"));

		WebElement c = driver.findElement(By.id("loginbutton"));
		c.click();

}
	@DataProvider(name="login")
	private Object[][] data() {
		return new Object[][] {{"pradeepa","7538563"},{"kavi","98462978"},{"pragathi","94613845"}};

	}
	@AfterClass
	private void closeBrowser() {
driver.quit();
	}
	@AfterMethod
	private void endTime() {
		  Date d=new Date();
		  System.out.println(d);
	}
	}












