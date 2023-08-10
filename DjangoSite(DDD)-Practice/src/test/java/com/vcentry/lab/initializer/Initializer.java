package com.vcentry.lab.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vcentry.lab.utils.Archiver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer {

	/**
	 * @author Gs praba
	 * @purpose Declaring environment variable
	 * @date 7 mar 2023
	 */
	public static Properties envProp = null;
	
	/**
	 * @author Gs praba
	 * @purpose Declaring locator variable
	 * @date 7 mar 2023
	 */
	public static Properties locatorProp = null;
	
	/**
	 * @author Gs praba
	 * @purpose Declaring webDriver variable
	 * @date 7 mar 2023
	 */
	public static WebDriver wd = null;

	/**
	 * 
	 * @author Gs praba
	 * @purpose 
	 * @date 7 mar 2023
	 */	
	public static Boolean isarchive=true;
	
	/**
	 * 
	 */
	public static ExtentReports reports;
	
	/**
	 * 
	 */
	public static ExtentTest log;
	
	
	/**
	 * @author Gs praba
	 * @throws IOException
	 * @purpose initialize the webDriver, report, files
	 */
	public static void initializer() throws IOException {
		// File f=new File("");
		// FileInputStream fis=new FileInputStream(f);
		// Properties prop=new Properties();
		// prop.load(fis);

		if(isarchive){
			Archiver.archiveScreenshot();
			reports = new ExtentReports("C:/Batch 256/J1_DDDTest/report/index.html");
			isarchive=false;
		}
		
		
		envProp = new Properties();
		envProp.load(new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/env.properties")));

		locatorProp = new Properties();
		locatorProp.load(new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/locator.properties")));
		
		if (envProp.getProperty("BROWSER").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver", ".exe - file") - Old format for initialization of webBrowser
//			Exceptions - Browser not reachable, session not connect, time out exception because of browser not reach
			wd = new ChromeDriver();
		} else if (envProp.getProperty("BROWSER").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			wd = new FirefoxDriver();
		} else if (envProp.getProperty("BROWSER").equals("ie")) {    // mistake if
			WebDriverManager.iedriver().setup();
			wd = new InternetExplorerDriver();
		}  else if (envProp.getProperty("BROWSER").equals("edge")) {    
			WebDriverManager.edgedriver().setup();
			wd = new EdgeDriver();
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}
}
