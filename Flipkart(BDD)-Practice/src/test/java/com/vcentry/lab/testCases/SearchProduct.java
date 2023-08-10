package com.vcentry.lab.testCases;

import com.vcentry.lab.pages.HomePage;
import com.vcentry.lab.pages.ProductListPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SearchProduct {

	@Then ("enter mobile name as {string}")
	public void enterMobileName(String data) {
		HomePage.searchProduct(data);
	}
	
	@And ("verify the list of contents")
	public void verifyTheListOfContents() {
	    String ProductName=ProductListPage.getFirstProductName();
	    String ProductPrice=ProductListPage.getFirstProductPrice();
	    System.out.println(ProductName);
	    System.out.println(ProductPrice);
	}
	
}
