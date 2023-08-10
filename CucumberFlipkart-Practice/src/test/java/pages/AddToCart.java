package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {

	public static void addTheProductToTheAddtocartSection(WebDriver wd) {
		wd.findElement(By
				.xpath("(.//div[@class='_1YokD2 _3Mn1Gg col-5-12 _78xt5Y']/child::div[2]/descendant::div/ul/li/button)"))
				.click();
	}

	public static void removeTheProductFromAddtocart(WebDriver wd) {
		wd.findElement(By.xpath("(.//div[@class='go_DOp _2errNR']//following-sibling::div[3]/descendant::div[2]/a)"))
				.click();
		wd.findElement(By.xpath("(.//div[@class='_10vWcL td-FUv WDiNrH']/descendant::div[2])")).click();
		wd.findElement(By.xpath("(.//div[@class='_2_e-g9 _2WFwmV']/div[@class='row _1lPa3S']/descendant::div[3])"))
				.click();
	}

	public static String checkIfAddtocartIsEmpty(WebDriver wd) {
		String actual = wd
				.findElement(By
						.xpath("(.//div[@class='_1YokD2 _3Mn1Gg col-12-12']/child::div[2]/div[@class='Vy94J0']/div[@class='_1LCJ1U'])"))
				.getText();
		String expected = "Missing Cart items?";
		Assert.assertEquals(actual, expected);
		return "Product removed from the add to cart - Now add to cart is empty!!!";
	}
}
