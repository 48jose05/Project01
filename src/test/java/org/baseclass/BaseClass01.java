package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass01 {

	WebDriver driver;
	// WebElement element;

	public void getDriver() {//

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

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

	public void selectOptionByText(WebElement element, String text) {//
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

	public void clickjs(WebElement element) {//
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].click()", element);
	}

	public void switchtoChildWindow(WebElement window) {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

		for (String x : windowHandles) {
			if (!windowHandle.equals(windowHandles)) {
				driver.switchTo().window(windowHandle);

			}
		}
	}

	public void frameByindex(int no) {
		driver.switchTo().frame(0);
	}

	public void frameById(String id) {
		driver.switchTo().frame(id);
	}

	public void getAllOptionFromDropDownasText(WebElement element) {

		Select select = new Select(element);

		List<WebElement> options = select.getOptions();

		for (int i = 0; i < options.size(); i++) {

			WebElement element2 = options.get(i);
			String text = element.getText();
			System.out.println(text);

		}
	}

	public List<WebElement> getAllSelectedOptions(WebElement element) {//
		Select select = new Select(element);

		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

		return allSelectedOptions;
	}

	public List<WebElement> getAllOptionsFromDropDown(WebElement element) {//
		Select select = new Select(element);

		List<WebElement> options = select.getOptions();

		return options;
	}

	public WebElement getFirstSelectedOption(WebElement element) {//
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;

	}

	public boolean dropDownisMultipleOption(WebElement element) {//
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void implicitWait(int time, int unit) {
		/////////// driver.manage().timeouts().implicitlyWait(time, unit);
	}

	public void waitforVisibilityOf() {

	}

	public void fluentWait() {
		/////// new Fluentwait(driver).withTimeout().pollingEvery().ignoring();
	}

	public boolean isDisplayed(WebElement element) {//
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public boolean isEnabled(WebElement element) {//
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public boolean isSelected(WebElement element) {//
		boolean selected = element.isSelected();
		return selected;

	}

	public void deSelectByIndex(WebElement element, int index) {//
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deSelectByAttribute(WebElement element, String value) {//
		Select select = new Select(element);
		select.deselectByValue(value);

	}

	public void deSelectByText(WebElement element, String text) {//
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deSelectAll(WebElement element) {//
		Select select = new Select(element);
		select.deselectAll();
	}

	public void clearTextBox(WebElement element) {//

		element.clear();
	}

	public File takeScreenShot() {//
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		return screenshotAs;

	}

	public String getDataFromCell(String Adacitine, int rownum, int cellnum) throws IOException {//

		String res = "";

		File file = new File("C:\\Users\\91638\\eclipse-workspace\\MavenProject\\Excel\\Adacitine.xlsx");

		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(Adacitine);
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

	public void updateCellData(String sheetname, int rownum, int cellnum, String olddata, String newdata)
			throws IOException {//

		File file = new File("C:\\Users\\91638\\eclipse-workspace\\MavenProject\\Excel\\Book.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		if (value.equals(olddata)) {
			cell.setCellValue(newdata);

			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);
		}

	}

	public void createCellinExistingRow(String sheetname, int rownum, int cellnum, String newdata) throws IOException {//

		File file = new File("C:\\Users\\91638\\eclipse-workspace\\MavenProject\\Excel\\Book.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(newdata);
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);

	}

	public void createCell(String sheetname, int rownum, int cellnum, String newdata) throws IOException {//

		File file = new File("C:\\Users\\91638\\eclipse-workspace\\MavenProject\\Excel\\Book.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(newdata);
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);

	}

	public void writeDatainCell(String sheetname, int rownum, int cellnum, String data) throws IOException {

		File file = new File("C:\\Users\\91638\\eclipse-workspace\\MavenProject\\Excel\\Book.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("sheetname");
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue("     ");

		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

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

	public void scrollDown(WebElement element) {//
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public void scrollUp(WebElement element) {//
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public void moveToElement(WebElement element) {//
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	public void doubleClick(WebElement element) {//
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}

	public void rightClick(WebElement element) {//
		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();
	}

	public void navigateToUrl(String url) {//
		driver.navigate().to(url);
	}

	public void refreshPage() {//
		driver.navigate().refresh();
	}

	public void previousPage() {//
		driver.navigate().back();
	}

	public void nextPage() {//
		driver.navigate().forward();
	}

	public void switchToParentFrame(String id) {//
		driver.switchTo().parentFrame();
	}

	public void switchToFrameById(String id) {//
		driver.switchTo().frame(id);
	}

	public void switchToFrameByWebElementRef(WebElement element) {//
		driver.switchTo().frame(element);
	}

	public void switchToFrameByIndex(int index) {//
		driver.switchTo().frame(index);
	}

	public void switchToWindowByUrl(String Url) {//
		driver.switchTo().window(Url);
	}

	public void switchToWindowById(String id) {//
		driver.switchTo().window(id);
	}

	public void switchToWindowByTitle(String value) {//
		driver.switchTo().window(value);
	}

	public void switchToParentWindow(String id) {//
		driver.switchTo().defaultContent();
	}

	public String getParentWindow() {//
		String parentWindow = driver.getWindowHandle();
		return parentWindow;
	}

	public Set<String> getAllWindows() {//
		Set<String> allWindows = driver.getWindowHandles();
		return allWindows;
	}

	public void unconditionalWait(int msecs) throws InterruptedException {//
		Thread.sleep(msecs);
	}

}
