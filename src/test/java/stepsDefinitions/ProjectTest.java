package stepsDefinitions;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProjectPage;
import utils.PropertyHelper;
import utils.TestBase;

public class ProjectTest extends TestBase{
	Properties p= PropertyHelper.loadData();
	ProjectPage project= new ProjectPage(driver);
	HomePage home= new HomePage(driver);
	
	@When("click on the project option")
	public void click_on_the_project_option() {
	  home.clickProjectOption();
	}

	@Then("The application should be open on the Project page")
	public void the_application_should_be_open_on_the_Project_page() {
	    project.assertTheProjectPageIsOpen();
	}

	@When("click on the new project button")
	public void click_on_the_new_project_button() {
	  project.clickNewProjectButton();
	}

	@When("enter the {string}")
	public void enter_the(String name) {
		String projectName= p.getProperty(name);
		project.enterProject(projectName);
	}

	@When("click on the save button")
	public void click_on_the_save_button() {
	    project.clickSaveButton();
	}

	@Then("The application should show a {string} to the user")
	public void the_application_should_show_a_to_the_user(String message) throws InterruptedException {
		String projectMessage= p.getProperty(message);
		  Thread.sleep(1000);
	    project.assertTheApplicationShowAMessage(projectMessage);
	}
	

	@When("edit whit the {string}")
	public void edit_with_the(String name) {
		String projectName= p.getProperty(name);
       project.editProjectName(projectName);
       
	}
	@Then("The application should show the {string} on the list")
	public void the_application_should_show_the_on_the_list(String name) throws InterruptedException {
		String projectName= p.getProperty(name);
		 Thread.sleep(1000);
		project.assertTheProjectIsOnTheTable(projectName);
	}
	
	
	@When("click on the edit project option with {string}")
	public void click_on_the_edit_project_option_with(String name) throws InterruptedException {
		String projectName= p.getProperty(name);
      Thread.sleep(5000);
	   project.selectProjectAndClickEditButton(projectName);
	   

	}

	

	@When("click on the yes option")
	public void click_on_the_yes_option() {
	    project.clickYesOption();
	}

	@When("click on the remove project option with {string}")
	public void click_on_the_remove_project_option_with(String name) throws InterruptedException {
		String projectName= p.getProperty(name);
		 Thread.sleep(5000);
	   project.selectProjectAndClickDeleteButton(projectName);
	   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Then("The application should remove the {string} of the list")
	public void the_application_should_remove_the_of_the_list(String name) {
		String projectName= p.getProperty(name);
		project.assertTheProjectIsRemovedCorrectly(projectName);
	}
}
