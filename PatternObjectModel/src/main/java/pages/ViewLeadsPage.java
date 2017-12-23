package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods{
	
	public ViewLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);				
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement elecmpname;
	
	public ViewLeadsPage verifyCmpName(String cName) {
		verifyPartialText(elecmpname, cName);
		
		
		return this;
		
	}
	
	
		
	
	

}
