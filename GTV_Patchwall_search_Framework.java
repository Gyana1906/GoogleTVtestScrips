package GTVTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class GTV_Patchwall_search_Framework extends GTV_PatchWall_BaseTest_Framework {

	@Test
	public void patchwallsearch() throws Exception {
		System.out.println("PW UI Launched in GTV ");
		Thread.sleep(2000);

		WebElement searchElement = driver.findElement(By.id("com.mitv.tvhome.atv:id/user_search"));
		searchElement.click();

		WebElement M = driver.findElement(By.xpath("//*[@text='M']"));
		M.click();
		M.click();
		Thread.sleep(200);
		WebElement N = driver.findElement(By.xpath("//*[@text='I']"));
		N.click();
		N.click();
		Thread.sleep(200);

		WebElement T = driver.findElement(By.xpath("//*[@text='T']"));
		T.click();
		T.click();
		Thread.sleep(200);

		WebElement V = driver.findElement(By.xpath("//*[@text='V']"));
		V.click();
		V.click();
		Thread.sleep(200);
		WebElement Mitv2 = driver.findElement(By.xpath("//*[@text='2']"));
		Mitv2.click();
		Mitv2.click();
		Thread.sleep(200);
		WebElement Mitv20 = driver.findElement(By.xpath("//*[@text='0']"));
		Mitv20.click();
		Mitv20.click();
		Thread.sleep(200);

		Mitv2.click();
		Mitv2.click();
		Thread.sleep(200);

		Mitv20.click();

//Mitv2020.click();
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN_RIGHT));
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN_RIGHT));

		WebElement ntptextElement = driver.findElement(By.id("com.mitv.tvhome.atv:id/di_text"));

		Assert.assertTrue(ntptextElement.isDisplayed());
		((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_CENTER));

		System.out.println("NTP Changer found");

	}

}
