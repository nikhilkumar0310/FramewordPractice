package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class CreateContactsPage extends BaseClass{
	
	public CreateContactsPage enterFirstName() {
		driver.findElement(By.id("firstNameField")).sendKeys("Hamza");
		return this;
	}
	
	public CreateContactsPage enterLastName() {
		driver.findElement(By.id("lastNameField")).sendKeys("Yaz");
		return this;
		
	}
	
	public CreateContactsPage enterPINCode() {
		driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("77011");
		return this;
	}
	
	public ViewContactsPage clickCreateContact() {
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		return new ViewContactsPage();
	}

}
