package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoRegisterTest {
	
@Test
	
	public void registerUser() throws InterruptedException 
	
	{       System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	        WebDriver driver =new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://demowebshop.tricentis.com/register");
		    driver.findElement(By.xpath("//input[@value ='F']")).click();	
            String Firstname = "Harika";
            String LastName = "Gurugubelli";
            String Email="yuharika04435@gmail.com";
            String Password ="Harika@123";
            String ConfirmPassword ="Harika@123";
		    driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		    driver.findElement(By.name("LastName")).sendKeys(LastName);
		    driver.findElement(By.id("Email")).sendKeys(Email);
		    driver.findElement(By.name("Password")).sendKeys(Password);
		    driver.findElement(By.name("ConfirmPassword")).sendKeys(Password); 
		    driver.findElement(By.id("register-button")).click();	
		    Thread.sleep(3000);
		    if(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(Email))
		    {
		    	System.out.println("Registration successfull");
		    }
		    else
		    {
		    	System.out.println("Registration Unsuccessfull");
		    }
		    
		    driver.quit();
		
	}
	

}
