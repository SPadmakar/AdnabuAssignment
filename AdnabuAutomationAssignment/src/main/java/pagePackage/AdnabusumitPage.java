package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import genericPackage.WorkLib;

public class AdnabusumitPage {
	
	
	
	@FindBy(xpath = "//button[@class='btn--link site-header__icon site-header__search-toggle js-drawer-open-top']") private WebElement searchIcon; 
	@FindBy(xpath = "//input[@class='search__input search-bar__input']") private WebElement searchBox; 
	@FindBy(xpath = "//button[@class='search-bar__submit search__submit btn--link']") private WebElement searchButton;
	@FindBy(xpath = "(//span[@class='site-nav__label'])[2]") private WebElement cateloglink;
	@FindBy(name = "FilterTags") private WebElement filterByDropDown;
	@FindBy(id="SortBy") private WebElement sortByDropDown;
	@FindBy(xpath ="(//div[@class='h4 grid-view-item__title product-card__title'])[2]") private WebElement product;
	@FindBy(id = "SingleOptionSelector-0") private WebElement sizeDropDown;
	@FindBy(id="Quantity-product-template") private WebElement quantity;
	@FindBy(xpath = "//button[@name='add']") private WebElement addToCartButton;
	@FindBy(xpath = "(//a[@aria-label='Remove 18k Pedal Ring'])[1]") private WebElement romoveButton;
	@FindBy(xpath = "//p[@class='cart--empty-message']") private WebElement msg;
	
	public AdnabusumitPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getCateloglink() {
		return cateloglink;
	}

	public WebElement getFilterByDropDown() {
		return filterByDropDown;
	}

	public WebElement getSortByDropDown() {
		return sortByDropDown;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getSizeDropDown() {
		return sizeDropDown;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getRomoveButton() {
		return romoveButton;
	}

	public WebElement getMsg() {
		return msg;
	} 
	
	

	
	public void testSearchByProductName()
	{
		searchIcon.click();
		searchBox.sendKeys("Earings");
		searchButton.click();
		Reporter.log("Able to search product by name (i.e. Earrings) ",true);
	}
	
	  public void testFilterProductsByCategory()
	  {
		  cateloglink.click();
		  WorkLib wb = new WorkLib();
		  wb.selectByValueMethod(filterByDropDown,"/collections/all/rose-gold");
		  Reporter.log("Able to filter the product by choice (i.e.rose gold) .",true);
	  }
	  
	  public void testSortProductsByPrice() 
	  {
		  WorkLib wb = new WorkLib();
		  wb.selectByValueMethod(sortByDropDown, "price-ascending");
		  Reporter.log("Able to sort product by price low to high .",true);
		  
	  }
	  
	  public void testAddProductToCart() 
	  {
		  WorkLib wb = new WorkLib();
		  wb.mouseHoverMethod(product);
		  wb.doubleClickMethod(product);
		  Reporter.log("Able to select required product.",true);
		  wb.selectByValueMethod(sizeDropDown, "9");
		  
		  Reporter.log("Able to update the size of product",true);
		  quantity.clear();
		  quantity.sendKeys("4");
		  Reporter.log("Able to update the qty of product",true);
		  addToCartButton.click();
		  
	  }
	  
	  public void testRemoveProductFromCart()
	  {
		  romoveButton.click();
		  msg.equals("Your cart is currently empty.");
		  Reporter.log("Product Suceesfully removed from cart.",true);
	  }
	
}
