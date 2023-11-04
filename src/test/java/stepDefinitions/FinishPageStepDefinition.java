 package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import testComponents.TestSetUp;

public class FinishPageStepDefinition {
	
	TestSetUp testSetUp;
	public FinishPageStepDefinition(TestSetUp testSetUp) {
		this.testSetUp = testSetUp;
	}
	
	
	@Then("I verify Order is placed successfully")
	public void i_verify_order_is_placed_successfully() {
		 String actualOrderSuccessMsg = testSetUp.pageObjectManager.getFinishPage().getOrderSuccessMsg();
		 Assert.assertEquals(actualOrderSuccessMsg, "THANK YOU FOR YOUR ORDER");
	}
	
	@Then("I logout from SWAGLABS application")
	public void i_logout_from_swaglabs_application() {
		testSetUp.pageObjectManager.getFinishPage().clickOpenMenuBtn();
		testSetUp.pageObjectManager.getFinishPage().clickLogoutLnk();
		Boolean isLogoPresent = testSetUp.pageObjectManager.getLoginPage().verifyLoginLogo();
		Assert.assertEquals(isLogoPresent, true);
	}

}
