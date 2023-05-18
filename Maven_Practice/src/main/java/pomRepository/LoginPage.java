package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Here we will store the webelements from Welcome page of DemoWebShop	
	
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(id = "Email")
 public WebElement emailAddress;

@FindBy(id = "Password")
public WebElement password;

@FindBy(xpath="//label[text() ='Remember me?']")
public WebElement remembermeforlogin;


@FindBy(xpath="//input[@value ='Log in']")
public WebElement loginButton;




}
