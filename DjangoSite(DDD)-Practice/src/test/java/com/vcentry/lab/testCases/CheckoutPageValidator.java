package com.vcentry.lab.testCases;

import java.io.IOException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.lab.initializer.Initializer;
import com.vcentry.lab.inputReader.InputReader;
import com.vcentry.lab.organizer.ScreenshotGenerator;
import com.vcentry.lab.pages.CheckOutPage;
import com.vcentry.lab.pages.HomePage;
import com.vcentry.lab.pages.LoginPage;

public class CheckoutPageValidator extends Initializer {

	@BeforeClass
	public void setUp() throws IOException{
		initializer();
	}
	
	@Test(dataProvider="CheckOutPageTest")
	public void validateCheckOutPage(String testId, String username, String password, String productName, String mobile, String email, String productCetagory, String ProductQuantity, String PurchaserName) {
		wd.get(envProp.getProperty("URL"));
		log = reports.startTest(testId);
//		extentreports - com.relevantcodes - For TestNg
//					  - com.aventstack - For Cucumber
		
        /**
          @author Gs praba
            Step1
		   wd.findElement(By.id("id_username")).sendKeys("prabakaran");
		   wd.findElement(By.id("id_password")).sendKeys("Gspraba@23");
		   wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button").click();
		   
		   wd.get(envProp.getProperty("LAB_URL"));
		   wd.findElement(By.id("element44")).click();
		   wd.findElement(By.id("element45")).click();
		   
		   wd.findElement(By.id("id0")).sendKeys("productAAA");
		   wd.findElement(By.id("id1")).sendKeys("9344346946");
		   wd.findElement(By.id("id2")).sendKeys("Gspraba@gmail.com"); Select
		   s=new Select(wd.findElement(By.id("id3")));
		   s.selectByVisibleText("Electrical");
		   wd.findElement(By.id("id4")).sendKeys("10");
		   wd.findElement(By.id("id5")).sendKeys("Purchaser AAA");
	      wd.findElement(By.id("idyes")).click();
		  wd.findElement(By.id("cod")).click();
		  wd.findElement(By.id("order")).click();
		 
		// Step2
		wd.findElement(By.id(locatorProp.getProperty("LOGINPAGE_TYPE_USERNAME_ID"))).sendKeys("prabakaran");
		wd.findElement(By.id(locatorProp.getProperty("LOGINPAGE_TYPE_PASSWORD_ID"))).sendKeys("Gspraba@23");
		wd.findElement(By.xpath(locatorProp.getProperty("LOGINPAGE_TYPE_LOGINBUTTON_XPATH"))).click();

		wd.get(envProp.getProperty("LAB_URL"));
		wd.findElement(By.id(locatorProp.getProperty("HOMEPAGE_TYPE_FRAMWORKSFORM_ID"))).click();
		wd.findElement(By.id(locatorProp.getProperty("HOMEPAGE_TYPE_SIMPLEFORM_ID"))).click();

		wd.findElement(By.id(locatorProp.getProperty("CHECKOUTPAGE_TYPE_PRODUCTNAME_ID"))).sendKeys("productAAA");
		wd.findElement(By.id(locatorProp.getProperty("CHECKOUTPAGE_TYPE_MOBILE_ID"))).sendKeys("9344346946");
		wd.findElement(By.id(locatorProp.getProperty("CHECKOUTPAGE_TYPE_EMAIL_ID"))).sendKeys("Gspraba@gmail.com");
		Select s = new Select(wd.findElement(By.id(locatorProp.getProperty("CHECKOUTPAGE_TYPE_PRODUCTCETAGORY_ID"))));
		s.selectByVisibleText("Electrical");
		wd.findElement(By.id(locatorProp.getProperty("CHECKOUTPAGE_TYPE_PRODUCTQUANTITY_ID"))).sendKeys("10");
		wd.findElement(By.id(locatorProp.getProperty("CHECKOUTPAGE_TYPE_PURCHASERNAME_ID"))).sendKeys("Purchaser AAA");
		wd.findElement(By.id(locatorProp.getProperty("CHECKOUTPAGE_TYPE_GSTAPPLIED_ID"))).click();
		wd.findElement(By.id(locatorProp.getProperty("CHECKOUTPAGE_TYPE_AVAILABLEPAYMENT_ID"))).click();
		wd.findElement(By.id(locatorProp.getProperty("CHECKOUTPAGE_TYPE_PLACEORDER_ID"))).click();  
		//Step3
		Finder.findById("LOGINPAGE_TYPE_USERNAME_ID").sendKeys("prabakaran");
		Finder.findById("LOGINPAGE_TYPE_PASSWORD_ID").sendKeys("Gspraba@23");
		Finder.findByXpath("LOGINPAGE_TYPE_LOGINBUTTON_XPATH").click();

		wd.get(envProp.getProperty("LAB_URL"));
		Finder.findById("HOMEPAGE_TYPE_FRAMWORKSFORM_ID").click();
		Finder.findById("HOMEPAGE_TYPE_SIMPLEFORM_ID").click();

		Finder.findById("CHECKOUTPAGE_TYPE_PRODUCTNAME_ID").sendKeys("productAAA");
		Finder.findById("CHECKOUTPAGE_TYPE_MOBILE_ID").sendKeys("9344346946");
		Finder.findById("CHECKOUTPAGE_TYPE_EMAIL_ID").sendKeys("Gspraba@gmail.com");
		Select s = new Select(Finder.findById("CHECKOUTPAGE_TYPE_PRODUCTCETAGORY_ID"));
		s.selectByVisibleText("Electrical");
		Finder.findById("CHECKOUTPAGE_TYPE_PRODUCTQUANTITY_ID").sendKeys("10");
		Finder.findById("CHECKOUTPAGE_TYPE_PURCHASERNAME_ID").sendKeys("Purchaser AAA");
		Finder.findById("CHECKOUTPAGE_TYPE_GSTAPPLIED_ID").click();
		Finder.findById("CHECKOUTPAGE_TYPE_AVAILABLEPAYMENT_ID").click();
		Finder.findById("CHECKOUTPAGE_TYPE_PLACEORDER_ID").click();
    **/
		//Step4
		//LoginPage
		LoginPage.enterUsername(username);
		LoginPage.enterPassword(password);
		LoginPage.clickLoginButton();
		log.log(LogStatus.PASS, "Login steps are completed");
		
		//HomePage
		wd.get(envProp.getProperty("LAB_URL"));
		HomePage.clickFrameworksForm();
		HomePage.clickSimpleForm();
		log.log(LogStatus.PASS, "HomePage steps are completed");
		
		//CheckOutPage
		CheckOutPage.enterProductName(productName);
		CheckOutPage.enterMobile(mobile);
		CheckOutPage.enterEmail(email);
		CheckOutPage.selectProductCetagory(productCetagory);
		CheckOutPage.enterProductQuantity(ProductQuantity);
		CheckOutPage.enterPurchaserName(PurchaserName);
        CheckOutPage.clickGst();
        CheckOutPage.clickAvailablePayment();
        CheckOutPage.clickPlaceOrderButton();
        log.log(LogStatus.PASS, "CheckoutPage steps are completed");
	}
	
