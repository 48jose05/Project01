package org.junitbase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 extends BaseClass {

	public Login2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement rooms;

	@FindBy(id = "datepick_in")
	private WebElement checkin;

	@FindBy(id = "datepick_out")
	private WebElement checkout;

	@FindBy(id = "adult_room")
	private WebElement adults;

	@FindBy(id = "child_room")
	private WebElement child;

	@FindBy(id = "Submit")
	private WebElement search;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	public void secondPage(
	// String roomtype,String room,String checkin,String checkout,String
	// adults,String child
	) throws IOException, InterruptedException {
		WebElement location2 = getLocation();
		String cell = getDataFromCell("Sheet1", 1, 2);
		elementSendKeys(location2, cell);
		
		WebElement hotel2 = getHotel();
		String cell2 = getDataFromCell("Sheet1", 1, 3);
		elementSendKeys(hotel2, cell2);
		
		WebElement roomType2 = getRoomType();
		String cell3 = getDataFromCell("Sheet1", 1, 4);
		elementSendKeys(roomType2, cell3);
		
		WebElement rooms2 = getRooms();
		String cell4 = getDataFromCell("Sheet1", 1, 5);
		elementSendKeys(rooms2, cell4);
		
		WebElement checkin2 = getCheckin();
		String cell5 = getDataFromCell("Sheet1", 1, 6);
		elementSendKeys(checkin2, cell5);
		
		WebElement checkout2 = getCheckout();
		String cell6 = getDataFromCell("Sheet1", 1, 7);
		elementSendKeys(checkout2, cell6);
		
		WebElement adults2 = getAdults();
		String cell7 = getDataFromCell("Sheet1", 1, 8);
		elementSendKeys(adults2, cell7);
		
		WebElement child2 = getChild();
		String cell8 = getDataFromCell("Sheet1", 1, 9);
		elementSendKeys(child2, cell8);
		
		getSearch().click();
		
		
		
	}
}