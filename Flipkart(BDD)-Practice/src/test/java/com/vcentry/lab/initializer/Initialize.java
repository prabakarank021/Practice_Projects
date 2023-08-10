package com.vcentry.lab.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initialize {

	public static WebDriver wd = null;

	public static Properties envProp = null;

	public static Properties locatorProp = null;

	public static void initializer() throws FileNotFoundException, IOException {

		envProp = new Properties();
		envProp.load(new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/env.properties")));

		locatorProp = new Properties();
		locatorProp.load(new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/locator.properties")));

		if (envProp.getProperty("BROWSER").equals("CHROME")) {
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
		} else if (envProp.getProperty("BROWSER").equals("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();
			wd = new FirefoxDriver();
		}

		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
