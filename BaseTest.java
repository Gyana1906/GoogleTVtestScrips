package GoogleTVtestScrips;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterClass;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	
	 public AndroidDriver driver;
	 ExtentReports extent=new ExtentReports();
	   
	@BeforeMethod
    public void BaseClass () throws IOException {
		
		Date date= new Date();
		String dtfString=date.toString();
	    String dtString=	dtfString.replace(" ", "_").replace(":", "_").trim();
		
		  

	        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+dtString+"report.html";
	        ExtentSparkReporter spark = new ExtentSparkReporter(path);
	        extent.attachReporter(spark);
	        spark.config().setTheme(Theme.STANDARD);
	        spark.config().setDocumentTitle("GTV Automation Report");
	        spark.config().setReportName("Extent Report for Regression");
	        spark.config().setReportName("GoogleTV Tests-Gyan");
	        extent.attachReporter(spark);

	    	
	    	DesiredCapabilities cap=new DesiredCapabilities();
	     cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
         cap.setCapability(MobileCapabilityType.UDID,GenericMethod.getvalue("GTVUdid"));
         cap.setCapability(MobileCapabilityType.PLATFORM_NAME,GenericMethod.getvalue("GTVPlatfomName"));
         cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, GenericMethod.getvalue("GTVPlatformVersion"));
         cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, GenericMethod.getvalue("GTVActivity"));
         cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,GenericMethod.getvalue("GTVPackage"));
        


	        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	        
	       

	     

}
		
@AfterClass
public void close() throws InterruptedException
{
	//Thread.sleep(2000);
driver.quit();
extent.flush();


}








}
