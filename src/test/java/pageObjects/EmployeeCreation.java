package pageObjects;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeeCreation extends LoginPage {

	public EmployeeCreation(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='profilepicture-custom_user_img']")
	WebElement profilepic;
	
	public void profilepic() throws InterruptedException
	{
        String pic=  "C://Users//RESBEE-218//Downloads//batman-bats-in-night-city-desktop-wallpaper-preview.jpg";
      
		
		profilepic.sendKeys(pic);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement upload=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cropBtn\"]")));
		upload.click();			
	}
	
	@FindBy(xpath="//*[@id=\"productsList\"]/div[2]/div[12]/span/a/img")
	WebElement hr;
	public void hr() throws InterruptedException
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("document.body.style.zoom='90%'");
//		Thread.sleep(2000);
		 js.executeScript("arguments[0].click();", hr);
	}
	
	@FindBy(xpath="//*[text()='Employment']")
	WebElement employ;
	public void employ()
	{
		employ.click();
	}
	
	@FindBy(xpath="//*[text()='Existing Employment']")
	WebElement Existingemp;
	public void Existingemp()
	{
		Existingemp.click();
	}

	//page1
	@FindBy(id="first_name")
	WebElement first;
	public void scroll()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",first);
	}
	
	@FindBy(id="first_name")
	WebElement firstn;
	public void firstn(String name)
	{
		firstn.sendKeys(name);
	}
	
	@FindBy(id="middle_name")
	WebElement middlen;
	public void middlen(String name)
	{
		middlen.sendKeys(name);
	}
	
	@FindBy(id="last_name")
	WebElement lastn;
	public void lastn(String name)
	{
		lastn.sendKeys(name);
	}
	
	@FindBy(id="date_of_birth")
	WebElement dob;
	
	public void dob()
	{
		String month="ጥር";
		String year="1999";
		String date="1";
		
		dob.click();
		while(true)
		{
			String activeyear=driver.findElement(By.xpath("//*[@id=\"activeyear\"]")).getText();//2017
			String activemonth=driver.findElement(By.xpath("//*[@id=\"activemonth\"]")).getText();//ህዳር
			
			if(activeyear.equals(year) && activemonth.equals(month) )
			{
				break;
			}
			
			driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
		}
		
     List<WebElement> dates=driver.findElements(By.xpath("//*[@class='col f-05 d-flex flex-row justify-content-center']/button"));
     for(WebElement d:dates)//list of dates
     {
    	 if(d.getText().equals(date))
    	 {
    		 d.click();
    		 break;
    	 }
     }
	}
	
	@FindBy(xpath="//select[@id='gender']")
	WebElement gender;
	public void gender()
	{
		Select s= new Select(gender);
		s.selectByVisibleText("Male");
	}
	
	@FindBy(xpath="//div[@id='fieldCont_7']//span[@class='label-text'][normalize-space()='No']")
	WebElement disability;
	public void disability()
	{
		disability.click();
	}
	
	@FindBy(xpath="//select[@id='blood_type']")
	WebElement bloodtype;
	public void bloodtype()
	{
		Select s= new Select(bloodtype);
		s.selectByVisibleText("A positive (A+)");
	}
	
	@FindBy(id="phone_number")
	WebElement phone;
	public void phone(String no)
	{
		phone.sendKeys(no);
	}
	
	@FindBy(id="ek_employment_type")
	WebElement emptype;
	public void emptype()
	{
		Select s= new Select(emptype);
		s.selectByVisibleText("Permanent");	
	}
	
	@FindBy(id="date_of_employment")
	WebElement doe;
	public void doe()
	{
		String month="የካቲት";
		String year="2016";
		String date="1";
		
		doe.click();
		while(true)
		{
			String activeyear=driver.findElement(By.xpath("//*[@id=\"activeyear\"]")).getText();//2017
			String activemonth=driver.findElement(By.xpath("//*[@id=\"activemonth\"]")).getText();//ህዳር
			
			if(activeyear.equals(year) && activemonth.equals(month) )
			{
				break;
			}
			
			driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
		}
		
     List<WebElement> dates=driver.findElements(By.xpath("//*[@class='col f-05 d-flex flex-row justify-content-center']/button"));
     for(WebElement d:dates)//list of dates
     {
    	 if(d.getText().equals(date))
    	 {
    		 d.click();
    		 break;
    	 }
     }
	}
	
	@FindBy(id="ek_department")
	WebElement depart;
	public void depart()
	{
		Select s= new Select(depart);
		s.selectByVisibleText("Department");	
	}
	
	@FindBy(id="ek_position")
	WebElement position;
	public void position()
	{
		Select s= new Select(position);
		s.selectByValue("1");	
	}
	
	
	
	@FindBy(id="ek_role")
	WebElement role;
	public void role()
	{
		Select s= new Select(role);
		s.selectByVisibleText("Teacher");	
	}
	
	@FindBy(id="gross_salary")
	WebElement salary;
	public void salary(String no)
	{
		salary.sendKeys(no);	
	}
	
	@FindBy(xpath="//div[@id='fieldCont_15']//span[@class='label-text'][normalize-space()='No']")
	WebElement transfer;
	public void transfer()
	{
		transfer.click();
	}
	
	@FindBy(xpath="//*[text()='Save & Next']")
	WebElement save1;
	public void save1()
	{
		save1.click();
	}
	
