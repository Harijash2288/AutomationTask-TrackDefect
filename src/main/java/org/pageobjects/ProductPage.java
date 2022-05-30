package org.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class ProductPage extends UtilityClass {
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "(//a[@class='s1Q9rs'])[1]")
	private WebElement crystalstone;

	@FindBy(xpath = "(//li[@class='col col-6-12'])[1]")
	private WebElement gotocart;




	public WebElement getCrystalstone() {
		return crystalstone;
	}

	public WebElement getGotocart() {
		return gotocart;
	}

	

}
