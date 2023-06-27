package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class MyHomePage2 extends BaseClass{
	
	public ContactsPage clickOnContactsTab() {
		driver.findElement(By.linkText("Contacts")).click();
		return new ContactsPage();
	}

}
