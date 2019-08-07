package CrmFree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {
	public WebDriver driver;
	@FindBy(xpath="//input[@name='email']")
	WebElement username;

	public SignOut(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void use() {

		username.sendKeys("sai@123");
	}






}
