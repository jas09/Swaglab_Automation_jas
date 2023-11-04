package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourInformationPage {

	WebDriver driver;
	public YourInformationPage(WebDriver driver) {
		this.driver =driver;
	}
	
	private By firstNameIp = By.xpath("//*[@id=\"first-name\"]");
	private By lastNameIp = By.xpath("//*[@id=\"last-name\"]");
	private By postalCodeIp = By.xpath("//*[@id=\"postal-code\"]");
	private By continueBtn = By.xpath("//*[@value=\"CONTINUE\"]");
	
	public void addUserInformation(List<String> userData) {

		driver.findElement(firstNameIp).sendKeys(userData.get(0));
		driver.findElement(lastNameIp).sendKeys(userData.get(1));
		driver.findElement(postalCodeIp).sendKeys(userData.get(2));
	}
	
	public void clickContinueOnInformationPage() {
		driver.findElement(continueBtn).click();
	}
}
