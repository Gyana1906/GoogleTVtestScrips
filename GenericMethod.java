package GoogleTVtestScrips;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;



public class GenericMethod {
	
	public static String getvalue(String Key) throws IOException {
		
		String pathString=System.getProperty("user.dir")+
		File.separator+"TestFiles"+File.separator+"properties.properties";
		
		//C:\Users\gyana\eclipse-workspace\chapter1\TestFiles\properties.properties
		
		
		
		
		FileInputStream fileInputStream=new FileInputStream(pathString);
		
		Properties properties=new Properties();
		properties.load(fileInputStream);
		String valueString=  properties.getProperty(Key);
		return valueString;
		
}
	
	
	 public static WebElement scrollUI (WebDriver driver, String text)

	    {
	        String element = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\"" + text + "\"))";
	        return ((AndroidDriver<?>) driver).findElementByAndroidUIAutomator(element);
	    }


	 

	    public static String captureScreen(WebDriver driver) throws Exception {

	    	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	         Calendar cal = Calendar.getInstance();
	        
	    	
	        String dtf = dateFormat.format(cal.getTime());
	        String dt = dtf.replace("/", "_").replace(":", "_").replace(" ", "_").trim();

	        TakesScreenshot screen = (TakesScreenshot) driver;
	        File src = screen.getScreenshotAs(OutputType.FILE);
	        String dest = System.getProperty("user.dir") + File.separator + "Output" + File.separator + dt + "screenShot.png";
	        File target = new File(dest);
	        FileUtils.copyFile(src, target);
	        return dest;
	    }

	 
}
