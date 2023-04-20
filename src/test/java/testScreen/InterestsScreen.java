package testScreen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InterestsScreen {
	
	@AndroidFindBy(xpath="(//*[@text='Saved']//following::*[@class='android.view.View'])[3]")
	public AndroidElement interestButton;
	
	@AndroidFindBy(xpath="(//*[@text='Interests'])[1]")
	public AndroidElement title;
	
	@AndroidFindBy(xpath="//*[@text='Games']")
	public AndroidElement games;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='Unfollow interest button']")
	public AndroidElement gamesWidget;

}
