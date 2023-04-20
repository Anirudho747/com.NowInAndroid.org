package testFlows;

import org.openqa.selenium.support.PageFactory;

import bs.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testScreen.LaunchScreen;

public class LaunchFlows extends LaunchScreen{
	
	Base bs;
	
	public LaunchFlows()
	{
		bs = new Base();
		PageFactory.initElements(new AppiumFieldDecorator(bs.getDriver()), this);
	}
	
	public String getTitle()
	{
		return(title.getText());
	}
	
	public void tapSettings()
	{
		settings.click();
	}
	
	

}
