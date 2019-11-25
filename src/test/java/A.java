



	import java.util.Date;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class A {
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
		@Test
		private void tc1() {
			driver.get("https://www.facebook.com/");

	WebElement a = driver.findElement(By.id("email"));
	a.sendKeys("pradeepa");
	WebElement b = driver.findElement(By.id("pass"));
	b.sendKeys("9594494");
	WebElement c = driver.findElement(By.id("loginbutton"));
	c.click();
	}
		@Test(priority=-5)
		private void tc2() {
			driver.get("https://www.facebook.com/");
			WebElement a = driver.findElement(By.id("email"));
			a.sendKeys("kdwhdwdik");
			WebElement b = driver.findElement(By.id("pass"));
			b.sendKeys("64949");
			WebElement c = driver.findElement(By.id("loginbutton"));
			c.click();

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



