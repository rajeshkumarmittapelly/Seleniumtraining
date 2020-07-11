package week5Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.testing.base.ProjectSpecficMethodWithExcel;

public class DeleteLead extends ProjectSpecficMethodWithExcel{
	@BeforeTest
	public void setData() {
		excelFileName = "TC002";
	}
	@Test(dataProvider = "ArrayData")
	public void TC002(String email ) throws InterruptedException {
		// TODO Auto-generated method stub
		String leadNum;
		
		WebElement eleLink = driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]");
		eleLink.click();
		WebElement eleLeadtab = driver.findElementByXPath("//a[(text()='Leads')]");
		eleLeadtab.click();
		WebElement eleFindlead = driver.findElementByXPath("//a[text()='Find Leads']");
		eleFindlead.click();
		WebElement eleEmail = driver.findElementByXPath("//span[text()='Email']");
		eleEmail.click();
		WebElement textboxEmail = driver.findElementByXPath("//input[@name='emailAddress']");
		textboxEmail.sendKeys(email);
		WebElement btnFindLeads = driver.findElementByXPath("//button[text()='Find Leads']");
		btnFindLeads.click();
		Thread.sleep(2000);
		WebElement eleLeadnumber = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		leadNum = eleLeadnumber.getText();
		System.out.println(leadNum);
		eleLeadnumber.click();
		WebElement eleDelete = driver.findElementByXPath("//a[@class='subMenuButtonDangerous' and text()='Delete']");
		eleDelete.click();
		Thread.sleep(4000);
		/*eleFindlead.click();
		 when am using this i am getting stale element exception. Hence re-defining the element again.
		 */
		WebElement eleFindlead2 = driver.findElementByXPath("//a[text()='Find Leads']");
		eleFindlead2.click();
		
		WebElement txtboxleadId = driver.findElementByXPath("//input[@name='id']");
		txtboxleadId.sendKeys(leadNum);
		
		WebElement btnFindLeads2 = driver.findElementByXPath("//button[text()='Find Leads']");
		btnFindLeads2.click();
		Thread.sleep(2000);
		WebElement msgNoRecords = driver.findElementByXPath("//div[@class='x-toolbar x-small-editor']/div");
		String msg = msgNoRecords.getText();
		System.out.println("Message is matching? "+msg.equalsIgnoreCase("No records to display"));
		driver.close();
		
		
		
		
		
		
	}

}
