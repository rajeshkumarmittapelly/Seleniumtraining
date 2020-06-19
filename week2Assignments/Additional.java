package week2Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Additional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@id='home']").click();
		driver.findElementByXPath("//*[text()='Button']/following-sibling::img").click();
		System.out.println("Position (x & y coordinators): "+driver.findElementByXPath("//button[text()='Get Position']").getLocation());
		System.out.println("Background Color: "+driver.findElementByXPath("//button[@id='color']").getCssValue("background-color"));
		System.out.println("Size ( H & W) of the Element: "+driver.findElementByXPath("//button[@id='size']").getSize());
		
		
		driver.findElementByXPath("//button[@id='home']").click();
		driver.findElementByXPath("//*[text()='HyperLink']/following-sibling::img").click();
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").click();
		driver.findElementByXPath("//*[text()='HyperLink']/following-sibling::img").click();
		
		System.out.println("Link navigates to: "+driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href"));
		driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
		if(driver.getPageSource().contains("Not Found")){
			System.out.println("Link is broken");
		}
		else {
			System.out.println("Link is not Broken");
		}
		driver.navigate().back();
		
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
		driver.findElementByXPath("//*[text()='HyperLink']/following-sibling::img").click();
		System.out.println(+driver.findElementsByXPath("//a").size()+" Links are aviable in this page");
		
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
		driver.findElementByXPath("//*[text()='Radio Button']/following-sibling::img").click();
		driver.findElementByXPath("//input[@id='yes']").click();
		driver.findElementByXPath("//input[@name='news' and @value ='0']").click();	
		driver.findElementByXPath("//input[@name='age' and @value ='0']").click();
		System.out.println("Are you enjoying classes? "+driver.findElementByXPath("//input[@id='yes']").isSelected());
		System.out.println("Unchecked is selected? "+driver.findElementByXPath("//input[@name='news' and @value ='0']").isSelected());
		System.out.println("1-20 Years selected? "+driver.findElementByXPath("//input[@name='age' and @value ='0']").isSelected());
		
		driver.findElementByXPath("//*[@class='widget-title']/following-sibling::a").click();
		driver.findElementByXPath("//*[text()='Checkbox']/following-sibling::img").click();
		
		
		driver.findElementByXPath("//*[text()='Java']/input").click();
		driver.findElementByXPath("//*[text()='Selenium']/input").click();
		driver.findElementByXPath("//*[text()='Option 1']/input").click();
		System.out.println("Java is selected? "+driver.findElementByXPath("//*[text()='Java']/input").isSelected());
		System.out.println("Selenium is checked? "+driver.findElementByXPath("//*[text()='Selenium']/input").isSelected());
		System.out.println("Option1 is selected? "+driver.findElementByXPath("//*[text()='Option 1']/input").isSelected());
		
		
		
		
		

	}

}
