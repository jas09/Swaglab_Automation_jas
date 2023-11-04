package testComponents;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class TestSetUp {
	
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public ArrayList<String> listOfProductsAddedToCart;
	
	public TestSetUp() throws IOException{
		BaseTest baseTest= new BaseTest();
		driver = baseTest.webDriverManager();
		pageObjectManager= new PageObjectManager(driver);
	}
	

}
