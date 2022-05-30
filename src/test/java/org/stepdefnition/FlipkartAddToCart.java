package org.stepdefnition;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageobjects.CartPage;
import org.pageobjects.Homepage;
import org.pageobjects.PaymentPage;
import org.pageobjects.ProductPage;
import org.utility.*;

import io.cucumber.java.en.*;

public class FlipkartAddToCart extends UtilityClass {
	Homepage home;
	ProductPage product;
	CartPage cart;
	PaymentPage p;

	@Given("the user should be in Flipkart page")
	public void the_user_should_be_in_Flipkart_page() {
	}

	@When("the user has to enter the Product name in serach box and search the product")
	public void the_user_has_to_enter_the_Product_name_in_serach_box_and_search_the_product() {
		home = new Homepage();
		home.getLoginclose().click();
		send(home.getSearchbox(), "crystal stone");
		home.getSub().click();

	}

	@When("the user has to click any product & Add to the cart")
	public void the_user_has_to_click_any_product_Add_to_the_cart() throws AWTException {
		product = new ProductPage();
		click(product.getCrystalstone());
		windowhandle(1);
		product.getGotocart().click();
		cart = new CartPage();
		try {
			click(cart.getPlaceorder());
		} catch (Exception e) {
			click(cart.getAddcontinuee());
		}

	}

	@When("the user has to click Place Order button & Login to the application")
	public void the_user_has_to_click_Place_Order_button_Login_to_the_application() {
		p = new PaymentPage();
		send(p.getMobileNumber(), "6379972288");
		click(p.getNextpass());
		send(p.getPass(), "Jash@4064");
		p.getLogin().click();
	}

	@When("the user has to Select Address & Select Payment option")
	public void the_user_has_to_Select_Address_Select_Payment_option() throws InterruptedException {
		click(p.getOrderContinue());
		move(p.getCod());
		p.getCod().click();

	}

	@When("the user has to click Remove the product from the cart")
	public void the_user_has_to_click_Remove_the_product_from_the_cart() {
//		cart.getHome().click();
		windowhandle(0);
		cart.getAddto().click();
		cart.getRemov().click();
		cart.getRemov2().click();

	}

	@Then("the user should navigate to the Empty Add to the cart page")
	public void the_user_should_navigate_to_the_Empty_Add_to_the_cart_page() {
		Assert.assertTrue("verify url ", cart.getEmptyCart().getText().contains("Your cart is empty!"));
		System.out.println("User in Empty Add to cart page");

	}

}
