package org.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class Homepage extends UtilityClass {
	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	private WebElement searchbox;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement sub;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement loginclose;

	public WebElement getSub() {
		return sub;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getLoginclose() {
		return loginclose;
	}
}
