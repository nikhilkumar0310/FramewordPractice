package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	
	public LoginPage enterPassword() {
        driver.findElement(By.id("password")) .sendKeys("crmsfa");
        return this;
	}
	
	public HomePage1 clickOnTheLoginBtn() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new HomePage1();
		
	}
}
