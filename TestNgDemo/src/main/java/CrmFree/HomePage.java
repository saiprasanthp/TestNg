package CrmFree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath="//a[text()='Sign Up']")

	WebElement signout;

	public	HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


	public SignOut click_signout() {
		signout.click();
		return new SignOut(driver);
	}


}
