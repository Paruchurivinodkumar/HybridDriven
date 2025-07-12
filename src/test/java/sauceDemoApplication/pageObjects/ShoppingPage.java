package sauceDemoApplication.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ShoppingPage extends BasePage {

	public ShoppingPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cartElement;
	@FindBy(xpath="//div[@class='inventory_item']")
	List<WebElement> linksElement;
	@FindBy(id="react-burger-menu-btn")
	WebElement menuElement;
	
	public void cart() {
		if (cartElement.isDisplayed() && cartElement.isEnabled()) {
			cartElement.click();
		}
	}
	public void links(String linkName) {
		
			for (int i = 0; i < linksElement.size(); i++) {
				String textString=linksElement.get(i).getText();
				System.out.println(textString);
			}
	
	}
		public void menuButton() {
			if (menuElement.isDisplayed() && menuElement.isEnabled()) {
				menuElement.click();
			}
		}
		
		
	

}
