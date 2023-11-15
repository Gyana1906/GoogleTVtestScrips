package GoogleTVtestScrips;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WIFI_toggleSwitchTest_Framework extends BaseTest{
	@Test
	public void wifitoggleTest() throws Exception {
		
		System.out.println("GTV Home UI launched");
		Thread.sleep(2000);
		GTV_TC1_Home gHome = new GTV_TC1_Home(driver);
		Thread.sleep(2000);
		gHome.settingbutton();
		Thread.sleep(200);
		
		
		
		GTV_TC3_Wifitoggle wifi1=new GTV_TC3_Wifitoggle(driver);
		wifi1.wifiicon();
		wifi1.wifitogg();

		
		Assert.assertTrue(wifi1.wifistatus().getText().contains("Connected"), "Connceted status not displayed");
		System.out.println("WIFI is connected");
		
		
	}

}
