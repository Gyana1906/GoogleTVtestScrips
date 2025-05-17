package GoogleTVtestScrips;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class GTV_Patchwall_KIdsmode_Framework  extends GTV_PatchWall_BaseTest_Framework{

	@SuppressWarnings("unchecked")
	@Test
	public void Kidsmode() throws InterruptedException {
		
		System.out.println("PW UI Launched");
		Thread.sleep(2000);
		
	     WebElement usermodElement=   driver.findElement(By.id("com.mitv.tvhome.atv:id/user_mode"));
	     
	     usermodElement.click();

	        Thread.sleep(5000);

	

	       WebElement modeelElement= driver.findElement(By.id("com.mitv.tvhome.atv:id/mode_kids"));
	   
     	   //driver.findElement(By.xpath("//*[contains(text(), \"You're in\")]"));

	   
		
		    modeelElement.click();
	        
	        WebElement textkidsElement=driver.findElement(By.xpath("//*[contains(@text,'KIDS')]"));

	        Assert.assertTrue(textkidsElement.isDisplayed(), "Switching to kIDS MOde Text not visible");
	        
	        System.out.println("Switching to Kids Mode in PW");
	        Thread.sleep(5000);
		
	        WebElement kidslogoElement=driver.findElement(By.id("com.mitv.tvhome.atv:id/brand"));
		    Assert.assertTrue(kidslogoElement.isDisplayed(), "kids logo not found");
		   
          
		    Thread.sleep(2000);
		    WebElement searchElement=driver.findElement(By.id("com.mitv.tvhome.atv:id/user_search"));
			searchElement.click();

	        WebElement d = driver.findElement(By.xpath("//*[@text='K']"));
	        d.click();
	        d.click();
	        Thread.sleep(200);
	        WebElement r = driver.findElement(By.xpath("//*[@text='I']"));
	        r.click();
	        r.click();
	        Thread.sleep(200);
	        WebElement i1 = driver.findElement(By.xpath("//*[@text='D']"));
	        i1.click();
	        i1.click();
	        Thread.sleep(200);

//	        WebElement space = (WebElement) driver.findElements(By.id("com.mitv.tvhome.atv:id/key_item_icon")).get(0);
//	        space.click();
//	        space.click();
//	        Thread.sleep(200);
	        
	        WebElement S = driver.findElement(By.xpath("//*[@text='S']"));
	        S.click();
	        S.click();
	        Thread.sleep(200);

//	        WebElement H = driver.findElement(By.xpath("//*[@text='H']"));
//	        H.click();
//	        H.click();
//	        Thread.sleep(200);
//
//	        WebElement y = driver.findElement(By.xpath("//*[@text='O']"));
//	        y.click();
//	        y.click();
//	        Thread.sleep(200);
//
//	        WebElement A = driver.findElement(By.xpath("//*[@text='N']"));
//	        A.click();
//	        A.click();
//	        Thread.sleep(2000);
//	        
//	        WebElement I = driver.findElement(By.xpath("//*[@text='I']"));
//	        I.click();
//	        I.click();
//	        Thread.sleep(2000);
//	        
//	        WebElement I1 = driver.findElement(By.xpath("//*[@text='C']"));
//	        I1.click();
//	        I1.click();
//	        Thread.sleep(2000);
//	        WebElement S1 = driver.findElement(By.xpath("//*[@text='S']"));
//	        S1.click();
//	        S1.click();
//	        Thread.sleep(2000);
//
//
//	       
	        List <WebElement> tilldisp = (List<WebElement>) driver.findElements(By.id("com.mitv.tvhome.atv:id/tv_suggest"));
	        //String namecontentString="ABC Song and Many More";

	        String namecontentString=driver.findElement(By.xpath("//*[contains(@text,'KIDS')]")).getText();
	        
	        
	        boolean found = tilldisp.stream().anyMatch(element -> element.getText().contains(namecontentString));

	        if (found) {
				
			
	              System.out.println("Content KIDS Found in PW Kids Mode");
	            
	          } else
	              System.out.println("Content KIDS not Found in PW kids mode");


//	          for (int i = 0; i < 4; i++) {
//
//	              ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_RIGHT));
//	          }
//
//
//	          List<WebElement> kidscontentElements = driver.findElements(By.id("com.mitv.tvhome.atv:id/di_text"));
//	          kidscontentElements.get(0).click();
//	        		  
//	          ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_CENTER));
//	       
//
//	          Thread.sleep(3000);
//
//	          ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_RIGHT));
//	          ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_CENTER));
// 
	          
//           ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
//           ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.BACK));


	          
	        ((AndroidDriver<?>) driver).startActivity(new Activity("com.mitv.tvhome.atv", "com.mitv.tvhome.atv.app.PatchWallActivity"));

	          Thread.sleep(4000);
	
	          driver.findElement(By.id("com.mitv.tvhome.atv:id/user_mode")).click();

	          Thread.sleep(2000);

		driver.findElement(By.id("com.mitv.tvhome.atv:id/mode_home")).click();


        driver.findElement(By.xpath("//*[@text='1']")).click();
        driver.findElement(By.xpath("//*[@text='1']")).click();
        driver.findElement(By.xpath("//*[@text='1']")).click();
        driver.findElement(By.xpath("//*[@text='1']")).click();
        
        
        WebElement textkidsElement1=driver.findElement(By.xpath("//*[contains(@text,'HOME')]"));

        Assert.assertTrue(textkidsElement1.isDisplayed(), "Switching to HOME MOde Text not visible");
        
        System.out.println("Switching to Home Mode in PW");
        Thread.sleep(5000);
        
	
}}
