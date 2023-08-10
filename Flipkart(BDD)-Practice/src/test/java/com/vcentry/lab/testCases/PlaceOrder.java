package com.vcentry.lab.testCases;

import org.testng.Assert;

import com.vcentry.lab.pages.DetailsPage;
import com.vcentry.lab.pages.ProductListPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrder {

	String productName;
	String productPrice;

	@When("get first product name and price")
	public void GetFirstProductNameAndPrice() {
		productName = ProductListPage.getFirstProductName();
		productPrice = ProductListPage.getFirstProductPrice();
	}

	@Then("click first product link")
	public void clickFirstProductLink() {
		ProductListPage.clickFirstProductLink();
	}

	@Then("verify the first product name and price in details page")
	public void verifyTheFirstProductNameAndPriceInDetailsPage() {
		String PName = DetailsPage.getProductName();
		String PPrice = DetailsPage.getProductPrice();
		Assert.assertEquals(PName, productName);
		Assert.assertEquals(PPrice, productPrice);
	}

	@And("click add to cart")
	public void clickAddToCart() {
		DetailsPage.clickAddToCart();
	}
}
