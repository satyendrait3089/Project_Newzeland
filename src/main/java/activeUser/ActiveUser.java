package activeUser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.project.testdata.Testdata1;

import keyWords.KeyWords;
import objectRepository.ObjectRepository;
public class ActiveUser
{
	public static WebDriver driver;	
	public static ObjectRepository objr= new ObjectRepository();
	public static KeyWords Key;
	public static Testdata1 tda;
	
	/*
	public WebDriver IEtestforDesiredCapabilities()
	{
	//it is used to define IE capability 
	 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	  
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
	capabilities.setCapability(InternetExplorerDriver.
	  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

	System.setProperty("webdriver.ie.driver", "F:\\Project Newzeland\\IEDriverServer_Win32_3.2.0\\IEDriverServer.exe");
	//it is used to initialize the IE driver
	 driver = new InternetExplorerDriver(capabilities);
	 driver.manage().window().maximize();
	 Key=new KeyWords(driver);
	 
	 return driver;
	
	 }
	  */
	
	public WebDriver chromeDesiredCapabilities()
	{
	//it is used to define IE capability 
	 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	  
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	capabilities.setCapability(InternetExplorerDriver.
	  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

	System.setProperty("webdriver.chrome.driver", "F:\\Project Newzeland\\GoogleChromeDriverServer\\chromedriver.exe");
	//it is used to initialize the IE driver;
	 driver = new ChromeDriver(capabilities);
	 driver.manage().window().maximize();
	 Key=new KeyWords(driver);
	 
	 return driver;
	
	 }
	
	
}
