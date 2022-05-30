package org.utility;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;


import java.io.IOException;


import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;

	public static void StartChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void url(String url) {
		driver.get(url);

	}

	public static void maxPage() {
		driver.manage().window().maximize();
	}

	public static void implicitlyWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	// sendkeys
	public static void send(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void click(WebElement button) {
		button.click();

	}

	public static void endBrowser() {
		driver.quit();

	}

	public static void sleep(int sec) throws InterruptedException {
		Thread.sleep(sec);

	}



	public static void move(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}


	public static void enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void screenshot(String picname) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File ds = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+picname+".png");
		FileUtils.copyFile(src, ds);

	}
	public static byte[] screenshot() throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] src = tk.getScreenshotAs(OutputType.BYTES);
		return src;

	}

	public static void windowhandle(int in) {
	    Set<String> set = driver.getWindowHandles();
		LinkedList<String> li=new LinkedList<String>(set);
		li.addAll(set);
		driver.switchTo().window(li.get(in));
	}

	

}
  