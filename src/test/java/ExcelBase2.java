import java.io.IOException;

import org.apache.poi.hpsf.TypeWriter;

public class ExcelBase2 extends ExcelBase {
	public static void main(String[] args) throws IOException {
		launch("https://www.facebook.com/");
		type("email", getData(1,1));
		type("pass", getData(0,1));
	}

}
