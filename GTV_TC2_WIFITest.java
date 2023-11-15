package GoogleTVtestScrips;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class GTV_TC2_WIFITest extends ReusableMethods{
	
	AndroidDriver<?> driver;
	public  GTV_TC2_WIFITest(AndroidDriver<?> driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this );
		
	}

	@FindBy(xpath = "//*[contains(@text,'Home')]")
	WebElement ghomebuttonElement;
	
	@FindBy(id = "com.google.android.apps.tv.launcherx:id/guide_home_google_tv_logo")
	WebElement logoElement;
	
	
	public void Ghomebutton() {
		ghomebuttonElement.click();
		
	}
	public WebElement logo() {
		
		return logoElement;
	}
	
	
	public String wifishellstatus() {

		String command = "adb shell dumpsys wifi | grep 'Wi-Fi is'";
		String wifiStatus = executeShellCommand(command);

		//System.out.println("WiFi Status: " + wifiStatus);
		return wifiStatus;

	}
}
