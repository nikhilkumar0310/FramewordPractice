package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClass;

public class MyHomePage2 extends BaseClass{
	
	
	public MyHomePage2(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public ContactsPage clickOnContactsTab() {
		driver.findElement(By.linkText("Contacts")).click();
		return new ContactsPage(driver);
	}

}
