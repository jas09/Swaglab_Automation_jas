package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testComponents.TestSetUp;

public class CheckoutOverviewPageStepDefinition {

	TestSetUp testSetUp;
	public CheckoutOverviewPageStepDefinition(TestSetUp testSetUp) {
		this.testSetUp = testSetUp;
	}


	@Then("I verify Items total amount in shipping information section")
	public void i_verify_items_total_amount_in_shipping_information_section() {

		float expectedTotalPrice = testSetUp.pageObjectManager.getCheckoutOverviewPage().getCalculatedItemPriceValue();
		float actualTotalPrice = testSetUp.pageObjectManager.getCheckoutOverviewPage().getTotalItemPriceValue();
		Assert.assertEquals(actualTotalPrice, expectedTotalPrice);

	}
	

	
	@When("I click on FINISH button on Overview page")
	public void i_click_on_finish_button_on_overview_page() {
		testSetUp.pageObjectManager.getCheckoutOverviewPage().clickFinishBtn();
	}
	

}
