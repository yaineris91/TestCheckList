package stepsDefinitions;

import java.util.Properties;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.QuizPage;
import utils.PropertyHelper;
import utils.TestBase;

public class QuizTest extends TestBase{
	Properties p= PropertyHelper.loadData();
	QuizPage quiz= new QuizPage(driver);
	HomePage home= new HomePage(driver);

@When("click on the quiz option")
public void click_on_the_quiz_option() {
  home.clickQuizOption();
}

@Then("The application should be open on the Quiz page")
public void the_application_should_be_open_on_the_Quiz_page() {
    quiz.assertTheQuizPageIsOpen();
}

@When("enter the {string} and {string}")
public void enter_the_and(String question, String clasification) {
	String question1= p.getProperty(question);
	String clasification1= p.getProperty(clasification);
	quiz.enterQuizData(question1, clasification1);
   
}

@When("edit the  data whit {string} and {string}")
public void edit_the_data_whit_and(String question, String clasification) throws InterruptedException {
	String question1= p.getProperty(question);
	String clasification1= p.getProperty(clasification);
	 Thread.sleep(1000);
	 quiz.editQuizData(question1, clasification1);
}

@Then("The application should show the question {string} on the list")
public void the_application_should_show_the_question_on_the_list(String question) throws InterruptedException {
	String question1= p.getProperty(question);
	 Thread.sleep(1000);
	quiz.assertTheQuizIsOnTheTable(question1);
}



@When("click on the new quiz button")
public void click_on_the_new_quiz_button() {
	 quiz.clickNewQuizButton();
}

@When("click on the edit option for the {string}")
public void click_on_the_edit_option_for_the(String question) throws InterruptedException {
	String question1= p.getProperty(question);
	 Thread.sleep(5000);
	 quiz.selectQuizAndClickEditButton(question1);
}


@When("click on the delete option for the {string}")
public void click_on_the_delete_option_for_the(String question) throws InterruptedException {
	String question1= p.getProperty(question);
	Thread.sleep(3000);
   quiz.selectQuizAndClickDeleteButton(question1);
}

@Then("The application should remove the question {string} of the list")
public void the_application_should_remove_the_question_of_the_list(String question) {
	String question1= p.getProperty(question);
	quiz.assertTheQuizIsRemovedCorrectly(question1);
}



}
