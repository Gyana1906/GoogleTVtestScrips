package GoogleTVtestScrips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;

public class MiHome_App_Framework extends BaseTest {
	
	@Test 
	public void MihomeAppTest() throws InterruptedException {
		
		
		
		System.out.println("Android UI");
		Thread.sleep(2000);
		GenericMethod.scrollUI(driver,"Your apps");
		
		
		driver.findElement(By.xpath("//*[@content-desc='PatchWall']")).click();
		
		Thread.sleep(2000);
	    WebElement moreappsElement=(WebElement) driver.findElements(By.id("com.mitv.tvhome.atv:id/di_img")).get(6);
		
//		moreappsElement.click();
//		Thread.sleep(2000);
		moreappsElement.click();
		moreappsElement.click();
		Thread.sleep(2000);
		
	
	
	    WebElement mihomeappElement=(WebElement) driver.findElements(By.id("com.mitv.tvhome.atv:id/di_img")).get(8);
		mihomeappElement.click();
		mihomeappElement.click();
		
	    WebElement mihomesElement=driver.findElement(By.xpath("//*[contains(@text,'Mi account')]"));

	    System.out.println(mihomesElement.getText());
		System.out.println("Mi Home App");
		
		//*[contains(@text,'not available')]
		
		
	if (mihomesElement.isDisplayed()) {
		{
			System.out.println("MiHome app  available");
		}
	}  else {
		System.out.println("MiHome app is not available");

		
	}
		
		
		
		
	}

}
