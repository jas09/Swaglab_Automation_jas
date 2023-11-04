package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testComponents.TestSetUp;

public class YourInformationPageStepDefinition {
	TestSetUp testSetUp;
	public YourInformationPageStepDefinition(TestSetUp testSetUp) {
		this.testSetUp = testSetUp;
	}

	@And("I provide user information on Checkout page and I click on CONTINUE")
	public void i_provide_user_information_on_checkout_page_and_i_click_on_continue(List<String> userData) {


		testSetUp.pageObjectManager.getYourInformationPage().addUserInformation(userData);
		testSetUp.pageObjectManager.getYourInformationPage().clickContinueOnInformationPage();
	}
	
}
