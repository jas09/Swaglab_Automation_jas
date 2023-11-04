package pageObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
	
	WebDriver driver;
	HashMap<String, Float> itemDetails;
	//Set itemSet;
	Iterator itemIterator;
	public CheckoutOverviewPage(WebDriver driver) {
		this.driver = driver;
	}

	private By itemNameTxt = By.xpath("//*[@class='inventory_item_name']");
	
	private By itemPriceTxt = By.xpath("//*[@class='inventory_item_price']");
	private By itemTotalPriceTxt = By.xpath("//*[@class='summary_subtotal_label']");
	private By finishBtn = By.xpath("//*[@class='btn_action cart_button']");
	
	public Iterator getCartItemPriceValue() {
		
		itemDetails  = new HashMap<String, Float>();
		int count = driver.findElements(itemNameTxt).size();
		for (int i=0; i<count; i++ ) {
			String itemName = driver.findElements(itemNameTxt).get(i).getText();
			float itemPrice = Float.parseFloat(driver.findElements(itemPriceTxt).get(i).getText().substring(1));
			itemDetails.put(itemName, itemPrice);
		}
			Set itemSet = itemDetails.entrySet();
			itemIterator = itemSet.iterator();
		return 	itemIterator;
	}
	
	public float getCalculatedItemPriceValue() {
		float total= 0;
		itemIterator = getCartItemPriceValue();
		while (itemIterator.hasNext())
		{
			Map.Entry<String, Float> mp = (Map.Entry<String, Float>)itemIterator.next();
			total = total + mp.getValue();
		}
		return total;
	}
	
	public float getTotalItemPriceValue() {
		String totalTxt = driver.findElement(itemTotalPriceTxt).getText();
		int i =totalTxt.indexOf('$');
		float actualTotal = Float.parseFloat(totalTxt.substring(i+1));
		return actualTotal;
	}

	public void clickFinishBtn() {
		driver.findElement(finishBtn).click();
	}
	
	

	
}