//page2
	@FindBy(id="subcity_1")
	WebElement subcity;
	public void subcity()
	{
		Select s= new Select(subcity);
		s.selectByVisibleText("Addis Ketema");		
	}
	
	@FindBy(id="woreda_1")
	WebElement woreda;
	public void woreda()
	{
		Select s= new Select(woreda);
		s.selectByVisibleText("Woreda 1");	
	}
	
	@FindBy(id="subcity_2")
	WebElement subcity2;
	public void subcity2()
	{
		Select s= new Select(subcity2);
		s.selectByVisibleText("Addis Ketema");
	}
	
	@FindBy(id="woreda_2")
	WebElement woreda2;
	public void woreda2()
	{
		Select s= new Select(woreda2);
		s.selectByVisibleText("Woreda 1");
	}
	
	@FindBy(id="house_number")
	WebElement hno;
	public void hno(String no)
	{
		hno.sendKeys(no);
	}
	@FindBy(id="mother_first_name_2")
	WebElement scroll2;
	public void scroll2()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",scroll2);
	}
	@FindBy(id="mother_first_name_2")
	WebElement mfirstn;
	public void mfirstn(String name)
	{
		mfirstn.sendKeys(name);
	}
	
	@FindBy(id="mother_middle_name_2")
	WebElement mmidn;
	public void mmidn(String name)
	{
		mmidn.sendKeys(name);
	}
	
	@FindBy(id="mother_last_name_2")
	WebElement mlastn;
	public void mlastn(String name)
	{
		mlastn.sendKeys(name);
	}
	
	@FindBy(id="marital_status")
	WebElement martialstat;
	public void martialstat()
	{
		Select s= new Select(martialstat);
		s.selectByVisibleText("Single");
		
	}
	
	@FindBy(xpath="//span[normalize-space()='No']")
	WebElement children;
	public void children()
	{
		children.click();
	}
	
	@FindBy(xpath="//*[text()='Save & Next']")
	WebElement save2;
	public void save2()
	{
		save2.click();
	}
	
