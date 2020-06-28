package week4Classwork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele = driver.findElementById("table_id");
		List<WebElement> eachRow = ele.findElements(By.tagName("tr"));
		for (WebElement webElement : eachRow) {
			WebElement spcRow = webElement;
			List<WebElement> eachColumns   = spcRow.findElements(By.tagName("td"));
			for (WebElement webElement2 : eachColumns) {
				System.out.print(webElement2.getText()+" | ");
			}
			System.out.println();
			
		}
		

	}

}
