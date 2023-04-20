package testFlows;

import org.openqa.selenium.support.PageFactory;

import bs.Base;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testScreen.SettingsScreen;

public class SettingsFlow extends SettingsScreen{
	
Base bs;
	
	public SettingsFlow()
	{
		bs = new Base();
		PageFactory.initElements(new AppiumFieldDecorator(bs.getDriver()), this);
	}
	
	public int getModeNumber()
	{
		return(modeOptions.size());
	}
	
	public boolean isSystemDefaultSelected()
	{
		return(systemDefaultOption.isSelected());
	}
	
	public void selectDarkOption()
	{
		darkOptionRadioButton.click();
	}
	
	public void selectOk()
	{
		okButton.click();
	}

}
