package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NumberNumeric {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\91638\\eclipse-workspace\\MavenProject\\Excel\\Book.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("Sheet1");

		Row row = sheet.getRow(5);

		Cell cell = row.getCell(3);

		CellType type = cell.getCellType();

		switch (type) {
		case STRING:
			String name = cell.getStringCellValue();
			System.out.println(name);
			break;

		case NUMERIC:

			double cellValue2 = cell.getNumericCellValue();
			BigDecimal decimal = BigDecimal.valueOf(cellValue2);
			System.out.println(decimal);
			break;
		default:
			break;
		}

	}

}
