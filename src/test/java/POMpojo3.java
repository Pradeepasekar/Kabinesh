import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMpojo3 extends POMbase1{
	public POMpojo3() {
		PageFactory.initElements(driver, this);
	}


	 public WebElement getSelect() {
		return select;
	}
	public WebElement getConti() {
		return conti;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getLast() {
		return last;
	}
	public WebElement getAddrs() {
		return addrs;
	}
	public WebElement getAcno() {
		return acno;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	public WebElement getOrder() {
		return order;
	}
	@FindBy(id="radiobutton_0")
	 private WebElement select;
	 @FindBy(id="continue")
	 private WebElement conti;
	 @FindBy(id="first_name")
	 private WebElement name;
	 @FindBy(id="last_name")
	 private WebElement last;
	 @FindBy(id="address")
	 private WebElement addrs;
	 @FindBy(id="cc_num")
	 private WebElement acno;
	 @FindBy(id="cc_type")
	 private WebElement type;
	 @FindBy(id="cc_exp_month")
	 private WebElement month;
	 @FindBy(id="cc_exp_year")
	 private WebElement year;
	 @FindBy(id="cc_cvv")
	 private WebElement cvv;
	 @FindBy(id="book_now")
	 private WebElement book;
	 @FindBy(id="order_no")
	 private WebElement order;
	
	}
	 

