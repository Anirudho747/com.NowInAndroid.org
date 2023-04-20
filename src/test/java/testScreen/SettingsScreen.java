package testScreen;

import java.util.List;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsScreen {
	
	@AndroidFindBy(xpath="//*[@text='Dark mode preference']//following::*[@class='android.widget.RadioButton']")
	public List<AndroidElement> modeOptions;
	
	@AndroidFindBy(xpath="//*[@text='OK']")
	public AndroidElement okButton;
	
	@AndroidFindBy(xpath="//*[@text='Dark mode preference']//following::*[@class='android.view.View']")
	public List<AndroidElement> widgetsAfterDarkMode;
	
	@AndroidFindBy(xpath="((//*[@class='android.view.View'])[3]//following::*[@class='android.view.View'])[8]")
	public AndroidElement systemDefaultOption;
	
	@AndroidFindBy(xpath="//*[@text='Dark']//following::*[@class='android.widget.RadioButton']")
	public AndroidElement darkOptionRadioButton;
	

}
