package org.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Employee extends BaseClass01 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Employee employee = new Employee();
		employee.booking();
	
	}
	private void booking() throws IOException, InterruptedException {

		getDriver();

		
		maximizeWindow();
		
		enterUrl("http://adactinhotelapp.com/");
		Thread.sleep(2000);
		WebElement id = findElementbyId("username");
		String dataFromCell = getDataFromCell("Sheet1", 1, 0);
		elementSendKeys(id,dataFromCell);
		WebElement id2 = findElementbyId("password");
		String cell2 = getDataFromCell("Sheet1", 1, 1);
		elementSendKeys(id2, cell2);
		WebElement id3 = findElementbyId("login");
		elementClick(id3);
	
	WebElement id4 = findElementbyId("location");
	String cell4 = getDataFromCell("Sheet1", 1, 2);
	elementSendKeys(id4, cell4);
	
	WebElement id5 = findElementbyId("hotels");
	String cell5 = getDataFromCell("Sheet1", 1, 3);
	elementSendKeys(id5, cell5);
	
	WebElement id6 = findElementbyId("room_type");
	String cell6 = getDataFromCell("Sheet1", 1,4);
	elementSendKeys(id6, cell6);
	
	WebElement id7 = findElementbyId("room_nos");
	String cell7 = getDataFromCell("Sheet1", 1, 5);
	elementSendKeys(id7, cell7);
	
	WebElement id8 = findElementbyId("datepick_in");
	String cell8 = getDataFromCell("Sheet1", 1,6);
	elementSendKeys(id8, cell8);
	
	WebElement id9 = findElementbyId("datepick_out");
	String cell9 = getDataFromCell("Sheet1", 1, 7);
	elementSendKeys(id9, cell9);
	
	WebElement id10 = findElementbyId("adult_room");
	String cell10 = getDataFromCell("Sheet1", 1, 8);
	elementSendKeys(id10, cell10);
	
	WebElement id11 = findElementbyId("child_room");
	String cell11 = getDataFromCell("Sheet1", 1,9);
	elementSendKeys(id11, cell11);
	
	WebElement id12 = findElementbyId("Submit");
	elementClick(id12);
	
	WebElement id13 = findElementbyId("radiobutton_0");
	elementClick(id13);
	
	WebElement id14 = findElementbyId("continue");
	elementClick(id14);
	
	
	WebElement id15 = findElementbyId("first_name");
	String cell15 = getDataFromCell("Sheet1", 1, 10);
	elementSendKeys(id15, cell15);
	
	WebElement id16 = findElementbyId("last_name");
	String cell16 = getDataFromCell("Sheet1", 1, 11);
	elementSendKeys(id16, cell16);
	
	WebElement id17 = findElementbyId("address");
	String cell17 = getDataFromCell("Sheet1", 1, 12);
	elementSendKeys(id17, cell17);
	
	WebElement id18 = findElementbyId("cc_num");
	String cell18 = getDataFromCell("Sheet1", 1, 13);
	elementSendKeys(id18, cell18);
	
	WebElement id19 = findElementbyId("cc_type");
	String cell19 = getDataFromCell("Sheet1", 1, 14);
	elementSendKeys(id19, cell19);
	
	
	WebElement id20 = findElementbyId("cc_exp_month");
	String cell20 = getDataFromCell("Sheet1", 1, 15);
	elementSendKeys(id20, cell20);
	
	WebElement id21 = findElementbyId("cc_exp_year");
	String cell21 = getDataFromCell("Sheet1", 1, 16);
	elementSendKeys(id21, cell21);
	
	WebElement id22 = findElementbyId("cc_cvv");
	String cell22 = getDataFromCell("Sheet1", 1, 17);
	elementSendKeys(id22, cell22);
	
	
	WebElement id23 = findElementbyId("book_now");
	elementClick(id23);
	
	Thread.sleep(3000);
	
	WebElement id24 = findElementbyId("order_no");
	String attributeValue = elementGetAttributeValue(id24, "VRI40X1N66");
	writeDatainCell("Sheet1", 1, 18,  attributeValue);
	

	
}}
