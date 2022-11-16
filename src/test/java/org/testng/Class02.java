package org.testng;

import org.junitbase.BaseClassTestNG;
import org.testng.annotations.Test;

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
