package org.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class PaymentPage extends UtilityClass {
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement mobileNumber;


	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;

	@FindBy(xpath = "//span[text()='CONTINUE']")
	private WebElement nextPass;

	@FindBy(xpath = "(//div[@class='_1XFPmK'])[7]")
	private WebElement cod;
	
	
	@FindBy(xpath="//button[text()='CONTINUE']")
	private WebElement orderContinue;
	

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getNextpass() {
		return nextPass;
	}

	public WebElement getCod() {
		return cod;
	}

	
	
	public WebElement getOrderContinue() {
		return orderContinue;
	}
}
