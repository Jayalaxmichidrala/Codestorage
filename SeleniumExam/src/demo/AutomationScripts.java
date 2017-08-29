package demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationScripts {
	
		public static void sfdcLoginwithinvalid(String dt_path) throws IOException{
		
		//String dt_path="/Users/jtatikonda/Documents/Salesforce.xls";
		

		/*Step 1: Get the XL Path*/
		File xlFile=new File(dt_path);
		
		/*Step2: Access the Xl File*/
		FileInputStream xlDoc=new FileInputStream(xlFile);
		
		
		/*Step3: Access the work book */
		HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
		
		/* Access the SHEET*/
		HSSFSheet sheet=wb.getSheet("Sheet1");
		//String data=sheet.getRow(0).getCell(2).getStringCellValue();
		System.out.println("test");
		
	/*	HSSFRow row=sheet.getRow(0);
		
		HSSFCell cell=row.getCell(0);
		
		cell.setCellValue("eeroju");
		
		FileOutputStream fout=new FileOutputStream(dt_path);
		wb.write(fout);
		fout.flush();
		fout.close();*/
		
		
		
		WebDriver driver=new FirefoxDriver();
		
		
		//System.out.println(data);
		int irowcount=sheet.getLastRowNum()+1;
		int icolcount=sheet.getRow(0).getLastCellNum();
		System.out.println(irowcount);
		System.out.println(icolcount);
		
		//read the URL from excel
		System.out.print(sheet.getRow(1).getCell(0).getStringCellValue()+" ");
		String s=sheet.getRow(1).getCell(0).getStringCellValue();
		driver.get(s);
		
		//read the username from excel
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue()+"");
		String username=sheet.getRow(1).getCell(1).getStringCellValue()+"";
		System.out.println(username);
		driver.findElement(By.id("username")).sendKeys(username);
		
		//read the password from excel
		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue()+"");
		String pw=sheet.getRow(1).getCell(2).getStringCellValue()+"";
		driver.findElement(By.id("password")).sendKeys(pw);
		
		//click the login button
		 WebElement login=driver.findElement(By.id("Login"));
		 login.click();
		 
		 System.out.println(sheet.getRow(1).getCell(3).getStringCellValue()+"");
		 String error=sheet.getRow(1).getCell(3).getStringCellValue()+"";
		 System.out.println(error+"excel");
		
		 String error1=driver.findElement(By.xpath(".//*[@id='error']")).getText();
		 System.out.println(error1+"notexcel");
		 if(error.equals(error1)){
			 System.out.println("passed");
			 //System.out.println("jaya");
		 }
		 else{
			 System.out.println("fail");
		 }
		
		//for(int i=0;i<irowcount;i=i+1){
		 
			//for(int j=0;j<icolcount;j=j+1){
		//for(int i=irowcount-1;i>0;i=i-1){//read all cell values
		       for(int i=irowcount-1;i>=0;i=i-1){
				for(int j=0;j<=icolcount-1;j=j+1){
			//System.out.println(i);
				//System.out.println(sheet.getRow(1).getCell(0).getStringCellValue()+" ");//syntax for if you want print the data like excel
				//if you want to try the try catch exception then below is the syntax
				try{
					System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
				}catch(Exception e){
					System.out.println(e);
					
				}
			}
			System.out.println();
		}
		

	}
		public static void sfdcLoginwithValid(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			//String username=sheet.getRow(1).getCell(1).getStringCellValue()+"";
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
			
		}
		public static void errorMessage(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
			
		}
		
		public static void logOut(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.findElement(By.id(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
			driver.findElement(By.linkText(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
			
		}
		public static void developerConsole(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.id(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    String s1=driver.getCurrentUrl();
		    System.out.println(s1);
		    for (String winHandle : driver.getWindowHandles()) {
		        driver.switchTo().window(winHandle);
		    }
		    driver.close();
		    //driver.quit();
			
		}
		public static void input_post(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.id(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.linkText(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    WebElement input=driver.findElement(By.id(sheet.getRow(1).getCell(6).getStringCellValue()+""));
		    System.out.println("clicked");
		    input.sendKeys(sheet.getRow(1).getCell(7).getStringCellValue()+"");
		    //input.sendKeys("hi world again");
		    System.out.println("clicked1");
		    driver.findElement(By.id(sheet.getRow(1).getCell(8).getStringCellValue()+"")).click();
		    
		}
	public static void fileUpload(String dt_path) throws IOException{
		/*Step 1: Get the XL Path*/
		File xlFile=new File(dt_path);
		
		/*Step2: Access the Xl File*/
		FileInputStream xlDoc=new FileInputStream(xlFile);
		
		
		/*Step3: Access the work book */
		HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
		
		/* Access the SHEET*/
		HSSFSheet sheet=wb.getSheet("Sheet1");
		WebDriver driver=new FirefoxDriver();
		
		String s=sheet.getRow(1).getCell(0).getStringCellValue();
		driver.get(s);
		
		driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
		driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
		driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.findElement(By.id(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
	    driver.findElement(By.linkText(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(sheet.getRow(1).getCell(6).getStringCellValue()+"")).click();
	    driver.findElement(By.id(sheet.getRow(1).getCell(7).getStringCellValue()+"")).click();
	    driver.findElement(By.id(sheet.getRow(1).getCell(8).getStringCellValue()+"")).click();
		}
		public static void createAccount(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    driver.findElement(By.linkText(sheet.getRow(1).getCell(6).getStringCellValue()+"")).click();
		    System.out.println("clicked");
		   WebElement input= driver.findElement(By.xpath(sheet.getRow(1).getCell(7).getStringCellValue()+""));
		   System.out.println("clicked");
		  // input.sendKeys(sheet.getRow(1).getCell(8).getStringCellValue()+"");
		   input.sendKeys("jaya");
		   System.out.println("clicked1");
		   driver.findElement(By.name(sheet.getRow(1).getCell(9).getStringCellValue()+"")).click();
		   driver.findElement(By.id(sheet.getRow(1).getCell(10).getStringCellValue()+"")).click();
		   driver.findElement(By.name(sheet.getRow(1).getCell(11).getStringCellValue()+"")).click();
		}
		public static void createAccountreport(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(6).getStringCellValue()+"")).click();
		    WebElement input=driver.findElement(By.name(sheet.getRow(1).getCell(7).getStringCellValue()+""));
		    input.sendKeys("8/28/2017");
		    WebElement input1=driver.findElement(By.name(sheet.getRow(1).getCell(8).getStringCellValue()+""));
		    input1.sendKeys("8/28/2017");
		    driver.findElement(By.id(sheet.getRow(1).getCell(9).getStringCellValue()+"")).click();
		    driver.findElement(By.name(sheet.getRow(1).getCell(10).getStringCellValue()+"")).click();
		   WebElement input2= driver.findElement(By.name(sheet.getRow(1).getCell(11).getStringCellValue()+""));
		   input2.sendKeys("new"); 
		   driver.findElement(By.name(sheet.getRow(1).getCell(12).getStringCellValue()+"")).click();
		   
		}
		public static void opprtunitiesDropdown(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    driver.findElement(By.id(sheet.getRow(1).getCell(6).getStringCellValue()+"")).click();
		}
		public static void createOpprtu(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    driver.findElement(By.name(sheet.getRow(1).getCell(6).getStringCellValue()+"")).click();

		    WebElement input1=driver.findElement(By.id(sheet.getRow(1).getCell(7).getStringCellValue()+""));
		    input1.sendKeys("rakul");
		    WebElement input2=driver.findElement(By.id(sheet.getRow(1).getCell(8).getStringCellValue()+""));
		    input2.sendKeys("Rahul");
		    WebElement dropdown=driver.findElement(By.id(sheet.getRow(1).getCell(10).getStringCellValue()+""));
		    dropdown.click();
		    Select select=new Select(dropdown);
		    //select.selectByValue(sheet.getRow(1).getCell(11).getStringCellValue()+"");
		    select.selectByVisibleText("Qualification");
		   
		   WebElement input3= driver.findElement(By.id(sheet.getRow(1).getCell(12).getStringCellValue()+""));
		   input3.sendKeys("me");
		}
		public static void stuckOpprtu(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    driver.findElement(By.linkText(sheet.getRow(1).getCell(6).getStringCellValue()+"")).click();
			
		}
		public static void quarterlySummary(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
			WebElement interdropdown=  driver.findElement(By.id(sheet.getRow(1).getCell(6).getStringCellValue()+""));
			Select s1=new Select(interdropdown);
			s1.selectByValue("curnext1");
			WebElement includedropdown=  driver.findElement(By.id(sheet.getRow(1).getCell(7).getStringCellValue()+""));
			Select s2=new Select(includedropdown);
			//s2.selectByValue("open");
			s2.selectByValue(sheet.getRow(1).getCell(8).getStringCellValue()+"");
			System.out.println("selected");
			driver.findElement(By.xpath(sheet.getRow(1).getCell(9).getStringCellValue()+"")).click();
			System.out.println("selected");
		}
		public static void leads1(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    driver.findElement(By.id(sheet.getRow(1).getCell(6).getStringCellValue()+"")).click();
		}
		public static void leads2(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    WebElement dropdown=driver.findElement(By.id(sheet.getRow(1).getCell(6).getStringCellValue()+""));
		    Select s1=new Select(dropdown);
		    s1.selectByValue(sheet.getRow(1).getCell(7).getStringCellValue()+"");
		    System.out.println("Go");	
		}
		public static void leadNew(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    driver.findElement(By.name(sheet.getRow(1).getCell(6).getStringCellValue()+"")).click();
		    WebElement input1=driver.findElement(By.id(sheet.getRow(1).getCell(7).getStringCellValue()+""));
		    input1.sendKeys(sheet.getRow(1).getCell(8).getStringCellValue()+"");
		    WebElement input2=driver.findElement(By.id(sheet.getRow(1).getCell(9).getStringCellValue()+""));
		    input2.sendKeys((sheet.getRow(1).getCell(10).getStringCellValue()+""));
		    driver.findElement(By.className(sheet.getRow(1).getCell(11).getStringCellValue()+"")).click();	
		}
		public static void newAccount(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    driver.findElement(By.name(sheet.getRow(1).getCell(6).getStringCellValue()+"")).click();
		    WebElement input1= driver.findElement(By.id(sheet.getRow(1).getCell(7).getStringCellValue()+""));
		    input1.sendKeys(sheet.getRow(1).getCell(8).getStringCellValue()+"");
		    WebElement input2= driver.findElement(By.id(sheet.getRow(1).getCell(9).getStringCellValue()+""));
		    input2.sendKeys(sheet.getRow(1).getCell(10).getStringCellValue()+"");
		    driver.findElement(By.name(sheet.getRow(1).getCell(11).getStringCellValue()+"")).click();
		}
		public static void myContact(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    WebElement dropdown= driver.findElement(By.name(sheet.getRow(1).getCell(6).getStringCellValue()+""));
		    Select s1=new Select(dropdown);
		    s1.selectByValue(sheet.getRow(1).getCell(7).getStringCellValue()+"");
		}
		public static void newView(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    driver.findElement(By.linkText(sheet.getRow(1).getCell(6).getStringCellValue()+"")).click();
		    WebElement input1=driver.findElement(By.id(sheet.getRow(1).getCell(7).getStringCellValue()+""));
		    input1.sendKeys(sheet.getRow(1).getCell(8).getStringCellValue()+"");
		    driver.findElement(By.name(sheet.getRow(1).getCell(9).getStringCellValue()+"")).click();
		}
		public static void newView1(String dt_path) throws IOException{
			/*Step 1: Get the XL Path*/
			File xlFile=new File(dt_path);
			
			/*Step2: Access the Xl File*/
			FileInputStream xlDoc=new FileInputStream(xlFile);
			
			
			/*Step3: Access the work book */
			HSSFWorkbook wb=new HSSFWorkbook(xlDoc);
			
			/* Access the SHEET*/
			HSSFSheet sheet=wb.getSheet("Sheet1");
			WebDriver driver=new FirefoxDriver();
			
			String s=sheet.getRow(1).getCell(0).getStringCellValue();
			driver.get(s);
			
			driver.findElement(By.id("username")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue()+"");
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue()+"");
			driver.findElement(By.id(sheet.getRow(1).getCell(3).getStringCellValue()+"")).click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.className(sheet.getRow(1).getCell(4).getStringCellValue()+"")).click();
		    driver.findElement(By.xpath(sheet.getRow(1).getCell(5).getStringCellValue()+"")).click();
		    driver.findElement(By.linkText(sheet.getRow(1).getCell(6).getStringCellValue()+"")).click();
		    WebElement input1=driver.findElement(By.id(sheet.getRow(1).getCell(7).getStringCellValue()+""));
		    input1.sendKeys(sheet.getRow(1).getCell(8).getStringCellValue()+"");
		    WebElement input2=driver.findElement(By.id(sheet.getRow(1).getCell(9).getStringCellValue()+""));
		    input2.sendKeys(sheet.getRow(1).getCell(10).getStringCellValue()+"");
		    driver.findElement(By.name(sheet.getRow(1).getCell(11).getStringCellValue()+"")).click();
			
		}
		

		
		
		
	}

