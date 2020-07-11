package week5Assignment;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.testing.base.ProjectSpecficMethodWithExcel;

public class MergeLead extends ProjectSpecficMethodWithExcel{
	@BeforeTest
	public void setData() {
		excelFileName = "TC005";
	}
	@Test
	public void TC005() {
		// TODO Auto-generated method stub
		
		//driver.findElementByXPath("//*[@class='decorativeSubmit']").click();
		WebElement eleLink = driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]");
		eleLink.click();		
		WebElement eleContactstab = driver.findElementByXPath("//a[(text()='Contacts')]");
		eleContactstab.click();
		WebElement linkMergeCont = driver.findElementByXPath("//a[(text()='Merge Contacts')]");
		linkMergeCont.click();
		
		WebElement frmContactImage = driver.findElementByXPath("(//img[@alt='Lookup'])[1]");
		frmContactImage.click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println("Number of windows :" + windowHandles1.size());
		for (String string : windowHandles1) {
			System.out.println(string);
			driver.switchTo().window(string);
		}
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='linktext'])[1]")));
		
		if (driver.getTitle().contains("Find Contacts")) {
			driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		}
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String string : windowHandles2) {
			System.out.println(string);
			driver.switchTo().window(string);
		}
		if (driver.getTitle().contains("Merge Contacts")) {
			driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
					
		}
		Set<String> windowHandles3 = driver.getWindowHandles();
		System.out.println("Number of windows :" + windowHandles3.size());
		for (String string : windowHandles3) {
			System.out.println(string);
			driver.switchTo().window(string);
		}
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")));
		if (driver.getTitle().contains("Find Contacts")) {
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]").click();
		}
		
		Set<String> windowHandles4 = driver.getWindowHandles();
		for (String string : windowHandles4) {
			System.out.println(string);
			driver.switchTo().window(string);
		}
		driver.findElementByXPath("//a[text()='Merge']").click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
