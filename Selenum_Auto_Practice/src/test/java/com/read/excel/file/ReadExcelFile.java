package com.read.excel.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.guru.alerts.SimpleAlertMessageHandling;
import com.reusable.constant.ReusableConstant;

public class ReadExcelFile {
	private String path;
	private String data;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private XSSFRow row;
	private static XSSFCell cell;
	private static String[][] excelData;
	private static int colCount = 0;
	private static int rowCount = 0;
	private int lastRow;
	private String[][] readdata;
	private static FileInputStream fileStream;
	private static final Logger logger = Logger.getLogger(SimpleAlertMessageHandling.class.getName());
	// Reading Excel File and get the data

	@Test
	public static String readExcel_Files(int sheetNo, int row, int col) throws IOException {

		try {
			String path = System.getProperty("user.dir");
			String excelFile = path + ReusableConstant.READ_EXCEL_FILE;
			
			fileStream = new FileInputStream(new File(excelFile));
			workbook = new XSSFWorkbook(fileStream);
			
			Thread.sleep(3000);
			// sheet = workbook.getSheet("LogIn");
			// read data
			XSSFSheet sheet = workbook.getSheetAt(sheetNo);
			cell = sheet.getRow(row).getCell(col);
			String CellData = cell.getStringCellValue();
			DataFormatter df = new DataFormatter();
			excelData[row][col] = df.formatCellValue(cell);

			return CellData;

		} catch (Exception e) {

			 e.printStackTrace();

		}
		return null;

		// end
		/*
		 * colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		 * 
		 * System.out.println("No of Columns" + colCount);
		 * 
		 * rowCount = sheet.getPhysicalNumberOfRows();
		 * 
		 * System.out.println("no of Rows" + rowCount);
		 * 
		 * excelData = new String[rowCount][colCount];
		 * 
		 * for (int row1 = 0; row1 < rowCount; row1++) { // row =
		 * sheet.getRow(row); for (int column = 0; column < colCount; column++)
		 * { cell = sheet.getRow(row1).getCell(column); cell =
		 * sheet.getRow(row1).getCell(column); System.out.print(" " +
		 * cell.getStringCellValue()); // DataFormatter df = new
		 * DataFormatter(); // excelData[row][column] =
		 * df.formatCellValue(cell);
		 * 
		 * } }
		 */
		// return excelData;

	}
}
