package pageObjects;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {
	
	 WebDriver driver;

	public YourCartPage(WebDriver driver) {
		this.driver=driver;
	}

	private By cartList= By.xpath("//*[@class='inventory_item_name']");
	private By checkOutBtn = By.xpath("//*[@id=\"cart_contents_container\"]//a[2]");
	
	

	public ArrayList<String> getCartList() {
		 ArrayList<String> list = new ArrayList<String>();
		int cartItems = driver.findElements(cartList).size();
				for (int i=0; i<cartItems; i++) {
					list.add(driver.findElements(cartList).get(i).getText());
		}
		return list;
	}
	
	public void clickCheckOutBtn() {
		driver.findElement(checkOutBtn).click();
	}
}
