package GoogleTVtestScrips;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class GTV_TC3_Wifitoggle {
	AndroidDriver<?> driver;
	public GTV_TC3_Wifitoggle (AndroidDriver<?> driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//*[@text='Wi-Fi']")
	WebElement wifibuttElement;
	
	
	@FindBy(id = "android:id/switch_widget")
	WebElement wifitogbuttonElement;
	
	
	@FindBy(xpath = "//*[contains(@text,'Connected')]")
	WebElement connectedstatusElement;
	
	public void wifiicon() throws InterruptedException {
		wifibuttElement.click();
		Thread.sleep(200);
		
		
	}
	public void wifitogg() throws InterruptedException {
		for(int i=0;i<6;i++)
		{
			wifitogbuttonElement.click();
			Thread.sleep(2000);
		}	
		
	}
	
	public WebElement wifistatus() {
		return	connectedstatusElement;
		}
}
