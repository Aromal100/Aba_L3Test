package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnlineAdmission extends BasePage {
	
	public OnlineAdmission(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[text()='Online Admission']")
	WebElement onlineadmission;
	
	public void onlineadmission()
	{
		onlineadmission.click();
	}
	
	@FindBy(id="shiftID")
	WebElement program;
	
	public void program()
	{
		Select s= new Select(program);
		s.selectByValue("1");
	}
	
	@FindBy(id="classesID")
	WebElement grade;
	
	public void grade()
	{
		Select s= new Select(grade);
		s.selectByValue("GRADE10");
	}
	
	@FindBy(id="fname")
	WebElement Firstname;
	
	public void Firstname(String name)
	{
		Firstname.sendKeys(name);
	}
	
	@FindBy(id="mname")
	WebElement midname;
	
	public void midname(String name)
	{
		midname.sendKeys(name);
	}
	
	@FindBy(id="lname")
	WebElement lastname;
	
	public void lastname(String name)
	{
		lastname.sendKeys(name);
	}

	
	@FindBy(xpath="//input[@id='newProfilePhoto']")
	WebElement profilepic;
	
	public void profilepic() throws InterruptedException
	{
        String pic="C://Users//RESBEE-218//Downloads//argentino-barcelona-celebracion-futbolista-wallpaper-preview.jpg";
		
		profilepic.sendKeys(pic);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement upload=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cropBtn\"]")));
		upload.click();			
	}
	
	@FindBy(id="sex")
	WebElement gender;
	
	public void gender()
	{
		Select s= new Select(gender);
		s.selectByValue("Male");
	}

	@FindBy(id="dob")
	WebElement dob;
	
	public void dob()
	{
		String month="ጥር";
		String year="2010";
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
	
	@FindBy(id="fmothername")
	WebElement mothername;
	
	public void mothername(String name)
	{
		mothername.sendKeys(name);
	}
	
	@FindBy(id="mmothername")
	WebElement mmother;
	
	public void mmother(String name)
	{
		mmother.sendKeys(name);
	}
	@FindBy(id="lmothername")
	WebElement lmother;
	
	public void lmother(String name)
	{
		lmother.sendKeys(name);
	}
	
	
	@FindBy(id="commencement")
	WebElement commencement;
	
	public void commencement()
	{
		Select s= new Select(commencement);
		s.selectByValue("2013");
				
	}
	
	@FindBy(id="language")
	WebElement language;
	
	public void language()
	{
		Select s=new Select(language);
		s.selectByValue("1");
	}
	
	@FindBy(id="birthcertificate")
	WebElement birthcertificate;
	
	public void birthcertificate()
	{
        String pic="C://Users//RESBEE-218//Downloads//argentino-barcelona-celebracion-futbolista-wallpaper-preview.jpg";

		birthcertificate.sendKeys(pic);
	}
	
	@FindBy(id="reportcardfile")
	WebElement reportcardfile;
	
	public void reportcardfile()
	{
		String pic="C://Users//RESBEE-218//Downloads//argentino-barcelona-celebracion-futbolista-wallpaper-preview.jpg";

		reportcardfile.sendKeys(pic);
	}
	
	@FindBy(id="birthsubcity")
	WebElement subcity;
	
	public void subcity()
	{
		Select s= new Select(subcity);
		s.selectByValue("84");
	}
	
	@FindBy(id="birthworeda")
	WebElement birthworeda;
	
	public void birthworeda()
	{
		Select s= new Select(birthworeda);
		s.selectByValue("786");
	}
	
	@FindBy(id="currentsubcity")
	WebElement currentsubcity;
	
	public void currentsubcity()
	{
		Select s= new Select(currentsubcity);
		s.selectByValue("84");
	}
	
	@FindBy(id="currentworeda")
	WebElement currentworeda;
	
	public void currentworeda()
	{
		Select s= new Select(currentworeda);
		s.selectByValue("785");
	}
	
	@FindBy(id="houseno")
	WebElement houseno;
	
	public void houseno(String no)
	{
		houseno.sendKeys(no);
	}
	
	@FindBy(id="phone")
	WebElement phone;
	
	public void phone(String no)
	{
		phone.sendKeys(no);
	}
	
	@FindBy(id="email")
	WebElement email;
	public void email(String name)
	{
		email.sendKeys(name);
	}
	
	@FindBy(id="fparentname")
	WebElement fparentname;
	
	public void fparentname(String name)
	{
		fparentname.sendKeys(name);
	}
	
	@FindBy(id="mparentname")
	WebElement mparentname;
	
	public void mparentname(String name)
	{
		mparentname.sendKeys(name);
	}
	
	@FindBy(id="lparentname")
	WebElement lparentname;
	
	public void lparentname(String name)
	{
		lparentname.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@id='newProfilePhoto2']")
	WebElement profilepic2;
	
	public void profilepic2() throws InterruptedException
	{
        String pic="C://Users//RESBEE-218//Downloads//argentino-barcelona-celebracion-futbolista-wallpaper-preview.jpg";
		
		profilepic2.sendKeys(pic);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement upload=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cropBtn\"]")));
		upload.click();			
	}
	
	@FindBy(id="parentsex")
	WebElement parentsex;
	
	public void parentsex()
	{
		Select s= new Select(parentsex);
		s.selectByValue("Male");
	}
	
	@FindBy(id="parentmaritalstatus")
	WebElement parentmaritalstatus;
	
	public void parentmaritalstatus()
	{
		Select s= new Select(parentmaritalstatus);
		s.selectByValue("Married");
	}
	
	@FindBy(id="parentphno")
	WebElement parentphno;
	
	public void parentphno(String no)
	{
		parentphno.sendKeys(no);
	}
	
	@FindBy(id="parentid")
	WebElement parentid;
	
	public void parentid()
	{
        String pic="C://Users//RESBEE-218//Downloads//argentino-barcelona-celebracion-futbolista-wallpaper-preview.jpg";
        
        parentid.sendKeys(pic);
	}
	
	@FindBy(xpath="//*[@id='checkBox']")
	WebElement checkBox;
	
	public void checkBox()
	{
		checkBox.click();
	}
	
	@FindBy(id="paymentmethod")
	WebElement paymentmethod;
	
	public void paymentmethod()
	{
		Select s= new Select(paymentmethod);
		s.selectByValue("online");
	}
	
	@FindBy(xpath="//*[text()='Apply']")
	WebElement applybutton;
	
	public void applybutton()
	{
		applybutton.click();
	}
	
	
}
