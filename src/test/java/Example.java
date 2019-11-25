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

public class Example {
	static WebDriver driver;

	public static void launch(String url) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void type(String loc, String val) {
		try {
			driver.findElement(By.xpath(loc)).sendKeys(val);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(String loclick) {
		driver.findElement(By.xpath(loclick)).click();
	}

	public static String getData(int rowNo, int cellNo) throws IOException {

		String value = null;
		File loc = new File(
				"C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\testdata\\File1.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		if (type == 1) {
			value = c.getStringCellValue();
			System.out.println(value);
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date datavalue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
				value = sim.format(datavalue);
				System.out.println(value);
			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				String b = String.valueOf(l);
				System.out.println(b);
			}
		}
		return value;
	}

}
