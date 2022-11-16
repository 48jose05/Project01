package org.jose;

import org.junit.Test;
import org.junitbase.BaseClassTestNG;

public class Class02 extends BaseClassTestNG {

	@Test
	public void clas() {
		getDriver();
		
		enterUrl("http://adactinhotelapp.com/");
		
		findElementbyId("username").sendKeys("welcomejava");

		findElementbyId("password").sendKeys("76747476");

		findElementbyId("login").click();
		
		driver.close();

	}

}