	@DataProvider(name="CheckOutPageTest")
	public static Object[][] getData() throws IOException{
		if(InputReader.verifyRunMode("CheckoutPageValidator")){
			Object[][] data=InputReader.verifyMultiData("CheckoutPageValidator");
//			Object[][] data= new Object[1-times][9-data] - If it is single data
//			Object[][] data= new Object[5-times][9-data] - If it is multiple data
			
//		Object[][] data=new Object[3][9];
//		//First data set
//		data[0][0]="checkout_DataSet1";
//		data[0][1]="prabakaran";
//		data[0][2]="Gspraba@23";
//		data[0][3]="productAAA";
//		data[0][4]="9344346946";
//		data[0][5]="Gspraba@gmail.com";
//		data[0][6]="Electrical";
//		data[0][7]="10";
//		data[0][8]="Purchaser AAA";
//		
//		//second data set
//		data[1][0]="checkout_DataSet2";
//		data[1][1]="prabakaran";
//		data[1][2]="Gspraba@23";
//		data[1][3]="productAAA";
//		data[1][4]="9344346946";
//		data[1][5]="Gspraba@gmail.com";
//		data[1][6]="Electrical";
//		data[1][7]="10";
//		data[1][8]="Purchaser AAA";
//		
//		//third data set
//		data[2][0]="checkout_DataSet3";
//		data[2][1]="prabakaran";
//		data[2][2]="Gspraba@23";
//		data[2][3]="productAAA";
//		data[2][4]="9344346946";
//		data[2][5]="Gspraba@gmail.com";
//		data[2][6]="Electrical";
//		data[2][7]="10";
//		data[2][8]="Purchaser AAA";
		return data;
		}
		return null;
	}
	
	@AfterMethod
	public void tearDown(ITestResult it) throws IOException{
		HomePage.clickLogoutButton();
		ScreenshotGenerator.generateScreenshot(it);
		
		
//		if(result.isSuccess()){
//		String name=result.getParameters()[0].toString();
//		File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
//		File dst= new File("C:/Batch 256/J1_DDDTest/screenshot/"+name+".png");
//		FileHandler.copy(src, dst);
//	    }
	}
	
}


// Vector, Can we call the constructor inside another constructor, API testing activities, constructor types, window switch
