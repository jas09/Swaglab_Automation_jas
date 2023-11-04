package testComponents;

import org.openqa.selenium.WebDriver;

import pageObjects.CheckoutOverviewPage;
import pageObjects.FinishPage;
import pageObjects.LoginPage;
import pageObjects.ProductsPage;
import pageObjects.YourCartPage;
import pageObjects.YourInformationPage;
import stepDefinitions.ProductsPageStepDefinition;

public class PageObjectManager {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public ProductsPage productsPage;
	public YourCartPage yourCartPage;
	public YourInformationPage yourInformationPage;
	public CheckoutOverviewPage checkoutOverviewPage;
	public FinishPage finishPage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLoginPage() {
		loginPage = new LoginPage(driver);
		return loginPage;
	}
	
	public ProductsPage getProductsPage() {
		productsPage = new ProductsPage(driver);
		return productsPage;
	}
	
	public YourCartPage getYourCartPage() {
		yourCartPage = new YourCartPage(driver);
		return yourCartPage;
	}
	
	public YourInformationPage getYourInformationPage() {
		yourInformationPage = new YourInformationPage(driver);
		return yourInformationPage;
	}
	
	public CheckoutOverviewPage getCheckoutOverviewPage() {
		checkoutOverviewPage = new CheckoutOverviewPage(driver);
		return checkoutOverviewPage;
	}
	
	public FinishPage getFinishPage() {
		finishPage = new FinishPage(driver);
		return finishPage;
	}
	
}
