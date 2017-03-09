package com.project.testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	public static List<TestData> readExcelData(String fileName) 
	{
		List<TestData> testDataList = new ArrayList<TestData>();
		
		try 
		{
			// to create the input stream from the xlsx/xls file
			FileInputStream fis = new FileInputStream(fileName);
			
			//to create Workbook instance for xlsx/xls file input stream
			Workbook workbook = null;
			if (fileName.toLowerCase().endsWith("xlsx"))
			{
				workbook = new XSSFWorkbook(fis);
			}
			else if (fileName.toLowerCase().endsWith("xls"))
			{
				workbook = new HSSFWorkbook(fis);
			}
			
			//Get the number of sheets in the xlsx file
			int numberOfSheets = workbook.getNumberOfSheets();
			
			TestData testDataRef = null;
			
			//loop through each of the sheets
			for (int i=0; i < numberOfSheets; i++)
			{	
				//Get the nth sheet from the workbook
				Sheet sheet = workbook.getSheetAt(i);
				
				//every sheet has rows, iterate over them
				Iterator<Row> rowIterator = sheet.iterator();
				
				// to ensure skip the heading part
				if (rowIterator.hasNext())
					rowIterator.next();
				
				while (rowIterator.hasNext()) 
				{
					//Get the row object
					Row row = rowIterator.next();
					//Every row has columns, get the column iterator and iterate over them
					Iterator<Cell> cellIterator = row.cellIterator();
					testDataRef = new TestData();
					
		            while (cellIterator.hasNext()) 
		            {
		            	//Get the Cell object
		            	Cell cell = cellIterator.next();
		            	
		            	//check the cell type and process accordingly
		            	switch(cell.getCellType())
		            	{
		            		case Cell.CELL_TYPE_STRING:
		            			
		            			String value = cell.getStringCellValue().trim();
		            			if (testDataRef.get_testCaseNumber() == null || testDataRef.get_testCaseNumber().equalsIgnoreCase(""))
		            			{
		            				testDataRef.set_testCaseNumber(value);
		            			}
		            			else if (testDataRef.get_employeeStatus() == null || testDataRef.get_employeeStatus().equalsIgnoreCase(""))
		            			{
		            				testDataRef.set_employeeStatus(value);
		            			}
		            			else if (testDataRef.get_riskProfile() == null || testDataRef.get_riskProfile().equalsIgnoreCase(""))
		            			{
		            				testDataRef.set_riskProfile(value);
		            			}
		            			else if (testDataRef.get_expectedResult() == null || testDataRef.get_expectedResult().equalsIgnoreCase(""))
		            			{
		            				testDataRef.set_expectedResult(value);
		            			}
		            		break;
		            		
		            		case Cell.CELL_TYPE_NUMERIC:

		            			double numericValue =  cell.getNumericCellValue();
		            			
		            			if (testDataRef.get_currentAge() == 0)
		            			{
		            				testDataRef.set_currentAge(numericValue);
		            			}
		            			else if (testDataRef.get_salary() == 0)
		            			{
		            				testDataRef.set_salary(numericValue);
		            			}
		            			else if (testDataRef.get_kiwiSaverMember() == 0)
		            			{
		            				testDataRef.set_kiwiSaverMember(numericValue);
		            			}
		            			else if (testDataRef.get_pir() == 0)
		            			{
		            				testDataRef.set_pir(numericValue);
		            			}
		            			else if (testDataRef.get_currentKiwiSaverBalance() == 0)
		            			{
		            				testDataRef.set_currentKiwiSaverBalance(numericValue);
		            			}
		            			else if (testDataRef.get_voluntryContribution() == 0)
		            			{
		            				testDataRef.set_voluntryContribution(numericValue);
		            			}
		            			else if (testDataRef.get_savingGoalAtRetirement() == 0)
		            			{
		            				testDataRef.set_savingGoalAtRetirement(numericValue);
		            			}
		            				
		            	}
		            } //end of cell iterator
		            
		            testDataList.add(testDataRef);
		            
		        } //end of rows iterator
				
				
			} //end of sheets for loop
			
			//close file input stream
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return testDataList;
	}
}