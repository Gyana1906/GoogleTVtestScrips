package GoogleTVtestScrips;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class GTV_Address_Framework extends BaseTest{
	
	@Test
	public void adressTest() throws InterruptedException {
		
		System.out.println("GTV Home UI launched");
		Thread.sleep(2000);
		GTV_TC1_Home gHome = new GTV_TC1_Home(driver);
		Thread.sleep(2000);
		gHome.settingbutton();
		Thread.sleep(2000);
		driver.findElement(By.id("com.google.android.apps.tv.launcherx:id/dashboard_profile_setting_icon_id")).click();
		Thread.sleep(2000);

		
        
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));

		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='System']")).click();

		
		Thread.sleep(2000);
        
     	//GenericMethod.scrollUI(driver, "System");
		
		Assert.assertEquals((driver.findElement(By.xpath("//*[@text='Privacy']"))).getText(), "Privacy");

     	
	}}

		
		
	


