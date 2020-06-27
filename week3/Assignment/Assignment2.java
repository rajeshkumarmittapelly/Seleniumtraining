package week3.Assignment;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//table[@id='tableTopMenu']/tbody/tr[1]/td[6]/input").click();
		Thread.sleep(3000);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("New Delhi", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("Mumbai Central",Keys.TAB);
		Thread.sleep(3000);
		//driver.findElementById("(//div[@class='autocomplete'])[2]/div[1]").click();
		//driver.findElementByXPath("//table[@id='tableTopMenu']/tbody/tr[1]/td[6]/input").click();
		//driver.findElementById("buttonFromTo").click();
		Thread.sleep(3000);
		List<WebElement> trainList = driver.findElementsByXPath("//table[@class ='DataTable TrainList TrainListHeader']//tr/td[2]/a");
		Set<String> setTrainsFrom = new HashSet<String>();
		System.out.println("Size of List: "+trainList.size());
		System.out.println("***********Complete train list displaying in UI***********");
		for ( WebElement ele: trainList) {
			System.out.println(ele.getText());
			setTrainsFrom.add(ele.getText());
		}
		
		System.out.println("Set size:"+setTrainsFrom.size());
		if (trainList.size()==setTrainsFrom.size()) {
			System.out.println("There are no duplicate train names in the UI");
			
		}
		else {
			System.out.println("There are duplicate train names in the UI");
		}
		
		
		

	}

}
