package GTVTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class GTV_RemotePairing_Framework extends BaseTest {
	@Test
	public void remoteTest() throws InterruptedException {
		
		
		System.out.println("GTV Home screen");

		Thread.sleep(2000);
		
		GTV_TC1_Home gHome = new GTV_TC1_Home(driver);
		Thread.sleep(2000);
		gHome.settingbutton();
		Thread.sleep(200);

		driver.findElement(By.id("com.google.android.apps.tv.launcherx:id/dashboard_profile_setting_icon_id")).click();
		Thread.sleep(200);

		
		for(int i=0;i<8;i++)
		{
		((AndroidDriver<?>)driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(200);
		}
		
		

		try {
	WebElement rCElement=driver.findElement(By.xpath("//*[contains(@text,'Remote')]"));
	rCElement.click();
		Thread.sleep(200);

		((AndroidDriver<?>)driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		((AndroidDriver<?>)driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		
		String btaddressString1=driver.findElement(By.id("com.android.tv.settings:id/info_item_summary")).getText();
		


		driver.findElement(By.xpath("//*[@text='Forget']")).click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//*[@text='Yes']")).click();
		Thread.sleep(5000);
		
		
			
		
		String rcstatuString=driver.findElement(By.id("android:id/summary")).getText();
	    List<WebElement> rCElement1=driver.findElements(By.xpath("//*[contains(@text,'RC')]"));
	    String rCElement2=rCElement1.get(0).getText();
		
		


		Thread.sleep(200);

		if(rCElement2.contains("Xiaomi"))
				
				{
			if (rcstatuString.contains("Connected")) {
				System.out.println("RC is connnected");
			}
				}else {
					System.out.println("RC is not connnected");
					
				}
		
		((AndroidDriver<?>)driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		((AndroidDriver<?>)driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));

		String btaddressString2=driver.findElement(By.id("com.android.tv.settings:id/info_item_summary")).getText();

		if (btaddressString1.equalsIgnoreCase(btaddressString2)) {
			System.out.println("RC BT address is matching after repairing");
		}else {
			System.out.println("RC BT address is not matching after repairing");

		}
		} catch (Exception e) {
		
			System.out.println("RC is diconnected and non discoverable");
			// TODO: handle exception
		}
		
		
	}

}
