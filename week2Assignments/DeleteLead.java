package week2Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String leadNum;
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
		WebElement eleFindlead = driver.findElementByXPath("//a[text()='Find Leads']");
		eleFindlead.click();
		WebElement eleEmail = driver.findElementByXPath("//span[text()='Email']");
		eleEmail.click();
		WebElement textboxEmail = driver.findElementByXPath("//input[@name='emailAddress']");
		textboxEmail.sendKeys("rajesh.raju225@gmail.com");
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
		
		
		
		
		
		
		
	}

}
