package org.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test1 {
static WebDriver driver;
	@BeforeClass
	private void start() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	}
@BeforeMethod
private void startTime() {
Date d=new Date();
System.out.println(d);
}
@Test(dataProvider="log in")
private void send(String s1) throws AWTException {
	driver.get("http://www.flipkart.com/");
	WebElement a = driver.findElement(By.className("LM6RPg"));
	a.sendKeys(s1);
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
@DataProvider(name="log in")
private Object[][] enter() {
	return new Object[][] {{"mobile"},{"tv"},{"fridge"}};

}
}
