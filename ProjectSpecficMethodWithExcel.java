package com.leaftaps.testing.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadingData;

public class ProjectSpecficMethodWithExcel {
	public ChromeDriver driver;
	public String excelFileName;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void openApp(String url,String username, String password) {
		System.out.println("Before Method started");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement eleUserName = driver.findElementByXPath("//input[@id='username']");
		eleUserName.sendKeys(username);
		WebElement elePasswrd = driver.findElementByXPath("//input[@id='password']");
		elePasswrd.sendKeys(password);
		WebElement btnSubmit = driver.findElementByXPath("//input[@value='Login']");
		btnSubmit.click();
		System.out.println("Before Method Ended");
	}
	@AfterMethod
	public void closeApp() {
		System.out.println("After Method started");
		driver.close();
		System.out.println("After Method Ended");
	}
	@DataProvider(name = "ArrayData")
	public String[][] sendData() throws IOException{
		String[][] array = ReadingData.readExcelData(excelFileName);	
		return array;
	}
	
}
