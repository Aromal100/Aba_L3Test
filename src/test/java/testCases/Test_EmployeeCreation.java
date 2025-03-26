package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.EmployeeCreation;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Test_EmployeeCreation extends BaseClass {
	
	@Test
	public void employeecreation() throws InterruptedException
	{
		
		Faker f=new Faker();
		String firstname=f.name().firstName();
		String lastname=f.name().lastName();
		String motherName = f.name().firstName();
		String mmother=f.name().firstName();
		String lmother=f.name().lastName();
		String parentFirstName = f.name().firstName();
	    String parentMiddleName = f.name().firstName();
	    String parentLastName = f.name().lastName();
		 String phone ="9"+ f.phoneNumber().subscriberNumber(8);
		
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
		Thread.sleep(2000);
		EmployeeCreation ec=new EmployeeCreation(driver);
		ec.hr();
		Thread.sleep(2000);
		ec.employ();
		Thread.sleep(2000);
		ec.Existingemp();
	//page1
		Thread.sleep(2000);
		ec.profilepic();
		ec.scroll();
		ec.firstn(firstname);
		ec.middlen(firstname);
		ec.lastn(lastname);
		ec.doe();
		ec.gender();
		ec.disability();
		ec.bloodtype();
		ec.phone(phone);
		ec.emptype();
		ec.dob();
		ec.depart();
		ec.position();
		ec.role();
		ec.salary("10000");
		ec.transfer();
		ec.dob();
		ec.save1();
	//page2
	
		ec.subcity();
		ec.woreda();
		ec.subcity2();
		ec.woreda2();
		ec.hno("122");
		Thread.sleep(2000);
		ec.scroll2();
		ec.mfirstn(motherName);
		ec.mmidn(mmother);
		ec.mlastn(lmother);
		ec.martialstat();
		ec.children();
		ec.save2();
	//page3
		Thread.sleep(2000);
		ec.edulvl();
		ec.fieldofstudy(firstname);
		ec.insti(firstname);
		ec.completedate();
		ec.startdate();
		ec.comceti();
		ec.pgdt();
		ec.research();
		ec.profeva();
		ec.englan();
		ec.bascom();
		ec.lanskill();
		ec.scitec();
		ec.pgcpss();
		ec.pgdsl();
		ec.continoustr();
		ec.gendertra();
		ec.teachpeda();
		ec.save3();
	//page4
		Thread.sleep(4000);
		ec.workexp();
		ec.fname(firstname);
		ec.mname(firstname);
		ec.lname(lastname);
		ec.gender2();
		ec.sub3();
		ec.woe3();
		ec.phone2(phone);
		ec.warletter();
		ec.save4();
	//page5
		ec.ffname(parentFirstName);
		ec.mmname(parentMiddleName);
		ec.llname(parentLastName);
		ec.gender3();
		ec.realtionship(lastname);
		ec.sub4();
		ec.wor4();
		ec.hno2();
		ec.phone3(phone);
		ec.save5();
		ec.goback();
		
		
		
		
		
		
		
	    
	}
}
