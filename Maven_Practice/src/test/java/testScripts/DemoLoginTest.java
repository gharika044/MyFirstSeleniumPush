package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genricLibrary.ScreenshotMethod;
import pomRepository.LoginPage;
import pomRepository.WelcomePage;

public class DemoLoginTest {
	
@Test	
public void test()
{
	 System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://demowebshop.tricentis.com/login");
	 
	 WelcomePage welcomepage =new WelcomePage(driver);
	 welcomepage.loginclick();
	 
	 LoginPage loginpage =new LoginPage(driver);
	 loginpage.emailAddress.sendKeys("mahi4455@gmail.com");
	 loginpage.password.sendKeys("mahi@123");
	 loginpage.remembermeforlogin.click();
	 loginpage.loginButton.click();
	 ScreenshotMethod.screenshot(driver);
	  
		/*
		 * driver.findElement(By.partialLinkText("Log")).click();
		 * driver.findElement(By.id("Email")).sendKeys("mahi4455@gmail.com");
		 * driver.findElement(By.id("Password")).sendKeys("mahi@123");
		 * driver.findElement(By.xpath("//label[text() ='Remember me?']")).click();
		 * driver.findElement(By.xpath("//input[@value ='Log in']")).click();
		 */
	driver.quit();
}
}
