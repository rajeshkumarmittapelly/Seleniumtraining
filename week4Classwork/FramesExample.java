package week4Classwork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[@id='Click']").click();
		System.out.println(driver.findElementByXPath("//button[@id='Click']").getText());
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElementById("Click1").click();
		System.out.println(driver.findElementById("Click1").getText());
		driver.switchTo().defaultContent();
		List<WebElement> numFrames = driver.findElementsByXPath("//iframe");
		System.out.println("Number fo frames : "+numFrames.size());	

	}

}
