package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClasificationPage {
	WebDriver driver;
	@FindBy(id = "home1")
	private WebElement newButton;
	
	@FindBy(id = "home1")
	private WebElement editButton;
	
	@FindBy(id = "home1")
	private WebElement removeButton;
	
	@FindBy(id = "home1")
	private WebElement removeTableButton;
	
	@FindBy(id = "name")
	private WebElement nameText;
	
	@FindBy(id = "home1")
	private WebElement saveOption;
	
	@FindBy(id = "home1")
	private WebElement cancelOption;
	
	public ClasificationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
}
