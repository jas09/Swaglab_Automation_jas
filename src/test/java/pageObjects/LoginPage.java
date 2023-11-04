package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
		WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	private By usernameTxt = By.id("user-name");
    private By passwordTxt = By.id("password");
	private By loginBtn = By.id("login-button");
	private By loginLogo = By.className("login_logo");
	
	public void enterUsername(String UN) {
		driver.findElement(usernameTxt).sendKeys(UN);
	}
	public void enterPassword(String PW) {
		driver.findElement(passwordTxt).sendKeys(PW);
	}
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	public Boolean verifyLoginLogo() {
		 Boolean result = driver.findElement(loginLogo).isDisplayed();
		 return result;
	}
}
