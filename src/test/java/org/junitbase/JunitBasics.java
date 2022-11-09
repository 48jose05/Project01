package org.junitbase;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitBasics extends BaseClass {
public static WebDriver driver;
	
	@BeforeClass
	public static void BeforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	

	}
	@Before
	public void before() throws IOException {
		// TODO Auto-generated method stub
		findElementbyId("email");
		
		
	}
	@Test
	public void tc01() throws IOException {
		// TODO Auto-generated method stub
		takeScreenshot("C:\\Users\\91638\\OneDrive\\Desktop\\New folder\\clone1\\Project01\\screenshots\\name.png");
		
	}
	@After
	public void after() {
		// TODO Auto-generated method stub

	}
	@AfterClass
	public static void afterclass() {
		
	}
}
