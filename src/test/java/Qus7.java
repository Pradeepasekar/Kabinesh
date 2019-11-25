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

public class Qus7 {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\testdata\\File2.xlsx");
FileInputStream stream =new FileInputStream(f);
Workbook w=new XSSFWorkbook(stream);
Sheet s = w.getSheet("sheet1");
Row r = s.getRow(0);
Cell c = r.getCell(1);
String value = c.getStringCellValue();
if(value.equals("Mobile No")) {
	c.setCellValue("ph no");
}
FileOutputStream f1=new FileOutputStream(f);
w.write(f1);
System.out.println("success");
}
}
