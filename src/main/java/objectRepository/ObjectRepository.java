package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ObjectRepository {

	WebDriver driver;

   // Common To all
	
	public By kiwiSaver = By.id("ubermenu-section-link-kiwisaver-ps");
	public By kiwiSaverCalculater = By.id("ubermenu-item-cta-kiwisaver-calculators-ps");
	public By getStartedButton = By.xpath("//*[contains(text(), 'Click here to get started.')]");
	public By icon_currentAge = By.xpath("//i[contains(@class, 'icon')]");
	public By textFielid_currentAge = By.xpath("//input[3]");
	
	// UserStorey1 Object Repo Instance
//---------------------------------------------------------------------------------------------------------------------------------------	
	public By current_AgeIcon = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button");
	public By current_AgeIcon_popup= By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div/p");
	
	
	public By empStatus_Icon = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/button");
	public By empStatus_Icon_pop_up = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/p");
	
	
	public By pir = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/div/div/div/button");
	public By pir_Pop_up = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[2]/div/p");
	
   
   
	public By Kiwi_Saver_Balance = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[2]/div/div/div/button");
	public By Kiwi_Saver_Balance_Pop_up = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[2]/div/p");
	
	
	public By Voluntary_cont = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/button");
	public By Voluntary_cont_Pop_up = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[2]/div/p");
	
	
	public By Risk_Profile = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[7]/div/div/div/div[2]/div[2]/div/div/div/button");
	public By Risk_Profile_Pop_up = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[2]/div/ul/li[2]");
	
	
	public By saving_goal_requirements = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[8]/div/div/div/div[2]/div[2]/div/div/div/button");
	public By saving_goal_requirements_pop_up = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[2]/div/p/strong/a");
	
	
	
	//UserStorey2 testcase1 Object Repo Instance
//--------------------------------------------------------------------------------------------------------------------------------------
	
	public By currentAge_textbox=By.xpath("//*[@class='ng-pristine ng-valid']");
	
	public By empStatus=By.xpath("//*[@class='well-value ng-binding']");
	public By empStatusOption=By.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/ul/li[2]/div/span");
	
    public By salary_employed=By.xpath("//*[@class='ng-pristine ng-valid']");
    
    public By kiwi_Saver_member_contri=By.id("radio-option-069");
    
    public By pIR_Textbox=By.xpath("//*[@class='ng-binding ng-scope']");
    
    public By pIR_option=By.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/ul/div[2]/li/div/span");
    
    public By high_risk_profile=By.id("radio-option-021");
    
    public By kiwi_Saver_Retirement_projection=By.xpath("//*[@class='btn btn-regular btn-results-reveal btn-has-chevron']");

    
  //UserStorey2 testcase2 Object Repo Instance
 //---------------------------------------------------------------------------------------------------------------------  

    
   // public By empStatusOption_selfempl=By.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/ul/li[2]/div/span");
    public By empStatusOption_selfempl=By.xpath("//*[contains(text(),'Self-employed')]");
    public By pIR_option_2= By.xpath("./html/body/div/div/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/ul/div[3]/li/div");
  
    ////*[contains(text(),'Self-employed')]
    
    //public By pIR_option_2= By.xpath("//*[@class='ng-binding ng-scope']");
    ///html/body/div/div/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/ul/div[3]/li/div
   
    
    //Current KiwiSaver balance (By.xpath("//*[@class='ng-pristine ng-valid']"))
    public By Current_KiwiSaver_balance=By.xpath("//*[@class='ng-pristine ng-valid']");
    public By volunarty_cont=By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input");
    
    public By mediumRisk_Profile=By.xpath("//*[@class='input-label']");
    public By frequency=By.xpath("//*[@class='ng-binding ng-scope']");
    public By Fortnightly=By.xpath("//*[contains(text(),'Fortnightly')]");
    public By Fortnightly_div=By.xpath("//*[@class='label']");
    //label
    //ng-binding ng-scope
    
    //ng-binding ng-scope
    
   
//input-label


}
