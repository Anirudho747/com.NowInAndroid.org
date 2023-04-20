package testScreen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import java.util.List;

public class LaunchScreen {
	
	@AndroidFindBy(xpath="//*[@text='Now in Android']")
	public AndroidElement title;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='Settings']")
	public AndroidElement settings;
	
}
