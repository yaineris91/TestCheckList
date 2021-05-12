package stepsDefinitions;

import java.util.Properties;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.PropertyHelper;
import utils.TestBase;

public class HomeTest extends TestBase {

	Properties p= PropertyHelper.loadData();
	HomePage home= new HomePage(driver);
	
	@Then("The application should be open on the Home page")
	public void the_application_should_be_open_on_the_Home_page() {
	    home.assertHomeText();
	}
	
	@When("click on the menu button")
	public void click_on_the_menu_button() {
	   home.clickMenuButton();
	}

	@Then("The application should open the main menu")
	public void the_application_should_open_the_main_menu() {
	    home.assertMenuIsVisible();
	}
}
