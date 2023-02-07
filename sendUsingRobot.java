package moolya1;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sendUsingRobot {
WebDriver driver;
	
	@BeforeTest
	public void btest() throws InterruptedException
	{WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	}
	@Test
	public void contClick() throws AWTException, InterruptedException
	{WebElement w=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	Actions action=new Actions(driver);
	action.moveToElement(w).perform();
	Robot rc=new Robot();
	rc.keyPress(MenuKeyEvent.VK_A);
	rc.keyRelease(MenuKeyEvent.VK_A);
	rc.keyPress(MenuKeyEvent.VK_D);
	rc.keyRelease(MenuKeyEvent.VK_D);
	rc.keyPress(MenuKeyEvent.VK_M);
	rc.keyRelease(MenuKeyEvent.VK_M);
	rc.keyPress(MenuKeyEvent.VK_I);
	rc.keyRelease(MenuKeyEvent.VK_I);
	rc.keyPress(MenuKeyEvent.VK_N);
	rc.keyRelease(MenuKeyEvent.VK_N);
	}
	@Test
	public void password() throws AWTException, InterruptedException
	{
	WebElement w1=driver.findElement(By.xpath("//input[@name='password']"));
	Actions act=new Actions(driver);
	act.moveToElement(w1).perform();
	act.click().perform();
	Robot rc1=new Robot();
	rc1.keyPress(MenuKeyEvent.VK_A);
	rc1.keyRelease(MenuKeyEvent.VK_A);
	rc1.keyPress(MenuKeyEvent.VK_D);
	rc1.keyRelease(MenuKeyEvent.VK_D);
	rc1.keyPress(MenuKeyEvent.VK_M);
	rc1.keyRelease(MenuKeyEvent.VK_M);
	rc1.keyPress(MenuKeyEvent.VK_I);
	rc1.keyRelease(MenuKeyEvent.VK_I);
	rc1.keyPress(MenuKeyEvent.VK_N);
	rc1.keyRelease(MenuKeyEvent.VK_N);
	rc1.keyPress(MenuKeyEvent.VK_1);
	rc1.keyRelease(MenuKeyEvent.VK_1);
	rc1.keyPress(MenuKeyEvent.VK_2);
	rc1.keyRelease(MenuKeyEvent.VK_2);
	rc1.keyPress(MenuKeyEvent.VK_3);
	rc1.keyRelease(MenuKeyEvent.VK_3);
	Thread.sleep(5000);

	}
	@AfterTest
	public void at()
	{
}}
