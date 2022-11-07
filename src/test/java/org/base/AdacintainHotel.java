package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AdacintainHotel {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\91638\\eclipse-workspace\\MavenProject\\Excel\\Adacitine.xlsx");

		FileInputStream stream = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("Sheet1");

		Row row = sheet.getRow(9);

		Cell cell = row.getCell(7);

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row2 = sheet.getRow(i);

			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {

				Cell cell2 = row2.getCell(j);
				System.out.println(cell2);
		}

		}
	}
}
