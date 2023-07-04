package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.ReadExcelFile;

public class BaseClass extends AbstractTestNGCucumberTests {

	//public static RemoteWebDriver driver; //Will Use ThreadLocal for Cucumber Parallel Execution. 
	private static final ThreadLocal<RemoteWebDriver> thDriver = new ThreadLocal<RemoteWebDriver>();
	public String excelFileName;
	
	public void setDriver(RemoteWebDriver driver) {
		thDriver.set(driver);
	}
	
	public RemoteWebDriver getDriver() {
		return thDriver.get();
	}
	
	
	
	@DataProvider(name = "contacts_Data")
	public String[][] getData() throws IOException {
		return ReadExcelFile.throwExcelData(excelFileName);
	}
	
	
	@BeforeMethod
	public void preConditions() {
		//driver = new ChromeDriver();
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	@AfterMethod
	public void postCondition() {
		getDriver().close();
		
	}
}
