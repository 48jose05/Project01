package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelLaunch {

	public static void main(String[] args) throws IOException {

		// mention the path of excel
		File file = new File("C:\\Users\\91638\\eclipse-workspace\\MavenProject\\Excel\\Book.xlsx");

		// Read bytes/objects from file-->FileInputStream
		FileInputStream stream = new FileInputStream(file);

		// Create the workbook-->collection of sheet
		Workbook workbook = new XSSFWorkbook(stream);

		// Get the sheet name
		Sheet sheet = workbook.getSheet("data");

		// Rows count
		int i = sheet.getPhysicalNumberOfRows();
		System.out.println(i);

		// Get the row
		Row row = sheet.getRow(2);

		// Get the cell
		Cell cell2 = row.getCell(1);
		System.out.println(cell2);

		// Cell count
		int j = row.getPhysicalNumberOfCells();
		System.out.println(j);

		for (int j2 = 0; j2 < row.getPhysicalNumberOfCells(); j2++) {

			Cell cell1 = row.getCell(j2);
			System.out.println(cell1);
		}

		Cell cell = row.getCell(1);

		System.out.println(cell);

		// Iterate rows
		for (int k = 0; k < sheet.getPhysicalNumberOfRows(); k++) {

			// Get the Each row
			Row row2 = sheet.getRow(k);

			// iterate all cells
			for (int l = 0; l < row2.getPhysicalNumberOfCells(); l++) {

			}

		}

		// Get each cell
		Cell cell3 = row.getCell(i);
		System.out.println(cell3);

	}

}
