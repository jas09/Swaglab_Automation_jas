package stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProductsPage;
import testComponents.TestSetUp;

public class ProductsPageStepDefinition {
	TestSetUp testSetUp;
	public ProductsPageStepDefinition(TestSetUp testSetUp) {
		this.testSetUp = testSetUp;
		
	}
	public ArrayList<String> listOfProductsAddedToCart;

	@When("I select few products from Products page and click on shopping cart icon")
	public void i_select_few_products_from_Products_page_and_click_on_shopping_cart_icon() {
			
		testSetUp.pageObjectManager.getProductsPage().addProductsToCart();
		
		testSetUp.listOfProductsAddedToCart = testSetUp.pageObjectManager.getProductsPage().getProductsNameAddedToCart();
		testSetUp.pageObjectManager.getProductsPage().clickCartLink();
		String productCount = testSetUp.pageObjectManager.getProductsPage().getItemCountNumber();
		Assert.assertEquals(productCount, "2","Verified product count");
		
	}
	
	
	
	
	
	
}
