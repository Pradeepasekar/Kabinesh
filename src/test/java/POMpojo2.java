import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMpojo2 extends POMbase1{
	public POMpojo2() {
		PageFactory.initElements(driver, this);
	}

 public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getNo() {
		return no;
	}
	public WebElement getC() {
		return c;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit() {
		return submit;
	}
@FindBy(id="location")
 private WebElement loc;
 @FindBy(id="hotels")
 private WebElement hotel;
 @FindBy(id="room_type")  
 private WebElement room;
 @FindBy(id="room_nos")
 private WebElement no;
 @FindBy(id="adult_room")
 private WebElement c;
 @FindBy(id="child_room")
 private WebElement child;
 @FindBy(id="Submit")
 private WebElement submit;

 

 
 

}
