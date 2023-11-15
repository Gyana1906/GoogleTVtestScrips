package GoogleTVtestScrips;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class GTV_Playback_Framework  extends BaseTest{
	ExtentTest test = extent.createTest("Content Playback");
	String texti = "https://www.youtube.com/watch?v=dx4Teh-nv3A";
	
	@Test
	public void playbackTest() {
		
	   GTV_Playback_Test test2=new GTV_Playback_Test(driver);
	   test2.ContentTest(texti);
	   test.pass("Content Played");
	   

}
}