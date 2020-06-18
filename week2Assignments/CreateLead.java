package week2Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElementByXPath("//input[@id='username']");
		eleUserName.sendKeys("Demosalesmanager");
		WebElement elePasswrd = driver.findElementByXPath("//input[@id='password']");
		elePasswrd.sendKeys("crmsfa");
		WebElement btnSubmit = driver.findElementByXPath("//input[@value='Login']");
		btnSubmit.click();
		//driver.findElementByXPath("//*[@class='decorativeSubmit']").click();
		WebElement eleLink = driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]");
		eleLink.click();
		WebElement eleLeadtab = driver.findElementByXPath("//a[(text()='Leads')]");
		eleLeadtab.click();
		WebElement eleCreatelead = driver.findElementByXPath("//a[(text()='Create Lead')]");
		eleCreatelead.click();
		WebElement eleCmpnyName = driver.findElementByXPath("(//input[@name='companyName'][1])[2]");
		eleCmpnyName.sendKeys("TestLeafRajeshMittapelly");
		WebElement eleFirstName = driver.findElementByXPath("(//input[@name='firstName'])[3]");
		eleFirstName.sendKeys("Rajeshkumar");
		WebElement eleLastName = driver.findElementByXPath("(//input[@name='lastName'])[3]");
		eleLastName.sendKeys("mittapelly");
		WebElement dropdownSource = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdownoptions = new Select (dropdownSource);
		dropdownoptions.selectByValue("LEAD_EMPLOYEE");
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("140000");
		WebElement dropdownIndustry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdownoptionsIndustry = new Select (dropdownIndustry);
		dropdownoptionsIndustry.selectByValue("IND_SOFTWARE");
		WebElement dropdownOwneship = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdownoptionsOwneship = new Select (dropdownOwneship);
		dropdownoptionsOwneship.selectByVisibleText("S-Corporation");
		driver.findElementById("createLeadForm_description").sendKeys("Selenium Automation Tester");
		WebElement dropdownMarketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdownoptionsMarketing = new Select (dropdownMarketing);
		dropdownoptionsMarketing.selectByIndex(6);
		WebElement dropdownState = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dropdownoptionsState = new Select (dropdownState);
		dropdownoptionsState.selectByValue("TX");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("rajesh.raju225@gmail.com");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9962066944");
		WebElement btnCreateLead = driver.findElementByXPath("(//input[@name='submitButton'])");
		btnCreateLead.click();
		

	}

}
