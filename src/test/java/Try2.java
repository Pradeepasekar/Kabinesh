import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\Alerts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		File f=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\src\\test\\java\\File7.xlsx");
		FileInputStream a=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(a);
		Sheet s=w.getSheet("sheet1");
	
			
		
		Row r=s.getRow(0);
		
			
		
		
		WebElement m = driver.findElement(By.xpath("//input[@id='username']"));
		m.sendKeys(r.getCell(0).toString());
		Thread.sleep(3000);
		WebElement n = driver.findElement(By.xpath("//input[@id='password']"));
		n.sendKeys(r.getCell(1).toString());
		Thread.sleep(3000);
	
		WebElement d = driver.findElement(By.xpath("//input[@id='login']"));
		d.click();
		
		
		driver.navigate().refresh();
		driver.navigate().back();
}
		
}

