package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "Create Lead (Positive)";
		testDescription = "Create Lead";
		category= "Sanity";
		authors	="Priya";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord, String cName, String fName, String lName, String source) {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFAlnk()
		.clickleadsbtn()
		.clickcrlead()
		.enterCmpName(cName)
		.enterFName(fName)
		.enterLName(lName)
		.selSource(source)
		.clickCrLead()
		.verifyCmpName(cName);
		
		
		
		
		
		
	}

}
