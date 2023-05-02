package org.Stepdefinition;

import org.Flippojo.fbsignuppojo;
import org.bas.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sgincode extends Baseclass{

	fbsignuppojo s;
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch url of Facebook application")
	public void to_launch_url_of_Facebook_application() {
	    //launchUrl("https://www.facebook.com/");
		driver.get("https://en-gb.facebook.com/");
	}

	@When("To click the Create New Account button")
	public void to_click_the_Create_New_Account_button() {
	    s = new fbsignuppojo();
	    clickBtn(s.getCreatenewacc());
	}

	@When("To pass the FirstName in Firstname Text box")
	public void to_pass_the_FirstName_in_Firstname_Text_box() throws InterruptedException {
		Thread.sleep(3000);
		s = new fbsignuppojo();
	    passText("Viji", s.getFirstnametextbox());
	}

	@When("To pass the SecondName in scondnameText box")
	public void to_pass_the_SecondName_in_scondnameText_box() throws InterruptedException {
		Thread.sleep(3000);
		s = new fbsignuppojo();
	    passText("Kavinesh", s.getSecondnameTextbox());
	}

	@When("To pass the Mobile no. or email in emailText box")
	public void to_pass_the_Mobile_no_or_email_in_emailText_box() {
	  
		s = new fbsignuppojo();
	   passText("vijikanamnni@gmail.com", s.getMobileorEmailtxtbox());
	}

	@When("To pass the password in password text box")
	public void to_pass_the_password_in_password_text_box() throws InterruptedException {
	   Thread.sleep(3000);
		s = new fbsignuppojo();
	    passText("viji123456", s.getNewPasswordtxtbox());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	    closeEntireBroswer();
	}

}
