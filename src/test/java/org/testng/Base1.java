package org.testng;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	static WebDriver driver;
public static void launch() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	}
public static void Broswer(String url) {

	driver.get(url);
}
public static void close() {
driver.quit();
}
public static void type(WebElement e,String val) {
e.sendKeys(val);
}
public static void click(WebElement a) {
a.click();
}
public static void time() {
Date d=new Date();
System.out.println(d);
}

}
