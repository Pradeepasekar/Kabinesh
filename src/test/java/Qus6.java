import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Qus6 {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\testdata\\File3.xlsx");

		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("pradeepa");
		Row r = s.createRow(2);
		Cell c = r.createCell(1);
		c.setCellValue("pradeepa");
		FileOutputStream f = new FileOutputStream(loc);
		w.write(f);
		System.out.println("success");

	}
}
