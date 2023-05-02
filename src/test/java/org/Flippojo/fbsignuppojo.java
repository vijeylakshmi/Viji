package org.Flippojo;

import org.bas.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbsignuppojo extends Baseclass {

	public fbsignuppojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Create new account']")
	WebElement createnewacc;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement firstnametextbox;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement SecondnameTextbox;

	@FindBy(name = "reg_email__")
	WebElement MobileorEmailtxtbox;

	@FindBy(name = "reg_passwd__")
	WebElement NewPasswordtxtbox;

	public WebElement getCreatenewacc() {
		return createnewacc;
	}

	public WebElement getFirstnametextbox() {
		return firstnametextbox;
	}

	public WebElement getSecondnameTextbox() {
		return SecondnameTextbox;
	}

	public WebElement getMobileorEmailtxtbox() {
		return MobileorEmailtxtbox;
	}

	public WebElement getNewPasswordtxtbox() {
		return NewPasswordtxtbox;
	}

}
