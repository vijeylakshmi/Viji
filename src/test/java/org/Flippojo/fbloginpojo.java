package org.Flippojo;

import org.bas.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginpojo extends Baseclass {
	//1.Non Paramaterized constructor
	public fbloginpojo() {
		PageFactory.initElements(driver, this);
	}
	
	//2. Private Webelements
	//WebElement email = driver.findElement(By.id("email"));
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	
	//3.Getters to access webelements outside the class
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getUsername() {
		return username;
	}
	
	
	
	
}
