package org.Stepdefinition;

import org.bas.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoflip extends Baseclass{

	public Pojoflip() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement login;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement emailtextbox;
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmailtextbox() {
		return emailtextbox;
	}

	public WebElement getReqOtpbutton() {
		return reqOtpbutton;
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement reqOtpbutton;
}
