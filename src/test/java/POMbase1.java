import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class POMbase1 {
static WebDriver driver;
	public static void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	
}
	public static void url(String u) {
driver.get(u);
	}
	public static void send(WebElement e,String val) {
   e.sendKeys(val);
	}
	public static void click(WebElement a) {
   a.click();
	}
  public static void dropDown(WebElement b,String val1) {
Select s=new Select(b);
s.selectByVisibleText(val1);
}
  public static void dropDowns(WebElement t,int val2) {
	  Select s=new Select(t);
	  s.selectByIndex(val2);
  }
  
  public static void getval(WebElement c) {
String s = c.getAttribute("value");
System.out.println(s);
}
}
