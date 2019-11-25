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
import org.testng.annotations.Test;

public class Task1 {

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
	private void tc2(String s1) {
		driver.get("https://www.amazon.in/");
		WebElement a = driver.findElement(By.id("twotabsearchtextbox"));
		a.sendKeys(s1);

		

		WebElement c = driver.findElement(By.className("nav-input"));
		c.click();

}
	@DataProvider(name="login")
	private Object[][] data() {
		return new Object[][] {{"iphone"},{"samsung"},{"Redmi"},{"vivo"},{"nokia"},{"Xiaomi Mi"},{"Coolpad"}};

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












