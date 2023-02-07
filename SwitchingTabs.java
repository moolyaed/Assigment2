package moolya1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingTabs {
WebDriver driver;
	
	@BeforeTest
	public void btest()
	{WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	}
	@Test
	public void contClick() throws InterruptedException
	{WebElement w=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/button"));
	w.click();
	w.click();
	int count=0;
	String parent=driver.getWindowHandle();
	Set<String> tabs=driver.getWindowHandles();
	for(String handle:tabs) {
		
		if(!handle.equals(parent))
		{
			count++;
		if(count==1)
		{	
		driver.switchTo().window(handle);
		Thread.sleep(1000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		}
		else{
		driver.switchTo().window(handle);
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		}
		}else
		{continue;}
		}
	driver.switchTo().window(parent);
	driver.get("https://www.amazon.com/");
}
	
	}
