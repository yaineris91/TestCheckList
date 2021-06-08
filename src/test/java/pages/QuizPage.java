package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.Common;

public class QuizPage {
	WebDriver driver;
	@FindBy(id = "new")
	private WebElement newButton;

	@FindBy(id = "questionText")
	private WebElement questionText;

	@FindBy(id = "home1")
	private WebElement saveOption;

	@FindBy(id = "titleTable")
	private WebElement nameTable;

	@FindBy(xpath = "//*[@id=\"clasificationOptions\"]/span/span")
	private WebElement clasificationDropDown;

	@FindBy(xpath = "//*[@id=\"clasificationOptions\"]/i")
	private WebElement clearDropDown;

	public QuizPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void assertTheQuizPageIsOpen() {
		Assert.assertEquals(nameTable.getText(), "Listado de Preguntas");

	}

	public void assertTheQuizIsOnTheTable(String question) {
		Assert.assertEquals(
				Common.elementIsPresentOnTheTable(question, "//*[@id=\"quiztable\"]/div[2]/table/tbody", driver), true);

	}

	public void selectQuizAndClickEditButton(String question) {
		Common.searchElementOnTheTableAndClickOnTheButton(question, "editTable",
				"//*[@id=\"quiztable\"]/div[2]/table/tbody", driver);

	}

	public void selectQuizAndClickDeleteButton(String question) {
		Common.searchElementOnTheTableAndClickOnTheButton(question, "deleteTable",
				"//*[@id=\"quiztable\"]/div[2]/table/tbody", driver);

	}

	public void clickNewQuizButton() {
		newButton.click();

	}

	public void enterQuizData(String question, String clasification) {
		clasificationDropDown.click();
		List<WebElement> dropDownItems = driver.findElements(By.className("clasification-item"));
		for (WebElement item : dropDownItems) {
			if (item.getText().equals(clasification)) {
				item.click();
				break;
			}

		}

		questionText.sendKeys(question);

	}

	public void editQuizData(String question, String clasification) {
			clearDropDown.click();
			clasificationDropDown.click();
		List<WebElement> dropDownItems = driver.findElements(By.className("clasification-item"));
		for (WebElement item : dropDownItems) {
			System.out.println(item.getText());
			if (item.getText().equals(clasification)) {
				
					item.click();
				
			
				break;
			}

		}

	
		questionText.clear();
		questionText.sendKeys(question);

	}

}
