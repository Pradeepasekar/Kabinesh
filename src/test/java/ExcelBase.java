import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ExcelBase{
	static WebDriver driver;
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	public static void type(String loc,String val) {
driver.findElement(By.id(loc)).sendKeys(val);
	}
	
		public static String getData(int rowNo,int cellNo) throws IOException {
		
	String value=null;
		File loc=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\src\\test\\java\\File7.xlsx");
		FileInputStream stream=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
			
	                 int type = c.getCellType();
	         		if(type==1) {
	         			 value = c.getStringCellValue();
	         			System.out.println(value);
	         			
	         		}else if(type==0){
	         			if(DateUtil.isCellDateFormatted(c)) {
	         			Date d = c.getDateCellValue();
	         				SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yy");
	         				 value = sim.format(d);
	         				System.out.println(value);
	         				
	         			}else {
	         				double d1 = c.getNumericCellValue();
	         				long l=(long)d1;
	         				 value = String.valueOf(l);
	         				System.out.println(value);
	         			}
		
	
}
		}}
		return value;}}
