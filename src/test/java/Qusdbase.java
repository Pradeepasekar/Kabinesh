import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Qusdbase {
	public static void main(String[] args) throws IOException {
		File loc =new File("C:\\\\Users\\\\samsung\\\\Desktop\\\\eclipse\\\\pradeepa sekar\\\\MavenFirstClass\\\\testdata\\\\File2.xlsx");
	FileInputStream f=new FileInputStream(loc);
	Workbook w=	new XSSFWorkbook(f);
	Sheet s = w.getSheet("sheet1");
	Row r = s.getRow(1);
	Cell c = r.getCell(1);
	System.out.println(c);
	}

}
