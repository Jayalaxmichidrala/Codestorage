package demo;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_ExcelDriver {
	//public class Driver {
		static WebDriver driver;
		public static void main(String[] args) throws Exception {
			
			String dt_path="/Users/jtatikonda/Documents/Amazon/Amazon_ReadExcel.xls";
			String sheetName="Sheet1";
			System.out.println("beforeread");
			String recdata[][]=Reusablemethods_Amazon.readXlSheet(dt_path, sheetName);
			System.out.println("afterread");
			String browserType = "Firefox";
			//String browserType="Chrome";
			
		/*	//calling from Excel only one testcase
			String testcase=recdata[1][2];
			
			Method tc=AutomationScripts1.class.getMethod(testcase);
			tc.invoke(tc);*/
			
			//reading many testcases from excel and Exceute only with yes condition and catch the exception
			for(int i=1;i<recdata.length;i=i+1){
				String execute=recdata[i][1];
				if(execute.equalsIgnoreCase("Y")){
					try{
						
					//	System.setProperty("webdriver.chrome.driver", "/Users/jtatikonda/Desktop/Chromedriver/chromedriver");
					//	driver = new ChromeDriver();	
						String testcase1=recdata[i][2];
					
						Method tc1=AutomationScripts_Amazon.class.getMethod(testcase1,String.class);
						//tc1.invoke(tc1);
						System.out.println("beforeInvoke");
						Object value = tc1.invoke(tc1,browserType);
						
						System.out.println(value);
						
					}
					catch(Exception e){
						System.out.println(e);
					}
				
			}
			}
			//java reflection -another way of calling
		/*	String testcase="sfdcLoginwithinvalid";
			Method tc=AutomationScripts1.class.getMethod(testcase);
			tc.invoke(tc);*/
			
			//java reflection-another way of calling 
			//Method tc=AutomationScripts1.class.getMethod("sfdcLoginwithinvalid");
			//tc.invoke(tc);
			
			//one method to call testcases
			//AutomationScripts1.sfdcLoginwithinvalid();

			
		}
		

	}

	




