package org.manual;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManualTesting01 extends BaseClassMan {

	@BeforeMethod
	private void beforeMethod() {
		getDriver();
		enterUrl("");
	}

	@Test(groups = "tc01")
	public void tc1() {

		findElementbyId("").sendKeys("");
		findElementbyId("").sendKeys("");
		
		// login button field enabled check
		boolean enabled = findElementbyId("").isEnabled();
		System.out.println(enabled);

	}

	@Test(groups = "")
	public void tc02() {

		// username field display test
		findElementbyId("").sendKeys("");

	}

	@Test(groups = "")
	public void tc03() {

		// password field display test
		findElementbyId("").sendKeys("");
	}

	@Test(groups = "")
	public void tc04() {

		// for validation of new user
		// enter username
		findElementbyId("").sendKeys("");
		
		// enter password
		findElementbyId("").sendKeys("");
		
		// enter login
		findElementbyId("").click();

		// validate the order history of user
		findElementbyId("").click();

		// validate the latest transaction history
		findElementbyId("").click();

		// validate the account details
		findElementbyId("").click();

		// validate the new user order histry
		findElementbyId("").click();

		// enter promo code for Existing user
		findElementbyId("").sendKeys("");

		// validate promo code for new user
		findElementbyId("").sendKeys("");

	}

	@Test
	public void tc05() {

		// for validation of new user
		// enter username
		findElementbyId("").sendKeys("");
		
		// enter password
		findElementbyId("").sendKeys("");
		
		// enter login
		findElementbyId("").click();

		// validate new user should be a credit card holder
		findElementbyId("").click();

		// validate debit card card holder using promo code
		findElementbyId("").click();

	}

	@Test
	public void tc06() {

		// for validation of new user
		// enter username
		findElementbyId("").sendKeys("");
		
		// enter password
		findElementbyId("").sendKeys("");
		
		// enter login
		findElementbyId("").click();

		// enter promo code without case sensitive
		findElementbyId("").sendKeys("");

		// enter invalid promo code
		findElementbyId("").sendKeys("");

		// enter valid promo code
		findElementbyId("").sendKeys("");

	}

	@Test
	public void tc07() {

		// for validation of new user
		// enter username
		findElementbyId("").sendKeys("");
		
		// enter password
		findElementbyId("").sendKeys("");
		
		// enter login
		findElementbyId("").click();

		// validation of november month new user using promo code
		findElementbyId("").sendKeys("");

		// validation of december month new user using promo code
		findElementbyId("").sendKeys("");

		// validation of december month new user using promo code 2nd time
		findElementbyId("").sendKeys("");
	}

	@Test
	public void tc08() {

		// for validation of new user
		// enter username
		findElementbyId("").sendKeys("");
		
		// enter password
		findElementbyId("").sendKeys("");
		
		// enter login
		findElementbyId("").click();

		// validate new user using promo code between 10am to 12pm
		findElementbyId("").sendKeys("");

		// validate new user using promo code between 06am to 10am
		findElementbyId("").sendKeys("");

	}

	@Test
	public void tc09() {

		// for validation of new user
		// enter username
		findElementbyId("").sendKeys("");
		
		// enter password
		findElementbyId("").sendKeys("");
		
		// enter login
		findElementbyId("").click();

		// Validate promo code apply only for mobiles
		findElementbyId("").click();

	}

}
