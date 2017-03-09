package Executer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;		
import org.testng.annotations.Test;

import activeUser.ActiveUser;
import keyWords.KeyWords;
import objectRepository.ObjectRepository;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;




public class Executer
{
	public WebDriver driver;	
	public ActiveUser activedriver= new ActiveUser();
	public ObjectRepository objr= new ObjectRepository();
	
	
	
	
	
	@Test
	public void userStorey1() throws Throwable
	{	
		ActiveUser.Key.getUrl("http://www.westpac.co.nz/");
		String title = driver.getTitle();
	    Assert.assertEquals("Bank | Westpac New Zealand - Helping Kiwis with their personal banking",title);
		System.out.println(title);
		ActiveUser.Key.mouseHoverAndClick(objr.kiwiSaver, objr.kiwiSaverCalculater);
	    ActiveUser.Key.scroleDown();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ActiveUser.Key.tapButton(objr.getStartedButton);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ActiveUser.Key.testCase1();		
	}	
	
	
	
	@Test
	public void userStorey2() throws Throwable
	{	
		ActiveUser.Key.getUrl("http://www.westpac.co.nz/");
		String title = driver.getTitle();
	    Assert.assertEquals("Bank | Westpac New Zealand - Helping Kiwis with their personal banking",title);
		System.out.println(title);
		ActiveUser.Key.mouseHoverAndClick(objr.kiwiSaver, objr.kiwiSaverCalculater);
	    ActiveUser.Key.scroleDown();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ActiveUser.Key.tapButton(objr.getStartedButton);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ActiveUser.Key.testCase2();		
	}	
	
	/*
	@Test
	public void userStorey3() throws Throwable
	{	
		ActiveUser.Key.getUrl("http://www.westpac.co.nz/");
		String title = driver.getTitle();
	    Assert.assertEquals("Bank | Westpac New Zealand - Helping Kiwis with their personal banking",title);
		System.out.println(title);
		ActiveUser.Key.mouseHoverAndClick(objr.kiwiSaver, objr.kiwiSaverCalculater);
	    ActiveUser.Key.scroleDown();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ActiveUser.Key.tapButton(objr.getStartedButton);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ActiveUser.Key.testCase3();		
	}
	*/	

		
  @BeforeSuite
  public void beforeTest() 
  {
	  
	  driver=activedriver.chromeDesiredCapabilities();
	  
  }


  
  
  @AfterSuite
  public void afterTest() 
  {
	  driver.quit();
  }

}
