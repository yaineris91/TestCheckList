package utils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Common {
	
	

	
	public static void searchElementOnTheTableAndClickOnTheButton(String name, String buttonId, WebDriver driver) {
		boolean stop=false;
		WebElement table = driver.findElement(By.xpath("//*[@id=\"projecttable\"]/div[2]/table/tbody"));
		 List<WebElement> allrows = table.findElements(By.tagName("tr"));
		for(WebElement row: allrows){
			List<WebElement> cells = row.findElements(By.tagName("td"));	
			        for(WebElement cell:cells){
			     	    if(cell.getText().equals(name)){
			     	    	WebElement edit =row.findElement(By.id(buttonId));
			     	     	stop=true;
			     	    	edit.click();
			     	       break;
			     	    }else{
			     	        System.out.println("The element with "+name+" is not available on this cell");
			     	    }
			         
			        }
			        if (stop==true) {
						break;
					}
	     
	   
		 }
	}
	
	
	
	public static boolean elementIsPresentOnTheTable(String name, WebDriver driver) {
		boolean stop=false;
		WebElement table = driver.findElement(By.xpath("//*[@id=\"projecttable\"]/div[2]/table/tbody"));
		 List<WebElement> allrows = table.findElements(By.tagName("tr"));
		for(WebElement row: allrows){
			 List<WebElement> cells = row.findElements(By.tagName("td"));
	        for(WebElement cell:cells){
	     	    if(cell.getText().equals(name)){
	     	    	stop=true;
		     	       break;
	     	    	
	     	    }else{
	     	        System.out.println("The element with "+name+" is not available on this table cell");
	     	    }
	         
	        }
	        if (stop== true) {
				break;
			}
	   
	   
		 }
		return stop;
	}
}
