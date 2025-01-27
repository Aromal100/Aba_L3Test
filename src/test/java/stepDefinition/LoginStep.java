package stepDefinition;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class LoginStep extends BaseClass {
	
	 public WebDriver driver;
	 
	@Given("User is on login page")
	public void user_is_on_login_page() throws IOException {
		FileReader fr= new FileReader("./src//test//resources//config.properties");// (./ this is current project directory) and if it is not system.getproperty then we can use 
		p=new Properties();
		p.load(fr);
		
		 driver = new ChromeDriver(); 
		 driver.get(p.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage hp= new HomePage(driver);
		hp.Login(); 
       
	}

	@When("User enters vaild username {string}")
	public void user_enters_vaild_username(String username) {
		LoginPage lp= new LoginPage(driver);
		lp.email(username);
		lp.submit();

	}

	@When("User enters vaild password {string}")
	public void user_enters_vaild_password(String password) throws InterruptedException {
		LoginPage lp= new LoginPage(driver);
		Thread.sleep(2000);
		lp.pass(password);
		
	}

	@When("clicks on the Login button")
	public void clicks_on_the_login_button() {
		LoginPage lp= new LoginPage(driver);
		lp.cont();
	}

	@Then("user enters the home page")	
	public void user_enters_the_home_page() {
		LoginPage lp= new LoginPage(driver);
	    
		boolean page=lp.pagehead();
		Assert.assertTrue(page);
	}

	@Then("close the browser")
	public void close_the_browser() {
	   
		//driver.quit();

	}

}
