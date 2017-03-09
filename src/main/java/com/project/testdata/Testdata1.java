package com.project.testdata;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebDriver;

public class Testdata1
{
	public static WebDriver driver;
	public Testdata1(WebDriver browser )
	{
		   driver=browser;
	}
	
	public static void main(String args[])
	{
		    /*USE*/
			List<TestData> list = ExcelReader.readExcelData("F:\\Project Newzeland\\TestData\\TestData.xlsx");
			
			//to get the second row 
			TestData tdtata = list.get(1);
			System.out.println("PIR :" + tdtata.get_pir());
			System.out.println(" \n");
			
			/*END USE*/
			
			
			
			
			Iterator<TestData> itr =   list.iterator();
			
			
			System.out.println("Test DATA LIST \n " + list.size());
			while(itr.hasNext())
			{
				TestData testData = itr.next();
				
				System.out.println("PIR :" + testData.get_pir());
				
				System.out.println(" \n");
				
				
				System.out.println(testData.get_testCaseNumber() + "  " 
				+"Current Age :"+ testData.get_currentAge() + "\n " 
				+"VoluntryContribution: " + testData.get_voluntryContribution() + " \n" 
				+ testData.get_expectedResult() + "\n "
				+ testData.get_currentKiwiSaverBalance() + "\n "
				+ testData.get_employeeStatus() + "\n "
				+ testData.get_pir() + " \n"
				+ testData.get_savingGoalAtRetirement() + "\n"
				);
				
				System.out.println("-------------------------------------");
			}
	}
}