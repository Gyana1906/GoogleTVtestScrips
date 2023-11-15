package GoogleTVtestScrips;



import io.appium.java_client.android.AndroidDriver;

public class GTV_Playback_Test extends ReusableMethods {

	public GTV_Playback_Test(AndroidDriver<?> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void ContentTest(String urlString) {
		
        //"https://www.youtube.com/watch?v=wlC_eFbxwD";
		String command = "adb shell am start -a android.intent.action.VIEW -d " + urlString;
		System.out.println(command);
		String Status = executeShellCommand1(command);

		
		//String State = "Starting: Intent { act=android.intent.action.VIEW dat="+ urlString;
		System.out.println(Status);


		// Determine the Bluetooth status based on the state
		String StatusText;
		if ( Status.contains("Starting")) {
		    StatusText = "Content is played";}
		 else {
			StatusText = "Content not is played";
		}

		
		System.out.println("Content Status: " + StatusText);

	}

}
