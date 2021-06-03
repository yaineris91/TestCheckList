package stepsDefinitions;

import java.util.Properties;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.QuizPage;
import utils.PropertyHelper;
import utils.TestBase;

public class QuizTest extends TestBase{
	Properties p= PropertyHelper.loadData();
	QuizPage home= new QuizPage(driver);
	

@When("click on the quiz option")
public void click_on_the_quiz_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("The application should be open on the Quiz page")
public void the_application_should_be_open_on_the_Quiz_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("enter the {string} and {string}")
public void enter_the_and(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("The application should show the quiz on the list")
public void the_application_should_show_the_quiz_on_the_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("click on the edit quiz option")
public void click_on_the_edit_quiz_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("edit the {string} and {string}")
public void edit_the_and(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("The application should edit {string} and {string} on the list")
public void the_application_should_edit_and_on_the_list(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("The application should remove the quiz of the list")
public void the_application_should_remove_the_quiz_of_the_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
}
