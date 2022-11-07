package org.junitbase;

import java.io.IOException;

public class TestData extends LoginPage {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseClass cc = new BaseClass();
		
		
		cc.getDriver();
		cc.enterUrl("http://adactinhotelapp.com/");
		
		LoginPage ee = new LoginPage();

		ee.firstPage("madasamy", "12345@greens");
		
		Thread.sleep(3000);

		Login2 gg = new Login2();
		gg.secondPage();
		
		Login3 jj= new Login3();
		jj.thirdPage();
		
		
		
		
		
		
		
		
		
		
		
	}

}
