package com.comcast.crm.generic.webdriverUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {

	public void waitForPageGetLoad(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void waitForElementGetLoad(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForElementGetVisible(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void switchToBrowserOnUrl(WebDriver driver, String url) {

		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		while (it.hasNext()) {

			String WindowId = it.next();
			driver.switchTo().window(WindowId);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(url)) {
				break;
			}
		}
	}

	public void switchToBrowserOnTitle(WebDriver driver, String url) {

		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		while (it.hasNext()) {

			String WindowId = it.next();
			driver.switchTo().window(WindowId);
			String actUrl = driver.getTitle();
			if (actUrl.contains(url)) {
				break;
			}
		}
	}

	public void handleChromeNotificationPopUp(WebDriver driver) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		 driver= new ChromeDriver(option);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
