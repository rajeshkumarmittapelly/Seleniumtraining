package week5Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.testing.base.ProjectSpecficMethodWithExcel;

public class EditLead extends ProjectSpecficMethodWithExcel{
	@BeforeTest
	public void setData() {
		excelFileName = "TC004";
	}
	@Test(dataProvider = "ArrayData")
	public void TC004(String companyNameValue, String eleCmpnyNameEditValue) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//driver.findElementByXPath("//*[@class='decorativeSubmit']").click();
		WebElement eleLink = driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]");
		eleLink.click();
		WebElement eleLeadtab = driver.findElementByXPath("//a[(text()='Leads')]");
		eleLeadtab.click();
		WebElement eleCreatelead = driver.findElementByXPath("//a[text()='Find Leads']");
		eleCreatelead.click();
		WebElement eleCmpnyName = driver.findElementByXPath("(//input[@name='companyName'])[2]");
		eleCmpnyName.sendKeys(companyNameValue);
		
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
		eleCmpnyNameEdit.sendKeys(eleCmpnyNameEditValue);
		WebElement eleEditSubmit = driver.findElementByXPath("//input[@name='submitButton' and @value='Update']");
		eleEditSubmit.click();
		
		driver.close();
		

	}
}
