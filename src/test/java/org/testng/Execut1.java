package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Execut1 extends Base1{
static POJO1 p;
@BeforeClass
private void start() {
launch();
}
@BeforeMethod
private void startTime() {
time();
}
@Test
private void send() {
	Broswer("https://www.facebook.com/");

	p=new POJO1();
type(p.getUserName(), "pradeepa");
type(p.getPassword(), "9635245");
click(p.getLog());
}
@Test
private void resend() {
	Broswer("https://www.facebook.com/");
	p=new POJO1();
type(p.getUserName(), "pradeepa");
type(p.getPassword(), "9635245");
click(p.getLog());
}
@AfterMethod
private void endTime() {
time();
}
@AfterClass
private void End() {
close();
}
}
