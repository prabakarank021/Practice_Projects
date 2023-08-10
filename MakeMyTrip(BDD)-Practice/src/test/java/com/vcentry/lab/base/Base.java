package com.vcentry.lab.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	/**
	 * @author praba 
	 * @purpose This variable for webdriver initialization purpose
	 */
	public static WebDriver wd = null;

	/**
	 * @author praba 
	 * @purpose This variable for environment related purpose
	 */

	public static Properties envProp = null;

	/**
	 * @author praba 
	 * @purpose This variable for locator related purpose
	 */

	public static Properties locatorProp = null;

	/**
	 * @author praba 
	 * @purpose This function for initialize the browser
	 * @throws IOException
	 * @throws FileNotFoundException
	 */

	public static void initializer() throws FileNotFoundException, IOException {

		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.addArguments("start-maximized");
		
		envProp = new Properties();
		envProp.load(new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/env.properties")));

		locatorProp = new Properties();
		locatorProp.load(new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/locator.properties")));

		if (envProp.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver(options);
		} else if (envProp.getProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			wd = new FirefoxDriver();
		} else if (envProp.getProperty("browser").equals("edge")) {
			WebDriverManager.edgedriver().setup();
			wd = new EdgeDriver();
		}

		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
