package Microsoft;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.codoid.products.exception.FilloException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class edgeBing4 extends test2 {

	public static void main(String[] args) throws InterruptedException, FilloException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new EdgeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.bing.com/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='id_n']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();

		Thread.sleep(2000);

		List<String> al = m1();

		String Email;
		String Password;

		try {

			for (int i = 0; i < al.size(); i = i + 2) {

				try {
					WebElement firstsignin = driver.findElement(By.xpath("//*[text()='Sign in']"));
					if (firstsignin.isDisplayed())
						firstsignin.click();
				}

				catch (Exception e) {

					WebElement lastsignin = driver.findElement(By.xpath("//*[@value='Sign in']"));
					if (lastsignin.isDisplayed())
						lastsignin.click();
					Thread.sleep(2000);
				}

				Email = al.get(i);
				Password = al.get(i + 1);
				System.out.println(al.size());
				System.out.println(Email);
				System.out.println(Password);

				System.out.println(driver.getTitle());

				Thread.sleep(1000);

				driver.findElement(By.name("loginfmt")).sendKeys(Email);

				Thread.sleep(2000);

				driver.findElement(By.id("idSIButton9")).click();

				Thread.sleep(3000);

				driver.findElement(By.name("passwd")).sendKeys(Password);

				Thread.sleep(2000);

				driver.findElement(By.id("idSIButton9")).click();

				Thread.sleep(2000);

				driver.findElement(By.id("idSIButton9")).click();
				
				for (int j = 0; j < 34; j++) {

					WebElement h1 = driver.findElement(By.xpath("//*[@id='sb_form_q']"));
					h1.sendKeys("k");
					h1.sendKeys(Keys.ENTER);
				}
				Thread.sleep(3000);
				driver.findElement(By.id("rh_meter")).click();
				System.out.println("hhhhhhhhhhhhhhhh");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id='sb_form_q']")).click();
				
//				driver.findElement(By.xpath("//button[@id=\"closeEduPanel\"]")).click();
				Thread.sleep(3000);
//				driver.findElement(By.xpath("//*[@id='id_n']")).click();
				driver.findElement(By.xpath("//*[@id='id_n']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()='Sign out']")).click();

			}

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("");
			driver.quit();

		}

		System.out.println("Successfully earned all the EDGE Point......");
		driver.quit();

	}

}
