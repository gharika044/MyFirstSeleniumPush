package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomRepository.BooksPage;
import pomRepository.LoginPage;
import pomRepository.ShoppingCartPage;
import pomRepository.WelcomePage;

public class MavenScriptTest {
	
	@Test
	
	public void test() {
	 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://demowebshop.tricentis.com/");
	 
	 WelcomePage welcomepage =new WelcomePage(driver);
	 LoginPage loginpage =new LoginPage(driver);
	 BooksPage bookpage =new BooksPage(driver);
	 ShoppingCartPage spage =new ShoppingCartPage(driver);
	 
	 welcomepage.loginclick();
	 loginpage.emailAddress.sendKeys("mahi4455@gmail.com");
	 loginpage.password.sendKeys("mahi@123");
	 loginpage.remembermeforlogin.click();
	 loginpage.loginButton.click();
	 
	 bookpage.ComputingandInternetAddToCartButton.click();
	 bookpage.HealthBookAddToCartButton.click();
	 welcomepage.Shoppingcartlink.click();
	 spage.termsandconditionsaccept.click();
	 spage.checkoutbutton.click();
	 
	 
	 
	 
	 driver.quit();

	 
	/* driver.findElement(By.partialLinkText("Log")).click();
	 driver.findElement(By.id("Email")).sendKeys("mahi4455@gmail.com");
	 driver.findElement(By.id("Password")).sendKeys("mahi@123");
	 driver.findElement(By.xpath("//label[text() ='Remember me?']")).click();
	 driver.findElement(By.xpath("//input[@value ='Log in']")).click();	
	 driver.findElement(By.partialLinkText("BOOKS")).click();
	 driver.findElement(By.xpath("(//input[contains(@class,'button-2 product-box-add-to-cart-button')])[1]")).click();
	 driver.findElement(By.xpath("(//input[contains(@class,'button-2 product-box-add-to-cart-button')])[2]")).click();	
	 driver.findElement(By.xpath("//span[text()= 'Shopping cart']")).click();
	 driver.findElement(By.id("termsofservice")).click();
	 driver.findElement(By.id("checkout")).click();*/
	 
	}
  
}
