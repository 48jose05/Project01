package org.testng;

import org.junitbase.BaseClassTestNG;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPage extends BaseClassTestNG {
    
	@Parameters({ "username", "password" })
	@Test(priority=1)
	public void firstPage(String user, String pass) {
		getDriver();
		enterUrl("http://adactinhotelapp.com/");

		WebElement id = findElementbyId("username");
		elementSendKeys(id, user);

		WebElement id2 = findElementbyId("password");
		elementSendKeys(id2, pass);

		WebElement id3 = findElementbyId("login");
		elementClick(id3);

	}

	@Parameters({ "location", "hotels", "roomtype", "noofrooms", "checkindate", "checkoutdate", "adultsperroom",
			"childrensperroom" })
	@Test(priority=2)
	public void secondPage(String loc, String hote, String rtype, String noroom, String chkDate, String chkout,
			String adlper, String chiper) throws InterruptedException {
		WebElement id4 = findElementbyId("location");
		elementSendKeys(id4, loc);

		WebElement id5 = findElementbyId("hotels");
		elementSendKeys(id5, hote);

		WebElement id6 = findElementbyId("room_type");
		elementSendKeys(id6, rtype);

		WebElement id7 = findElementbyId("room_nos");
		elementSendKeys(id7, noroom);

		WebElement id8 = findElementbyId("datepick_in");
		elementSendKeys(id8, chkDate);

		Thread.sleep(3000);
		
		WebElement id9 = findElementbyId("datepick_out");
		elementSendKeys(id9, chkout);

		WebElement id10 = findElementbyId("adult_room");
		elementSendKeys(id10, adlper);

		WebElement id11 = findElementbyId("child_room");
		elementSendKeys(id11, chiper);

		WebElement id12 = findElementbyId("Submit");
		elementClick(id12);
		
		Thread.sleep(3000);
	}

	@Parameters({ "firstname", "lastname", "billingaddress", "creditcardno", "creditcardtype", "expirymonth",
			"selectyear", "cvvnum" })
	@Test(priority=3)
	public void thirdPage(String firname, String lasname, String billadd, String crecadno, String crecardty,
			String expmon, String selyear, String cvvnum) throws InterruptedException {

		WebElement id13 = findElementbyId("radiobutton_0");
		elementClick(id13);

		WebElement id14 = findElementbyId("continue");
		elementClick(id14);

		WebElement id15 = findElementbyId("first_name");
		elementSendKeys(id15, firname);

		WebElement id16 = findElementbyId("last_name");
		elementSendKeys(id16, lasname);

		WebElement id17 = findElementbyId("address");
		elementSendKeys(id17, billadd);

		Thread.sleep(3000);
		
		WebElement id18 = findElementbyId("cc_num");
		elementSendKeys(id18, crecadno);

		WebElement id19 = findElementbyId("cc_type");
		elementSendKeys(id19, crecardty);
		
		WebElement id20 = findElementbyId("cc_exp_month");
        elementSendKeys(id20, expmon);
        
        WebElement id21 = findElementbyId("cc_exp_year");
	    elementSendKeys(id21, selyear);
	    
	    WebElement id22 = findElementbyId("cc_cvv");
	    elementSendKeys(id22, cvvnum);
	    
	    WebElement id23 = findElementbyId("book_now");
	    elementClick(id23);
	    
	    Thread.sleep(2000);
	    
	    WebElement id24 = findElementbyId("order_no");
	    
	    
	    String text = getText(id24);
	    System.out.println(text);
	    
//	    String id25 = elementGetAttributeValue(id24, "value");
//	    System.out.println(id25);
	    
	}

}
