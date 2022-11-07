package org.junitbase;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTestNG{

	

	

	public static WebDriver driver;
	public static  WebElement element;


		
		public void getDriver() {//

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			// return driver;
		}

		public void enterUrl(String url) {//
			driver.get(url);

		}

		public void maximizeWindow() {//
			driver.manage().window().maximize();

		}

		public void elementSendKeys(WebElement element, String data) {//
			element.sendKeys(data);

		}

		public void elementSendKeysJs(WebElement element, String data) {//
			JavascriptExecutor executor = (JavascriptExecutor) driver;

			executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);

		}

		public void elementClick(WebElement element) {//
			element.click();

		}

		public String getApplnTitle() {//

			String title = driver.getTitle();
			return title;
		}

		public WebElement findElementbyId(String attributeValue) {//
			WebElement element = driver.findElement(By.id(attributeValue));
			return element;
		}

		public WebElement findElementbyName(String attributeValue) {//
			WebElement element = driver.findElement(By.name(attributeValue));
			return element;
		}

		public WebElement findElementByClassName(String attributeValue) {//

			WebElement element = driver.findElement(By.className(attributeValue));
			return element;
		}

		public WebElement findElementByXpath(String xpath) {//
			WebElement element = driver.findElement(By.xpath(xpath));
			return element;
		}

		public void closeWindow() {
			driver.close();
		}

		public void quitWindow() {
			driver.quit();

		}

		public String getCurrntUrl(String string) {//
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}

		public String getText(WebElement element) {//
			String text = element.getText();
			return text;
		}



		public String elementGetAttributeValue(WebElement element, String attributeName) {
			String attribute = element.getAttribute(attributeName);
			return attribute;
		}

		public void selectOptionByText(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}

		public void selectOptionByAttribute(WebElement element, String value) {//

			Select select = new Select(element);
			select.selectByValue(value);
		}

		public void selectOptionByIndex(WebElement element, int index) {//
			Select select = new Select(element);
			select.selectByIndex(index);
		}

		public void dropdownOptionByText(WebElement element, String text) {
			Select se = new Select(element);
			se.selectByVisibleText(text);
		}

		public void dropdownOptionByAttribute(WebElement element, String text) {
			Select se = new Select(element);
			se.selectByValue(text);
		}

		public void dropdownOptionByIndex(WebElement element, int no) {
			Select se = new Select(element);
			se.selectByIndex(0);
		}

		public void okAlert() {//
			Alert al = driver.switchTo().alert();
			al.accept();
		}

		public void cancelAlert() {//
			Alert al = driver.switchTo().alert();
			al.dismiss();
		}

		public void sendKeyAlert(String value) {//
			Alert al = driver.switchTo().alert();
			al.sendKeys(value);
		}

		public String getTextAlert() {//
			Alert al = driver.switchTo().alert();
			String text = al.getText();
			return text;
		}

		public void insertedValueFromTextbox(WebElement element, String name) {
			element.getAttribute(name);
		}

		public void allWindow() {
			driver.quit();
		}

		public void closeCurrentWindows() {
			driver.close();
		}

		public void enteredUrl() {
			driver.getCurrentUrl();
		}
		public String getDataFromCell(String Adacitine, int rownum, int cellnum) throws IOException {//

			String res = "";

			File file = new File("C:\\Users\\91638\\eclipse-workspace\\MavenProject\\Excel\\Adacitine.xlsx");

			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet("Sheet1");
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			CellType type = cell.getCellType();
			switch (type) {
			case STRING:
				res = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					res = dateFormat.format(dateCellValue);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
					res = valueOf.toString();
				}
				break;
			default:
				break;
			}
			return res;
		}
		public String getdataSheet(String adacitine, int rownum, int cellnum) throws IOException {

			String res = " ";

			File file = new File("C:\\Users\\91638\\eclipse-workspace\\MavenProject\\Excel\\Adacitine.xlsx");

			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet("Sheet1");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(1);

			System.out.println(cell);
			return res;

		}

		public void clearTextBox(WebElement element) {//

			element.clear();
		}

	
	}


