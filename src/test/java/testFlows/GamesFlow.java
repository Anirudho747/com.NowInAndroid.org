 package testFlows;

import org.openqa.selenium.support.PageFactory;
import bs.Base;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testScreen.GamesScreen;

public class GamesFlow extends GamesScreen{
	
	Base bs;
	
	public GamesFlow()
	{
		bs = new Base();
		PageFactory.initElements(new AppiumFieldDecorator(bs.getDriver()), this);
	}

    public String getTitle()
    {
    	return(gamesTitle.getText());
    }
    
    public void followGames()
    {
    	notFollowing.click();
    }
    
    public void backToInterests()
    {
    	backButton.click();
    }
}
