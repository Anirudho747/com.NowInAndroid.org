package testCases;

import bs.Base;
import testFlows.GamesFlow;
import testFlows.InterestsFlow;
import testFlows.LaunchFlows;
import testFlows.SettingsFlow;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


public class Tests {
	
	Base bs;
	LaunchFlows lF;
	SettingsFlow sF;
	InterestsFlow iF;
	GamesFlow gF;
	
	//Handles Requirement 1
	@BeforeClass
	public void setUp() throws IOException
	{
		bs = new Base();
		bs.setCapabilities();
	}
	
	//Handles Requirement 16
	@AfterClass
	public void tearDown()
	{
		bs.quitDriver();
	}
	
	
	@BeforeMethod
	public void prepMethod()
	{
		lF = new LaunchFlows();
		sF = new SettingsFlow();
		iF = new InterestsFlow();
		gF = new GamesFlow();
	}
	
	//Handles Requirements 2 to 5
	@Test
	public void testCase1()
	{
		lF.getTitle();
		lF.tapSettings();
		Assert.assertEquals(sF.getModeNumber(), 3,"Incorrect Number of Mode options present");
	//	Assert.assertEquals(sF.isSystemDefaultSelected(),true,"System Default Not selected");
	}
	
	//Handles Requirements 6 to 9
	@Test
	public void testCase2()
	{
		sF.selectDarkOption();
		sF.selectOk();
		iF.clickInterests();
		Assert.assertEquals(iF.getTitle(), "Interests","Incorrect Title");
	}
	
	//Handles Requirements 10 to 15
	@Test
	public void testCase3()
	{
		iF.swipeToBottom();
		iF.tapGames();
		Assert.assertEquals(gF.getTitle(), "Games","Incorrect Title");
		gF.followGames();
		gF.backToInterests();
		Assert.assertEquals(iF.isGamesSelected(),true,"Games Not selected");
	}
	
}
