package testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SignOut;
import testBase.BaseClass;

public class LoginDDTest extends BaseClass {

	@Test(groups={"DataDriven","master"})
	public void verifyLoginDDT(String emails, String passs, String exp) throws IOException, InterruptedException
	{

		
		HomePage hp= new HomePage(driver);
		hp.Login();
		
		LoginPage lp= new LoginPage(driver);
		lp.email(emails); //p from the properties in thws BaseClass
		lp.submit();
		Thread.sleep(2000);
		lp.pass(passs);
		lp.cont();
		
		boolean page=lp.pagehead();
		assertTrue(page);
		
		SignOut so= new SignOut(driver);
		
		
		if(exp.equalsIgnoreCase("valid"))
		{
			if(page==true)
			{
				Assert.assertTrue(true);
				so.sign();
				so.signout();
				so.out();
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else
		{
			if(exp.equalsIgnoreCase("invalid"))
			{
				if(page==true)
				{
					Assert.assertTrue(false);	
				}
				else
				{
					Assert.assertTrue(true);
				}
			}				
		}
	}
}
