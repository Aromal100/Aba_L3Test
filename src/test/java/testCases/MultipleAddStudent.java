package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.AddStudent;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class MultipleAddStudent extends BaseClass{
	
	
	@DataProvider(name = "studentData")
	public Object[][] getStudentData() {
	    Faker f = new Faker();
	    Object[][] data = new Object[3][12];

	    for (int i = 0; i < 3; i++) {
	        data[i][0] = f.name().firstName(); // firstname
	        data[i][1] = f.name().firstName(); // middlename
	        data[i][2] = f.name().lastName();  // lastname	
	        data[i][3] = f.name().firstName(); // motherName
	        data[i][4] = f.name().firstName(); // mmother
	        data[i][5] = f.name().lastName();  // lmother
	        data[i][6] = f.name().firstName(); // parentFirstName
	        data[i][7] = f.name().firstName(); // parentMiddleName
	        data[i][8] = f.name().lastName();  // parentLastName
	        data[i][9] = f.internet().emailAddress(); // email
	        data[i][10] = "9" + f.phoneNumber().subscriberNumber(8); // phone
	        data[i][11] = String.valueOf(f.number().numberBetween(1, 100)); // house number
	    }

	    return data;
	}
	
	@BeforeClass
	public void loginToAdmin() throws InterruptedException {
	    HomePage hp = new HomePage(driver);
	    hp.Login();

	    LoginPage lp = new LoginPage(driver);
	    lp.email(p.getProperty("email")); 
	    lp.submit();
	    Thread.sleep(2000);
	    lp.pass(p.getProperty("pass"));
	    lp.cont();
	    boolean page = lp.pagehead();
	    Assert.assertTrue(page);
	}
	
	
	
	@Test(dataProvider = "studentData")
	public void addstudent(String firstname, String middlename, String lastname,
	        String motherName, String mmother, String lmother,
	        String parentFirstName, String parentMiddleName, String parentLastName,
	        String email, String phone, String houseNo) throws InterruptedException
	{
//		Faker f=new Faker();
//		String firstname=f.name().firstName();
//		String middlename=f.name().firstName();
//		String lastname=f.name().lastName();
//		String motherName = f.name().firstName();
//		String mmother=f.name().firstName();
//		String lmother=f.name().lastName();
//		String parentFirstName = f.name().firstName();
//	    String parentMiddleName = f.name().firstName();
//	    String parentLastName = f.name().lastName();
//	    String mail=f.internet().emailAddress();
//	    String phone ="9"+ f.phoneNumber().subscriberNumber(8);
		
//		HomePage hp= new HomePage(driver);
//		hp.Login();
//		
//		LoginPage lp= new LoginPage(driver);
//		lp.email(p.getProperty("email")); 
//		lp.submit();
//		Thread.sleep(2000);
//		lp.pass(p.getProperty("pass"));
//		lp.cont();
//		boolean page=lp.pagehead();
//		Assert.assertTrue(page);

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
		addstu.houseno(houseNo);
		addstu.phone(phone);
		addstu.email(email);
		addstu.fparentname(parentFirstName);
		addstu.mparentname(parentMiddleName);
		addstu.lparentname(parentLastName);
		addstu.profilepic2();
		addstu.parentsex();
		addstu.parentmaritalstatus();
		addstu.parentphno(phone);
		addstu.parentid();
		addstu.checkBox();
		//addstu.paymentmethod();
		addstu.applybutton();
		Thread.sleep(2000);
		addstu.approve();
		addstu.ok();

		
				
		
	}
	
	


}
