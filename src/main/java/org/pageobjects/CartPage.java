package org.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class CartPage extends UtilityClass {
	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@class='_2xm1JU']")
	private WebElement home;

	@FindBy(xpath = "//span[text()='Continue']")
	private WebElement addContinuee;

	@FindBy(xpath = "//span[text()='Cart']")
	private WebElement addto;

	@FindBy(xpath = "//div[text()='Remove']")
	private WebElement remov;

	@FindBy(xpath = "(//div[text()='Remove'])[1]")
	private WebElement remov2;

	@FindBy(xpath = "//div[@class='_1LCJ1U']")
	private WebElement emptyCart;
	
	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement placeorder;
	
	public WebElement getPlaceorder() {
		return placeorder;
	}
	

	public WebElement getHome() {
		return home;
	}

	public WebElement getAddto() {
		return addto;
	}

	public WebElement getRemov() {
		return remov;
	}

	public WebElement getAddcontinuee() {
		return addContinuee;
	}

	public WebElement getRemov2() {
		return remov2;
	}

	public WebElement getEmptyCart() {
		return emptyCart;
	}
}
