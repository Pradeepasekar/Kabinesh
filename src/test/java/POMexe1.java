
public class POMexe1 extends POMbase1{
public static void main(String[] args) throws InterruptedException {
	launch();
	url("https://adactin.com/HotelApp/");
	POMpojo1 l=new POMpojo1();
	send(l.getUser(), "pradeepa");
	send(l.getPass(), "7JILYK");
	click(l.getLog());
	POMpojo2 m=new POMpojo2();
	dropDown(m.getLoc(), "London");
	dropDown(m.getHotel(), "Hotel Creek");
	dropDown(m.getRoom(), "Double");
	dropDowns(m.getNo(), 2);
	dropDowns(m.getChild(), 1);
	click(m.getSubmit());
	POMpojo3 n=new POMpojo3();
	click(n.getSelect());
	click(n.getConti());
	send(n.getName(), "pradeepa");
	send(n.getLast(), "sekar");
	send(n.getAddrs(), "chennai");
	send(n.getAcno(), "1234567895998569");
	dropDown(n.getType(), "VISA");
	dropDown(n.getMonth(), "March");
	dropDown(n.getYear(), "2020");
	send(n.getCvv(), "1234");
	click(n.getBook());
	Thread.sleep(5000);
	getval(n.getOrder());
}



}
