package GoogleTVtestScrips;

import java.util.List;

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
	
	@FindBy(className  = "android.widget.ImageView")
List<WebElement> logoElement;
	
	
	public void Ghomebutton() {
		ghomebuttonElement.click();
		
	}
	public WebElement logo() {
		
		return logoElement.get(16);
	}
	
	
	public String wifishellstatus() {

		String command = "adb shell dumpsys wifi | grep 'Wi-Fi is'";
		String wifiStatus = executeShellCommand(command);

		//System.out.println("WiFi Status: " + wifiStatus);
		return wifiStatus;

	}
}
