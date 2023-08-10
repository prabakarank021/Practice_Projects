package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCart;
import pages.HomePage;
import pages.SwitchPage;
import utils.DriverFunction;

public class StepDefinition {

	static WebDriver wd;
	public static String productName;
	public static String productPrice;
	public static String switchedProductName;
	public static String switchedProductPrice;

	@Given("open browser as {string}")
	public void openBrowser(String browser) {
		wd = DriverFunction.openBrowser();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("enter url as {string}")
	public void enterUrl(String url) {
		DriverFunction.enterUrl(wd, url);
	}

	@And("close popup button")
	public void closePopupButton() {
		HomePage.closePopupButton(wd);
	}

	@When("enter input as {string}")
	public void searchProduct(String searchproduct) {
		HomePage.searchProduct(wd, searchproduct);
	}

	@And("get product name")
	public void getProductName() {
		String ProductName = HomePage.getProductName(wd);
		this.productName = ProductName;
		System.out.println("Product name - " + productName);
	}

	@And("get product price")
	public void getProductPrice() {
		String ProductPrice = HomePage.getProductPrice(wd);
		this.productPrice = ProductPrice;
		System.out.println("Product price - " + productPrice);
	}

	@And("click first product")
	public void clickFirstProduct() {
		HomePage.clickFirstProduct(wd);
	}

	@When("switch to next window")
	public void switchToNextWindow() {
		SwitchPage.switchToNextWindow(wd);
	}

	@When("get current product name")
	public void getCurrentProductName() {
		String currentPName = SwitchPage.getCurrentProductName(wd);
		this.switchedProductName = currentPName;
		System.out.println("After window switch product name - " + switchedProductName);
	}

	@And("get current product price")
	public void getCurrentProductPrice() {
		String currentPPrice = SwitchPage.getCurrentProductPrice(wd);
		this.switchedProductPrice = currentPPrice;
		System.out.println("After window switch product price - " + switchedProductPrice);
	}

	@And("comparing product details")
	public void comparingProductDetails() {
		String message=SwitchPage.comparingProductDetails(wd);
		System.out.println(message);
	}

	@When("add the product to the add to cart section")
	public void addingTheProductToTheAddtocartSection() {
		AddToCart.addTheProductToTheAddtocartSection(wd);
	}

	@And("remove the product from add to cart")
	public void removeTheProductFromAddtocart() {
		AddToCart.removeTheProductFromAddtocart(wd);
	}

	@Then("check if add to cart is empty")
	public void checkIfAddtocartIsEmpty() {
		String isEmpty=AddToCart.checkIfAddtocartIsEmpty(wd);
		System.out.println(isEmpty);
	}
}
