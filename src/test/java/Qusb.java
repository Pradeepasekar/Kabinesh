import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Qusb{
	public static void main(String[] args) throws IOException {
		File s=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\MavenFirstClass\\testdata\\File2.xlsx");
		FileInputStream stream=new FileInputStream(s);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s1 = w.getSheet("sheet1");
		for(int i=0;i<s1.getPhysicalNumberOfRows();i++) {
			Row r = s1.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
			   Cell cell = r.getCell(j);
		int c = cell.getCellType();
		//System.out.println(c);
		if(c==1) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}else if(c==0){
			if(DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yy");
				String f = sim.format(d);
				System.out.println(f);
			}else {
				double a = cell.getNumericCellValue();
				long l=(long)a;
				String v = String.valueOf(l);
				System.out.println(v);
			}
			
		}
			}
		
		}

}
}