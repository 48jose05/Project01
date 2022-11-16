package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Final01 {

	@Test
	public void hoo() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://greenstech.in/");

		driver.findElement(By.xpath("(//a[contains(text(),'Placements')])[1]")).click();
		
		driver.close();

	}
}
