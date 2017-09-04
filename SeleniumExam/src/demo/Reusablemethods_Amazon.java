package demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Reusablemethods_Amazon {
	
		//Report data
			static BufferedWriter bw = null;
			static BufferedWriter bw1 = null;
			static String htmlname;
			static String objType;
			static String objName;
			static String TestData;
			static String rootPath;
			static int report;
			static Date cur_dt = null;
			static String filenamer;
			static String TestReport;
			int rowcnt;
			static String exeStatus = "True";
			static int iflag = 0;
			static int j = 1;
			static String fireFoxBrowser;
			static String chromeBrowser;
			static String result;
			static int intRowCount = 0;
			static String dataTablePath;
			static int i;
			static String browserName;
		
			static String result1;
			static String text;
			static Object [][] data;
			static Object [][] locator;
			static Object[] [] matrix;
			static String locatortype;
			static String value;
			static String obj_name;
			
			//Object repository implemenatation
			public static By findElement(String type,String value){
				switch(type)
				{
				case "id":
					return By.id(value);
				case "xpath":
					return By.xpath(value);
				case "className":
					return By.className(value);
				case "name":
					return By.name(value);
				case "linkText":
					return By.linkText(value);
				case "partialLinkText":
					return By.partialLinkText(value);
				case "cssSelector":
					return By.cssSelector(value);
				case "tagName":
					return By.tagName(value);
				default:
					System.out.println("Unknown type");
					return null;

				
			}
			}
		//set value
	public static void setValue(int row){
		obj_name=(String) locator[row][0];
		 locatortype= (String) locator[row][1];
		 value=(String) locator[row][2];
	}
			//read object repo from excel
	public static void readLocators(String path){
				//path="/Users/jtatikonda/Documents/Salesforce_All/ObjectRepo_Salesforce.xls";
		   locator=readExcel(path);
			}
	//read test data
	public static void readTestdata(String path){
		data=readExcel(path);
	}
	//read excel
	public static Object[][] readExcel(String path){
		try
		{
			File file = new File(path);
			FileInputStream xf = new FileInputStream(file);
			HSSFWorkbook xwb = new HSSFWorkbook(xf);
			ArrayList<String> sNames = new ArrayList<String>();

			// retrieve all the sheet in a file
			for (int i=0; i<xwb.getNumberOfSheets(); i++) 
			{
				sNames.add( xwb.getSheetName(i) );
				
			}
			
			//Iterate through each sheet and retrieves the data and stores it in an arraylist
			for(String s: sNames)
			{
				HSSFSheet sheet = xwb.getSheet(s);
				int row = sheet.getLastRowNum()+1;
				int col = sheet.getRow(0).getLastCellNum();
				matrix = new Object[row][col];
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						HSSFCell cell = sheet.getRow(i).getCell(j);
						if(cell!=null)
						{
							String value= cell.getStringCellValue();
							matrix[i][j]=value;

						}
					}
				}

			}
			System.out.println("loop");
			xwb.close();
		}
		catch(Exception e)
		{
			
		}
		return matrix;
	}

			
	/*public static void main(String[] args){
			WebDriver driver=new FirefoxDriver();
			 driver.get("http://www.salesforce.com");
			
			//Reusable_input i1=new Reusable_input();
			WebElement username=driver.findElement(By.id("userName"));
			  inPut(username,"user@gmail.com","username");
			  
			WebElement password=driver.findElement(By.id("password"));
				inPut(password,"user23","password");
				
			WebElement login1=driver.findElement(By.id("Login"));
				login(login1,"login");
			}*/
			

			

		public static void inPut(WebElement obj,String textvalue,String objName){
			if(obj.isDisplayed()){
				obj.sendKeys(textvalue);
				System.out.println(textvalue+"is entered in"+ objName+"feild");
				
			}
			else{
				System.out.println("fail"+objName+"feild is not dispalyed and check your applictaion");
			}
		}
		public static void clickElement(WebElement obj,String objname){
			if(obj.isDisplayed()){
				obj.click();
				System.out.println("pass"+objname+"is clicked");
			}
			else{
				System.out.println("fail"+objname+"feild is not dispalyed and check your application" );
			}
		}
		public static String verifyErrormessage(String exp,String act){
			if(exp.equals(act)){
				//System.out.println("pass");
				result1="Pass";
				return result1;
			}
			else{
				System.out.println("fail");
				result1="Fail";
				return result1;
			}
		}
		public static String getText(WebElement txtele){
			text=txtele.getText();
			return text;
			
		}
		//Clear text box
		public static void clear(WebElement textBox)
			{
				textBox.clear();
			}
		//read testcases from excel--need to create mwthod
		public static String[][] readXlSheet(String dt_path, String sheetName) throws IOException{

			/*Step 1: Get the XL Path*/
			
			File xlFile = new File(dt_path);

			/*Step2: Access the Xl File*/
			FileInputStream xlDoc = new FileInputStream(xlFile);

			/*Step3: Access the work book */
			HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		
			/*Step4: Access the Sheet */
			HSSFSheet sheet = wb.getSheet(sheetName);
		
			int iRowCount = sheet.getLastRowNum()+1;
			int iColCount = sheet.getRow(0).getLastCellNum();

			String[][] xlData = new String[iRowCount][iColCount];

			for(int i = 0; i < iRowCount; i++){
		
				for(int j = 0; j <iColCount; j++){
					
					xlData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();

				}

			}

			return xlData;

		}
		
		//start Report method
			public static void startReport(String scriptName, String ReportsPath) throws IOException{

				String strResultPath = null;
				String testScriptName =scriptName;
				cur_dt = new Date(); 
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
				String strTimeStamp = dateFormat.format(cur_dt);

				if (ReportsPath == "") { 

					ReportsPath = "C:\\";
				}

				if (ReportsPath.endsWith("\\")) { 
					ReportsPath = ReportsPath + "\\";
				}

				strResultPath = ReportsPath + "Log" + "/" +testScriptName +"/"; 
				File f = new File(strResultPath);
				f.mkdirs();
				htmlname = strResultPath  + testScriptName + "_" + strTimeStamp 
						+ ".html";
				bw = new BufferedWriter(new FileWriter(htmlname));
				bw.write("<HTML><BODY><TABLE BORDER=0 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
				bw.write("<TABLE BORDER=0 BGCOLOR=BLACK CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
				bw.write("<TR><TD BGCOLOR=#66699 WIDTH=27%><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>Browser Name</B></FONT></TD><TD COLSPAN=6 BGCOLOR=#66699><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>"
						+ "FireFox " + "</B></FONT></TD></TR>");
				bw.write("<HTML><BODY><TABLE BORDER=1 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
				bw.write("<TR COLS=7><TD BGCOLOR=#BDBDBD WIDTH=3%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>SL No</B></FONT></TD>"
						+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Step Name</B></FONT></TD>"
						+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Execution Time</B></FONT></TD> "
						+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Status</B></FONT></TD>"
						+ "<TD BGCOLOR=#BDBDBD WIDTH=47%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Detail Report</B></FONT></TD></TR>");


			}


			//Report update method
			public static void Update_Report(String Res_type,String Action, String result) throws IOException {
				String str_time;
				Date exec_time = new Date();
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
				str_time = dateFormat.format(exec_time);
				if (Res_type.startsWith("Pass")) {
					bw.write("<TR COLS=7><TD BGCOLOR=#EEEEEE WIDTH=3%><FONT FACE=VERDANA SIZE=2>"
							+ (j++)
							+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
							+Action
							+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
							+ str_time
							+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
							+ "Passed"
							+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
							+ result + "</FONT></TD></TR>");

				} else if (Res_type.startsWith("Fail")) {
					exeStatus = "Failed";
					report = 1;
					bw.write("<TR COLS=7><TD BGCOLOR=#EEEEEE WIDTH=3%><FONT FACE=VERDANA SIZE=2>"
							+ (j++)
							+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
							+Action
							+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
							+ str_time
							+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
							+ "<a href= "
							+ htmlname
							+ "  style=\"color: #FF0000\"> Failed </a>"

						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ result + "</FONT></TD></TR>");

				} 
			}

}

