 package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends HomePage {
	
	
	public LoginPage(WebDriver driver)
	{
	   super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='email']") 
    WebElement email;
    
    @FindBy(xpath="//button[@id='SubmitBtn']") 
    WebElement submit;
    
    @FindBy(xpath="//input[@id='password']") 
    WebElement pass;
    
    @FindBy(xpath="//button[@id='continueBtn']") 
    WebElement cont;  
    
    @FindBy(xpath="//*[@id='ekBrandName']")
    WebElement pagehead;
    
    
  
    public void email(String user)
    {
   	 email.sendKeys(user);
    }
	
    public void submit() 
    {
   	 submit.click();
    }
    
    public void pass(String psw)
    {
   	pass.sendKeys(psw);
    }
    public void cont()
    {
   	 cont.click();
    }
    
    public boolean pagehead()
    {
    	try
    	{
    		return(pagehead.isDisplayed());
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    	
    }

}
