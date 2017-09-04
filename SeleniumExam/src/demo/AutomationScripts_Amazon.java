package demo;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationScripts_Amazon extends Reusablemethods_Amazon  {
	public static WebDriver driver;
	public static String result1;
	static String Actual;
	static String Listactual;
	static String helpLinks;
	//static String Alldropdownactual;
	// static WebDriverWait wait = new WebDriverWait(driver,30);
	static boolean findmoresolutiontextbox;

	public static void openConnection(String browserType)
	{
		//Launch browser
		if(browserType.equals("Firefox"))
		{
		System.out.println("InConnection");
			driver = new FirefoxDriver();
		}else if(browserType.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/jtatikonda/Desktop/Chromedriver/chromedriver");
			driver = new ChromeDriver();
		}
	}
	public static String searchandAdd(String browserType) throws IOException{
		try
		{
			startReport("Amazon_TestCase_1","/Users/jtatikonda/Documents/Amazon/");
			String orPath = "/Users/jtatikonda/Documents/Amazon/ObjectRepo_Amazon.xls";
			String tdPath = "/Users/jtatikonda/Documents/Amazon/AmazonTC_1.xls";
			readLocators(orPath);
			readTestdata(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				System.out.println("testcasessheet"+data[i][0]);
				String input=(String) data[i][1];
				String Expected=(String) data[i][2];
				System.out.println("step1");

				//Launch driver
				System.out.println(url);
				openConnection(browserType);
				WebDriverWait wait = new WebDriverWait(driver,800);
				driver.get(url);
				System.out.println("step1");
				

				//Locate Searchtext box
				
				setValue(1);
				By searchbox = findElement(locatortype,value);
				WebElement searchbox1 = driver.findElement(searchbox);
				inPut(searchbox1,input,obj_name);
				System.out.println("step2");
				
				//locate and click searchbutton
				setValue(2);
				By button=findElement(locatortype,value);
				WebElement searchbutton=driver.findElement(button);
				clickElement(searchbutton,obj_name);
				System.out.println("step3");
				
				//select iphone link
				setValue(3);
				By link=findElement(locatortype,value);
				WebElement selectlink=driver.findElement(link);
				clickElement(selectlink,obj_name);
				Thread.sleep(4000);
				System.out.println("step4");
				
				//locate and click addtocart button
				setValue(4);
				By cartbutton=findElement(locatortype,value);
				WebElement cartbutton1=driver.findElement(cartbutton);
				clickElement(cartbutton1,obj_name);
				System.out.println("step5");
				
				//click on no thanks button
				setValue(5);
				By nothanksbutton=findElement(locatortype,value);
				WebElement nothanksbutton1=driver.findElement(nothanksbutton);
				clickElement(nothanksbutton1,obj_name);
				System.out.println("step6");
				
				//locate and click addtocarticon
				setValue(6);
				Thread.sleep(300);
				By addtocart=findElement(locatortype,value);
				System.out.println("Before Step7");
				WebElement addtocart1= wait.until(ExpectedConditions.visibilityOfElementLocated(addtocart)) ;
				clickElement(addtocart1,obj_name);
				System.out.println("step7");
				//Thread.sleep(9000);
				
				//locate and click subtotal
				setValue(7);
				By subTotal=findElement(locatortype,value);
				WebElement subTotal1=wait.until(ExpectedConditions.visibilityOfElementLocated(subTotal));
				clickElement(subTotal1,obj_name);
				System.out.println("step8");
				
				//verify the result
				String actual=subTotal1.getText();
				if(Expected.equals(actual)){
					 System.out.println("pass");
					result1="Pass";
				}
				else{
					System.out.println("fail");
					result1="Fail";
				}
				Update_Report( result1, "searchandAdd",  "Execution Completed");
				driver.close();

			}			

}
		catch(Exception e){
			System.out.println(e);
			return "Fail";
		}
		
		bw.close();
		return result1;
	}
	public static String hover(String browserType) throws IOException{
		try
		{
			startReport("Amazon_TestCase_2","/Users/jtatikonda/Documents/Amazon/");
			String orPath = "/Users/jtatikonda/Documents/Amazon/ObjectRepo_Amazon.xls";
			String tdPath = "/Users/jtatikonda/Documents/Amazon/AmazonTC_1.xls";
			readLocators(orPath);
			readTestdata(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				System.out.println("testcasessheet"+data[i][0]);
				//String input=(String) data[i][1];
				String Expectedtext=(String) data[i][3];
				System.out.println("step1");

				//Launch driver
				System.out.println(url);
				openConnection( browserType);
				//imported wait and Actions class
				WebDriverWait wait = new WebDriverWait(driver,800);
				Actions actions=new Actions(driver);
				driver.get(url);
				System.out.println("step1");
				
				//locate and hover the departments
				setValue(8);
				By departments=findElement(locatortype,value);
				WebElement departments1=driver.findElement(departments);
				Thread.sleep(400);
				
				//locate and your amazon link
				setValue(9);
				By amazonlink=findElement(locatortype,value);
				WebElement amazonlink1=driver.findElement(amazonlink);
				Thread.sleep(3000);
				
				//locate and todaysdeals link
				setValue(10);
				By todaysdeals=findElement(locatortype,value);
				WebElement todaysdeals1=driver.findElement(todaysdeals);
				actions.moveToElement(departments1).build().perform();
				Thread.sleep(2000);
				actions.moveToElement(amazonlink1).build().perform();
				Thread.sleep(2000);
				actions.moveToElement(todaysdeals1).build().perform();
				
				//verify testcase
				String actualtext=todaysdeals1.getText();
				if(Expectedtext.equals(actualtext)){
					System.out.println("Pass");
					 result1="Pass";
				}
				else{
					 result1="Fail";
					 return "Fail";
				}
				Update_Report( result1, "Hover testcase",  "Execution Completed");
				driver.close();
		
	}
	
}
		catch(Exception e){
			System.out.println(e);
		}
		bw.close();
		return result1;
	}

	public static String departmentsDropdown(String browserType) throws IOException{
		try
		{
			startReport("Amazon_TestCase_3","/Users/jtatikonda/Documents/Amazon/");
			String orPath = "/Users/jtatikonda/Documents/Amazon/ObjectRepo_Amazon.xls";
			String tdPath = "/Users/jtatikonda/Documents/Amazon/AmazonTC_1.xls";
			readLocators(orPath);
			readTestdata(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				System.out.println("testcasessheet"+data[i][0]);
				System.out.println("step1");
				String DepartmentsExpected=(String) data[i][4];

				//Launch driver
				System.out.println(url);
				openConnection(browserType);
				//imported wait and Actions class
				WebDriverWait wait = new WebDriverWait(driver,800);
				Actions actions=new Actions(driver);
				driver.get(url);
				System.out.println("step2");
				
				//hover over the Departments
				setValue(11);
				By Departments=findElement(locatortype,value);
				WebElement Departments1=driver.findElement(Departments);
				actions.moveToElement(Departments1).build().perform();
				Thread.sleep(2000);
				System.out.println("step3");
				
				//Storing the dropdown values in list
				setValue(12);
				// List<WebElement> spans = driver.findElements(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]"));
				 System.out.println("list");
				 By spans=findElement(locatortype,value);
				 System.out.println("list");
				 List<WebElement> spans1 = driver.findElements(spans);
				  System.out.println(spans1.size());
				  System.out.println("step4");
				  
				  for(WebElement ele:spans1){
					  String Actual=(ele.getText()+",");
					  System.out.println("inloop");

				}
				  System.out.println(Actual);
				  System.out.println(DepartmentsExpected);
				  Actual =Actual.replaceAll("\n",",");
				  if(DepartmentsExpected.equals(Actual)){
					  System.out.println("Pass");
					  result1="Pass";
				  }
				  else{
					  System.out.println("Fail");
					  result1="Fail";
				  }
				  Update_Report( result1, " departmentsDropdown",  "Execution Completed");
					driver.close();
				}
							
	
}
		catch(Exception e){
		System.out.println(e);
		return "Fail";
		}
		
		bw.close();
		return result1;
		}
	
	public static String accountAndList(String browserType) throws IOException{
		try
		{
			startReport("Amazon_TestCase_4","/Users/jtatikonda/Documents/Amazon/");
			String orPath = "/Users/jtatikonda/Documents/Amazon/ObjectRepo_Amazon.xls";
			String tdPath = "/Users/jtatikonda/Documents/Amazon/AmazonTC_1.xls";
			readLocators(orPath);
			readTestdata(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				System.out.println("testcasessheet"+data[i][0]);
				String AccountsAndListExpected=(String) data[i][5];
				System.out.println("step1");
				
				//Launch browser
				System.out.println(url);
				openConnection(browserType);
				//imported wait and Actions class
				WebDriverWait wait = new WebDriverWait(driver,800);
				Actions actions=new Actions(driver);
				driver.get(url);
				System.out.println("step2");
				
				//locate Accounts and List dropdown
				 setValue(13);
				 By AccountandList=findElement(locatortype,value);
				 WebElement AccountandList1=wait.until(ExpectedConditions.visibilityOfElementLocated(AccountandList));
				 actions.moveToElement(AccountandList1).build().perform();
				 Thread.sleep(2000);
				 System.out.println("step3");
				 
				 //storing the dropdown values
				 setValue(14);
				 By AccountandListDropdown=findElement(locatortype,value);
				 List<WebElement> spans1 = driver.findElements(AccountandListDropdown);
				 System.out.println("step4");
				 for(WebElement ite:spans1)
				 {
						Listactual=(ite.getText()+",");
						 System.out.println("step5");
				 }	
				 System.out.println(Listactual);
				 Listactual=Listactual.replaceAll("\n", " ");
				 System.out.println(Listactual);
				 System.out.println(AccountsAndListExpected);
				 if(AccountsAndListExpected.equals(Listactual)){
					 System.out.println("Pass");
					 result1="Pass";
				 }
				 else{
					 System.out.println("Fail");
					 result1="Fail";
				 }
				 Update_Report( result1, "Accounts and List dropdown",  "Execution Completed");
					driver.close();
		
	
		}
		}
			catch(Exception e){
			System.out.println(e);
			return "Fail";
			}
		bw.close();
		return result1;
}
	public static String allDropdown(String browserType) throws IOException{
		try
		{
			startReport("Amazon_TestCase_5","/Users/jtatikonda/Documents/Amazon/");
			String orPath = "/Users/jtatikonda/Documents/Amazon/ObjectRepo_Amazon.xls";
			String tdPath = "/Users/jtatikonda/Documents/Amazon/AmazonTC_1.xls";
			readLocators(orPath);
			readTestdata(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				System.out.println("testcasessheet"+data[i][0]);

				System.out.println("step1");
				
				//Launch browser
				System.out.println(url);
				openConnection(browserType);
				//imported wait and Actions class
				WebDriverWait wait = new WebDriverWait(driver,400);
				driver.get(url);
				System.out.println("step2");
				
				//locate and click All dropdown
				setValue(15);
				 By Alldropdown=findElement(locatortype,value);
				 WebElement Alldropdown1=driver.findElement(Alldropdown);
				 clickElement(Alldropdown1,obj_name);
				// Thread.sleep(9000);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

				 Select select=new Select(Alldropdown1);
				 System.out.println("ddddd");
				 
				 //selecting all options
				List<WebElement> all=select.getOptions();
				System.out.println(all.size());
				for(int j=0;j<all.size();j=j+1){
				String Alldropdownactual=all.get(j).getText();
				System.out.println(Alldropdownactual);
					
				}
				//selecting the clothing shoes $jewellery
				 select.selectByVisibleText("Clothing, Shoes & Jewelry");
		
	}
	}
		catch(Exception e){
			System.out.println(e);
			return "Fail";
		}
		bw.close();
		return result1;
	}
	public static String checktheCart( String browserType) throws IOException{
		try
		{
			startReport("Amazon_TestCase_6","/Users/jtatikonda/Documents/Amazon/");
			String orPath = "/Users/jtatikonda/Documents/Amazon/ObjectRepo_Amazon.xls";
			String tdPath = "/Users/jtatikonda/Documents/Amazon/AmazonTC_1.xls";
			readLocators(orPath);
			readTestdata(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				System.out.println("testcasessheet"+data[i][0]);
				String input=(String) data[i][1];
				String DeleteitemExpected=(String) data[i][7];
				System.out.println("step1");

				//Launch driver
				System.out.println(url);
				openConnection(browserType);
				WebDriverWait wait = new WebDriverWait(driver,800);
				driver.get(url);
				System.out.println("step1");
				

				//Locate Searchtext box
				
				setValue(1);
				By searchbox = findElement(locatortype,value);
				WebElement searchbox1 = driver.findElement(searchbox);
				inPut(searchbox1,input,obj_name);
				System.out.println("step2");
				
				//locate and click searchbutton
				setValue(2);
				By button=findElement(locatortype,value);
				WebElement searchbutton=driver.findElement(button);
				clickElement(searchbutton,obj_name);
				System.out.println("step3");
				
				//select iphone link
				setValue(3);
				By link=findElement(locatortype,value);
				WebElement selectlink=driver.findElement(link);
				clickElement(selectlink,obj_name);
				Thread.sleep(4000);
				System.out.println("step4");
				
				//locate and click addtocart button
				setValue(4);
				By cartbutton=findElement(locatortype,value);
				WebElement cartbutton1=driver.findElement(cartbutton);
				clickElement(cartbutton1,obj_name);
				System.out.println("step5");
				
				//click on no thanks button
				setValue(5);
				By nothanksbutton=findElement(locatortype,value);
				WebElement nothanksbutton1=driver.findElement(nothanksbutton);
				clickElement(nothanksbutton1,obj_name);
				System.out.println("step6");
				
				//locate and click addtocarticon
				setValue(6);
				Thread.sleep(300);
				By addtocart=findElement(locatortype,value);
				System.out.println("Before Step7");
				//WebElement addtocart1= wait.until(ExpectedConditions.visibilityOfElementLocated(addtocart)) ;
				WebElement addtocart1= driver.findElement(addtocart) ;
				Thread.sleep(9000);
				clickElement(addtocart1,obj_name);
				System.out.println("step7");
				//Thread.sleep(9000);
				
				//locate and click the delete button
				setValue(16);
				By delete=findElement(locatortype,value);
				WebElement delete1=driver.findElement(delete);
				clickElement(delete1,obj_name);
				System.out.println("step8");
				Thread.sleep(9000);
				
				//locate the Subtotal area
				setValue(17);
				By subtotalAfterDelete=findElement(locatortype,value);
				WebElement subtotalAfterDelete1=wait.until(ExpectedConditions.visibilityOfElementLocated(subtotalAfterDelete));
				clickElement(subtotalAfterDelete1,obj_name);
				System.out.println("step9");
				String Deleteitemactual=subtotalAfterDelete1.getText();
				System.out.println(Deleteitemactual);
				System.out.println("step10");
				//verifying the text
				if(DeleteitemExpected.equals(Deleteitemactual)){
					System.out.println("Pass");
					result1="Pass";
					System.out.println("step11");
				}
				else{
					System.out.println("Fail");
					result1="Fail";
				}
				 Update_Report( result1, "Check Cart After Deleting Item",  "Execution Completed");
					driver.close();
	}
			
}
		catch(Exception e){
			System.out.println(e);
			return "Fail";
		}
		bw.close();
		return result1;
	}
	public static String help(String browserType) throws IOException{
		try
		{
			startReport("Amazon_TestCase_7","/Users/jtatikonda/Documents/Amazon/");
			String orPath = "/Users/jtatikonda/Documents/Amazon/ObjectRepo_Amazon.xls";
			String tdPath = "/Users/jtatikonda/Documents/Amazon/AmazonTC_1.xls";
			readLocators(orPath);
			readTestdata(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				System.out.println("testcasessheet"+data[i][0]);
				System.out.println("step1");
				String HelpMessageExpected=(String) data[i][8];

				//Launch driver
				System.out.println(url);
				openConnection(browserType);
				WebDriverWait wait = new WebDriverWait(driver,800);
				driver.get(url);
				System.out.println("step2");
				
				//locate and click on help
				setValue(18);
				By help=findElement(locatortype,value);
				WebElement help1=driver.findElement(help);
				clickElement(help1,obj_name);
				System.out.println("step3");
				
				//locate and click on helptextmessage
				setValue(19);
				By helpMessage=findElement(locatortype,value);
				WebElement helpMessage1=driver.findElement(helpMessage);
				clickElement(helpMessage1,obj_name);
				System.out.println("step4");
				
				//verifying the HelpMessage
				String helpActual=helpMessage1.getText();
				if(HelpMessageExpected.equals(helpActual)){
					System.out.println("Pass");
					result1="Pass";
					System.out.println("step5");
				}
				else{
					System.out.println("Fail");
					result1="Fail";
				}
				
				//Links on the Help page
				setValue(20);
				By helplink=findElement(locatortype,value);
				WebElement helplinks1=driver.findElement(helplink);
				List<WebElement> li=helplinks1.findElements(By.tagName("a"));
				System.out.println("step6");
				for(int k=0;k<li.size();k=k+1){
					String helpLinks=li.get(i).getText();
				}
				System.out.println(helpLinks);
				
				//Locate FindmoreSolutions textbox
				setValue(21);
				By findmoresolution=findElement(locatortype,value);
				WebElement findmoresolution1=driver.findElement(findmoresolution);
				clickElement(findmoresolution1,obj_name);
				System.out.println("step8");
				
				//verifying the textbox display
			 findmoresolutiontextbox=findmoresolution1.isDisplayed();
			 if(findmoresolutiontextbox==true){
				 System.out.println("Pass");
				 result1="Pass";
			 }
			 else{
				 System.out.println("Fail");
				 result1="Fail";
			 }
			 Update_Report( result1, "Check the Helplinks and Textboxes and Message",  "Execution Completed");
				driver.close();			
		
	}
}
		catch(Exception e){
			System.out.println(e);
			return "Fail";
		}
		bw.close();
		return result1;
	}
	public static String bookSearch(String browserType) throws IOException{
		try
		{
			startReport("Amazon_TestCase_8","/Users/jtatikonda/Documents/Amazon/");
			String orPath = "/Users/jtatikonda/Documents/Amazon/ObjectRepo_Amazon.xls";
			String tdPath = "/Users/jtatikonda/Documents/Amazon/AmazonTC_1.xls";
			readLocators(orPath);
			readTestdata(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				System.out.println("testcasessheet"+data[i][0]);
				String Bookinput=(String) data[i][9];
				System.out.println("step1");
				String ProceedtoCheckoutExpected=(String) data[i][10];

				//Launch driver
				System.out.println(url);
				openConnection(browserType);
				WebDriverWait wait = new WebDriverWait(driver,800);
				driver.get(url);
				System.out.println("step1");
				

				//Locate Searchtext box
				
				setValue(1);
				By bookinput = findElement(locatortype,value);
				WebElement bookinput1 = driver.findElement(bookinput);
				inPut(bookinput1,Bookinput,obj_name);
				System.out.println("step2");
				Thread.sleep(800);
				
				//locate and click searchbutton
				setValue(2);
				By button=findElement(locatortype,value);
				WebElement searchbutton=driver.findElement(button);
				clickElement(searchbutton,obj_name);
				System.out.println("step3");
				
				//locate the desired link and click
				setValue(22);
				By booklink=findElement(locatortype,value);
				WebElement booklink1=driver.findElement(booklink);
				clickElement(booklink1,obj_name);
				System.out.println("step4");
				
				//locate the Quantity box
				setValue(23);
				By noofBooks=findElement(locatortype,value);
				WebElement quantity=driver.findElement(noofBooks);
				clickElement(quantity,obj_name);
				System.out.println("step5");
				
				//select the 5 from dropdown
				setValue(24);
				By Quantitydropdown=findElement(locatortype,value);
				WebElement Quantitydropdown1=driver.findElement(Quantitydropdown);
				clickElement(Quantitydropdown1,obj_name);
				System.out.println("step6");
				
				//locate and click AddtoCartButton
				setValue(25);
				By BookAddtoCartButton=findElement(locatortype,value);
				WebElement BookAddtoCartButton1=driver.findElement(BookAddtoCartButton);
				clickElement(BookAddtoCartButton1,obj_name);
				System.out.println("step7");
				
				//locate and verifying the quantity
				setValue(26);
				By checkout=findElement(locatortype,value);
				WebElement checkout1=driver.findElement(checkout);
				String Proceed_checkoutbuttonActual=checkout1.getText();
				System.out.println(Proceed_checkoutbuttonActual);

				//validating
				if(ProceedtoCheckoutExpected.equals(Proceed_checkoutbuttonActual)){
					System.out.println("Pass");
					result1="Pass";
				}
				else{
					System.out.println("Fail");
					result1="Fail";
				}
				 Update_Report( result1, "Book Search and validating Quantity",  "Execution Completed");
					driver.close();		
		
	}
}
		catch(Exception e){
			System.out.println(e);
			return "Fail";
		}
		bw.close();
		return result1;
	}
	public static String verifySuggestions(String browserType) throws IOException{
		try
		{
			startReport("Amazon_TestCase_9","/Users/jtatikonda/Documents/Amazon/");
			String orPath = "/Users/jtatikonda/Documents/Amazon/ObjectRepo_Amazon.xls";
			String tdPath = "/Users/jtatikonda/Documents/Amazon/AmazonTC_1.xls";
			readLocators(orPath);
			readTestdata(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				System.out.println("testcasessheet"+data[i][0]);
				System.out.println("step1");
				String input=(String) data[i][1];
				String SuggestionsExpected=(String) data[i][11];
			

				//Launch driver
				System.out.println(url);
				openConnection(browserType);
				WebDriverWait wait = new WebDriverWait(driver,800);
				driver.get(url);
				System.out.println("step1");
				
				//locate searchtextbox
				setValue(1);
				By searchbox = findElement(locatortype,value);
				WebElement searchbox1 = driver.findElement(searchbox);
				inPut(searchbox1,input,obj_name);
				System.out.println("step2");
				
				setValue(2);
				By button=findElement(locatortype,value);
				WebElement searchbutton=driver.findElement(button);
				clickElement(searchbutton,obj_name);
				System.out.println("step3");
				
				setValue(27);
				By suggestions=findElement(locatortype,value);
				WebElement suggestions1=driver.findElement(suggestions);
				
				String suggestionsTextActual= suggestions1.getText();
				suggestionsTextActual=suggestionsTextActual.replaceAll("\n", " ");
				System.out.println(suggestionsTextActual);
				//System.out.print("after");

				//validate text
				//System.out.println(SuggestionsExpected);
				if(SuggestionsExpected.equals(suggestionsTextActual)){
					
					System.out.println("Pass");
					result1 ="Pass";
				}
				else{
					System.out.println("Fail");
					result1 ="Fail";
				}
				System.out.print("after");
				Update_Report( result1, "verifySuggestions",  "Execution Completed");
				 System.out.println("after");
				
				 driver.close();	
				
	}
}
		catch(Exception e){
			System.out.println(e);
			return "Fail";
		
	}
	bw.close();
	return result1;
}
}
	
		
		
