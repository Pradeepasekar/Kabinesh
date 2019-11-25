import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class Exceltest {
// EXCEL READ
	public static void main(String[] args) throws IOException {
		/*File loc=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\testdata\\File1.xlsx");
	FileInputStream stream=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(stream);
	Sheet s = w.getSheet("sheet2");
	Row r = s.getRow(1);
	Cell c = r.getCell(0);
	System.out.println(c);*/
		
	//EXCEL READ ITERATE	
		/*File loc=new File("C:\\\\Users\\\\samsung\\\\Desktop\\\\eclipse\\\\pradeepa sekar\\\\MavenFirstClass\\\\testdata\\\\File1.xlsx");
	FileInputStream stream=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(stream);
	Sheet s = w.getSheet("sheet1");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			System.out.println(c);
			int type = c.getCellType();
			System.out.println(type);
			*/
//CELL TYPE			
		/*File loc=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\testdata\\File1.xlsx");
		FileInputStream stream=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("sheet2");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
		
		int type = c.getCellType();
		if(type==1) {
			String string = c.getStringCellValue();
			System.out.println(string);
			
		}else if(type==0){
			if(DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yy");
				String f = sim.format(d);
				System.out.println(f);
				
			}else {
				double d1 = c.getNumericCellValue();
				long l=(long)d1;
				String a = String.valueOf(l);
				System.out.println(a);
			}
	}
		}}*/
		
		
	
}
	}