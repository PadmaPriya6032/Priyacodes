package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);				
	}
	
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Leads']")
	private WebElement eleleadsbtn;
	public MyLeadsPage clickleadsbtn() {
		click(eleleadsbtn);
		return new MyLeadsPage(driver, test);
	}
	
		
	
	
	
	
	
	
	
	
	

}
