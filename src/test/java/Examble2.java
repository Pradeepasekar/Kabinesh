import java.io.IOException;

public class Examble2 extends Example{
	public static void main(String[] args) throws IOException, InterruptedException  {
		launch("https://adactin.com/HotelApp/");
		Thread.sleep(3000);
		type("//input[@id='username']", getData(0,1));
		Thread.sleep(3000);
		type("//input[@id='password']", getData(1,0));
		click("//input[@id='login']");
	}

}
