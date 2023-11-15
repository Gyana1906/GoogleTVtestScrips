package GoogleTVtestScrips;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class GTV_Patchwall_Contentsearch_Framework  extends GTV_PatchWall_BaseTest_Framework{

	@Test
	public void contentSearch() throws InterruptedException {

		System.out.println("PW UI Launched");
		Thread.sleep(2000);
		
		WebElement searchElement=driver.findElement(By.id("com.mitv.tvhome.atv:id/user_search"));
		searchElement.click();

        WebElement d = driver.findElement(By.xpath("//*[@text='D']"));
        d.click();
        d.click();
        Thread.sleep(200);
        WebElement r = driver.findElement(By.xpath("//*[@text='R']"));
        r.click();
        r.click();
        Thread.sleep(200);
        WebElement i1 = driver.findElement(By.xpath("//*[@text='I']"));
        i1.click();
        i1.click();
        Thread.sleep(200);


        WebElement S = driver.findElement(By.xpath("//*[@text='S']"));
        S.click();
        S.click();
        Thread.sleep(200);

        WebElement H = driver.findElement(By.xpath("//*[@text='H']"));
        H.click();
        H.click();
        Thread.sleep(200);

        WebElement y = driver.findElement(By.xpath("//*[@text='Y']"));
        y.click();
        y.click();
        Thread.sleep(200);

        WebElement A = driver.findElement(By.xpath("//*[@text='A']"));
        A.click();
        A.click();
        Thread.sleep(200);

        WebElement Mi = driver.findElement(By.xpath("//*[@text='M']"));
        Mi.click();
        Mi.click();
        Thread.sleep(200);
        
        WebElement spacElement = driver.findElements(By.id("com.mitv.tvhome.atv:id/key_item_icon")).get(0);
        spacElement.click();
        Thread.sleep(200);

        
        WebElement n1 = driver.findElement(By.xpath("//*[@text='2']"));
        n1.click();
        n1.click();
        
        Thread.sleep(200);

        // String tittl = driver.findElement(By.xpath("//*[@text='Drishyam']")).getText();
        @SuppressWarnings("unchecked")
		List <WebElement> tilldisp = (List<WebElement>) driver.findElements(By.id("com.mitv.tvhome.atv:id/tv_suggest"));

      WebElement tittl2=
              tilldisp.stream().filter(p->p.getText().contains("Drishyam 2")).collect(Collectors.toList()).get(0);
        if (tittl2.getText().equalsIgnoreCase("Drishyam 2")) {

            System.out.println("Content Drishyam 2 Found in PW");
          
        } else
            System.out.println("Content Drishyam 2 not Found in PW");


        for (int i = 0; i <= 5; i++) {

            ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_RIGHT));
        }


        @SuppressWarnings("unchecked")
		List<WebElement> Patchcont = (List<WebElement>) driver.findElements(By.id("com.mitv.tvhome.atv:id/di_text"));
        Patchcont.get(0).click();
        ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_CENTER));
     

        Thread.sleep(10000);

        ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_RIGHT));
        ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_CENTER));
		
	}
	
}
