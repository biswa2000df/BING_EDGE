package Microsoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chrometest {
	
	
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\biswa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		
//		WebDriver driver = new ChromeDriver(option);
//		
//		driver.get("http://www.google.com");
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\biswa\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	}

}