//page3
	@FindBy(id="educational_level")
	WebElement edulvl;
	public void  edulvl()
	{
		Select s= new Select(edulvl);
		s.selectByVisibleText("Certificate");
				
	}
	
	@FindBy(id="field_of_study_2")
	WebElement fieldofstudy;
	public void fieldofstudy(String name)
	{
		fieldofstudy.sendKeys(name);
	}
	
	@FindBy(id="institutionorganization_2")
	WebElement insti;
	public void insti(String name)
	{
		insti.sendKeys(name);
	}
	
	@FindBy(id="start_date")
	WebElement startdate;
	public void startdate()
	{
		String month="ጥር";
		String year="2017";
		String date="1";
		
		startdate.click();
		while(true)
		{
			String activeyear=driver.findElement(By.xpath("//*[@id=\"activeyear\"]")).getText();//2017
			String activemonth=driver.findElement(By.xpath("//*[@id=\"activemonth\"]")).getText();//ህዳር
			
			if(activeyear.equals(year) && activemonth.equals(month) )
			{
				break;
			}
			driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
		}
		
     List<WebElement> dates=driver.findElements(By.xpath("//*[@class='col f-05 d-flex flex-row justify-content-center']/button"));
     for(WebElement d:dates)//list of dates
     {
    	 if(d.getText().equals(date))
    	 {
    		 d.click();
    		 break;
    	 }
     }
	}
	
	@FindBy(id="completion_date")
	WebElement completedate;
	public void completedate()
	{
		String month="ጥር";
		String year="2017";
		String date="10";
		
		completedate.click();
		while(true)
		{
			String activeyear=driver.findElement(By.xpath("//*[@id=\"activeyear\"]")).getText();//2017
			String activemonth=driver.findElement(By.xpath("//*[@id=\"activemonth\"]")).getText();//ህዳር
			
			if(activeyear.equals(year) && activemonth.equals(month) )
			{
				break;
			}
			driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
		}
		
     List<WebElement> dates=driver.findElements(By.xpath("//*[@class='col f-05 d-flex flex-row justify-content-center']/button"));
     for(WebElement d:dates)//list of dates
     {
    	 if(d.getText().equals(date))
    	 {
    		 d.click();
    		 break;
    	 }
     }
	}
	
	@FindBy(id="completion_certificate")
	WebElement comceti;
	public void comceti() throws InterruptedException
	{
		String pic="C://Users//RESBEE-218//Downloads//batman-bats-in-night-city-desktop-wallpaper-preview.jpg";
		comceti.sendKeys(pic);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Close']")).click();
	}
	
	@FindBy(id="pgdt_course")
	WebElement pgdt;
	public void pgdt()
	{
		Select s= new Select(pgdt);
		s.selectByVisibleText("Taken");
	}
	
	@FindBy(id="currently_doing_research")
	WebElement research;
	public void research()
	{
		Select s= new Select(research);
		s.selectByVisibleText("Researching");
	}
	
	@FindBy(id="professional_evaluation_license")
	WebElement profeva;
	public void profeva()
	{
		Select s= new Select(profeva);
		s.selectByVisibleText("Taken");
	}
	
	@FindBy(id="english_language_improvement_training")
	WebElement englan;
	public void englan()
	{
		Select s= new Select(englan);
		s.selectByVisibleText("Taken");
	}
	
	@FindBy(id="basic_computer_skill_training")
	WebElement bascom;
	public void bascom()
	{
		Select s= new Select(bascom);
		s.selectByVisibleText("Taken");
	}
	
	@FindBy(id="language_skill_training")
	WebElement lanskill;
	public void lanskill()
	{
		Select s= new Select(lanskill);
		s.selectByVisibleText("Taken");
	}
	
	@FindBy(id="science_and_technology_training")
	WebElement scitec;
	public void scitec()
	{
		Select s= new Select(scitec);
		s.selectByVisibleText("Taken");
	}
	
	@FindBy(id="pgcpss_training")
	WebElement pgcpss;
	public void pgcpss()
	{
		Select s= new Select(pgcpss);
		s.selectByVisibleText("Taken");
	}
	
	@FindBy(id="pgdsl_training")
	WebElement pgdsl;
	public void pgdsl()
	{
		Select s= new Select(pgdsl);
		s.selectByVisibleText("Taken");
	}
	
	@FindBy(id="continous_professional_development_training")
	WebElement continoustr;
	public void continoustr()
	{
		Select s= new Select(continoustr);
		s.selectByVisibleText("Participating");
	}
	
	@FindBy(id="gender_training")
	WebElement gendertra;
	public void gendertra()
	{
		Select s= new Select(gendertra);
		s.selectByVisibleText("Taken");
	}
	
	@FindBy(id="teacher_pedagogy_training_information_2")
	WebElement teachpeda;
	public void teachpeda()
	{
		Select s= new Select(teachpeda);
		s.selectByVisibleText("Taken");
	}
	
	@FindBy(xpath="//*[text()='Save & Next']")
	WebElement save3;
	public void save3()
	{
		save3.click();
	}
