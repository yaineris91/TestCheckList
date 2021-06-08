package stepsDefinitions;

import java.util.Properties;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClasificationPage;
import pages.HomePage;
import utils.PropertyHelper;
import utils.TestBase;

public class ClasificationTest extends TestBase {
	Properties p= PropertyHelper.loadData();
	ClasificationPage clasification= new ClasificationPage(driver);
	HomePage home= new HomePage(driver);
	

@When("click on the clasification option")
public void click_on_the_clasification_option() {
   home.clickClasificationOption();
}

@Then("The application should be open on the Clasification page")
public void the_application_should_be_open_on_the_Clasification_page() {
    clasification.assertTheClasificationPageIsOpen();
}


@When("enter the clasification with {string}")
public void enter_the_clasification_with(String name) {
	String clasificationName= p.getProperty(name);
	clasification.enterClasificationName(clasificationName);
}


@When("click on the new clasification button")
public void click_on_the_new_clasification_button() {
    clasification.clickNewClasificationButton();
}


@Then("The application should show the clasification {string} on the list")
public void the_application_should_show_the_clasification_on_the_list(String name) throws InterruptedException {
	String clasificationName= p.getProperty(name);
	Thread.sleep(1000);
	clasification.assertTheClasificationIsOnTheTable(clasificationName);
}

@When("click on the edit clasification option with {string}")
public void click_on_the_edit_clasification_option_with(String name) throws InterruptedException {
	String clasificationName= p.getProperty(name);
	 Thread.sleep(5000);
	clasification.selectClasificationAndClickEditButton(clasificationName);
}

@When("edit the clasification and enter {string}")
public void edit_the_clasification_and_enter(String name) {
	String clasificationName= p.getProperty(name);
	clasification.editClasificationName(clasificationName);
}

@When("click on the remove clasification option of the {string}")
public void click_on_the_remove_clasification_option_of_the(String name) throws InterruptedException {
	String clasificationName= p.getProperty(name);
	Thread.sleep(5000);
	clasification.selectProjectAndClickDeleteButton(clasificationName);
}

@Then("The application should remove the clasification{string} of the list")
public void the_application_should_remove_the_clasification_of_the_list(String name) {
	String clasificationName= p.getProperty(name);
	clasification.assertTheClasificationIsRemovedCorrectly(clasificationName);
}


}
