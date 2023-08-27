package Microsoft;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class small {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new EdgeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/newtours/register.php");

		Thread.sleep(3000);

		List<WebElement> ele = driver.findElements(By.xpath("//select[@name=\"country\"]//child::option"));
		System.out.println(ele.size());



//		List<WebElement> ele1 = driver.findElements(By.tagName("option"));
//		ele1.get(10).click();
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.name("country"))).click(driver.findElement(By.xpath("//select[@name=\"country\"]//child::option"))).sendKeys("CHINA").build().perform();

		WebElement element = driver.findElement(By.xpath("(//font[@face=\"Arial, Helvetica, sans-serif\"])[2]"));
		// Get the text using JavascriptExecutor
		String text = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].textContent;", element);
		System.out.println("Text from the element: " + text);

//		driver.findElement(By.name("country")).click();
//		driver.findElement(By.xpath("//option[@value='CHINA']")).click();
		
		
		
		
		
		
//		
//		int dropsize=drpCountry.getOptions().size();
//		
//		System.out.println(dropsize);

//		String s="document.getElementByName('firstName').value='kanha'";
//		
//		((JavascriptExecutor)driver).executeScript(s);

		System.out.println(driver.findElement(By.xpath("(//font[@face=\"Arial, Helvetica, sans-serif\"])[3]"))
				.getAttribute("First Name: "));

//		String javaScriptCode = "document.getElementById('userName').value = 'kanha'";
//
//		// Execute the JavaScript code.
//		((JavascriptExecutor) driver).executeScript(javaScriptCode);
//		
//		((JavascriptExecutor) driver).executeScript("window.open();");
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		
//		driver.navigate().to("https://ishine.apmosys.com/#/login");
//		

	}

}