//page4
	@FindBy(xpath="//span[normalize-space()='No']")
	WebElement workexp;
	public void workexp()
	{
		workexp.click();
	}
	
	@FindBy(id="first_name_3")
	WebElement fname;
	public void fname(String name)
	{
		fname.sendKeys(name);
	}
	
	@FindBy(id="middle_name_5")
	WebElement mname;
	public void mname(String name)
	{
		mname.sendKeys(name);
	}
	
	@FindBy(id="last_name_5")
	WebElement lname;
	public void lname(String name)
	{
		lname.sendKeys(name);
	}
	
	@FindBy(id="gender_2")
	WebElement gender2;
	public void gender2()
	{
		Select s= new Select(gender2);
		s.selectByVisibleText("Male");
	}
	
	@FindBy(id="subcity_3")
	WebElement sub3;
	public void sub3()
	{
		Select s= new Select(sub3);
		s.selectByVisibleText("Addis Ketema");
	}
	
	@FindBy(id="woreda_3")
	WebElement woe3;
	public void woe3()
	{
		Select s= new Select(woe3);
		s.selectByVisibleText("Woreda 1");
	}
	
	@FindBy(id="mobile_2")
	WebElement phone2;
	public void phone2(String no)
	{
		phone2.sendKeys(no);
	}
	
	@FindBy(id="warranty_letter__id")
	WebElement warletter;
	public void warletter() throws InterruptedException
	{
		String pic="C://Users//RESBEE-218//Downloads//batman-bats-in-night-city-desktop-wallpaper-preview.jpg";
		warletter.sendKeys(pic);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Close']")).click();
	}
	
	@FindBy(xpath="//*[text()='Save & Next']")
	WebElement save4;
	public void save4()
	{
		save4.click();
	}
//page5
	@FindBy(id="first_name_4")
	WebElement ffname;
	public void ffname(String name)
	{
		ffname.sendKeys(name);
	}
	
	@FindBy(id="middle_name_6")
	WebElement mmname;
	public void mmname(String name)
	{
		mmname.sendKeys(name);
	}
	
	@FindBy(id="last_name_6")
	WebElement llname;
	public void llname(String name)
	{
		llname.sendKeys(name);
	}
	
	@FindBy(id="gender_3")
	WebElement gender3;
	public void gender3()
	{
		Select s= new Select(gender3);
		s.selectByVisibleText("Male");
	}
	
	@FindBy(id="relationship")
	WebElement realtionship;
	public void realtionship(String name)
	{
		realtionship.sendKeys(name);
	}
	
	@FindBy(id="subcity_4")
	WebElement sub4;
	public void sub4()
	{
		Select s= new Select(sub4);
		s.selectByVisibleText("Addis Ketema");
	}
	
	@FindBy(id="woreda_4")
	WebElement wor4;
	public void wor4()
	{
		Select s= new Select(wor4);
		s.selectByVisibleText("Woreda 1");
	}
	
	@FindBy(id="house_number_2")
	WebElement hno2;
	public void hno2()
	{
		hno2.sendKeys("12");
	}
	
	@FindBy(id="mobile_3")
	WebElement phone3;
	public void phone3(String no)
	{
		phone3.sendKeys(no);
	}
	
	@FindBy(xpath="//*[text()='Save']")
	WebElement save5;
	public void save5()
	{
		save5.click();
	}
	
	@FindBy(xpath="//*[text()='Go back to listing']")
	WebElement goback;
	public void goback()
	{
		goback.click();
	}
}


