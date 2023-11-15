package GoogleTVtestScrips;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class GTV_TC1_Home {
	AndroidDriver<?> driver;

	public GTV_TC1_Home(AndroidDriver<?> driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "com.google.android.apps.tv.launcherx:id/guide_page_tab_title")
	List<WebElement> tabsElements;

	@FindBy(id = "com.google.android.apps.tv.launcherx:id/dashboard_button_first_icon")

	WebElement settingElement1;

	@FindBy(id = "com.google.android.apps.tv.launcherx:id/status_bar_dashboard_button")
	WebElement settingElement2;

	// WebElement element =
	// driver.findElement(MobileBy.AccessibilityId("YourContentDescription"));

	@FindBy(id = "com.google.android.apps.tv.launcherx:id/ambient_tile_text")
	WebElement screensaverElement;

	@FindBy(id = "com.google.android.apps.tv.launcherx:id/dashboard_tile_text")
	List<WebElement> settingfuncElement;

	@FindBy(xpath = "//*[@text='Input source']")
	WebElement input1Element;

	@FindBy(id = "com.mitv.livetv:id/input_label")
	List<WebElement> inputsorcElements;

	@FindBy(id = "com.google.android.apps.tv.launcherx:id/guide_home_google_tv_logo\r\n")
	WebElement gtvlogoElement;

	public void home(List<String> list) {

		for (WebElement singletabElement : tabsElements) {
			// System.out.println(singletabElement.getText());
			if (list.contains(singletabElement.getText())) {
				System.out.println(singletabElement.getText() + " Tabs available");
			}

			else {
				System.out.println(singletabElement.getText() + " Tabs not available");
			}

		}
	}

	public void settingbutton() throws InterruptedException {
		// Thread.sleep(2000);

		try {
			settingElement2.click();
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
			settingElement1.click();
			Thread.sleep(200);

		}

	}

	public void SettingOps(List<String> list2) {
		int i = 1;
		for (WebElement ops : settingfuncElement) {

			// System.out.println(ops.getText());
			if (list2.contains(ops.getText())) {
				System.out.println(ops.getText() + " Ops available");

			} else {
				System.out.println(ops.getText() + " Ops not available");
			}
			if (i == 4)
				break;

			i++;
		}
	}

	public void inputbutton() throws InterruptedException {
		input1Element.click();
		Thread.sleep(200);
	}

	public void inputsource(List<String> list3) {

		for (WebElement inputElement : inputsorcElements) {
			// System.out.println(inputElement.getText());
			if (list3.contains(inputElement.getText())) {
				System.out.println(inputElement.getText() + " input source Option available");
			}

			else {
				System.out.println(inputElement.getText() + " input source Option not available");
			}

		}

	}

}
