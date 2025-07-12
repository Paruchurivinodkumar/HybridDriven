package sauceDemoApplication.testCases;


import org.testng.annotations.Test;

import sauceDemoApplication.pageObjects.HomePage;
import sauceDemoApplication.pageObjects.ShoppingPage;
import sauceDemoApplication.testBase.BaseClass;

public class LoginTest extends BaseClass{
	@Test
	public void login() {
		HomePage homePage=new HomePage(driver);
		homePage.login("standard_user", "secret_sauce");
		ShoppingPage shoppingPage=new ShoppingPage(driver);
		shoppingPage.links();
	}

}
