package uielements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.test.fulfilment.ReusableActionsUpdate;
public class DriverInit extends ReusableActionsUpdate {

    public WebDriver driver;
    private static DriverInit driverInit = null;

    public static DriverInit getInstance() {
        if (driverInit == null) {
            driverInit = new DriverInit();
        }
        return driverInit;
    }

    private DriverInit() {
        this.driver = new ChromeDriver();
       this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.get("******");
    }

    public WebDriver getDriver() {
        return this.driver;
    }}