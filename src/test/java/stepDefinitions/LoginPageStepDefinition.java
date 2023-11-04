package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;
import testComponents.BaseTest;
import testComponents.TestSetUp;

public class LoginPageStepDefinition {
	TestSetUp testSetup;
	
	
	public LoginPageStepDefinition(TestSetUp testSetup) {
		this.testSetup = testSetup;
	}
	
	@Given("^User is logged into SWAGLABS application with (.+) and (.+)$")
	public void user_is_logged_into_SWAGLABS_application(String UN, String PW) {
		
		testSetup.pageObjectManager.getLoginPage().enterUsername(UN);
		testSetup.pageObjectManager.getLoginPage().enterPassword(PW);
		testSetup.pageObjectManager.getLoginPage().clickLoginBtn();

			
	}
	
}
