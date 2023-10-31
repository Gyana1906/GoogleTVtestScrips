package GTVTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class GTV_Patchwall_kidsModePasswordTest extends GTV_PatchWall_BaseTest_Framework {

	@Test(dataProvider = "datainput")
	public void passwordTest(String num, String num1, String num2) throws InterruptedException {
		System.out.println("PW UI Launched");

		driver.findElement(By.id("com.mitv.tvhome.atv:id/settings")).click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//*[contains(@text,'Controls')]")).click();
		Thread.sleep(200);

		System.out.println("Kids Mode Control");

		driver.findElement(By.xpath("//*[contains(@text,'Change')]")).click();
		Thread.sleep(200);

		System.out.println("Change Password");

		driver.findElement(By.xpath("//*[contains(@text,'Enter password for Kids Mode controls')]"));

		driver.findElement(By.xpath("//*[@text='" + num + "']")).click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//*[@text='" + num + "']")).click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//*[@text='" + num + "']")).click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//*[@text='" + num + "']")).click();
		Thread.sleep(200);

		WebElement newpasswordElement = driver.findElement(By.xpath("//*[contains(@text,'Enter new password')]"));
		Assert.assertTrue(newpasswordElement.isDisplayed(), "");

		driver.findElement(By.xpath("//*[@text='" + num1 + "']")).click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//*[@text='" + num1 + "']")).click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//*[@text='" + num1 + "']")).click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//*[@text='" + num1 + "']")).click();
		Thread.sleep(200);

		WebElement newpasswordagainElement = driver
				.findElement(By.xpath("//*[contains(@text,'Enter new password again')]"));
		Assert.assertTrue(newpasswordagainElement.isDisplayed(), "");

		driver.findElement(By.xpath("//*[@text='" + num2 + "']")).click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//*[@text='" + num2 + "']")).click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//*[@text='" + num2 + "']")).click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//*[@text='" + num2 + "']")).click();
		Thread.sleep(200);



	}

	@DataProvider
	public Object[][] datainput() {

		Object[][] data = { { "1", "2", "2" }, { "2", "1", "1" } };
		return data;
	}

}
