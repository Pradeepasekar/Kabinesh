import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass1 {
	static WebDriver driver;
public static void launch(String url) {
	try {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(url);
}catch(Exception e) {
	e.printStackTrace();
}
}
public static void type(String loc,String val) {
	try {
	driver.findElement(By.xpath(loc)).sendKeys(val);
}catch(Exception e) {
	e.printStackTrace();
}
}	
public static void click(String loclick) {
driver.findElement(By.xpath(loclick)).click();
}

}

