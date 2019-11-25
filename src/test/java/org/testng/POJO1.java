package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO1 extends Base1 {
	public POJO1() {
		PageFactory.initElements(driver, this);
	}
    public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLog() {
		return log;
	}
	@FindBy(id="email")
	private WebElement userName;
    @FindBy(id="pass")
	private WebElement password;
    @FindBy(id="loginbutton")
	private WebElement log;
}
