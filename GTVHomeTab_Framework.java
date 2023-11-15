package GoogleTVtestScrips;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class GTVHomeTab_Framework extends BaseTest {

	ExtentTest test = extent.createTest("HDMI Test");


	String[] gtvtabStrings = { "For you", "Movies", "TV Shows", "Apps", "Library" };
	List<String> list = Arrays.asList(gtvtabStrings);

	String[] settingsops = { "Input source", "Picture", "Wi-Fi", "Accessibility" };
	List<String> list2 = Arrays.asList(settingsops);

	String[] inputops = { "Google TV Home", "TV", "HDMI 1", "HDMI 2","HDMI 3","AV" };
	List<String> list3 = Arrays.asList(inputops);

	@Test(dataProvider = "data")
	public void GTVHome(String hdmi1String, int i) throws InterruptedException {
		
		Thread.sleep(4000);


		System.out.println("GTV UI Launched");
		test.pass("Google TV UI launched");
		Thread.sleep(2000);


		GTV_TC1_Home gHome = new GTV_TC1_Home(driver);
		Thread.sleep(2000);
		gHome.home(list);


		System.out.println(hdmi1String);
		 gHome.settingbutton();
		

		gHome.SettingOps(list2);
		gHome.inputbutton();

		test.pass("All tabs are available");

		System.out.println(hdmi1String);
		 gHome.settingbutton();
		 test.pass("Settings button repsponded");
		

		gHome.SettingOps(list2);
		 test.pass("Settings Options are available");
		gHome.inputbutton();
		 test.pass("input buttons Clickable");

		gHome.inputsource(list3);

		// String hdmi1String="HDMI1";
		String hdmi1xpathString = "//*[@text='" + hdmi1String + "']";

		// WebElement hdmi1eElement =
		// driver.findElement(By.xpath("//*[@text='HDMI 1']"));'

		WebElement hdmi1eElement = driver.findElement(By.xpath(hdmi1xpathString));

		@SuppressWarnings("unchecked")
		List<WebElement> connectedstatusElement = driver
				.findElements(By.id("com.mitv.livetv:id/input_item_connect_state_msg"));

		if (connectedstatusElement.get(i).getText().equalsIgnoreCase("Connected"))

		{
			System.out.println(hdmi1String + " device status is connected");
                        test.pass((hdmi1String +"device status is connected");

		}  else {
			System.out.println(hdmi1String + " device  status is not connected");
			test.fail(hdmi1String +"device  status is not connected");
		}


		hdmi1eElement.click();

		Thread.sleep(2000);

		try {

			@SuppressWarnings("unchecked")
			List<WebElement> bool = driver.findElements(By.className("android.widget.TextView"));
			List<String> stringList = new ArrayList<>();

			for (WebElement webElement1 : bool) {
				String elementText = webElement1.getText();
				stringList.add(elementText);
			}

			if (stringList.contains("No signal")) {

				System.out.println(hdmi1String + "  No signal on Source UI");

//				
			} else {
				System.out.println(hdmi1String + " UI appeared ");

				test.fail("device  status is not connected");
				
//				
			
			}
		} catch (Exception e) {
			// TODO: handle exception

			 e.printStackTrace();

			System.out.println("Exception occurred:  " + e.getMessage());
		}
		
		//Thread.sleep(2000);
		//((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.HOME));

		GTV_Bluetooth_Test bletestgtv = new GTV_Bluetooth_Test(driver);
		bletestgtv.bleTest();
		test.pass("BLuetooth  status is enabled");


	}
		
	
		




	
	
	@DataProvider
	public Object[][] data() {

		Object dataObjects[][] = { { "HDMI1", 0 }, { "HDMI2", 1 }};//{"HDMI 2",1 }};

		return dataObjects;

	}
}