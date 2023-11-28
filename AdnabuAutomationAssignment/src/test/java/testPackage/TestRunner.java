package testPackage;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import pagePackage.AdnabusumitPage;

public class TestRunner extends BaseTest {
  @Test
  public void endtoendSearchForProduct() throws InterruptedException {
	  
	 AdnabusumitPage adp = new AdnabusumitPage(driver);
	 adp.testSearchByProductName();
	 Thread.sleep(2000);
	 adp.testFilterProductsByCategory();
	 Thread.sleep(2000);
	 adp.testSortProductsByPrice();
	 Thread.sleep(2000);
	 adp.testAddProductToCart();
	 Thread.sleep(2000);
	 adp.testRemoveProductFromCart();
	 
	
  }
}
