package sauceDemoApplication.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="user-name")
	WebElement usernamElement;
	@FindBy(id="password")
	WebElement passwordElement;
    @FindBy(id="login-button")
    WebElement loginElement;
    
    public void login(String username , String password) {
    	if (usernamElement.isDisplayed() && usernamElement.isEnabled()) {
    		usernamElement.sendKeys(username);
		}
		if (passwordElement.isDisplayed() && passwordElement.isEnabled()) {
			passwordElement.sendKeys(password);
		}
		if (loginElement.isDisplayed() && loginElement.isEnabled()) {
			loginElement.click();
		}
	}
}
