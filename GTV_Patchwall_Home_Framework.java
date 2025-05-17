package GoogleTVtestScrips;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GTV_Patchwall_Home_Framework extends GTV_PatchWall_BaseTest_Framework {

	
	@SuppressWarnings("unchecked")
	
	@Test
	public void patchwallhome() throws InterruptedException {
		
		System.out.println("PW UI Launched in GTV ");
		Thread.sleep(2000);

		
		try {
			
			
			List<WebElement> headertabsElements = (List<WebElement>) driver
					.findElements(By.id("com.mitv.tvhome.atv:id/row_header_in"));
			

			System.out.println("PW UI loaded");
			
		WebElement branduiElement=driver.findElement(By.id("com.mitv.tvhome.atv:id/brand"));

		Assert.assertTrue(branduiElement.isDisplayed(),"Patchwall not displayed");
		
		Assert.assertTrue(listtab.size() == headertabsElements.size(), "Different number of Tabs are Present as declared");
//			if (listtab.size() == headertabsElements.size()) {
//				System.out.println("Same number of Tabs are Present as declared");
//			} else {
//				System.out.println("Different number of Tabs are Present as declared");
//			}

			for (int i = 0; i < headertabsElements.size(); i++) {
//				if (headertabsElements.get(i).getText().trim().equalsIgnoreCase(listtab.get(i).trim())) {
//					System.out.println(headertabsElements.get(i).getText() + " Tabs are matching ");
//				} else {
//					System.out.println(headertabsElements.get(i).getText() + " Tabs are not matching ");
//				}
//						
		Assert.assertTrue(headertabsElements.get(i).getText().trim().equalsIgnoreCase(listtab.get(i).trim()),"Tabs are not matching");		
			}
			
		
		}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Patchwall UI change");
			}


		
	}
}
