package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import pages.LoginPage;
import utilities.ReadExcelFile;

public class BaseClass extends AbstractTestNGCucumberTests {

	//public static RemoteWebDriver driver; //Will Use ThreadLocal for Cucumber Parallel Execution. 
	private static final ThreadLocal<RemoteWebDriver> thDriver = new ThreadLocal<RemoteWebDriver>();
	public String excelFileName;
	public static Properties prop;
	public static Properties proLang;
	
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
	public void preConditions() throws InterruptedException, IOException {
		//driver = new ChromeDriver();
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(new File("./src/main/resources/config.properties"));
		prop.load(fis);
		
		
		getDriver().get(prop.getProperty("url"));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String lang = prop.getProperty("language");
		proLang = new Properties();
		FileInputStream fiL = new FileInputStream(new File("./src/main/resources/"+lang+".properties"));
		proLang.load(fiL);
		
		
		
		
		new LoginPage().enterUserName(prop.getProperty("username")).enterPassword(prop.getProperty("password")).clickOnTheLoginBtn();
	}
	
	@AfterMethod
	public void postCondition() {
		getDriver().close();
		
	}
}
