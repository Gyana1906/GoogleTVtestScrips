package GoogleTVtestScrips;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class GTV_Date_Time_Framework extends BaseTest{

	@Test
	public void datenTime() throws InterruptedException {
		ExtentTest test = extent.createTest("Date and Time Test");
		System.out.println("GTV Home screen");
		test.pass("Google TV UI launched");

		//Thread.sleep(2000);
		
		GTV_TC1_Home gHome = new GTV_TC1_Home(driver);
		Thread.sleep(2000);
		 gHome.settingbutton();

	WebElement timeElement=	 driver.findElement(By.id("com.google.android.apps.tv.launcherx:id/dashboard_time_indicator"));
	WebElement datelElement=driver.findElement(By.id("com.google.android.apps.tv.launcherx:id/dashboard_date_indicator"));
	
	System.out.println("Time date & Month  :"+  timeElement.getText() + " "+ datelElement.getText());
	
	
	 LocalTime time = LocalTime.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a"); // for 24hrs format (HH:mm) & a gives am /pm
     String TodayTime = time.format(formatter);

     
     if (TodayTime.equalsIgnoreCase(timeElement.getText())) {
         System.out.println("Time matched with IN Locale");
         test.pass("Current Time is Matched");
     } else {
    	 System.out.println("Time not matched with IN Locale");  
         test.fail("Current Time doesnt Match");
}


     LocalDate currentDate = LocalDate.now();
     DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("E, dd MMM");
     String formattedDate = currentDate.format(formatter1);

     if (formattedDate.equalsIgnoreCase(datelElement.getText())) {
         System.out.println("Date & Month matched with IN Locale");
         test.pass("Current Date & Month  Matched");
     } else {
    	 System.out.println("Date & Month not matched with IN Locale"); 
    	 test.fail("Current Date & Month not Matched");}
     
   
     
     
		
	}
}
