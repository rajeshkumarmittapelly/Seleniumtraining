package week4Assignment;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZoomCar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai");		
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("(//div[text()='Popular Pick-up points']/following-sibling::div)[1]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='days']/div[2]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.findElementByXPath("//div[@class='days']/div[2]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(3000);
		List<WebElement> vechiclesName=driver.findElementsByXPath("//div[@class='details']/h3");
		System.out.println(vechiclesName.size());
		List<WebElement> vehicleCost=driver.findElementsByXPath("//div[@class='price']");
		System.out.println(vehicleCost.size());
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < vehicleCost.size(); i++) {
			
			map.put(vechiclesName.get(i).getText(), Integer.parseInt(vehicleCost.get(i).getText().replaceAll("[^\\d]", "")));
			
		}
		
		int maxprice = Collections.max(map.values());
		String maxpriceCarName =""; 
		
		for(Entry<String, Integer> eachEntry: map.entrySet()) {
			if (eachEntry.getValue()==maxprice) {
				maxpriceCarName = eachEntry.getKey();
				
				System.out.println(eachEntry.getKey()+"----"+ eachEntry.getValue());
			}
		}
		System.out.println(maxpriceCarName);
		for (int i = 0; i < vechiclesName.size(); i++) {
			
			if(vechiclesName.get(i).getText().equalsIgnoreCase(maxpriceCarName)) {
				System.out.println("Carname is matching");
				
				if(Integer.parseInt(vehicleCost.get(i).getText().replaceAll("[^\\d]", ""))==maxprice)
			{
					System.out.println("Carprice is matching");
				driver.findElementByXPath("(//div[@class='car-amount'])["+i+"]/button").click();
			}
			}
			
		}
		driver.close();

	}

}
