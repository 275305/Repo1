package uielements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;

import javax.activation.DataHandler;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.fluttercode.datafactory.impl.DataFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.sun.mail.imap.protocol.FLAGS;

import WebTest.JourneyScreenOneTest;
import WebTest.JourneyScreenTwoTest;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;
import util.AppConstant;

public class ReusableActions {

	private static File file;
	private static FileInputStream fileInputStream;
	private static XSSFWorkbook hssfWorkbook;
	private static XSSFSheet sheet;
	private static int lastRow;
	private static XSSFCell cell;
	private static String data;
	private static DataFormatter df;

	public static WebDriver driver;
	public static Logger logger = LoggerFactory.getLogger(LoginPage.class);
	public static Logger JourneyScreenOnelogger = LoggerFactory.getLogger(JourneyScreenOneTest.class);
	public static Logger JourneyScreenTwologger = LoggerFactory.getLogger(JourneyScreenTwoTest.class);

	public static String OTP;
	public static String TinyURL;

	// Function for Print the steps in allure report
	@Step("{0}")
	public static void logStep(String stepName) {

	}

	// Function for take the screen shot in allure report
	@Attachment("Screenshot")
	public static byte[] attachScreen(WebDriver driver) {
		logStep("Taking screenshot");
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	@Attachment("Error_Screenshot")
	public static byte[] attachScreen_TestCaseError(WebDriver driver) {
		logStep("Taking screenshot");
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	// Function for Read the data from Properties File

	public static FileInputStream fileInput = null;
	// public String filepath="D:\\Max_Life Resolved
	// Issues\\MAX_QA_FunctionalTest\\File Paths\\geckodriver.exe";
	public static Properties prop = null;

	public static Properties readProperties() {
		file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.INPUT_PROPERTIES_EXCELL);
		FileInputStream fileInput = null;

		try {
			fileInput = new FileInputStream(file);
			prop = new Properties();
			prop.load(fileInput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e1) {
			logger.error(e1.getMessage());
		}

		return prop;
	}

	public static WebElement waitTillElementLocated(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement elementloaded = wait.until(ExpectedConditions.elementToBeClickable(element));
		return elementloaded;
	}

	public static WebElement waitTillElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elementloaded = wait.until(ExpectedConditions.visibilityOf(element));
		return elementloaded;
	}

	public static WebElement waitTillElementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 260);
		WebElement elementloaded = wait.until(ExpectedConditions.elementToBeClickable(element));
		return elementloaded;

	}

	public static WebElement waitTillElementToBeClickableRefreshed(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 260);
		WebElement elementloaded = wait
				.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
		return elementloaded;
	}

	public static WebElement waitTillElementToBeClickableLongWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 660);
		WebElement elementloaded = wait.until(ExpectedConditions.elementToBeClickable(element));
		return elementloaded;
	}

	public static WebElement waitTillpresenceofElementLoacted(By element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elementloaded = wait.until(ExpectedConditions.presenceOfElementLocated(element));
		return elementloaded;
	}

	public static void type(WebElement textbox, String inputdata) throws Exception {
		Thread.sleep(2000);
		for (int i = 0; i <= 15; i++) {
			try {
				textbox.clear();
				textbox.sendKeys(inputdata);
				break;

			} catch (Exception e) {
				if (i == 15) {
					throw e;

				} else {
					Thread.sleep(2000);
				}
			}
		}
	}

	public static void click(WebElement locator) throws Exception {
		Thread.sleep(1000);

		for (int i = 0; i <= 40; i++) {
			try {
				locator.click();
				break;

			} catch (Exception e) {
				if (i == 40) {
					throw e;

				} else {
					Thread.sleep(1000);
				}
			}
		}
	}

	public static boolean isAttribtuePresent(WebElement element, String attribute) {
		Boolean result = false;
		try {
			String value = element.getAttribute(attribute);
			if (value != null) {
				result = true;
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
		}

		return result;
	}

	public static String readingdata(int sheetno, int rownum, int colnum) throws Exception {
		file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		fileInputStream = new FileInputStream(file);
		hssfWorkbook = new XSSFWorkbook(fileInputStream);
		sheet = hssfWorkbook.getSheetAt(sheetno);
		cell = sheet.getRow(rownum).getCell(colnum);
		df = new DataFormatter();
		data = df.formatCellValue(cell);
		hssfWorkbook.close();
		return data;

	}

	public static String readingdataTestData(int sheetno, int rownum, int colnum) throws Exception {
		file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.TEST_DATA_EXCELL);
		fileInputStream = new FileInputStream(file);
		hssfWorkbook = new XSSFWorkbook(fileInputStream);
		sheet = hssfWorkbook.getSheetAt(sheetno);
		cell = sheet.getRow(rownum).getCell(colnum);
		df = new DataFormatter();
		data = df.formatCellValue(cell);
		hssfWorkbook.close();
		return data;

	}

	/* comment on 5 Line*/
	public static void waitTillPageLoaded(WebDriver driver) {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		Wait<WebDriver> wait = new WebDriverWait(driver, 30);
		try {
			wait.until(expectation);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String getColumnDataAsPerTheForLoopRow(XSSFSheet sheet, int rowNum, int column) {
		XSSFCell cellpremiumCommitment = sheet.getRow(rowNum).getCell(column);
		// String premiumCommitmentFromExcell =
		// cellpremiumCommitment.getStringCellValue();
		DataFormatter formatter = new DataFormatter();
		String premiumCommitmentFromExcell = formatter.formatCellValue(sheet.getRow(rowNum).getCell(column));
		return premiumCommitmentFromExcell;
	}

	/*
	 * public static void captureScreenShot(WebDriver ldriver) { // Take screenshot
	 * and store as a file format File src = ((TakesScreenshot)
	 * ldriver).getScreenshotAs(OutputType.FILE); try { // now copy the screenshot
	 * to desired location using copyFile method
	 *
	 * FileUtils.copyFile(src, new File("C:/selenium/" + System.currentTimeMillis()
	 * + ".png")); } catch (IOException e)
	 *
	 * { System.out.println(e.getMessage()); } }
	 */

	// Selecting value by date picker
	public static void datePicker(List<WebElement> columns, int i, String Y) throws Exception {
		// List<WebElement>
		// columns=driver.findElements(By.xpath("//div[contains(@class,
		// 'react-datepicker__month-container')]/div/div[1]/div"));
		{
			for (WebElement cell : columns) {
				// String datePickerText=cell.getText();
				// System.out.print("dataaaa"+datePickerText);
				// boolean date=cell.getText().equals("3");
				// System.out.print(date);
				// String X="3";
				if (cell.getText().equals(i)) {
					// Y="//div[contains(@class,
					// 'react-datepicker__month-container')]/div[2]/div[1]/div[text()="+Z+"]";
					cell.findElement(By.xpath(Y)).click();
					break;
				}
			}
		}
	}

	public static void comparingExcelDataWithUI(String xpath, int sheetNo, int columnNo) throws Exception {
		String str = null;
		XSSFCell cellRep = null;
		List<String> actualResult = new ArrayList<String>();
		List<WebElement> actualListDOBProfInsureresDetails = driver.findElements(By.xpath(xpath));
		for (int i = 0; i < actualListDOBProfInsureresDetails.size(); i++) {
			str = actualListDOBProfInsureresDetails.get(i).getText();
			actualResult.add(str);
		}
		System.out.println(actualResult.size());
		System.out.println(actualResult);
		file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		fileInputStream = new FileInputStream(file);
		hssfWorkbook = new XSSFWorkbook(fileInputStream);
		sheet = hssfWorkbook.getSheetAt(sheetNo);
		lastRow = sheet.getLastRowNum();
		while (lastRow >= 0 && sheet.getRow(lastRow).getCell(columnNo) == null) {
			lastRow--;
		}
		int columnSize = lastRow + 1;
		List<String> expectedResult = new ArrayList<String>();
		for (int i = 1; i < columnSize; i++) {
			cellRep = sheet.getRow(i).getCell(columnNo);
			final FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator(hssfWorkbook);
			objFormulaEvaluator.evaluate(cellRep);
			final DataFormatter dataFormatter = new DataFormatter();
			final String cellValue = dataFormatter.formatCellValue(cellRep, objFormulaEvaluator);
			expectedResult.add(cellValue);
		}
		expectedResult.removeAll(Arrays.asList("", null));
		System.out.println(expectedResult.size());
		System.out.println(expectedResult);
		int x = expectedResult.size();
		for (String compare : actualResult) {
			expectedResult.contains(compare);
			x--;
			System.out.println(x);
		}
		System.out.println(x);

		if (x == 0)

		{
			System.out.println("Test case pass:Drop down list is same as per the requirement");
		} else {
			System.out.println("Test case fail :Drop down list is not same as per the requirement");
		}
	}

	public static void comparingExcelDataWithUIBySheetPath(String xpathOFList, int sheetNo, int columnNo,
			String sheetPath) throws Exception {
		String str = null;
		XSSFCell cellRep = null;
		List<String> actualResult = new ArrayList<String>();
		List<WebElement> actualListDOBProfInsureresDetails = driver.findElements(By.xpath(xpathOFList));
		for (int i = 0; i < actualListDOBProfInsureresDetails.size(); i++) {
			str = actualListDOBProfInsureresDetails.get(i).getText();
			actualResult.add(str);
		}
		System.out.println(actualResult.size());
		System.out.println(actualResult);
		File file = new File(System.getProperty("user.dir") + sheetPath);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(sheetNo);
		int lastRow = sheet.getLastRowNum();
		while (lastRow >= 0 && sheet.getRow(lastRow).getCell(columnNo) == null) {
			lastRow--;
		}
		int columnSize = lastRow + 1;
		List<String> expectedResult = new ArrayList<String>();
		for (int i = 1; i < columnSize; i++) {
			cellRep = sheet.getRow(i).getCell(columnNo);
			final FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator(hssfWorkbook);
			objFormulaEvaluator.evaluate(cellRep);
			final DataFormatter dataFormatter = new DataFormatter();
			final String cellValue = dataFormatter.formatCellValue(cellRep, objFormulaEvaluator);
			expectedResult.add(cellValue);
		}
		expectedResult.removeAll(Arrays.asList("", null));
		System.out.println(expectedResult.size());
		System.out.println(expectedResult);
		int x = expectedResult.size();
		for (String compare : actualResult) {
			expectedResult.contains(compare);
			x--;
			System.out.println(x);
		}
		System.out.println(x);

		if (x == 0)

		{
			System.out.println("Test case pass:Drop down list is same as per the requirement");
		} else {
			Assert.fail("Test case fail :Drop down list is not same as per the requirement");
		}
	}

	public static void comparisonOfListForExpectedAndActualResult(List<String> expectedResult,
			List<String> actualResultText) throws Exception {

		expectedResult.removeAll(Arrays.asList("", null));
		actualResultText.removeAll(Arrays.asList("", null));
		int x = expectedResult.size();
		for (String compare : actualResultText) {
			expectedResult.contains(compare);
			x--;
			System.out.println(x);
		}
		System.out.println(x);

		if (x == 0)

		{
			System.out.println("Test case pass:Drop down list is same as per the requirement");
		} else {
			System.out.println("Test case fail :Expected not same as actual result");
		}

	}

	public static List<String> fetchingdataFromExcelExpectedResult(int columnNo, int columnSize) throws Exception {
		XSSFCell cellRep = null;
		File file = new File(System.getProperty("user.dir") + AppConstant.TEST_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(2);
		/*
		 * int lastRow = sheet.getLastRowNum(); while (lastRow >= 0 &&
		 * sheet.getRow(lastRow).getCell(0) == null) { lastRow--; } int columnSize =
		 * lastRow + 1;
		 */
		List<String> expectedResultForDropDown = new ArrayList<String>();
		for (int i = 1; i < columnSize; i++) {
			cellRep = sheet.getRow(i).getCell(columnNo);
			final FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator(hssfWorkbook);
			objFormulaEvaluator.evaluate(cellRep);
			final DataFormatter dataFormatter = new DataFormatter();
			final String cellValue = dataFormatter.formatCellValue(cellRep, objFormulaEvaluator);
			expectedResultForDropDown.add(cellValue);
		}
		return expectedResultForDropDown;
	}

	public static List<String> fetchingdataFromExcelExpectedResultSheet(int columnNo, int columnSize, int SheetNo)
			throws Exception {
		XSSFCell cellRep = null;
		File file = new File(System.getProperty("user.dir") + AppConstant.TEST_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(SheetNo);
		/*
		 * int lastRow = sheet.getLastRowNum(); while (lastRow >= 0 &&
		 * sheet.getRow(lastRow).getCell(0) == null) { lastRow--; } int columnSize =
		 * lastRow + 1;
		 */
		List<String> expectedResultForDropDown = new ArrayList<String>();
		for (int i = 1; i < columnSize; i++) {
			cellRep = sheet.getRow(i).getCell(columnNo);
			final FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator(hssfWorkbook);
			objFormulaEvaluator.evaluate(cellRep);
			final DataFormatter dataFormatter = new DataFormatter();
			final String cellValue = dataFormatter.formatCellValue(cellRep, objFormulaEvaluator);
			expectedResultForDropDown.add(cellValue);
		}
		return expectedResultForDropDown;
	}

	public static List<String> fetchingdataFromUI(String xpathOfTexOnTheScreen) throws Exception {
		String str = null;
		// driver.findElements(By.xpath("//input[contains(@type,'text')]"));
		List<String> actualResultText = new ArrayList<String>();
		List<WebElement> actualListTextBox = driver.findElements(By.xpath(xpathOfTexOnTheScreen));
		for (int i = 0; i < actualListTextBox.size(); i++) {
			str = actualListTextBox.get(i).getAttribute("value");
			actualResultText.add(str);
		}
		return actualResultText;

	}

	public static boolean isElementDisplayed(WebElement ele) {
		boolean elementDisplayed = false;

		try {
			ele.isDisplayed();
			elementDisplayed = true;
		} catch (Exception e) {
			elementDisplayed = false;
		}

		return elementDisplayed;

	}

	public static boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static void escapeFunction() throws Exception {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(1000);
	}

	public static void backSpaceFunction() throws Exception {
		for (int i = 1; i <= 12; i++) {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(1000);
		}
	}

	public static void tabClose() throws Exception {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
	}
	
	public static void tabReload() throws Exception {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		Thread.sleep(2000);
		
	}

	public static void alwaysCloseAllChildTabs() throws Exception {

		String originalHandle = driver.getWindowHandle();
		// Do something to open new tabs
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
				driver.close();
			}
		}

		driver.switchTo().window(originalHandle);
	}

	public static String testDatafForNameGenerator() {
		DataFactory df = new DataFactory();
		for (int i = 0; i < 200; i++) {
			String name = df.getFirstName() + " " + df.getLastName();
			System.out.println(name);
			return name;
		}
		return null;

	}

	// Gmail throu API
	public static void checkEmail(String validation, String host, String storeType, String user, String password) {
		String filter = null;
		if (validation.equalsIgnoreCase("OTP Validation")) {
			filter = "Pre Issuance otp confirmation";
		} else if (validation.equalsIgnoreCase("Pre Issuance Verification")) {
			filter = "Pre Issuance Verification";
		}
		try {

			// create properties field
			Properties properties = new Properties();
			properties.put("mail.pop3.auth", "true");
			properties.put("mail.pop3.host", host);
			properties.put("mail.pop3.port", "995");
			properties.put("mail.pop3.starttls.enable", "true");
			Session emailSession = Session.getDefaultInstance(properties);

			// create the POP3 store object and connect with the pop server
			Store store = emailSession.getStore("pop3s");

			store.connect(host, user, password);

			// create the folder object and open it
			Folder emailFolder = store.getFolder("INBOX");

			Message[] messages = null;

			outer: for (int timer = 1; timer <= 40; timer++) {
				// retrieve the messages from the folder in an array and print it
				emailFolder.open(Folder.READ_WRITE);
				// getting only unseen emails
				Flags seen = new Flags(Flags.Flag.SEEN);
				FlagTerm unseenFlagTerm = new FlagTerm(seen, false);
				messages = emailFolder.search(unseenFlagTerm);
				// messages = emailFolder.getMessages();
				System.out.println("messages.length---" + messages.length);
				if (messages.length == 0) {
					System.out.println("No new messages are found");
				} else {
					for (int i = 0, n = messages.length; i < n; i++) {
						Message message = messages[i];
						System.out.println("---------------------------------");

						if (message.getSubject().contains(filter)) {
							System.out.println("Line Count is " + message.getSubject());
							Multipart multipart = (Multipart) message.getContent();

							for (int j = 0; j < multipart.getCount(); j++) {

								BodyPart bodyPart = multipart.getBodyPart(j);

								String disposition = bodyPart.getDisposition();

								if (disposition != null && (disposition.equalsIgnoreCase("ATTACHMENT"))) { // BodyPart.ATTACHMENT
																											// doesn't
																											// work for
																											// gmail
									System.out.println("Mail have some attachment");

									DataHandler handler = bodyPart.getDataHandler();
									System.out.println("file name : " + handler.getName());
								} else {
									System.out.println("Body: " + bodyPart.getContent());
									String content = bodyPart.getContent().toString();
									String tinyurl = null;
									String OTPtext;
									if (filter.contains("otp")) {
										OTPtext = content.substring(0, 4);
										OTP = OTPtext;
										System.out.println("OTP is : " + OTP);
									} else if (filter.contains("Verification")) {

										try {
											tinyurl = content.substring(content.indexOf("txnId="),
													content.indexOf("'>"));
										} catch (Exception e) {
											tinyurl = content.substring(content.indexOf("txnId="),
													content.indexOf(" to"));
										}
										TinyURL = "https://tinyurl.com/yd3vyvy7/mprobuyer?" + tinyurl;
										System.out.println(TinyURL);
									}
									message.setFlag(FLAGS.Flag.SEEN, true);
									break outer;
								}
							}
						} else {

							System.out.println("Required -- " + filter + " -- email not reached :  ");
							Thread.sleep(2000);
						}

					}

				}
				Thread.sleep(2000);
				if (timer == 40) {
					System.out.println("Folder aleady open");
				} else {
					emailFolder.close(true);
				}
			}

			// close the store and folder objects
			emailFolder.close(false);
			store.close();

		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// gmail closing

}
