package pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	WebDriver driver;
	public ProductsPage(WebDriver driver) {
		this.driver= driver;
	}

	private By productBtn1 = By.xpath("(//*[@id=\"inventory_container\"]//button)[3]");
	private By productBtn2 = By.xpath("(//*[@id=\"inventory_container\"]//button)[5]");
	private By cartLnk =     By.xpath("//*[@id='shopping_cart_container']/a");
	private By itemCount = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
	private By productNameList = By.xpath("//*[@id='inventory_container']//button[text()='REMOVE']/../..//div[@class='inventory_item_name']");
	
	
	public void addProductsToCart() {
		driver.findElement(productBtn1).click();
		driver.findElement(productBtn2).click();
	}
	
	public ArrayList<String>  getProductsNameAddedToCart() {
		
		ArrayList<String> list = new ArrayList<String>();
		int listCount = driver.findElements(productNameList).size();
		for(int i=0; i<listCount; i++) {
			list.add(driver.findElements(productNameList).get(i).getText());
		}	
		return list;
	}
	

	public void clickCartLink() {
		driver.findElement(cartLnk).click();
	}
	public String getItemCountNumber() {
		String prodCount = driver.findElement(itemCount).getText();
		return prodCount;
	}
}
