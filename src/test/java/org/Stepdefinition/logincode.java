package org.Stepdefinition;

import org.Flippojo.fbloginpojo;
import org.bas.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logincode extends Baseclass{
	fbloginpojo f;
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();   
	}

	@When("To launch the url of the Instagram Application")
	public void to_launch_the_url_of_the_Instagram_Application() {
		driver.get("https://www.instagram.com/");
	}
	
	@When("To pass the valid username in username field")
	public void to_pass_the_valid_username_in_username_field() {
	   // f = new fbloginpojo();
	    //passText("viji", f.getEmail());
	  	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Kanmani");
	}

	@When("To pass the valid password in password field")
	public void to_pass_the_valid_password_in_password_field() {
	    f = new fbloginpojo();
	    passText("kavin456", f.getPassword());
	}

	@When("To click the Login button")
	public void to_click_the_Login_button() {
	    f = new fbloginpojo();
	    clickBtn(f.getLoginBtn());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	closeEntireBroswer();    
	}
}
