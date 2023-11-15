package GoogleTVtestScrips;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class GTV_Picture_Framework extends BaseTest {

	@Test
	public void picture() throws InterruptedException {
		System.out.println("GTV UI Launched");
		Thread.sleep(2000);

		GTV_TC1_Home gHome = new GTV_TC1_Home(driver);
		Thread.sleep(2000);
		gHome.settingbutton();

		driver.findElement(By.id("com.google.android.apps.tv.launcherx:id/dashboard_profile_setting_icon_id")).click();

		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));

//		driver.findElement(By.xpath("//*[@text='Picture']")).click();
//
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Picture']")).click();
		Thread.sleep(2000);

		WebElement Picturemode = driver.findElement(By.xpath("//*[@text='Picture mode']"));
		WebElement backlight = driver.findElement(By.xpath("//*[@text='Backlight']"));

		WebElement picturemodesetElement = (WebElement) driver.findElements(By.className("android.widget.TextView")).get(2);

		// android.widget.TextView

		WebElement baclightsetElement = (WebElement) driver.findElements(By.className("android.widget.TextView"))
				.get(4);
		if (picturemodesetElement.getText().equals("Standard") && baclightsetElement.getText().equals("100")) {
			System.out
					.println(Picturemode.getText() + " is matching  with default as  " + picturemodesetElement.getText()
							+ "  & " + backlight.getText() + " value " + baclightsetElement.getText());
		}

		else {
			System.out.println(Picturemode.getText() + " is not matching  with default " + "Picture Mode found as "
					+ picturemodesetElement.getText() + "  & " + backlight.getText() + " value "
					+ baclightsetElement.getText());
		}

		for (int i = 0; i < 4; i++)

		{

			Picturemode.click();
			Thread.sleep(200);
			@SuppressWarnings("unchecked")
			List<WebElement> picturemode4 = driver.findElements(By.id("com.android.tv.settings:id/button"));

			picturemode4.get(i).click();

			Thread.sleep(2000);

			@SuppressWarnings("unchecked")
			List<WebElement> pmElements = driver.findElements(By.id("android:id/summary"));

			if (pmElements.get(0).getText().equals("Standard") && pmElements.get(1).getText().equals("100")) {
				System.out.println(Picturemode.getText() + " is matching  as  " + pmElements.get(0).getText() + "  in "
						+ backlight.getText() + " value " + pmElements.get(1).getText());

			}

			else if (pmElements.get(0).getText().equals("Vivid") && pmElements.get(1).getText().equals("100")) {
				System.out.println(Picturemode.getText() + " is matching  as  " + pmElements.get(0).getText() + "  in "
						+ backlight.getText() + " value " + pmElements.get(1).getText());

			}

			else if (pmElements.get(0).getText().equals("Movie") && pmElements.get(1).getText().equals("80")) {
				System.out.println(Picturemode.getText() + " is matching  as  " + pmElements.get(0).getText() + "  in "
						+ backlight.getText() + " value " + pmElements.get(1).getText());

			}

			else if (pmElements.get(0).getText().equals("Sport") && pmElements.get(1).getText().equals("100")) {
				System.out.println(Picturemode.getText() + " is matching  as  " + pmElements.get(0).getText() + "  in "
						+ backlight.getText() + " value " + pmElements.get(1).getText());

			}

			else {

				System.out.println(Picturemode.getText() + " is not matching  as  " + pmElements.get(0).getText()
						+ "  & " + backlight.getText() + " value " + pmElements.get(1).getText());
			}

		}

	}
}
//	}
