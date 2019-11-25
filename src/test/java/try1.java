


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class try1 {
	static WebDriver driver;
		public static void launch(String url) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\Alerts\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get(url);
		}
	
		}
		
	



