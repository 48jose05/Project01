package org.jose;

import org.junit.Test;
import org.junitbase.BaseClassTestNG;

public class Class01 extends BaseClassTestNG {

	@Test
	public void tc01() {
		getDriver();
		enterUrl("https://www.facebook.com/");

		findElementbyId("email").sendKeys("welcomejava");

		findElementbyId("pass").sendKeys("76747476");

		findElementbyName("login").click();

		driver.close();
		
	}

}
