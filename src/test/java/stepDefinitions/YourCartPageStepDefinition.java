package stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testComponents.TestSetUp;

public class YourCartPageStepDefinition {
	TestSetUp testSetUp;
	public YourCartPageStepDefinition(TestSetUp testSetUp) {
		this.testSetUp = testSetUp;
	}

	@Then("I verify the selected products on Your Cart page")
	public void i_verify_the_selected_products_on_Your_Cart_page() {
		ArrayList<String> getCartList = testSetUp.pageObjectManager.getYourCartPage().getCartList();
		Assert.assertEquals(getCartList, testSetUp.listOfProductsAddedToCart);
	
	}
	
	@And("I click on CHECKOUT button on Your Cart page")
	public void I_click_on_CHECKOUT_button_on_Your_Cart_page() {
		testSetUp.driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]//a[2]")).click();
	}
}
