package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class ContactsPage extends BaseClass{

	public CreateContactsPage clickCreateContacts() {
		driver.findElement(By.linkText("Create Contact")).click();
		return new CreateContactsPage();
	}
}
