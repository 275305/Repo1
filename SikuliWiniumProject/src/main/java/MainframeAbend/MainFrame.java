package MainframeAbend;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class MainFrame {
	
	static MainFrame frame;
	WiniumDriver driver;
   
	public static void main(String[] args) throws Exception {

		frame = new MainFrame();
		frame.initialIbmFrame();
		frame.radioIbmframe();
		frame.drodownIbmFrame();
     	}

	public void implicitWait() {
		WebDriverWait wait=new  WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("COBOL")));
		 
		
	}
	public void initialIbmFrame() throws InterruptedException, MalformedURLException {

		DesktopOptions desktopOptions = new DesktopOptions();

		desktopOptions.setApplicationPath("C:\\Program Files (x86)\\Mainframe ABEND ASSIST\\ABENDASSIST.exe");

		driver = new WiniumDriver(new URL("http://localhost:9999"), desktopOptions);

		Thread.sleep(5000);
	    }

	public void radioIbmframe() throws Exception {
		//driver.findElement(By.name("COBOL")).click();
		String name_radio = driver.findElement(By.name("COBOL")).getAttribute("Name");
		System.out.println("Selected radio value is:" + name_radio);
		
		frame.implicitWait();
		driver.findElement(By.name("VSAM")).click();
		
		driver.findElement(By.name("IMS")).click();
		
		driver.findElement(By.name("MVS")).click();
	
		driver.findElement(By.name("DB2")).click();
		
		driver.findElement(By.name("IDMS")).click();
	
		driver.findElement(By.name("JCL")).click();
	
		driver.findElement(By.name("CICS")).click();

		driver.findElement(By.name("REXX")).click();
		
		
	     }

	public void drodownIbmFrame() throws Exception {
		driver.findElement(By.id("DropDown")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("01")).click();
		String dropDownValue = driver.findElement(By.name("01")).getAttribute("Name");

		System.out.println("drop down value is:" + dropDownValue);

		Thread.sleep(3000);
		
		driver.quit();
	    
		List<WebElement> itemIbmFrame=driver.findElementsByClassName("ThunderRT6UserControlDC");
		
		Iterator itr=itemIbmFrame.iterator();
		
		for(WebElement ele:itemIbmFrame) {
			System.out.println(ele.getAttribute("itemIbmFrame"));
			
			ele.click();
			
			itr.next();
			}
			
		
		
	}

}
