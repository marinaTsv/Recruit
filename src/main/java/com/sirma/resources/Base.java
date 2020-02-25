package com.sirma.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	protected static WebDriver driver;
	protected Properties prop = new Properties();
	
	
	public void propertiesFileRead() throws IOException {
		FileInputStream fis = new FileInputStream(
				"D:\\Projects\\Recruit\\src\\main\\java\\com\\sirma\\resources\\data.properties");
		prop.load(fis);
	}
	public WebDriver initializeDriver() throws IOException {		
		/*FileInputStream fis = new FileInputStream(
				"D:\\Projects\\Recruit\\src\\main\\java\\com\\sirma\\resources\\data.properties");
		prop.load(fis);*/
		propertiesFileRead();
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D://PRG//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D://PRG//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
}
