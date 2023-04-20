package testScreen;

import java.util.List;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GamesScreen {
	
	@AndroidFindBy(xpath="//*[@text='Games']")
	public AndroidElement gamesTitle;
	
	@AndroidFindBy(xpath="//*[@text='NOT FOLLOWING']")
	public AndroidElement notFollowing;
	
	@AndroidFindBy(xpath="(//*[@class='android.widget.Button'])[1]")
	public AndroidElement backButton;

	

}
