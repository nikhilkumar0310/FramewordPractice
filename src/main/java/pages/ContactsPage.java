package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClass;

public class ContactsPage extends BaseClass{

	public ContactsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	
	public CreateContactsPage clickCreateContacts() {
		driver.findElement(By.linkText("Create Contact")).click();
		return new CreateContactsPage(driver);
	}
}
