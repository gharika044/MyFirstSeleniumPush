package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	
	//Here we will store the webelements from BOOKS page of DemoWebShop

	public BooksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//All the links of the Books 
	@FindBy(partialLinkText = "Computing and Internet")
	public WebElement ComputingandInternetlink ;
	@FindBy(partialLinkText = "Copy of Computing and Internet EX")
	public WebElement CopyofComputingandInternetEXlink;
	@FindBy(partialLinkText = "Fiction")
	public WebElement Fictionlink ;
	@FindBy(partialLinkText = "Fiction EX")
	public WebElement FictionEXlink ;
	@FindBy(partialLinkText = "Health Book")
	public WebElement HealthBooklink ;
	@FindBy(partialLinkText = "Science")
	public WebElement Sciencelink ;
	
	//Add to cart for available books
	@FindBy(xpath = "(//input[contains(@class ,'button-2 product-box-add-to-cart-button')])[1]")
	public WebElement ComputingandInternetAddToCartButton;
	@FindBy(xpath = "(//input[contains(@class ,'button-2 product-box-add-to-cart-button')])[2]")
	public WebElement FictionAddToCartButton;
	@FindBy(xpath = "(//input[contains(@class ,'button-2 product-box-add-to-cart-button')])[3]")
	public WebElement HealthBookAddToCartButton;
	
	//Books Sorting Option By Position
	@FindBy(xpath = "//option[text()='Name: A to Z']")
	public WebElement NameAToZLink;
	@FindBy(xpath = "//option[text()='Name: Z to A']")
	public WebElement NameZToALink;
	@FindBy(xpath = "//option[text()='Price: Low to High']")
	public WebElement Pricelowtohighlink;
	@FindBy(xpath = "//option[text()='Price: High to Low']")
	public WebElement Pricehightolowlink;
	@FindBy(xpath = "//option[text()='Created on']")
	public WebElement CreatedOnlink;
	
	//Books Sorting Option By Display
	@FindBy(xpath = "//option[text()='4'")
	public WebElement display4perpage;
	@FindBy(xpath = "//option[text()='8']")
	public WebElement display8perpage;
	@FindBy(xpath = "//option[text()='12']")
	public WebElement display12perpage;
	
	//Books Sorting Option By View As
	@FindBy(xpath = "//option[text()='Grid'")
	public WebElement viewasgrid;
	@FindBy(xpath = "//option[text()='List']")
	public WebElement viewaslist;
	
	
	//Filter By price
	@FindBy(xpath = "(//span[text()='25.00'])[1]")
	public WebElement Under25link;
	@FindBy(xpath = "(//span[text()='25.00'])[2]")
	public WebElement link25to50;
	@FindBy(xpath = "(//span[text()='50.00'])[2]")
	public WebElement Over50link;
	
	
}
