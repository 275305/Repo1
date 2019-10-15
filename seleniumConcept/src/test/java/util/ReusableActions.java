package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import pages.PropertyReader;

public class ReusableActions {
	
protected static WebDriver driver;

Properties properties;
String PATH = System.getProperty("user.dir");
private final String propertyFilePath = PATH + "\\config\\configuration.properties";;

// PATH + "\\config\\configration.properties"
PropertyReader reader=new PropertyReader();
	
 public ReusableActions() {
	// TODO Auto-generated constructor stub

	BufferedReader reader;

	try {

		reader = new BufferedReader(new FileReader(propertyFilePath));
		properties = new Properties();
		try {
			properties.load(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
	}
}

	@BeforeTest
	public void initBrowser() {
		//String PATH = System.getProperty("user.dir");
		//PATH + "\\lib\\chromedriver.exe"
		System.setProperty("webdriver.chrome.driver",reader.getChromeDriver());
		driver = new ChromeDriver();
		String url = reader.getApplicationUrl();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(reader.getImplicitWait(), TimeUnit.SECONDS);
		driver.get(url);
			}

	public static String readingdata(int sheetno, int rownum, int colnum) throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = hssfWorkbook.getSheetAt(sheetno);
		Cell cell = sheet.getRow(rownum).getCell(colnum);
		DataFormatter df = new DataFormatter();
		String data = df.formatCellValue(cell);
		hssfWorkbook.close();
		return data;
	}

}
