import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Qus3 {
	public static void main(String[] args) throws IOException {
	
	File loc=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\testdata\\File2.xlsx");
	FileInputStream stream=new FileInputStream(loc);
	XSSFWorkbook w=new XSSFWorkbook(stream);
    XSSFSheet sheet = w.getSheet("sheet1");
    XSSFRow row = sheet.getRow(0);
    int lastCellNum = row.getLastCellNum();
    System.out.println(lastCellNum);
    int lastRowNum = sheet.getLastRowNum();
    System.out.println(lastRowNum);
}}
