package org.baseclass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert01 {
	@Ignore
	@Test
	private void tc01() {
		String s = "jack";

		boolean b = s.contains("J");
		Assert.assertTrue(b, "mismatched");
		System.out.println(b);
		System.out.println("pass");

	}

	@Ignore
	@Test
	private void tc02() {
		String s = "Jack";
		boolean contains = s.contains("J");
		Assert.assertEquals(contains, true, "mismatch");
		System.out.println(contains);
		System.out.println("pass");

	}

	@Ignore
	@Test
	private void tc03() {

		String s = "Facebook helps you connect and share with the people in your life.";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement findElement = driver.findElement(By.xpath("//h2[contains(text(),'connect and share')]"));
		String text = findElement.getText();

		Assert.assertEquals(text, s, "missmatch");

		System.out.println("pass");
	}

	@Test
	private void tc04() {
String s = "Jack";
	
	boolean contains = s.contains("J");
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(contains, true,"mismatch");
	System.out.println(contains);
	System.out.println("pass");
	
	
	
	
	
	
	}
	
	
}