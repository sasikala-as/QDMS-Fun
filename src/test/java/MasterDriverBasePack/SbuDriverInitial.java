package MasterDriverBasePack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SbuDriverInitial {
	
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentTest testCase;

	 
		public static WebDriver driver;
		
		  public static String URL = "http://qa-automation-release.s3-website-us-east-1.amazonaws.com/#/login";
			
		 
		 @BeforeSuite
		    public  void main() throws IOException {     
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    driver.manage().window().maximize();	        
		    driver.get(URL);
		    ExtentReport();
		    }
		 
		 @AfterSuite
		      public void closeChrome(){
		     //  driver.close();
		          extent.flush();
		    }
		      
		      public static void ExtentReport() throws IOException {
		    	  extent = new ExtentReports();
		          htmlreporter = new ExtentHtmlReporter("C:\\Users\\hp\\Documents\\QDMS_ECLIPSE\\SBUProject\\Reports\\extentreport.html");
		            
		            extent.attachReporter(htmlreporter);
		        }
		    
			
		

}
