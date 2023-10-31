package GTVTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GTVHome_Switch_Input_Framework extends BaseTest{
	
	@Test
	public void GTVHomeSwitchTest() throws InterruptedException {
		
		//System.out.println("GTV Home screen");
		
		Thread.sleep(2000);
		System.out.println("GTV Home screen");
		GTV_TC1_Home gHome = new GTV_TC1_Home(driver);
		gHome.settingbutton();
		Thread.sleep(200);
		gHome.inputbutton();
		Thread.sleep(200);
		
		GTV_TC2_WIFITest testhome=new GTV_TC2_WIFITest(driver);
		testhome.Ghomebutton();
		
		Assert.assertTrue(testhome.logo().isDisplayed(), "google home logo not displayed");
		
		System.out.println("WiFi Status: " + testhome.wifishellstatus());
		
	}

}
