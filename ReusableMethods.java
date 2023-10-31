package GTVTestCases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ReusableMethods  {
	
	WebDriver driver;
	
	public ReusableMethods(WebDriver driver) {
		this.driver=driver;
		  }

	public List<WebElement> visibilityOfelements(List<WebElement> productList1) {
		
	
		
		 WebDriverWait wait= new WebDriverWait(driver,7);
		 //WebDriverWait wait2=new WebDriverWait(driver, 20);
		 return wait.until(ExpectedConditions.visibilityOfAllElements(productList1));	

		
	}
	
	public WebElement visibilityOfelement(WebElement product) {
		
		 WebDriverWait wait= new WebDriverWait(driver,10);
		 return wait.until(ExpectedConditions.visibilityOf(product));	

		
	}
	
	public Boolean invisibilityOfelements(By inviBy) {
		
		 WebDriverWait wait= new WebDriverWait(driver,20);
		 return wait.until(ExpectedConditions.invisibilityOfElementLocated(inviBy));	

	
	
}
	public WebElement visibilityOfelement(By eleBy) {
		
		 WebDriverWait wait= new WebDriverWait(driver,20);
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(eleBy));	
	

}
	


public void dynamicElem(WebDriver driver,WebElement orderElement1) {
	
	 JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].click();", orderElement1);
	
}

//wifi status
  public String executeShellCommand(String command) {
    StringBuilder output = new StringBuilder();

    try {
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line).append("\n");
        }

        process.waitFor();
    } catch (IOException | InterruptedException e) {
        e.printStackTrace();
    }

    return output.toString();
}

//bt status
public static String executeShellCommand1(String command) {
      StringBuilder output = new StringBuilder();

      try {
          Process process = Runtime.getRuntime().exec(command);
          BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

          String line;
          while ((line = reader.readLine()) != null) {
              output.append(line).append("\n");
          }

          process.waitFor();
      } catch (IOException | InterruptedException e) {
          e.printStackTrace();
      }

      return output.toString();
  }
  
  
}
