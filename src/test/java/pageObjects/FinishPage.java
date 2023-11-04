package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage {
	
	WebDriver driver;
	
	public FinishPage(WebDriver driver) {
		this.driver = driver;
	}

	private By orderSuccessTxt = By.xpath("//*[@class='complete-header']");
	private By openMenuBtn = By.xpath("//button[text()='Open Menu']");
	private By logoutLnk = By.xpath("//*[@id='logout_sidebar_link']");
	
	
	public String getOrderSuccessMsg() {
		String msg= driver.findElement(orderSuccessTxt).getText();
		return msg;
	}
	
	public void clickOpenMenuBtn() {
		driver.findElement(openMenuBtn).click();
		
	}
	
	public void clickLogoutLnk() {
		driver.findElement(logoutLnk).click();
		
		
	}
	

}
