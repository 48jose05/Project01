package org.testng;

import org.junitbase.BaseClassTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class03 extends BaseClassTestNG {

	@Test

	public void ok1() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement xpath = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));

		Actions ac = new Actions(driver);

		ac.moveToElement(xpath).perform();

		driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[1]")).click();
		
		driver.close();

	}
}
