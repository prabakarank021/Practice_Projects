package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFunction {

	public static WebDriver openBrowser() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

	public static void enterUrl(WebDriver wd, String url) {
		wd.get(url);
	}

}
