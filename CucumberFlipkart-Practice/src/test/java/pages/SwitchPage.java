package pages;

import java.util.Iterator;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testCases.StepDefinition;

public class SwitchPage {

	public static void switchToNextWindow(WebDriver wd) {
		Set<String> window = wd.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		// return wd.switchTo().window(childWindow);
		wd.switchTo().window(childWindow);
	}

	public static String getCurrentProductName(WebDriver wd) {
		String name=wd
				.findElement(
						By.xpath("(.//div[@class='_1AtVbE col-12-12']/div[@class='aMaAEs']//span[@class='B_NuCI'])"))
				.getText();
		String[] name1= name.split("  ");
//		for(int i=0;i<name1.length;i++){
//			System.out.println(name1[i]);
//		}
		return name1[0];
	}

	public static String getCurrentProductPrice(WebDriver wd) {
		return wd
				.findElement(By
						.xpath("(.//div[@class='_1AtVbE col-12-12']/div[@class='aMaAEs']/child::div[4]/descendant::div[3])"))
				.getText();
	}

	public static String comparingProductDetails(WebDriver wd) {
		String ClickAfterProductName = StepDefinition.switchedProductName;
		String ClickBeforeProductName = StepDefinition.productName;
		String ClickAfterProductPrice = StepDefinition.switchedProductPrice;
		String ClickBeforeProductPrice = StepDefinition.productPrice;

		if (ClickAfterProductName.isEmpty()) {
             System.out.println("Product name is null");
		} else {
			Assert.assertEquals(ClickAfterProductName, ClickBeforeProductName);
			Assert.assertEquals(ClickAfterProductPrice, ClickBeforeProductPrice);
		}
		return "Successfully compared product details";
	}

}
