package snapdeal.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass {
	
	WebDriver driver;
	@FindBy(xpath="//span[text()='Mobile & Tablets']")
	WebElement mobile;
	
	@FindBy(xpath="//span[text()='Plain Back Covers']")
	WebElement cover;
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void click1() {

		Actions action=new Actions(driver);
		action.moveToElement(mobile).build().perform();		
	}
	public String covers() {
		cover.click();
		return "covers website";
	}

	
	
	
	

}
