package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.BaseClass;

public class HomePage1 extends BaseClass {
	
	public HomePage1(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	
	public HomePage1 verifyLogin() {
		String welcomeText = driver.findElement(By.linkText("CRM/SFA")).getText();
		SoftAssert soa = new SoftAssert();
		soa.assertEquals(welcomeText, "CRM/SFA", "Login was Successfull");
		soa.assertAll();
		return this;
		}
		public MyHomePage2 clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage2(driver);
		}
		

}
