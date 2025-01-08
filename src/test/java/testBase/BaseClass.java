package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	    public static WebDriver driver;
	    public Properties p;
		
		@BeforeClass(groups={"Sanity","DataDriven","master"})
		@Parameters({"os","browser"})//need to specify the name in parameter
		public void setup(String os, String br) throws IOException
		{
			FileReader fr= new FileReader("./src//test//resources//config.properties");// (./ this is current project directory) and if it is not system.getproperty then we can use 
			p=new Properties();
			p.load(fr);
			
			switch(br)
			{
			case "chrome":driver=new ChromeDriver(); break;
			case "edge" :driver=new EdgeDriver(); break;
			case "firefox":driver= new FirefoxDriver(); break;
			default: System.out.println("Invalid browser"); return;
			}
			
			
			driver.get(p.getProperty("url"));// reading file from the properties
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
		
		@AfterClass(groups={"Sanity","DataDriven","master"})
		public void teardown() throws InterruptedException
		{
			//driver.quit();
		}
		
		public String capturescreenshot(String sname)
		{
			SimpleDateFormat df= new SimpleDateFormat("dd.MM.yyyy");
			 Date d= new Date();
			 String currentdate=df.format(d);
			 
			 TakesScreenshot sc=(TakesScreenshot)driver;
			 File sourcefile= sc.getScreenshotAs(OutputType.FILE);
			 
			String targetfile=System.getProperty("user.dir")+"\\screenshots\\"+sname+"_"+currentdate+".png";
			File target=new File(targetfile);
			sourcefile.renameTo(target);
			return targetfile;
			
					 
		}

}
