package GTVTestCases;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class GTV_PatchWall_BaseTest_Framework {
	AndroidDriver<?> driver;
	String[] tabnameStrings = { "Home", "Movies", "Shows", "Music", "Live", "Kids" };
	List<String> listtab = Arrays.asList(tabnameStrings);

	@BeforeMethod
	public void patchwallTest() throws InterruptedException, IOException, TimeoutException {
		// Thread.sleep(2000);

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		cap.setCapability(MobileCapabilityType.UDID, GenericMethod.getvalue("PWTVUdid"));
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, GenericMethod.getvalue("PWTVPlatfomName"));
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, GenericMethod.getvalue("PWTVPlatformVersion"));
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, GenericMethod.getvalue("PWTVActivity"));
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, GenericMethod.getvalue("PWTVPackage"));

		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

	}	
	
	
	
	@AfterTest
	public void testpwclose() throws InterruptedException
	{
		Thread.sleep(2000);
	driver.quit();
	}

		
}
	

	




