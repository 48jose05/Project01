package org.baseclass;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
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

public class Junit01 {

	@Test
	public void method01() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement findElement = driver.findElement(By.xpath("//h2[contains(text(),'connect and share')]"));
		String text = findElement.getText();
		System.out.println(text);

		String s = "Facebook helps you connect and share with the people in your life.";

		assertEquals(s, text);

	}/*
		 * @Test public void method02() {
		 * 
		 * //String s =
		 * "Facebook helps you connect and share with the people in your life."; //
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * driver.manage().window().maximize(); driver.get("https://www.facebook.com/");
		 * 
		 * 
		 * WebElement findElement =
		 * driver.findElement(By.xpath("//h2[contains(text(),'connect and share')]"));
		 * String text = findElement.getText(); System.out.println(text);
		 * 
		 * String s=text;
		 * 
		 * assertEquals(true, true);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
}
