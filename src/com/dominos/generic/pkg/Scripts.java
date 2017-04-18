package com.dominos.generic.pkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Scripts extends Generic_Methods {

	
	
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser) throws Exception{
       //Check if parameter passed from TestNG is 'firefox'
         if(browser.equalsIgnoreCase("Firefox")){
        	 driver = new FirefoxDriver();
        }
	       else if(browser.equalsIgnoreCase("chrome")){
			  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			  driver=new ChromeDriver();
         }
           else if(browser.equalsIgnoreCase("IE")){
 			  System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
 			  driver=new InternetExplorerDriver();
         }
   //      fn_LoginApp();
         Thread.sleep(2000);

         }
	
	
//	@BeforeMethod
//	public void Dashboard(){
//		launchBrowser("CH");
//	     fn_LoginApp();
//	    }
//	
     @Test(priority=1, enabled=true)
     public void fn_ValidData_Preferred_AA1_Furn12Months() throws InterruptedException {
    	 
    	 Jay_Class1 AA1Month12furobj=PageFactory.initElements(driver, Jay_Class1.class);
		try {
	            FileInputStream fis = new FileInputStream("jay docs.xlsx");
	            XSSFWorkbook wb = new XSSFWorkbook(fis);

	            XSSFSheet sheet = wb.getSheet("Sheet1");

	            for(int count=0;count<=sheet.getLastRowNum();count++)
	            {
	                XSSFRow row = sheet.getRow(count);
	                
//	                DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
//	            //    Cell cell = sheet.getRow(i).getCell(0);
//	                XSSFRow row=sheet.getRow(count);
	                
	                System.out.println("\n----------------------------");
	                System.out.println("Running test case " + count);

	               String cell1data =row.getCell(0).toString();
	                System.out.println(cell1data);
//	                AA1Month12furobj.fn_AA1_Furn12Months(row.getCell(0).toString(),row.getCell(1).toString(),row.getCell(2).toString(),row.getCell(3).
//	                		toString(),row.getCell(4).toString(),row.getCell(5).toString(),row.getCell(6).toString(),row.getCell(7).
//	                		toString(),row.getCell(8).toString(),row.getCell(9).toString(),row.getCell(10).toString(),row.getCell(11).
//	                		toString(),row.getCell(12).toString(),row.getCell(13).toString());
	                fis.close();
	            }	
	    //     driver.close();// Closing the browser instance
	      } catch (IOException e) {
	                 System.out.println("Test data file not found");
	         }   	 
	       }
	
	
}
