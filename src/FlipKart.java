import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FlipKart {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("7065159668");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Buddy$tar29");
		///driver.findElement(By.xpath("//input[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("watch");
		
	//	driver.findElement(By.xpath("//input[@data-reactid='18']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/div/a[2]")).click();
		
		
		
		
		
Set<String> windows= driver.getWindowHandles();
		
		Iterator it = windows.iterator();
		
		String firstWindow = (String) it.next();
		String secondWindow = (String) it.next();
		
	
		driver.switchTo().window(secondWindow);
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/button")).click();
		
		System.out.println("Prodcut sucesfully added into cart");
		System.out.println("Product name "+ "["+driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/a")).getText()+"]");
	}

}
