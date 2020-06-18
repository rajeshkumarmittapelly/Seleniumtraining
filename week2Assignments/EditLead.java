package week2Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement eleCreatelead = driver.findElementByXPath("//a[text()='Find Leads']");
		eleCreatelead.click();
		WebElement eleCmpnyName = driver.findElementByXPath("(//input[@name='companyName'])[2]");
		eleCmpnyName.sendKeys("TestLeafRajeshMittapelly");
		
		WebElement btnFindLeads = driver.findElementByXPath("//button[text()='Find Leads']");
		btnFindLeads.click();
		Thread.sleep(2000);
		WebElement eleLeadnumber = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		eleLeadnumber.click();
		
		WebElement eleEdit = driver.findElementByXPath("//a[@class='subMenuButton' and text()='Edit']");
		eleEdit.click();
		WebElement eleCmpnyNameEdit = driver.findElementById("updateLeadForm_companyName");
		
		System.out.println(eleCmpnyNameEdit.getAttribute("value"));
		eleCmpnyNameEdit.clear();
		eleCmpnyNameEdit.sendKeys("TestLeafRajeshMittapelly1");
		WebElement eleEditSubmit = driver.findElementByXPath("//input[@name='submitButton' and @value='Update']");
		eleEditSubmit.click();
		//input[@name='submitButton' and @value='Update']
		

	}
}
