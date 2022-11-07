package org.junitbase;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics {

	static WebDriver driver;

	@Rule
	public TestName name = new TestName();

	@BeforeClass
	public static void beforeClass() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
	}

	@Before
	public void before() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void tc01() {
		// Assert.assertTrue(driver.findElement(By.xpath("//input[@name='email']")).isDisplayed());
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("welcome");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
	}

	@Test
	public void tc02() {
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("hijavaa");
	}

	@Test
	public void tc03() {
		WebElement btnLogin = driver.findElement(By.id("loginbutton"));
		btnLogin.click();

	}

	@After
	public void after() throws IOException {
		Date date = new Date();
		System.out.println(date);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(name.getMethodName() + "png"));

	}

	@AfterClass
	public static void afterClass() {
		driver.close();
	}
}
