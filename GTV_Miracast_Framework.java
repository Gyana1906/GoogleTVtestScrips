package GTVTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class GTV_Miracast_Framework extends BaseTest{
	
	
	
	@Test
	public void miracastTest() throws InterruptedException {
		
		System.out.println("GTV Home screen");

		Thread.sleep(2000);

		 ((AndroidDriver<?>)driver).startActivity
         (new Activity("com.xiaomi.mitv.smartshare",
                 "com.xiaomi.mitv.smartshare.wifidisplay.WfdActivity"));
		 Thread.sleep(2000);

	        System.out.println("Miracast App launched");
	        WebElement mira=driver.findElement(By.xpath("//*[@text='Miracast']"));
	        Assert.assertTrue(mira.isDisplayed(),"Miracast is not displayed");
	        WebElement defpriority=driver.findElement(By.xpath("//*[@text='Definition Priority']"));

	        Assert.assertTrue(defpriority.isDisplayed(),"Definition Priority is not displayed");
	        System.out.println("Definition Priority is  displayed");


	        WebElement Flupriority=driver.findElement(By.xpath("//*[@text='Fluency Priority']"));

	        Assert.assertTrue(Flupriority.isDisplayed(),"Fluency Priority is not displayed");

	       System.out.println("Fluency Priority is  displayed");

	        WebElement connection=driver.findElement(By.xpath("//*[contains(@text,'TV waiting')]"));
	        Assert.assertTrue(connection.isDisplayed(),"TV waiting for the connection is not displayed");
	        System.out.println("TV waiting for connection is  displayed");


		
	}

}
