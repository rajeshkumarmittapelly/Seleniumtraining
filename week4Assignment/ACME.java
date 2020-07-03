package week4Assignment;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ACME {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");		
		driver.findElementByName("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementByName("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElementByXPath("//button[text()=' Vendors']"))
		.moveToElement(driver.findElementByXPath("//a[text()='Search for Vendor']"))
		.click()
		.perform();
		
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").sendKeys("Blue Lagoon");
		WebElement ele = driver.findElementByXPath("//table[@class='table']");
		List<WebElement> eachRow = ele.findElements(By.tagName("tr"));
		for (int i = 1; i <eachRow.size(); i++) {
			WebElement spcRow = eachRow.get(i);
			List<WebElement> eachColumns   = spcRow.findElements(By.tagName("td"));
			System.out.println("Vendor Name ="+eachColumns.get(0).getText()+" And Vendor Country Name="+eachColumns.get(4).getText());
		}
		Thread.sleep(3000);
		driver.findElementByLinkText("Log Out").click();
		driver.close();

	}

}
