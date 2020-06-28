package week4Classwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		//driver.switchTo().defaultContent();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Rajesh");
		alert.accept();
		//driver.switchTo().frame("iframeResult");
		String msg = driver.findElementByXPath("//p[@id='demo']").getText();
		System.out.println(msg);
		driver.switchTo().defaultContent();
		
		

	}

}
