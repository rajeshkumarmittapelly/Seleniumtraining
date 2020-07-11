package week5Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.testing.base.ProjectSpecficMethodWithExcel;

public class DuplicateLead extends ProjectSpecficMethodWithExcel{
	@BeforeTest
	public void setData() {
		excelFileName = "TC003";
	}
	@Test(dataProvider = "ArrayData")
	public void TC003(String phoneNum) throws InterruptedException {
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoneNum);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByName("submitButton").click();
		driver.close();
}
}






