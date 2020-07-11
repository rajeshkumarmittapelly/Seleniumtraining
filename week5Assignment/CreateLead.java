package week5Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.testing.base.ProjectSpecficMethodWithExcel;

public class CreateLead extends ProjectSpecficMethodWithExcel{
	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	}
	@Test(dataProvider = "ArrayData")
	public void TC001(String cName, String fName, String lName, String source, String revenueAnnual, String industryValue, String ownershipText, String formDescription, String marketingValue, String State, String email, String mobileNum){
		// TODO Auto-generated method stub
		
		WebElement eleLink = driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]");
		eleLink.click();
		WebElement eleLeadtab = driver.findElementByXPath("//a[(text()='Leads')]");
		eleLeadtab.click();
		WebElement eleCreatelead = driver.findElementByXPath("//a[(text()='Create Lead')]");
		eleCreatelead.click();
		WebElement eleCmpnyName = driver.findElementByXPath("(//input[@name='companyName'][1])[2]");
		eleCmpnyName.sendKeys(cName);
		WebElement eleFirstName = driver.findElementByXPath("(//input[@name='firstName'])[3]");
		eleFirstName.sendKeys(fName);
		WebElement eleLastName = driver.findElementByXPath("(//input[@name='lastName'])[3]");
		eleLastName.sendKeys(lName);
		WebElement dropdownSource = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdownoptions = new Select (dropdownSource);
		dropdownoptions.selectByValue(source);
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys(revenueAnnual);
		WebElement dropdownIndustry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdownoptionsIndustry = new Select (dropdownIndustry);
		dropdownoptionsIndustry.selectByValue(industryValue);
		WebElement dropdownOwneship = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdownoptionsOwneship = new Select (dropdownOwneship);
		dropdownoptionsOwneship.selectByVisibleText(ownershipText);
		driver.findElementById("createLeadForm_description").sendKeys(formDescription);
		WebElement dropdownMarketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdownoptionsMarketing = new Select (dropdownMarketing);
		dropdownoptionsMarketing.selectByIndex(Integer.parseInt(marketingValue));
		WebElement dropdownState = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dropdownoptionsState = new Select (dropdownState);
		dropdownoptionsState.selectByValue(State);
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(email);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(mobileNum);
		WebElement btnCreateLead = driver.findElementByXPath("(//input[@name='submitButton'])");
		btnCreateLead.click();
		driver.close();
		

	}

}
