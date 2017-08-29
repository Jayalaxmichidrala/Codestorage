package demo;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AutomationScripts tc=new AutomationScripts();
		tc.sfdcLoginwithinvalid("/Users/jtatikonda/Documents/Salesforce_All/Salesforce.xls");
		tc.sfdcLoginwithValid("/Users/jtatikonda/Documents/Salesforce_All/Login.xls");
		tc.errorMessage("/Users/jtatikonda/Documents/Salesforce_All/Login1.xls");
		tc.logOut("/Users/jtatikonda/Documents/Salesforce_All/Logout.xls");
		tc.developerConsole("/Users/jtatikonda/Documents/Salesforce_All/DeveloperConsole.xls");
		tc.input_post("/Users/jtatikonda/Documents/Salesforce_All/Input_post.xls");
		tc.fileUpload("/Users/jtatikonda/Documents/Salesforce_All/FileUpload.xls");
		tc.createAccount("/Users/jtatikonda/Documents/Salesforce_All/CreateAccount.xls");
		//tc.createAccountreport("/Users/jtatikonda/Documents/Salesforce_All/CreateAccount_report.xls");
		//tc.opprtunitiesDropdown("/Users/jtatikonda/Documents/Salesforce_All/Opprtunities_dropdown.xls");
		//tc.createOpprtu("/Users/jtatikonda/Documents/Salesforce_All/NewOpprtunity.xls");
		//tc.stuckOpprtu("/Users/jtatikonda/Documents/Salesforce_All/Stuckopprtu.xls");
		//tc.quarterlySummary("/Users/jtatikonda/Documents/Salesforce_All/Quarterly_Opprtu.xls");
		//tc.leads1("/Users/jtatikonda/Documents/Salesforce_All/Leads1.xls");
		  //tc.leads2("/Users/jtatikonda/Documents/Salesforce_All/Leads2.xls");
		//tc.leadNew("/Users/jtatikonda/Documents/Salesforce_All/LeadNew.xls");
		//tc.newAccount("/Users/jtatikonda/Documents/Salesforce_All/NewAccount.xls");
		//tc.myContact("/Users/jtatikonda/Documents/Salesforce_All/MyContact.xls");
		//tc.newView("/Users/jtatikonda/Documents/Salesforce_All/Newview_Contact.xls");
		tc.newView1("/Users/jtatikonda/Documents/Salesforce_All/Newview1.xls");
		

	}

}
