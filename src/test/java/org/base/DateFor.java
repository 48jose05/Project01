package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateFor {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\91638\\eclipse-workspace\\MavenProject\\Excel\\Adacitine.xlsx");

		FileInputStream stream = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("Sheet1");

		Row row = sheet.getRow(4);

		Cell cell = row.getCell(4);

		// Date date = new Date();

		// SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		// String format = dateFormat.format(date);

		// System.out.println(format);

		Date dateCellValue = cell.getDateCellValue();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		String format = dateFormat.format(dateCellValue);

		System.out.println(format);

	}
}
