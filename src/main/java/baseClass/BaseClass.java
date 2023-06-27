package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utilities.ReadExcelFile;

public class BaseClass {

	public static RemoteWebDriver driver;
	public String excelFileName;
	
	
	
	
	@DataProvider(name = "contacts_Data")
	public String[][] getData() throws IOException {
		return ReadExcelFile.throwExcelData(excelFileName);
	}
	
	
	@BeforeMethod
	public void preConditions() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}
}
