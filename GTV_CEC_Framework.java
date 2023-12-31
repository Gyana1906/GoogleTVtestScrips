package GoogleTVtestScrips;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;



public class GTV_CEC_Framework extends BaseTest {

	@SuppressWarnings("unchecked")
	@Test 

	public void HdmiCec() throws InterruptedException {
		ExtentTest test = extent.createTest("CEC Option");

		System.out.println("GTV UI Launched");
		test.pass("Google TV UI launched");
		Thread.sleep(2000);

		GTV_TC1_Home gHome = new GTV_TC1_Home(driver);
		Thread.sleep(2000);
		gHome.settingbutton();

		driver.findElement(By.id("com.google.android.apps.tv.launcherx:id/dashboard_profile_setting_icon_id")).click();
		Thread.sleep(2000);

		List<WebElement> inputElements = driver.findElements(By.xpath("//*[@text='Channels and inputs']"));
		inputElements.get(0).click();

		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_RIGHT));

		// WebElement hdmicontrolElement= driver.findElement(By.xpath("//*[@text='HDMI
		// control']"));
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));

		WebElement hdmicontrolElement = driver.findElement(By.xpath("//*[@text='HDMI control']"));

		WebElement autopoweroffElement = driver.findElement(By.xpath("//*[contains(@text,'power off')]"));
		WebElement autopoweronElement = driver.findElement(By.xpath("//*[contains(@text,'power on')]"));
		WebElement StarttoplayElement = driver.findElement(By.xpath("//*[contains(@text,'Start to play')]"));

		List<WebElement> autopowerbuttonElements = driver.findElements(By.className("android.widget.Switch"));

		WebElement hdmicontrolElementcheckbox_element = autopowerbuttonElements.get(0);
		boolean is_checked = Boolean.parseBoolean(hdmicontrolElementcheckbox_element.getAttribute("checked"));

		if (is_checked == true) {
			System.out.println(hdmicontrolElement.getText() + " Enabled");
			test.pass("HDMI Control is Enabled ");
		} else {
			System.out.println(hdmicontrolElement.getText() + " dissabled");
		    test.fail("HDMI Control is Dissabled ");

		}

		WebElement autopowerbuttonElementscheckbox_element = autopowerbuttonElements.get(1);
		boolean is_checked1 = Boolean.parseBoolean(autopowerbuttonElementscheckbox_element.getAttribute("checked"));

		if (is_checked1 == true) {
			System.out.println(autopoweroffElement.getText() + " is enabled");
			test.pass(" Device Auto Power off Control is Enabled ");


		} else {
			System.out.println(autopoweroffElement.getText() + " is dissabled");
		  test.fail(" Device Auto Power off Control is Dissabled ");


		}

		WebElement autopoweronbuttonElementscheckbox_element = autopowerbuttonElements.get(2);
		boolean is_checked2 = Boolean.parseBoolean(autopoweronbuttonElementscheckbox_element.getAttribute("checked"));

		if (is_checked2 == true) {
			System.out.println(autopoweronElement.getText() + " is enabled");
			test.pass("TV Auto power on is Enabled");

		} else {
			System.out.println(autopoweronElement.getText() + " is dissabled");
			test.fail("TV Auto power on is Dissabled");

		}

		WebElement StarttoplayElementcheckbox_element = autopowerbuttonElements.get(3);
		boolean is_checked3 = Boolean.parseBoolean(StarttoplayElementcheckbox_element.getAttribute("checked"));

		if (is_checked3 == true) {
			System.out.println(StarttoplayElement.getText() + " is enabled");
			test.pass("Start to play when a source is connected is Enabled");

		} else {
			System.out.println(StarttoplayElement.getText() + " is dissabled");
			test.fail("Start to play when a source is connected is Dissabled");

		}

	}

}
