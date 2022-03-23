package com.page.object.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pages.objects.libraries.Base;

public class RRS_Labs_Main_Page extends Base {

	final static Logger logger = Logger.getLogger(RRS_Labs_Main_Page.class);

	@Test
	public void nvgtRTS() {
		logger.info("Navagating to 'RTS Labs' Page...");
		main.enterText(By.name("q"), "RTS Labs");

		main.clickButton(By.cssSelector(
				"body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf.emcav > div.UUbT9 > div.aajZCb > div.mkHrUc > ul.erkvQe > div > ul > li.sbct.sbre"));
		main.dynamicWaitForPresenceOfElement(
				By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div > div.yuRUbf > a > div"));

		main.clickButton(
				By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div > div.yuRUbf > a > div"));
		logger.info("Page Title : " + driver.getTitle());

	
		WebElement RTSlogo = driver.findElement(By.cssSelector("#logo > a"));
		
		if (RTSlogo.isDisplayed()) {
			logger.info("Logo veryfied! We are on the right page.");
		} else {
			logger.info("We are not on 'RTS Labs' page!");
		}

	}

}
