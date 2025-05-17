package GoogleTVtestScrips;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class GTV_Playback_Framework  extends BaseTest{
	ExtentTest test = extent.createTest("Content Playback");
	
	@Test (dataProvider = "datainput")
	public void playbackTest(String texti) throws InterruptedException {
		
	   GTV_Playback_Test test2=new GTV_Playback_Test(driver);
	   Thread.sleep(2000);
	   test2.ContentTest( texti);
	   Thread.sleep(2000);
	   test.pass("Content Played");
	   Thread.sleep(2000);

}
	
	
	@DataProvider
	public Object[][] datainput() {

		Object[][] data = { { "https://www.youtube.com/watch?v=Nnop2walGmM"}, {"https://www.youtube.com/watch?v=Zlqf9cuaOBw"},{ "https://www.youtube.com/watch?v=BsqrmY91nUQ"}};
		
		return data;
	}

	
}