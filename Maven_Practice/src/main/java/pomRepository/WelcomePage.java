package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//Here we will store the webelements from Welcome page of DemoWebShop
	
 public WelcomePage(WebDriver driver)	
 {
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(partialLinkText ="Register")
  private WebElement registerlink;
  public void registerclick()
  {
	  registerlink.click();
  }
 
 @FindBy(partialLinkText = "Log")
  private WebElement loginlink;
 
public WebElement getRegisterlink() {
	return registerlink;
}

public void setRegisterlink(WebElement registerlink) {
	this.registerlink = registerlink;
}

public WebElement getLoginlink() {
	return loginlink;
}

public void setLoginlink(WebElement loginlink) {
	this.loginlink = loginlink;
}

public void loginclick() {
	loginlink.click();
}
 
 @FindBy(xpath = "//span[text()='Shopping cart']")
 public WebElement Shoppingcartlink;
 
 @FindBy(xpath = "//span[text()='Wishlist']")
 public WebElement wishlistlink;
 
 @FindBy(xpath = "//input[@value='Search store']")
 public WebElement serachTextField;
 
 @FindBy(xpath = "//input[@value='Search']")
 public WebElement serachButton;
 
 @FindBy(partialLinkText = "BOOKS")
 public WebElement headerBOOKSLink;
 
 @FindBy(partialLinkText = "COMPUTERS")
 public WebElement headerCMPUTERSLink;
 
 @FindBy(partialLinkText = "ELECTRONICS")
 public WebElement headerELECTRONICSLink;
 
 @FindBy(partialLinkText = "APPAREL")
 public WebElement headerAPPARELANDSHOESLink;
 
 @FindBy(partialLinkText = "DIGITAL")
 public WebElement headerDIGITALDOWNLOADSLink;
 
 @FindBy(partialLinkText = "JEWELRY")
 public WebElement headerJEWELRYLink;
 
 @FindBy(partialLinkText = "GIFT")
 public WebElement headerGIDTCARDSLink;
 
 
 
 
 
 
	

}
