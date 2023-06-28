package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


import baseClass.BaseClass;

public class CreateContactsPage extends BaseClass{
	
	public CreateContactsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public CreateContactsPage enterFirstName(String fpgName) {
		driver.findElement(By.id("firstNameField")).sendKeys(fpgName);
		return this;
	}
	
	public CreateContactsPage enterLastName(String lpgName) {
		driver.findElement(By.id("lastNameField")).sendKeys(lpgName);
		return this;
		
	}
	
	public CreateContactsPage enterPINCode(String pPgCode) {
		driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys(pPgCode);
		return this;
	}
	
	public ViewContactsPage clickCreateContact() {
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		return new ViewContactsPage(driver);
	}

}
