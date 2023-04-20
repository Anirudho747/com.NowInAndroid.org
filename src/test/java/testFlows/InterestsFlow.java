package testFlows;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import bs.Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import testScreen.InterestsScreen;

public class InterestsFlow extends InterestsScreen {
	
Base bs;
	
	public InterestsFlow()
	{
		bs = new Base();
		PageFactory.initElements(new AppiumFieldDecorator(bs.getDriver()), this);
	}

	public void clickInterests()
	{
		interestButton.click();
	}
	
	public String getTitle()
	{
		return (title.getText());
	}
	
	public void swipeToBottom()
	{
		Dimension dim = bs.getDriver().manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int top_y = (int)(height*0.80);
		int bottom_y = (int)(height*0.20);
		TouchAction ta = new TouchAction(bs.getDriver());
		ta.longPress(PointOption.point(x, top_y)).moveTo(PointOption.point(x, bottom_y)).release().perform();
	}
	
	public void tapGames()
	{
		games.click();
	}
	
	public boolean isGamesSelected()
	{
		return(gamesWidget.isDisplayed());
	}

}
