package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static void closePopupButton(WebDriver wd) {
		wd.findElement(By.xpath("(.//div[@class='_2Sn47c']/descendant::div[2]/button)")).click();
	}

	public static void searchProduct(WebDriver wd, String sproduct) {
		WebElement search = wd.findElement(By.name("q"));
		search.sendKeys(sproduct);
		search.submit();
	}

	public static String getProductName(WebDriver wd) {
		return wd
				.findElement(By
						.xpath("((.//div[@class='_2kHMtA']/a[@class='_1fQZEK']/div[@class='MIXNux']/following-sibling::div/div[@class='col col-7-12']/div[@class='_4rR01T'])[1])"))
				.getText();
	}

	public static String getProductPrice(WebDriver wd) {
		return wd
				.findElement(By
						.xpath("((.//div[@class='_2kHMtA']/child::a/div[@class='MIXNux']/following::div[10])[1])"))
				.getText();
	}

	public static void clickFirstProduct(WebDriver wd) {
		wd.findElement(By
				.xpath("((.//div[@class='_1YokD2 _2GoDe3']/child::div[2]/div[@class='_1AtVbE col-12-12']/descendant::div[3]/a)[1])"))
				.click();
	}
}
