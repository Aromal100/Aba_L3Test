package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.AddStudent;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class AddStudentTest extends BaseClass{
	
	
	@Test
	public void addstudent() throws InterruptedException
	{
		Faker f=new Faker();
		String firstname=f.name().firstName();
		String middlename=f.name().firstName();
		String lastname=f.name().lastName();
		String motherName = f.name().firstName();
		String mmother=f.name().firstName();
		String lmother=f.name().lastName();
		String parentFirstName = f.name().firstName();
	    String parentMiddleName = f.name().firstName();
	    String parentLastName = f.name().lastName();
	    String mail=f.internet().emailAddress();
	    String phone ="9"+ f.phoneNumber().subscriberNumber(8);
		
		HomePage hp= new HomePage(driver);
		hp.Login();
		
		LoginPage lp= new LoginPage(driver);
		lp.email(p.getProperty("email")); 
		lp.submit();
		Thread.sleep(2000);
		lp.pass(p.getProperty("pass"));
		lp.cont();
		boolean page=lp.pagehead();
		Assert.assertTrue(page);

		AddStudent addstu= new AddStudent(driver);
		addstu.student();
		addstu.Schoolstu();
		addstu.addstudent();
		addstu.program();
		addstu.grade();
		addstu.Firstname(firstname);
		addstu.midname(middlename);
		addstu.lastname(lastname);
		addstu.profilepic();
		addstu.gender();
		addstu.dob();
		addstu.mothername(motherName);
		addstu.mmother(mmother);
		addstu.lmother(lmother);
		addstu.commencement();
		addstu.language();
		addstu.birthcertificate();
		addstu.reportcardfile();
		addstu.subcity();
		addstu.birthworeda();
		addstu.currentsubcity();
		addstu.currentworeda();
		addstu.houseno("11");
		addstu.phone(phone);
		addstu.email(mail);
		addstu.fparentname(parentFirstName);
		addstu.mparentname(parentMiddleName);
		addstu.lparentname(parentLastName);
		addstu.profilepic2();
		addstu.parentsex();
		addstu.parentmaritalstatus();
		addstu.parentphno(phone);
		addstu.parentid();
		addstu.checkBox();
		addstu.paymentmethod();
		addstu.applybutton();
		Thread.sleep(2000);
		addstu.approve();
		addstu.ok();
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
