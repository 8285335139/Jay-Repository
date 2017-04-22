package com.dominos.order.pkg;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dominos.generic.pkg.Generic_Methods;

public class Order_Scripts extends Generic_Methods {

	
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) throws Exception{
       //Check if parameter passed from TestNG is 'firefox'
         if(browser.equalsIgnoreCase("Firefox")){
        	 driver = new FirefoxDriver();
        }
	       else if(browser.equalsIgnoreCase("chrome")){
			  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			  driver=new ChromeDriver();
         }
           else if(browser.equalsIgnoreCase("IE")){
 			  System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
 			  driver=new InternetExplorerDriver();
         }
   //      fn_LoginApp();
         fn_LandingHome();
         Thread.sleep(3000);
         
         Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
 		 pizzaorder.fn_SelectPizzaStore();
         
         }
	
//	@AfterMethod
//	public void HomePage_Delivery() throws InterruptedException{
//		Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
//		pizzaorder.fn_ClickLocationTab();
//	}

	
	@Test(priority=1, enabled=false)
    public void fn_ValidateOrderbyAddToCart() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	   pizzaorder.fn_OrderbyAddToCart();
	
	}

	
	@Test(priority=2, enabled=false)
    public void fn_ValidateAmountWithoutCustomize() throws InterruptedException, IOException {
   	  Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.AmountVerify_MediumSizeWithoutTopping();
	
	}
	
	
	@Test(priority=3, enabled=false)
    public void fn_OrderDeal() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderDeal();
	
	}
	
	
	@Test(priority=4, enabled=false)
    public void fn_OrderDealWithPizza() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderDealWithPizza();
	
	}
	
	
	@Test(priority=5, enabled=false)
    public void fn_OrderPizzaWithUpsell() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderPizzaWithUpsell();
	
	}
	
	
	@Test(priority=6, enabled=false)
    public void fn_OrderPizzawithTopping() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderPizzawithTopping();
	
	}

	
	@Test(priority=7, enabled=false)
    public void fn_OrderDealandPizzawithUpsell() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderDealandPizzawithUpsell();
	
	}
	
	
	@Test(priority=8, enabled=false)
    public void fn_OrderPizzaMania() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderPizzaManiaWithPizza();
	
	}   
    
    
    @Test(priority=9, enabled=false)
    public void fn_OrderPizzabyCrustCustmize() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderPizzabyCrustCustmize();
	
	}  
	
	
	@Test(priority=10, enabled=false)
    public void fn_OrderDealwithTopping() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderDealwithTopping();
	
	}  
	
    @Test(priority=11, enabled=false)
    public void fn_OrderDealbyCrustCustomize() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderDealbyCrustCustomize();
	
	} 
	
	
    @Test(priority=12, enabled=false)
    public void fn_OrderTwoDealswithUpsell() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderTwoDealswithUpsell();
	
	} 
	
	
	
    @Test(priority=13, enabled=false)
    public void fn_OrderDealWithPizzaandSide() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderDealWithPizzaandSide();
	
	}
	
	
	
    @Test(priority=14, enabled=false)
    public void fn_OrderPizzaManiaWithSide() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderPizzaManiaWithSide();
	
	} 
    
    
    
    @Test(priority=15, enabled=false)
    public void fn_OrderDealwithPizzaManiaandUpsell() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderDealwithPizzaManiaandUpsell();
	
	} 
    
    
    
    @Test(priority=16, enabled=false)
    public void fn_OrderDealwithPizzaManiaSideBeverageDesert() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderDealwithPizzaManiaSideBeverageDesert();
	
	} 
    
    
    
    @Test(priority=17, enabled=false)
    public void fn_VerifyCouponWithDeal() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_VerifyCouponWithDeal();
	
	}  
    
   
    
    @Test(priority=18, enabled=false)
    public void fn_RemoveCorePizzaWithUpsell() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_RemoveCorePizzaWithUpsell();
	
	} 
    
    
    @Test(priority=19, enabled=false)
    public void fn_RemoveDealwithUpsell() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_RemoveDealwithUpsell();
	
	} 
       
    
    
    @Test(priority=20, enabled=false)
    public void fn_OrderPizzabyReplaceTopping() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderPizzabyReplaceTopping();
	
	}     
    
    
    @Test(priority=21, enabled=false)
    public void fn_OrderDealbyReplaceTopping() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_OrderDealbyReplaceTopping();
	
	}     
    
    
    
    @Test(priority=22, enabled=false)
    public void fn_VerifyErrorMessageReplaceTopping() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_VerifyErrorMessageReplaceTopping();
	
	}
    
	
    @Test(priority=23, enabled=false)
    public void fn_VerifyErrorMessageReplaceToppingDeal() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_VerifyErrorMessageReplaceToppingDeal();
	
	} 
    
    
    
    @Test(priority=24, enabled=false)
    public void AmountVerify_CartandReviewPage() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.AmountVerify_CartandReviewPage();
	
	}  
    
   
    @Test(priority=25, enabled=false)
    public void fn_VerifyAlertonStep2() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_VerifyAlertonStep2();
	
	}  
    
    
    
    @Test(priority=26, enabled=false)
    public void fn_VerifyEveryDayValueOfferText() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_VerifyEveryDayValueOfferText();
	
	} 
    
    
    @Test(priority=27, enabled=true)
    public void fn_MandatoryfieldsValidation() throws InterruptedException, IOException {
   	 Pizza_Order pizzaorder=PageFactory.initElements(driver, Pizza_Order.class);
	    pizzaorder.fn_MandatoryfieldsValidation();
	
	} 

    
	
   }

	
	
	
  
