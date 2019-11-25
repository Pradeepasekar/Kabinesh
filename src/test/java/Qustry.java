import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Qustry {
	public static void main(String[] args) throws IOException {
		File s=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\testdata\\File4.xlsx");
		FileInputStream stream=new FileInputStream(s);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s1 = w.createSheet("sheet1");
		for(int i=0;i<3;i++) {
			Row r = s1.createRow(i);
			for(int j=0;j<2;j++) {
				Cell c = r.createCell(j);
				c.setCellValue("date");
				
}
			
		}}}
