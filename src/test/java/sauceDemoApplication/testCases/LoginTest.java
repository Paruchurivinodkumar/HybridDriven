package sauceDemoApplication.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sauceDemoApplication.pageObjects.HomePage;
import sauceDemoApplication.pageObjects.ShoppingPage;

public class LoginTest {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");	
	}
	@Test
	public void login() {
		HomePage homePage=new HomePage(driver);
		homePage.login("standard_user", "secret_sauce");
		ShoppingPage shoppingPage=new ShoppingPage(driver);
		shoppingPage.links("Sauce Labs Fleece Jacket\r\n"
				+ "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.\r\n"
				+ "$49.99\r\n"
				+ "Add to cart");
	}

}
