package com.vcentry.lab.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vcentry.lab.base.Base;
import com.vcentry.lab.base.DriverFunction;
import com.vcentry.lab.base.Locators;

public class DetailsPage extends Base {

	public static void closePopUpModule() {
		DriverFunction.explicitWaitByXpath("detailspage_click_popup_xpath");
		Locators.findElement_ByXpath("detailspage_click_popup_xpath").click();
	}

	public static void selectHightestPriceOfDepart() throws InterruptedException {
		DriverFunction.explicitWaitByXpath("detailspage_wait_pricelist_xpath");
		DriverFunction.jseScrollIntoView(Locators.findElement_ByXpath("detailspage_wait_pricelist_xpath"));
		Thread.sleep(3000);
		List<WebElement> departflightlist = Locators.findElements_ByXpath("detailspage_collect_departflightlist_xpath");
		ArrayList departpricelist = new ArrayList();
		for (int i = 0; i < departflightlist.size(); i++) {
			WebElement priceList = departflightlist.get(i)
					.findElement(By.xpath(locatorProp.getProperty("detailspage_collect_departpricelist_xpath")));
			String price = priceList.getText();
			departpricelist.add(price);
			System.out.println(departpricelist.get(i));
		}
		Collections.sort(departpricelist);
		WebElement scrollToHightestPrice = departflightlist.get(departpricelist.size() - 1)
				.findElement(By.xpath(locatorProp.getProperty("detailspage_collect_departpricelist_xpath")));
		DriverFunction.jseScrollIntoView(scrollToHightestPrice);
		DriverFunction.explicitWaitByXpath("detailspage_click_departhighestprice_xpath");
		WebElement clickHightestPrice = departflightlist.get(departpricelist.size() - 1)
				.findElement(By.xpath(locatorProp.getProperty("detailspage_click_departhighestprice_xpath")));
		DriverFunction.checkBoxSelect(clickHightestPrice);
	}

	public static void selectHighestPriceofReturn() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> returnflightlist = Locators.findElements_ByXpath("detailspage_collect_returnfligtlist_xpath");
		ArrayList returnpricelist = new ArrayList();
		for (int i = 0; i < returnflightlist.size(); i++) {
			WebElement priceList = returnflightlist.get(i)
					.findElement(By.xpath(locatorProp.getProperty("detailspage_collect_returnpricelist_xpath")));
			String price = priceList.getText();
			returnpricelist.add(price);
			System.out.println(returnpricelist.get(i));
		}
		Collections.sort(returnpricelist);
		WebElement scrollToHightestPrice = returnflightlist.get(returnpricelist.size() - 1)
				.findElement(By.xpath(locatorProp.getProperty("detailspage_collect_returnpricelist_xpath")));
		DriverFunction.jseScrollIntoView(scrollToHightestPrice);
		DriverFunction.explicitWaitByXpath("detailspage_click_returnhighestprice_xpath");
		WebElement clickHightestPrice = returnflightlist.get(returnpricelist.size() - 1)
				.findElement(By.xpath(locatorProp.getProperty("detailspage_click_returnhighestprice_xpath")));
		DriverFunction.checkBoxSelect(clickHightestPrice);
	}

	public static void clickBookNowButton() {
		Locators.findElement_ByXpath("detailspage_click_booknowbutton_xpath").click();
	}

	public static void clickContinueButton() {
		DriverFunction.explicitWaitByXpath("detailspage_click_continuebutton_xpath");
		Locators.findElement_ByXpath("detailspage_click_continuebutton_xpath").click();
	}
}
