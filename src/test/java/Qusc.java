import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Qusc {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\testdata\\pradeepa.xlsx");
Workbook w=new XSSFWorkbook();
	Sheet s = w.createSheet("pradeepa");
	Row r = s.createRow(0);
	Cell c = r.createCell(7);
	c.setCellValue("priya");
	c.getStringCellValue();
	FileOutputStream o=new FileOutputStream(f);
	w.write(o);
	System.out.println("success");
	
}
}
