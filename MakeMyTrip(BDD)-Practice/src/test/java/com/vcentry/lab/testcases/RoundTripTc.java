package com.vcentry.lab.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;

import com.vcentry.lab.base.Base;
import com.vcentry.lab.organizer.ScreenshotGenerator;
import com.vcentry.lab.pages.CompletePage;
import com.vcentry.lab.pages.DetailsPage;
import com.vcentry.lab.pages.HomePage;
import com.vcentry.lab.pages.SearchPage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RoundTripTc extends Base{

	@When("click roundtrip option")
	public void click_roundtrip_option() {
		HomePage.clickRoundTripOption();
	}

	@When("select from city as {string}")
	public void select_from_city(String fromCity) throws AWTException, InterruptedException {
		SearchPage.selectFromCity(fromCity);
	}

	@And("select to city as {string}")
	public void select_to_city(String toCity) throws AWTException {
		SearchPage.selectToCity(toCity);
	}

	@When("select departure date as {string}")
	public void select_departure_date(String string) {
		SearchPage.selectFromDate();
	}

	@And("select return date as {string}")
	public void select_return_date(String string) {
		SearchPage.selectToDate();
	}

	@When("select no.of traveller and ticket class")
	public void select_no_of_traveller_and_ticket_class() {
		SearchPage.selectTraveller();
		SearchPage.selectClass();
	}

	@And("click the search button")
	public void click_the_search_button() {
		SearchPage.clickSearchButton();
	}

	@Then("close the popup module")
	public void close_the_popup_module() {
		DetailsPage.closePopUpModule();
	}

	@When("select the highest price Departure flight")
	public void select_the_highest_price_departure_flight() throws InterruptedException {
		DetailsPage.selectHightestPriceOfDepart();
	}

	@And("select the highest price return flight")
	public void select_the_highest_price_return_flight() throws InterruptedException {
		DetailsPage.selectHighestPriceofReturn();
	}

	@When("click the booknow button")
	public void click_the_booknow_button() {
		DetailsPage.clickBookNowButton();
	}

	@And("click the confirm button")
	public void click_the_confirm_button() {
		DetailsPage.clickContinueButton();
	}
	
	@When ("verify complete page text as {string}")
	public static void verifyCompletePageText(String expectedText) {
		CompletePage.verifyCompletePage(expectedText);
	}
	
	@AfterStep
	public static void tearDown(Scenario s) throws IOException {
		ScreenshotGenerator.generateScreenshot(s);
	}
	
	@After
	public static void closeWindow() {
		wd.quit();
	}
}
