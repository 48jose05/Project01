package org.junitbase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login3 extends BaseClass {
	
	public Login3() {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="radiobutton_0")
	private WebElement butClick;
	
	@FindBy(id="continue")
	private WebElement contClick;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement creditNo;
	
	@FindBy(id="cc_type")
	private WebElement creditType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNum;
	
	@FindBy(id="book_now")
	private WebElement bookClick;

	public WebElement getButClick() {
		return butClick;
	}

	public WebElement getContClick() {
		return contClick;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditNo() {
		return creditNo;
	}

	public WebElement getCreditType() {
		return creditType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookClick() {
		return bookClick;
	}
	
	public void thirdPage() throws IOException {
		 getButClick().click();
		 
		 getContClick().click();
		 
		 WebElement firstName2 = getFirstName();
		 String cell = getDataFromCell("Sheet1", 1, 10);
		 elementSendKeys(firstName2, cell);
		 
		 WebElement lastName2 = getLastName();
		 String cell2 = getDataFromCell("Sheet1", 1, 11);
		 elementSendKeys(lastName2, cell2);
		 
		 WebElement address2 = getAddress();
		 String cell3 = getDataFromCell("Sheet1", 1, 12);
		 elementSendKeys(address2, cell3);
		 
		 WebElement creditNo2 = getCreditNo();
		 String cell4 = getDataFromCell("Sheet1", 1, 13);
		 elementSendKeys(creditNo2, cell4);
		 
		 WebElement creditType2 = getCreditType();
		 String cell5 = getDataFromCell("Sheet1", 1, 14);
		 elementSendKeys(creditType2, cell5);
		 
		 
		
		WebElement expMonth2 = getExpMonth();
		String cell6 = getDataFromCell("Sheet1", 1, 15);
		elementSendKeys(expMonth2, cell6);
		
		WebElement expYear2 = getExpYear();
		String cell7 = getDataFromCell("Sheet1", 1, 16);
		elementSendKeys(expYear2, cell7);
		
		WebElement cvvNum2 = getCvvNum();
		String cell8 = getDataFromCell("Sheet1", 1, 17);
		elementSendKeys(cvvNum2, cell8);
		
		getBookClick().click();
		
	}
	
	
	
	
	
}
