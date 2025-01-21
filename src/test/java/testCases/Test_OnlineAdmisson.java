package testCases;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.OnlineAdmission;
import testBase.BaseClass;

public class Test_OnlineAdmisson extends BaseClass {
	
	
	@Test
	public void onlineadm() throws InterruptedException 
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
	    String phone ="9"+ f.phoneNumber().subscriberNumber(8);
		
		OnlineAdmission oa= new OnlineAdmission(driver);
		oa.onlineadmission();
		oa.program();
		oa.grade();
		oa.Firstname(firstname);
		oa.midname(middlename);
		oa.lastname(lastname);
		oa.profilepic();
		oa.gender();
		oa.dob();
		oa.mothername(motherName);
		oa.mmother(mmother);
		oa.lmother(lmother);
		oa.commencement();
		oa.language();
		oa.birthcertificate();
		oa.reportcardfile();
		oa.subcity();
		oa.birthworeda();
		oa.currentsubcity();
		oa.currentworeda();
		oa.houseno("10");
		oa.phone(phone);
		oa.email("vishnupriya.resbee@gmail.com");
		oa.fparentname(parentFirstName);
		oa.mparentname(parentMiddleName);
		oa.lparentname(parentLastName);
		oa.profilepic2();
		oa.parentsex();
		oa.parentmaritalstatus();
		oa.parentphno(phone);
		oa.parentid();
		oa.checkBox();
		oa.paymentmethod();
		oa.applybutton();
		
		
		
		
	}

}
