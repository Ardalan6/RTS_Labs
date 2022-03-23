package com.pages.objects.libraries;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Base {

	
	
	
	
	final static Logger logger = Logger.getLogger(Base.class);

	private String URL = "https://www.google.com/";
	public static WebDriver driver;
	int defaultWaitTimeInSecs = 10;
	public static Main main;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Atumation_Testing_documents\\Interview_Tasks\\RTS_Labs\\src\\test\\resources\\Drivers\\chromedriver.exe");
		main = new Main();
		driver = new ChromeDriver();
		logger.info("starting 'Chrome' browser.");
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(defaultWaitTimeInSecs, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(defaultWaitTimeInSecs, TimeUnit.SECONDS);
		logger.info("Maximizing the browser.");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@AfterMethod
	public void tearDown() {
		try {
		logger.info("test ended. ");
		
		
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		if (driver != null) {
			driver.close();
		}

}

	@AfterClass
	public void cleanUpAfterAllTestMethods() {
		logger.info("After Class ...");
		if (driver != null) {
			driver.quit();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
