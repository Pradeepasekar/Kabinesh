import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest1 {
	public static void main(String[] args) throws IOException {
	//write excel

	/*File loc=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\src\\test\\java\\File6.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet s = w.createSheet("sheet2");
	Row r = s.createRow(1);
	Cell c = r.createCell(0);
	c.setCellValue("pradeepa");
    FileOutputStream stream=new FileOutputStream(loc);
	w.write(stream);
	System.out.println("success");
	*/
	
	File loc=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\src\\test\\java\\File7.xlsx");
	FileInputStream stream=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(stream);
	Sheet s = w.getSheet("sheet1");
	Row r = s.getRow(1);
	Cell c = r.getCell(0);
	String s1 = c.getStringCellValue();
	if(s1.equals("pradeepa")) {
		c.setCellValue("kabi");
	}
	FileOutputStream o=new FileOutputStream(loc);
	w.write(o);
System.out.println("success");

}}
