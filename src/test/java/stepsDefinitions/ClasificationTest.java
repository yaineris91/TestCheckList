package stepsDefinitions;

import java.util.Properties;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClasificationPage;
import utils.PropertyHelper;
import utils.TestBase;

public class ClasificationTest extends TestBase {
	Properties p= PropertyHelper.loadData();
	ClasificationPage home= new ClasificationPage(driver);
	

@When("click on the clasification option")
public void click_on_the_clasification_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("The application should be open on the Clasification page")
public void the_application_should_be_open_on_the_Clasification_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("click on the new clasification button")
public void click_on_the_new_clasification_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("The application should show the clasification on the list")
public void the_application_should_show_the_clasification_on_the_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("click on the edit clasification option")
public void click_on_the_edit_clasification_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("click on the remove clasification button")
public void click_on_the_remove_clasification_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("The application should remove the clasification of the list")
public void the_application_should_remove_the_clasification_of_the_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
}
