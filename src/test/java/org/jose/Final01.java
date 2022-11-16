package org.jose;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Suite.class)
@SuiteClasses({ Class01.class, Class02.class, Class03.class })
public class Final01 {

	@Test
	public void hoo() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://greenstech.in/");

		driver.findElement(By.xpath("//a[@title='All Courses']")).click();

		driver.close();
	}
}
