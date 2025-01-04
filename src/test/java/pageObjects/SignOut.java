package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOut extends LoginPage{

	public SignOut(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@class='d-flex-with-gap user-widget']")
	WebElement  sign;
	
	@FindBy(xpath="//*[text()='Sign out']")
	WebElement signout;
	
	public void sign()
	{
		sign.click();
	}
	public void signout()
	{
		signout.click();
	}
	public void out()
	{
		driver.switchTo().alert().accept();
	}

}
