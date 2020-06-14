package week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElementById("username");
		eleUserName.sendKeys("Demosalesmanager");
		WebElement elePasswrd = driver.findElementById("password");
		elePasswrd.sendKeys("crmsfa");
		WebElement btnSubmit = driver.findElementByClassName("decorativeSubmit");
		btnSubmit.click();
		//driver.findElementByXPath("//*[@class='decorativeSubmit']").click();
		WebElement eleLink = driver.findElementByLinkText("CRM/SFA");
		eleLink.click();
		WebElement eleLeadtab = driver.findElementByLinkText("Leads");
		eleLeadtab.click();
		WebElement eleCreatelead = driver.findElementByLinkText("Create Lead");
		eleCreatelead.click();
		WebElement eleCmpnyName = driver.findElementById("createLeadForm_companyName");
		eleCmpnyName.sendKeys("TestLeaf");
		WebElement eleFirstName = driver.findElementById("createLeadForm_firstName");
		eleFirstName.sendKeys("Rajeshkumar");
		WebElement eleLastName = driver.findElementById("createLeadForm_lastName");
		eleLastName.sendKeys("mittapelly");
		WebElement btnCreateLead = driver.findElementByName("submitButton");
		btnCreateLead.click();
		driver.close();
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());

	}

}
