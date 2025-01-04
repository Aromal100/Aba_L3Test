package testCases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;



public class Test_LoginPage extends BaseClass {
	
   
	@Test(groups={"Sanity","master"})
	void Login() throws IOException, InterruptedException
	{

		
		HomePage hp= new HomePage(driver);
		hp.Login();
		
		LoginPage lp= new LoginPage(driver);
		lp.email(p.getProperty("email")); //p from the properties in thws BaseClass
		lp.submit();
		Thread.sleep(2000);
		lp.pass(p.getProperty("pass"));
		lp.cont();
		
		boolean page=lp.pagehead();
		Assert.assertTrue(page);
		
//		SignOut so= new SignOut(driver);
//		so.sign();
//		so.signout();
//		so.out();
		
	}
	
	
	


}
