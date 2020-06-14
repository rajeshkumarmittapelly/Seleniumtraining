package week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2Classwork1 {

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
		eleCmpnyName.sendKeys("TestLeaf");
		WebElement eleFirstName = driver.findElementByXPath("(//input[@name='firstName'])[3]");
		eleFirstName.sendKeys("Rajeshkumar");
		WebElement eleLastName = driver.findElementByXPath("(//input[@name='lastName'])[3]");
		eleLastName.sendKeys("mittapelly");
		WebElement btnCreateLead = driver.findElementByXPath("(//input[@name='submitButton'])");
		btnCreateLead.click();
		//driver.close();
		System.out.println(driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText());

	}

}
