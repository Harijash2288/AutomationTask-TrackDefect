package org.stepdefnition;

import java.io.IOException;

import org.utility.UtilityClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class Hooks extends UtilityClass {

	@Before
	public void before() {
		StartChrome();
		url("https://www.flipkart.com/");
		maxPage();
		implicitlyWait(20);
	}

	@After
	public void after(Scenario sc) throws IOException {
		screenshot("CartPage");
		sc.embed(screenshot(), "image/png");
		endBrowser();
	}

}
