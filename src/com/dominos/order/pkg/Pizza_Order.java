package com.dominos.order.pkg;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dominos.generic.pkg.Generic_Methods;

public class Pizza_Order extends Generic_Methods {

	
	
	@FindBy(id = "custCity")
	public WebElement CustCity_TB;
	
	@FindBy(xpath = "//form[@id='buildOrderForm']/div/div/div/span/a/span")
	public WebElement city_select;
	
	@FindBy(xpath = "//ul[@id='ui-id-1']/li[2]")
	public WebElement Banglore_City;
	
	@FindBy(id = "custAddress")
	public WebElement CustAddress_TB;
	
	@FindBy(id = "buildOrderBtn")
	public WebElement BuildOrder_BT;
	
	@FindBy(xpath = "//ul[@id='orderMenu']/li/a")
	public WebElement EveryDayValueOffers_LK;
	
	@FindBy(xpath = "//ul[@id='orderMenu']/li[2]/a")
	public WebElement PizzaMenu_LK;
	
	@FindBy(linkText= "PIZZA MANIA")
	public WebElement PizzaMania_LK;
	
	@FindBy(linkText= "OK")
	public WebElement OkPizzaMania_BT;
	
	@FindBy(xpath = "//ul[@id='pizza_mania_extremes_veg_0']/li/div")
	public WebElement VegLoaded_PizzaMania;
	
	@FindBy(xpath = "//ul[@id='pizza_mania_extremes_veg_0']/li/div/div[5]/div/a")
	public WebElement AddToCartVegLoaded_PizzaMania;
	
	@FindBy(xpath = "//ul[@id='feast_pizzas__veg_0']/li[1]")
	public WebElement DeluxeVeggie_Pizza;
	
	@FindBy(xpath = "//ul[@id='feast_pizzas__veg_0']/li[2]")
	public WebElement VegExtraVaganza_Pizza;

	@FindBy(id = "size_btn_regular_1")
	public WebElement Regularsize_LK;
	
	@FindBy(id = "size_btn_large_1")
	public WebElement Largesize_LK;
	
	@FindBy(id = "quick_add_1")
	public WebElement QuickAddDuluxeViggie_LK;
	
	@FindBy(id = "quick_add_2")
	public WebElement QuickAddVegExtraVaganza_LK;
	
	@FindBy(id = "customize_pizza_1")
	public WebElement CustomizePizza1_BT;
	
	@FindBy(id = "customize_pizza_2")
	public WebElement CustomizePizza2_BT;
	
	@FindBy(id = "customPriceId")
	public WebElement Price_CustomizePage;
	
	@FindBy(id = "add-to-cart-buy-now")
	public WebElement BuyNow_BT;
	
	@FindBy(id = "upsellingSlide")
	public WebElement Upsell_Popup;
	
	@FindBy(id = "crossButtonUpselling")
	public WebElement SkipPopup_BT;
	
	@FindBy(xpath = "//div[@id='cartView']/div/ul/li/div[4]/p")
	public WebElement PriceReviewPage_TX;
	
	@FindBy(id = "net_price")
	public WebElement NetPriceReviewPage_TX;	
	
	@FindBy(id = "total_price")
	public WebElement TotalPaybleReviewPage_TX;
	
	@FindBy(id = "checkout")
	public WebElement CheckOut_BT;
	
	@FindBy(id = "firstname")
	public WebElement FirstName_TB;
	
	@FindBy(id = "lastname")
	public WebElement LastName_TB;
	
	@FindBy(id = "email_id")
	public WebElement EmailId_TB;
	
	@FindBy(id = "mobile")
	public WebElement Mobile_TB;

	@FindBy(id = "flat_no")
	public WebElement Flat_TB;

    @FindBy(id = "street")
	public WebElement Street_TB;

    @FindBy(id = "favorite-order-name")
   	public WebElement OrderName_TB;
    
    @FindBy(xpath = "//ul[@id='nextdayordering']/li/span")
	public WebElement NextDay_RB;
    
    @FindBy(xpath = "//ul[@id='nextdayordering']/li[2]/span")
   	public WebElement SameDay_RB;
    
    @FindBy(id = "advancetime")
	public WebElement AdvanceTime_DD;
    
    @FindBy(id = "proceed_to_payment_button")
	public WebElement PlaceOrder_BT;
    
    @FindBy(id = "cod-tab")
	public WebElement COD_LK;
   
    @FindBy(id = "send-otp")
	public WebElement AuthenticationOTP_LK;
    
    @FindBy(id = "submit-otpcode")
   	public WebElement Submit_BT;
    
    @FindBy(id = "cashformbutton")
   	public WebElement CaptchaSub_BT;
    
    @FindBy(id = "customizePizza_82")
   	public WebElement SelectOffer1_BT;
    
    @FindBy(id = "customizePizza_83")
   	public WebElement SelectOffer2_BT;
    
   
    @FindBy(xpath = "//ul[@id='pizza-row-s0-0']/li/div/div[4]/div/a")
    public WebElement Customizedeal1_BT;
    
    @FindBy(id = "deal-add_0")
   	public WebElement Add1stPizza_BT;
    
    @FindBy(xpath = "//ul[@id='pizza-row-s1-0']/li[2]/div/div[5]/div/a")
   	public WebElement Customizedeal2_BT;
    
    @FindBy(xpath = "//ul[@id='pizza-row-s1-0']/li[2]/div/div[4]/div/a")
   	public WebElement Customizedeal2offer2_BT;
    
    @FindBy(id = "deal-add_1")
   	public WebElement Add2ndPizza_BT;
    
    @FindBy(id = "captcha-form")
   	public WebElement Captcha_TB;
    
    @FindBy(id = "netPayable")
   	public WebElement NetPricePaymentPage_TX;
    
    @FindBy(id = "totalPayable")
   	public WebElement TotalPayablePaymentPage_TX;
    
    @FindBy(xpath = "//div[@id='summaryBox']/div/p[3]")
   	public WebElement NetPriceThankyouPage_TX;
    
    @FindBy(xpath = "//div[@id='summaryBox']/div[4]/p[3]")
   	public WebElement TotalPayableThankyouPage_TX;
    
    @FindBy(xpath = "//div[@id='summaryBox']/div[2]/p[3]")
   	public WebElement NetPriceDealThankyouPage_TX;
    
    @FindBy(xpath = "//div[@id='summaryBox']/div[5]/p[3]")
   	public WebElement TotalPayableDealThankyouPage_TX;
    
    @FindBy(xpath = "//span[@id='upsell_div_side_21'][2]")
    public WebElement Upsellitem1_Add;
    
    @FindBy(xpath = "//span[@id='upsell_div_side_61'][2]")
    public WebElement Upsellitem2_Add;
    
    @FindBy(id = "upsell_quick_sides")
   	public WebElement UpsellAddToCart_BT;
    
    @FindBy(id = "login")
   	public WebElement LoginSignup_BT;
    
    @FindBy(id = "txtMobileNo")
   	public WebElement Mobileno_TB;
  
    @FindBy(id = "txtPassword")
   	public WebElement Password_TB;
    
    @FindBy(id = "userlogin")
   	public WebElement Login_BT;
    
    @FindBy(xpath = "//div[@id='vegToppings']/ul/li[4]/a/img")
   	public WebElement Topping4_LK;
    
    @FindBy(xpath = "//div[@id='sticky-wrapper']/header/section/div/div[2]/div/ul/li/a")
 // @FindBy(linkText = "LOCATION")
   	public WebElement Location_BT;
  
    @FindBy(xpath = "//div[@id='sticky-wrapper']/header/section[2]/div/div[2]/div/ul/li[2]/a")
    public WebElement Menu_BT;
    
    @FindBy(xpath = "//a[@id='crust-type-3']/img")
   	public WebElement CrustWTC_LK;
  
    @FindBy(xpath = "//ul[@id='orderMenu']/li[4]/a")
    public WebElement Sides_LK;
    
    @FindBy(id = "quick_side_27")
   	public WebElement SideWhitePastaNonveg_LK;
    
    @FindBy(xpath = "//div[@id='sticky-wrapper']/header/section[4]/div[3]/div/div/ul/li[4]/a")
    public WebElement Beverages_LK;
    
    @FindBy(id = "quick_side_34")
   	public WebElement CokeAdd_LK;
    
    @FindBy(xpath = "//div[@id='sticky-wrapper']/header/section[4]/div[3]/div/div/ul/li[5]/a")
    public WebElement More_LK;
    
    @FindBy(id = "quick_side_37")
   	public WebElement LavaCakeAdd_LK;
    
    @FindBy(id = "discount_amount")
   	public WebElement DealDiscountAmountReviewpage_TX;

    @FindBy(xpath = "//div[@id='summaryBox']/div[1]/p[3]")
    public WebElement DealDiscountAmountThankyoupage_TX;
    
    @FindBy(xpath = "//form[@id='review_order_form']/div/div/div/div[3]/div/span/a")
    public WebElement GotACoupon_LK;
    
    @FindBy(xpath = "//div[@id='cartView']/div/ul/li/a[2]")
    public WebElement RemoveCorePizza_LK;
  
    @FindBy(xpath = "//div[@id='cartView']/div/div/a")
    public WebElement RemoveDeal_LK;
    
    @FindBy(xpath = "//div[@id='sticky-wrapper']/header/section[4]/div[2]/div[2]/ul/li[2]/span")
    public WebElement CartAmount_TX;
  
    @FindBy(xpath = "//div[@id='replaceTopping']/a")
    public WebElement ReplaceTopping_LK;
  
    @FindBy(xpath = "//div[@id='replaceToppings']/div/div[2]/ul/li/a")
    public WebElement ReplaceTopping1_LK;
    
    @FindBy(xpath = "//div[@id='replaceToppings']/div/div[2]/ul/li[2]/a")
    public WebElement ReplaceTopping2_LK;
  
    @FindBy(xpath = "//button[@name='jqi_state0_buttonOk']")
    public WebElement ToppingPopupOk_BT;
  
    @FindBy(id = "screen-button_1")
   	public WebElement Step2_LK;
    
    @FindBy(xpath = "//button[@name='jqi_state0_buttonOk']")
    public WebElement AlertOk_BT;
    
    @FindBy(xpath = "//div[@id='dealOffers']/div/div/h3")
    public WebElement Everydayvalueoffer_TX;
  
    
  
  
  
    
     
    public Order fn_SelectPizzaStore() throws InterruptedException{
    	fn_Click(city_select);
        Thread.sleep(2000);
    	fn_Click(Banglore_City);
    	Thread.sleep(5000);
    	fn_Input(CustAddress_TB,"POKHRA");
    	Thread.sleep(3000);
    	fn_Click(BuildOrder_BT);
    	Thread.sleep(5000);
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
    }
    
    
    public Order fn_ClickLocationTab() throws InterruptedException{
    	Thread.sleep(3000);
    	fn_Click(Location_BT);
        Thread.sleep(3000);
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
    }
    
    
    public void fn_LoginUser() throws InterruptedException{
    	fn_Click(LoginSignup_BT);
        Thread.sleep(2000);
    	fn_Input(Mobileno_TB,"8285335139");
    	Thread.sleep(2000);
    	fn_Input(Password_TB,"3988");
    	Thread.sleep(2000);
    	fn_Click(Login_BT);
    	Thread.sleep(5000);
    }
    
    
    public void fn_DeliveryDetails() throws InterruptedException{
    	fn_Input(FirstName_TB, "Jay");
        fn_Input(LastName_TB, "Prakash");
        fn_Input(EmailId_TB, "jay.prakash@incaendo.com");
        fn_Input(Mobile_TB, "8285335139");
        fn_Input(Flat_TB, "14 A");
        fn_Input(Street_TB, "Mayur Vihar");
    }
    
    public void fn_CODPayment() throws InterruptedException{
    	Thread.sleep(3000);
//    	fn_Click(PlaceOrder_BT);
//    	Thread.sleep(2000);
    	fn_Click(COD_LK);
    	Thread.sleep(2000);
//        fn_Input(Captcha_TB,"9654336929");
//        Thread.sleep(10000);
    //	fn_Click(CaptchaSub_BT);
    	fn_Click(AuthenticationOTP_LK);
    	Thread.sleep(20000);
    	fn_Click(Submit_BT);
    	Thread.sleep(15000);
    }
    
    
    
    public void fn_AmountVerify_Deal() throws InterruptedException, IOException{
    	
    	
    	String dealdiscountamtreviewpage=DealDiscountAmountReviewpage_TX.getText().trim();
    	System.out.println("Deal discount amount on Review page:"+ dealdiscountamtreviewpage);
    	
    	String netpricereviewpage=NetPriceReviewPage_TX.getText().trim();
    	System.out.println("Net price on Review page:"+ netpricereviewpage);
    	
    	String totalpayblereviewpage=TotalPaybleReviewPage_TX.getText().trim();
    	System.out.println("Total Payable amount on Review Page:"+ totalpayblereviewpage);
    	Thread.sleep(2000);
    	fn_Click(PlaceOrder_BT);
    	
    	String netpricepaymentpage=NetPricePaymentPage_TX.getText().trim();
    	System.out.println("Net price on Payment page:"+ netpricepaymentpage);
    	
    	String totalpayblepaymentpage=TotalPayablePaymentPage_TX.getText().trim();
    	System.out.println("Total Payable amount on Payment Page:"+ totalpayblepaymentpage);
    	
    	assert(netpricereviewpage.equals(netpricepaymentpage));
    	System.out.println("Net price is correct: Passed");
    	
    	assert(totalpayblereviewpage.equals(totalpayblepaymentpage));
    	System.out.println("Total Payable price is correct: Passed");
    	
    	fn_CODPayment();
    	
    	try{
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	
    //Tomorrow to be done
//    	String dealdiscountamountthankyoupage=DealDiscountAmountThankyoupage_TX.getText().trim();
//       String discountamount=dealdiscountamountthankyoupage.split("\\.")[0].replaceAll("0", "").trim();
//        
//        System.out.println("Deal Discount amount on Thankyou page:"+ dealdiscountamountthankyoupage);
//        
//        assert(dealdiscountamtreviewpage.equals(dealdiscountamountthankyoupage));
    	
    	
    	
    	String netpricedealthankyoupage=NetPriceDealThankyouPage_TX.getText();
		try{
		if(netpricedealthankyoupage.contains(",")){
			String actualnetpricethankyoupage=netpricedealthankyoupage.replaceAll(",", "").trim();
			
			System.out.println("Net Price on Thankyou Page:"+ actualnetpricethankyoupage);
        	assert(netpricepaymentpage.equals(actualnetpricethankyoupage));
			
        	}}
        catch(Exception e ){
        	System.out.println("Net Price on Thankyou Page:"+ netpricedealthankyoupage);
        	assert(netpricepaymentpage.equals(netpricedealthankyoupage));
        }
		
		String totalpayabledealthankyoupage=TotalPayableDealThankyouPage_TX.getText();
		
		try{
    		if(totalpayabledealthankyoupage.contains(",")){
    			String actualtotalpricethankyoupage=totalpayabledealthankyoupage.replaceAll(",", "").trim();
    			
    			System.out.println("Total Payable on Thankyou Page:"+ actualtotalpricethankyoupage);
            	assert(totalpayblepaymentpage.equals(actualtotalpricethankyoupage));
    			
            	}}
            catch(Exception e ){
            	System.out.println("Total Payable on Thankyou Page:"+ totalpayabledealthankyoupage);
            	assert(totalpayblepaymentpage.equals(totalpayabledealthankyoupage));
            }

		    fn_ClickLocationTab();
        }
       catch(Exception e){
    	fn_ClickLocationTab();
    }
    	finally{
    		fn_ClickLocationTab();
    	}
    }
    
    
    public void fn_AmountVerify_Pizza() throws InterruptedException, IOException{
    	String netpricereviewpage=NetPriceReviewPage_TX.getText().trim();
    	System.out.println("Net price on Review page:"+ netpricereviewpage);
    	
    	String totalpayblereviewpage=TotalPaybleReviewPage_TX.getText().trim();
    	System.out.println("Total Payable amount on Review Page:"+ totalpayblereviewpage);
    	Thread.sleep(2000);
    	fn_Click(PlaceOrder_BT);
    	
    	String netpricepaymentpage=NetPricePaymentPage_TX.getText().trim();
    	System.out.println("Net price on Payment page:"+ netpricepaymentpage);
    	
    	String totalpayblepaymentpage=TotalPayablePaymentPage_TX.getText().trim();
    	System.out.println("Total Payable amount on Payment Page:"+ totalpayblepaymentpage);
    	
    	assert(netpricereviewpage.equals(netpricepaymentpage));
    	System.out.println("Net price is correct: Passed");
    	
    	assert(totalpayblereviewpage.equals(totalpayblepaymentpage));
    	System.out.println("Total Payable price is correct: Passed");
    	
    	fn_CODPayment();
    	
    	try{
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	
    	String netpricethankyoupage=NetPriceThankyouPage_TX.getText().trim();
    	
    	try{
    		if(netpricethankyoupage.contains(",")){
    			String actualnetpricethankyoupage=netpricethankyoupage.replaceAll(",", "").trim();
    			
    			System.out.println("Net Price on Thankyou Page:"+ actualnetpricethankyoupage);
            	assert(netpricepaymentpage.equals(actualnetpricethankyoupage));
    			
            	}}
    	
    	catch(Exception E ){
        	System.out.println("Net Price on Thankyou Page:"+ netpricethankyoupage);
        	assert(netpricepaymentpage.equals(netpricethankyoupage));
        }
    	
    	String totalpayablethankyoupage=TotalPayableThankyouPage_TX.getText();
    	
    	
    	try{
    		if(totalpayablethankyoupage.contains(",")){
    			String actualtotalpricethankyoupage=totalpayablethankyoupage.replaceAll(",", "").trim();
    			
    			System.out.println("Total Payable on Thankyou Page:"+ actualtotalpricethankyoupage);
            	assert(totalpayblepaymentpage.equals(actualtotalpricethankyoupage));
    			
            	}}
            catch(Exception E ){
            	System.out.println("Total Payable on Thankyou Page:"+ totalpayablethankyoupage);
            	assert(totalpayblepaymentpage.equals(totalpayablethankyoupage));
            }
    
    	    fn_ClickLocationTab();
    	
           }
         //  }
    catch(Exception e){
    	fn_ClickLocationTab();
    	 }
    	finally{
    		fn_ClickLocationTab();
    	}
    	
    	}

    
    public void fn_AmountVerify() throws InterruptedException, IOException{
    	String netpricereviewpage=NetPriceReviewPage_TX.getText().trim();
    	System.out.println("Net price on Review page:"+ netpricereviewpage);
    	
    	String totalpayblereviewpage=TotalPaybleReviewPage_TX.getText().trim();
    	System.out.println("Total Payable amount on Review Page:"+ totalpayblereviewpage);
    	Thread.sleep(2000);
    	fn_Click(PlaceOrder_BT);
    	
    	String netpricepaymentpage=NetPricePaymentPage_TX.getText().trim();
    	System.out.println("Net price on Payment page:"+ netpricepaymentpage);
    	
    	String totalpayblepaymentpage=TotalPayablePaymentPage_TX.getText().trim();
    	System.out.println("Total Payable amount on Payment Page:"+ totalpayblepaymentpage);
    	
    	assert(netpricereviewpage.equals(netpricepaymentpage));
    	System.out.println("Net price is correct: Passed");
    	
    	assert(totalpayblereviewpage.equals(totalpayblepaymentpage));
    	System.out.println("Total Payable price is correct: Passed");
    	
    	fn_CODPayment();
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	
    	try{
    	if(TotalPayableDealThankyouPage_TX.isDisplayed()){
    		
    		String netpricedealthankyoupage=NetPriceDealThankyouPage_TX.getText();
    		try{
    		if(netpricedealthankyoupage.contains(",")){
    			String actualnetpricethankyoupage=netpricedealthankyoupage.replaceAll(",", "").trim();
    			
    			System.out.println("Net Price on Thankyou Page:"+ actualnetpricethankyoupage);
            	assert(netpricepaymentpage.equals(actualnetpricethankyoupage));
    			
            	}}
            catch(Exception e ){
            	System.out.println("Net Price on Thankyou Page:"+ netpricedealthankyoupage);
            	assert(netpricepaymentpage.equals(netpricedealthankyoupage));
            }
    		
    		String totalpayabledealthankyoupage=TotalPayableDealThankyouPage_TX.getText();
    		
    		try{
        		if(totalpayabledealthankyoupage.contains(",")){
        			String actualtotalpricethankyoupage=totalpayabledealthankyoupage.replaceAll(",", "").trim();
        			
        			System.out.println("Total Payable on Thankyou Page:"+ actualtotalpricethankyoupage);
                	assert(totalpayblepaymentpage.equals(actualtotalpricethankyoupage));
        			
                	}}
                catch(Exception e ){
                	System.out.println("Total Payable on Thankyou Page:"+ totalpayabledealthankyoupage);
                	assert(totalpayblepaymentpage.equals(totalpayabledealthankyoupage));
                }
    		
//        	System.out.println("Net Price on Thankyou Page:"+ netpricedealthankyoupage);
//        	assert(netpricepaymentpage.equals(netpricedealthankyoupage));
//        	String totalpayabledealthankyoupage=TotalPayableDealThankyouPage_TX.getText().trim();
//        	System.out.println("Total Payable on Thankyou Page:"+ totalpayabledealthankyoupage);
//        	assert(totalpayblepaymentpage.equals(totalpayabledealthankyoupage));
//        	Thread.sleep(3000);
//        	fn_Click(Location_BT);
//        	Thread.sleep(3000);
    	}
    	}
    	catch(Exception e){
	    	String netpricethankyoupage=NetPriceThankyouPage_TX.getText().trim();
	    	
	    	try{
	    		if(netpricethankyoupage.contains(",")){
	    			String actualnetpricethankyoupage=netpricethankyoupage.replaceAll(",", "").trim();
	    			
	    			System.out.println("Net Price on Thankyou Page:"+ actualnetpricethankyoupage);
	            	assert(netpricepaymentpage.equals(actualnetpricethankyoupage));
	    			
	            	}}
	    	
	    	catch(Exception E ){
            	System.out.println("Net Price on Thankyou Page:"+ netpricethankyoupage);
            	assert(netpricepaymentpage.equals(netpricethankyoupage));
            }
	    	
	    	String totalpayablethankyoupage=TotalPayableThankyouPage_TX.getText();
	    	
	    	
	    	try{
        		if(totalpayablethankyoupage.contains(",")){
        			String actualtotalpricethankyoupage=totalpayablethankyoupage.replaceAll(",", "").trim();
        			
        			System.out.println("Total Payable on Thankyou Page:"+ actualtotalpricethankyoupage);
                	assert(totalpayblepaymentpage.equals(actualtotalpricethankyoupage));
        			
                	}}
                catch(Exception E ){
                	System.out.println("Total Payable on Thankyou Page:"+ totalpayablethankyoupage);
                	assert(totalpayblepaymentpage.equals(totalpayablethankyoupage));
                }
	    	
	    	
//	    	System.out.println("Net Price on Thankyou Page:"+ netpricethankyoupage);
//	    	assert(netpricepaymentpage.equals(netpricethankyoupage));
//	    	String totalpayablethankyoupage=TotalPayableThankyouPage_TX.getText().trim();
//	    	System.out.println("Total Payable on Thankyou Page:"+ totalpayablethankyoupage);
//	    	assert(totalpayblepaymentpage.equals(totalpayablethankyoupage));
//	    	Thread.sleep(3000);
//	    	fn_Click(Location_BT);
//	    	Thread.sleep(3000);
    	}
    	    fn_ClickLocationTab();
    }
    
  
    public Order AmountVerify_MediumSizeWithoutTopping() throws InterruptedException, IOException{
    	   try{
    	Thread.sleep(3000);
            fn_Click(PizzaMenu_LK);
        	Thread.sleep(2000);
        	fn_mouseOver(DeluxeVeggie_Pizza);
        	Thread.sleep(2000);
        	fn_Click(CustomizePizza1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown100();
          //String pricewithoutcustomize="440.00";
           String pricewithoutcustomize=Price_CustomizePage.getText();
        	System.out.println("Actual Price of pizza:" + pricewithoutcustomize);
        	
            fn_Click(BuyNow_BT);
        	Thread.sleep(15000);
        	fn_Click(Upsellitem1_Add);
        	Thread.sleep(2000);
        	fn_Click(UpsellAddToCart_BT);
        	Thread.sleep(3000);
        	fn_DeliveryDetails();
        	fn_AmountVerify_Pizza();
    	   }
    	   catch(NoSuchElementException e){
           	fn_Click(Menu_BT);
           	Thread.sleep(3000);
           }
            Order orderobj = PageFactory.initElements(driver, Order.class);
    		return orderobj;
        	
        	}
    
    
    
    public Order fn_OrderbyAddToCart() throws InterruptedException, IOException{
           try{
    	    Thread.sleep(3000);
            fn_Click(PizzaMenu_LK);
      //  	fn_ScrollDown100();
            Thread.sleep(2000);
        	fn_mouseOver(DeluxeVeggie_Pizza);
        	Thread.sleep(2000);
        	fn_Click(QuickAddDuluxeViggie_LK);
        	Thread.sleep(3000);
        	fn_Click(CheckOut_BT);
        	Thread.sleep(15000);
        	fn_Click(SkipPopup_BT);
        	Thread.sleep(4000);
        	
  //      	fn_FetchExcelData(1);
        	
        	
        	fn_DeliveryDetails();
        	fn_AmountVerify_Pizza();
           }
           catch(NoSuchElementException e){
           	fn_Click(Menu_BT);
           	Thread.sleep(3000);
           }
        	Order orderobj = PageFactory.initElements(driver, Order.class);
    		return orderobj;
        	
          }
        
    
    
    public Order fn_OrderDeal() throws InterruptedException, IOException{
            try{
    	    Thread.sleep(3000);
        	fn_Click(SelectOffer1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Customizedeal1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_WiatUntilVisible(Add1stPizza_BT);
        	fn_Click(Add1stPizza_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_WiatUntilVisible(Customizedeal2_BT);
        	fn_Click(Customizedeal2_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_WiatUntilVisible(Add2ndPizza_BT);
        	fn_Click(Add2ndPizza_BT);
        	Thread.sleep(15000);
        // try{
        	if(Upsell_Popup.isDisplayed()){
        			fn_Click(SkipPopup_BT);
                	 Thread.sleep(4000);	
        			 fn_DeliveryDetails();
        			 fn_AmountVerify_Deal();
                }
        	//}
        	else{
        		fn_DeliveryDetails();
        		fn_AmountVerify_Deal();
        	  }
            }
            catch(NoSuchElementException e){
            	fn_Click(Menu_BT);
            	Thread.sleep(3000);
            }
        	Order orderobj = PageFactory.initElements(driver, Order.class);
    		return orderobj;
        	
         }
    
    
    
    public Order fn_OrderDealWithPizza() throws InterruptedException, IOException{
    	try{
    	Thread.sleep(2000);
        fn_Click(PizzaMenu_LK);
  //  	fn_ScrollDown100();
        Thread.sleep(2000);
    	fn_mouseOver(VegExtraVaganza_Pizza);
    	Thread.sleep(2000);
    	fn_Click(QuickAddVegExtraVaganza_LK);
    	Thread.sleep(3000);
    	fn_Click(EveryDayValueOffers_LK);	
    	Thread.sleep(2000);	
           	fn_Click(SelectOffer1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_WiatUntilVisible(Customizedeal1_BT);
        	fn_Click(Customizedeal1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_WiatUntilVisible(Add1stPizza_BT);
        	fn_Click(Add1stPizza_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_WiatUntilVisible(Customizedeal2_BT);
        	fn_Click(Customizedeal2_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_WiatUntilVisible(Add2ndPizza_BT);
        	fn_Click(Add2ndPizza_BT);
        	Thread.sleep(15000);
        // try{
        	if(Upsell_Popup.isDisplayed()){
        			fn_Click(SkipPopup_BT);
                	 Thread.sleep(2000);	
        			 fn_DeliveryDetails();
        			 fn_AmountVerify_Deal();
             }
        	//}
        	else{
        		fn_DeliveryDetails();
        		fn_AmountVerify_Deal();
        	 }
    	}
    	catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
        	Order orderobj = PageFactory.initElements(driver, Order.class);
    		return orderobj;
        	
        }
    
    
    
    public Order fn_OrderPizzaWithUpsell() throws InterruptedException, IOException{
            try{
    	    Thread.sleep(3000);
            fn_Click(PizzaMenu_LK);
      //  	fn_ScrollDown100();
            Thread.sleep(2000);
        	fn_mouseOver(DeluxeVeggie_Pizza);
        	Thread.sleep(2000);
        	fn_Click(QuickAddDuluxeViggie_LK);
        	Thread.sleep(3000);
        	fn_Click(CheckOut_BT);
        	Thread.sleep(15000);
        	fn_WiatUntilVisible(Upsellitem1_Add);
        	fn_Click(Upsellitem1_Add);
        	Thread.sleep(2000);
        	fn_Click(UpsellAddToCart_BT);
        	Thread.sleep(2000);
        	fn_DeliveryDetails();
        	fn_AmountVerify_Pizza();
            }
            catch(NoSuchElementException e){
            	fn_Click(Menu_BT);
            	Thread.sleep(3000);
            }
        	Order orderobj = PageFactory.initElements(driver, Order.class);
    		return orderobj;
        	
          }
    
    
    public Order fn_OrderPizzawithTopping() throws InterruptedException, IOException{
           try{
    	    Thread.sleep(2000);
        	fn_Click(PizzaMenu_LK);
            Thread.sleep(2000);
            fn_mouseOver(DeluxeVeggie_Pizza);
            Thread.sleep(2000);
            fn_Click(CustomizePizza1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown100();
          //String pricewithoutcustomize="440.00";
            String pricewithouttopping=Price_CustomizePage.getText().trim();
        	System.out.println("Actual Price of pizza before topping:" + pricewithouttopping);
        	Thread.sleep(2000);
            fn_Click(Topping4_LK);
        	String pricewithtopping=Price_CustomizePage.getText().trim();
        	System.out.println("Actual Price of pizza after added topping:" + pricewithtopping);
        	Thread.sleep(2000);
        	
//        	int pricebefore=Integer.parseInt(pricewithouttopping);
//        	int priceafter=Integer.parseInt(pricewithtopping);
        if(pricewithouttopping.equals(pricewithtopping)){
        	System.out.println("Topping price is not greater: Failed");
        }
        else{
        	System.out.println("Topping price is greater: Passed");
        }
            fn_Click(BuyNow_BT);
        	Thread.sleep(15000); 	
            fn_Click(SkipPopup_BT);
       	    Thread.sleep(2000);	
			 fn_DeliveryDetails();
			 fn_AmountVerify_Pizza();
           }
           catch(NoSuchElementException e){
           	fn_Click(Menu_BT);
           	Thread.sleep(3000);
           }
            Order orderobj = PageFactory.initElements(driver, Order.class);
    		return orderobj;
        	
          } 
    
    
    public Order fn_OrderDealandPizzawithUpsell() throws InterruptedException, IOException{
    	try{
    	Thread.sleep(2000);
        fn_Click(PizzaMenu_LK);
  //  	fn_ScrollDown100();
        Thread.sleep(2000);
    	fn_mouseOver(VegExtraVaganza_Pizza);
    	Thread.sleep(2000);
    	fn_Click(QuickAddVegExtraVaganza_LK);
    	Thread.sleep(3000);
    	fn_Click(EveryDayValueOffers_LK);	
    	Thread.sleep(2000);	
           	fn_Click(SelectOffer2_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_WiatUntilVisible(Customizedeal1_BT);
        	fn_Click(Customizedeal1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_WiatUntilVisible(Add1stPizza_BT);
        	fn_Click(Add1stPizza_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_WiatUntilVisible(Customizedeal2offer2_BT);
        	fn_Click(Customizedeal2offer2_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_WiatUntilVisible(Add2ndPizza_BT);
        	fn_Click(Add2ndPizza_BT);
        	Thread.sleep(15000);
        // try{
        	if(Upsell_Popup.isDisplayed()){
	        		fn_Click(Upsellitem2_Add);
	            	Thread.sleep(2000);
	            	fn_Click(UpsellAddToCart_BT);
	            	Thread.sleep(2000);	
        			 fn_DeliveryDetails();
        			 fn_AmountVerify_Deal();
             }
        	//}
        	else{
        		fn_DeliveryDetails();
        		fn_AmountVerify_Deal();
        	 }
    	     }
    	catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
        	Order orderobj = PageFactory.initElements(driver, Order.class);
    		return orderobj;
        	
        }
    
    
    
    
    public Order fn_OrderPizzaManiaWithPizza() throws InterruptedException, IOException{
        try{
    	Thread.sleep(3000);
        fn_Click(PizzaMania_LK);
        Thread.sleep(3000);
    	fn_mouseOver(VegLoaded_PizzaMania);
    	Thread.sleep(2000);
    	fn_Click(AddToCartVegLoaded_PizzaMania);
    	Thread.sleep(3000);
    	fn_Click(CheckOut_BT);
    	Thread.sleep(15000);
       Assert.assertFalse(Upsell_Popup.isDisplayed());
    	Thread.sleep(2000);
    	fn_DeliveryDetails();
    	fn_Click(PlaceOrder_BT);
    	Thread.sleep(2000);
    	fn_Click(OkPizzaMania_BT);
    	Thread.sleep(2000);
    	fn_Click(Menu_BT);
    	Thread.sleep(3000);
    	
    	fn_OrderbyAddToCart();
        }
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
    //	fn_AmountVerify();
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
      }

    
    
    public Order fn_OrderPizzabyCrustCustmize() throws InterruptedException, IOException{
        try{
    	Thread.sleep(2000);
    	fn_Click(PizzaMenu_LK);
        Thread.sleep(2000);
        fn_mouseOver(VegExtraVaganza_Pizza);
        Thread.sleep(2000);
        fn_Click(CustomizePizza2_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown100();
        String pricewithoutcrust=Price_CustomizePage.getText().trim();
    	System.out.println("Actual Price of pizza before crust customize:" + pricewithoutcrust);
    	Thread.sleep(2000);
    	fn_ScrollUp100();
    	fn_Click(CrustWTC_LK);
    	fn_ScrollDown100();
    	String pricewithtopping=Price_CustomizePage.getText().trim();
    	System.out.println("Actual Price of pizza after crust customize:" + pricewithtopping);
    	Thread.sleep(2000);
    	
//    	int pricebefore=Integer.parseInt(pricewithouttopping);
//    	int priceafter=Integer.parseInt(pricewithtopping);
    if(pricewithoutcrust.equals(pricewithtopping)){
    	System.out.println("Topping price is not greater: Failed");
    }
    else{
    	System.out.println("Topping price is greater: Passed");
    }
        fn_Click(BuyNow_BT);
    	Thread.sleep(15000); 	
        fn_Click(SkipPopup_BT);
   	    Thread.sleep(2000);	
		fn_DeliveryDetails();
		fn_AmountVerify_Pizza();
        }
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
        Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
      }
    
    
    
    
    
    public Order fn_OrderDealwithTopping() throws InterruptedException, IOException{
        try{
    	Thread.sleep(3000);
    	fn_Click(SelectOffer1_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Customizedeal1_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown500();
    	
    	fn_Click(Topping4_LK);
    	Thread.sleep(2000);
    	fn_Click(Add1stPizza_BT);
    	Thread.sleep(2000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Customizedeal2_BT);
    	Thread.sleep(2000);
    	fn_ScrollDown500();
    	fn_Click(Topping4_LK);
    	Thread.sleep(2000);
    	fn_Click(Add2ndPizza_BT);
    	Thread.sleep(15000);
    // try{
    	if(Upsell_Popup.isDisplayed()){
    			fn_Click(SkipPopup_BT);
            	 Thread.sleep(4000);	
    			 fn_DeliveryDetails();
    			 fn_AmountVerify_Deal();
            }
    	//}
    	else{
    		fn_DeliveryDetails();
    		fn_AmountVerify_Deal();
    	  }
          }
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
    	}  
    
    
    
    public Order fn_OrderDealbyCrustCustomize() throws InterruptedException, IOException{
        try{
    	Thread.sleep(3000);
    	fn_Click(SelectOffer1_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Customizedeal1_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown100();
    	fn_Click(CrustWTC_LK);
    	fn_ScrollDown500();
    	
    	Thread.sleep(2000);
    	fn_Click(Add1stPizza_BT);
    	Thread.sleep(2000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Customizedeal2_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown100();
    	fn_Click(CrustWTC_LK);
    	fn_ScrollDown500();
    	
    	fn_Click(Add2ndPizza_BT);
    	Thread.sleep(15000);
    // try{
    	if(Upsell_Popup.isDisplayed()){
    			fn_Click(SkipPopup_BT);
            	 Thread.sleep(4000);	
    			 fn_DeliveryDetails();
    			 fn_AmountVerify_Deal();
            }
    	//}
    	else{
    		fn_DeliveryDetails();
    		fn_AmountVerify_Deal();
    	  }
        }
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
     }  
    
    
    
    
    public Order fn_OrderTwoDealswithUpsell() throws InterruptedException, IOException{
        try{
    	Thread.sleep(3000);
    	fn_Click(SelectOffer1_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Customizedeal1_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Add1stPizza_BT);
    	Thread.sleep(2000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Customizedeal2_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown500();
    	fn_Click(Add2ndPizza_BT);
    	Thread.sleep(3000);
    	fn_Click(Menu_BT);
    	Thread.sleep(2000);
    	fn_Click(EveryDayValueOffers_LK);	
    	Thread.sleep(2000);	
       	fn_Click(SelectOffer2_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Customizedeal1_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Add1stPizza_BT);
    	Thread.sleep(2000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Customizedeal2offer2_BT);
    	Thread.sleep(2000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Add2ndPizza_BT);
    	Thread.sleep(15000);
    // try{
    	if(Upsell_Popup.isDisplayed()){
        		fn_Click(Upsellitem2_Add);
            	Thread.sleep(2000);
            	fn_Click(UpsellAddToCart_BT);
            	Thread.sleep(2000);	
    			 fn_DeliveryDetails();
    			 fn_AmountVerify_Deal();
         }
    	//}
    	else{
    		fn_DeliveryDetails();
    		fn_AmountVerify_Deal();
        	 }
        }
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
    	
    }  
    
    
    
    
    public Order fn_OrderDealWithPizzaandSide() throws InterruptedException, IOException{
    	try{
    	Thread.sleep(2000);
        fn_Click(PizzaMenu_LK);
  //  	fn_ScrollDown100();
        Thread.sleep(2000);
    	fn_mouseOver(VegExtraVaganza_Pizza);
    	Thread.sleep(2000);
    	fn_Click(QuickAddVegExtraVaganza_LK);
    	Thread.sleep(2000);
    	fn_Click(Sides_LK);
    	Thread.sleep(3000);
    	fn_Click(SideWhitePastaNonveg_LK);
    	Thread.sleep(3000);
    	fn_Click(EveryDayValueOffers_LK);	
    	Thread.sleep(2000);	
           	fn_Click(SelectOffer1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Customizedeal1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(3000);
        	fn_Click(Add1stPizza_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Customizedeal2_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(3000);
        	fn_Click(Add2ndPizza_BT);
        	Thread.sleep(15000);
        // try{
        	if(Upsell_Popup.isDisplayed()){
        			fn_Click(SkipPopup_BT);
                	 Thread.sleep(2000);
                	 
        			 fn_DeliveryDetails();
        			 fn_AmountVerify_Deal();
             }
        	//}
        	else{
        		fn_DeliveryDetails();
        		fn_AmountVerify_Deal();
        	 }
    	}
    	catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
        	Order orderobj = PageFactory.initElements(driver, Order.class);
    		return orderobj;
        	
        }
    
    
    
    
    public Order fn_OrderPizzaManiaWithSide() throws InterruptedException, IOException{
        try{
    	Thread.sleep(3000);
        fn_Click(PizzaMania_LK);
        Thread.sleep(3000);
    	fn_mouseOver(VegLoaded_PizzaMania);
    	Thread.sleep(3000);
    	fn_Click(AddToCartVegLoaded_PizzaMania);
    	Thread.sleep(3000);
    	fn_Click(Sides_LK);
    	Thread.sleep(3000);
    	fn_Click(SideWhitePastaNonveg_LK);
    	Thread.sleep(3000);
    	
    	fn_Click(CheckOut_BT);
    	Thread.sleep(15000);
       Assert.assertFalse(Upsell_Popup.isDisplayed());
    	Thread.sleep(2000);
    	fn_DeliveryDetails();
    	fn_Click(PlaceOrder_BT);
    	Thread.sleep(2000);
    	fn_Click(OkPizzaMania_BT);
    	Thread.sleep(2000);
    	fn_Click(Menu_BT);
    	Thread.sleep(3000);
    	
    	fn_OrderbyAddToCart();
        }
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
    //	fn_AmountVerify();
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
      }
    
    
    
    public Order fn_OrderDealwithPizzaManiaandUpsell() throws InterruptedException, IOException{
       try{
    	Thread.sleep(3000);
        fn_Click(PizzaMania_LK);
        Thread.sleep(3000);
    	fn_mouseOver(VegLoaded_PizzaMania);
    	Thread.sleep(3000);
    	fn_Click(AddToCartVegLoaded_PizzaMania);
    	Thread.sleep(3000);
    	fn_Click(EveryDayValueOffers_LK);	
    	Thread.sleep(2000);	
           	fn_Click(SelectOffer2_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Customizedeal1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(3000);
        	fn_Click(Add1stPizza_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(3000);
        	fn_Click(Customizedeal2offer2_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(3000);
        	fn_Click(Add2ndPizza_BT);
        	Thread.sleep(15000);
        // try{
        	if(Upsell_Popup.isDisplayed()){
	        		fn_Click(Upsellitem2_Add);
	            	Thread.sleep(2000);
	            	fn_Click(UpsellAddToCart_BT);
	            	Thread.sleep(2000);	
        			 fn_DeliveryDetails();
        			 fn_AmountVerify_Deal();
             }
        	//}
        	else{
        		fn_DeliveryDetails();
        		fn_AmountVerify_Deal();
        	 }
        	
            }
    
    catch(NoSuchElementException e){
    	fn_Click(Menu_BT);
    	Thread.sleep(3000);
    }
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
      }
    
    
    
    
    public Order fn_OrderDealwithPizzaManiaSideBeverageDesert() throws InterruptedException, IOException{
       try{
    	Thread.sleep(3000);
        fn_Click(PizzaMania_LK);
        Thread.sleep(3000);
    	fn_mouseOver(VegLoaded_PizzaMania);
    	Thread.sleep(3000);
    	fn_Click(AddToCartVegLoaded_PizzaMania);
    	Thread.sleep(3000);
    	fn_Click(Sides_LK);
    	Thread.sleep(3000);
    	fn_Click(SideWhitePastaNonveg_LK);
    	Thread.sleep(3000);
    	
    	fn_Click(Beverages_LK);
    	Thread.sleep(3000);
    	
    	fn_Click(CokeAdd_LK);
    	Thread.sleep(3000);
    	
    	fn_Click(More_LK);
    	Thread.sleep(3000);
    	
    	fn_Click(LavaCakeAdd_LK);
    	Thread.sleep(3000);
    	
    	fn_Click(CheckOut_BT);
    	Thread.sleep(15000);
       Assert.assertFalse(Upsell_Popup.isDisplayed());
    	Thread.sleep(2000);
    	fn_DeliveryDetails();
    	fn_Click(PlaceOrder_BT);
    	Thread.sleep(2000);
    	fn_Click(OkPizzaMania_BT);
    	Thread.sleep(2000);
    	fn_Click(Menu_BT);
    	Thread.sleep(3000);
    	
    	fn_Click(PizzaMenu_LK);
    	  //  	fn_ScrollDown100();
    	        Thread.sleep(2000);
    	    	fn_mouseOver(VegExtraVaganza_Pizza);
    	    	Thread.sleep(2000);
    	    	fn_Click(QuickAddVegExtraVaganza_LK);
    	    	Thread.sleep(2000);
    	
    	    fn_Click(EveryDayValueOffers_LK);	
    	    Thread.sleep(2000);	
           	fn_Click(SelectOffer2_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Customizedeal1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Add1stPizza_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Customizedeal2offer2_BT);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Add2ndPizza_BT);
        	Thread.sleep(15000);
//        // try{
//        	if(Upsell_Popup.isDisplayed()){
//	        		fn_Click(Upsellitem2_Add);
//	            	Thread.sleep(2000);
//	            	fn_Click(UpsellAddToCart_BT);
//	            	Thread.sleep(2000);	
//        			 fn_DeliveryDetails();
//        			 fn_AmountVerify_Deal();
//             }
//        	//}
//        	else{
        		Assert.assertFalse(Upsell_Popup.isDisplayed());
        		fn_DeliveryDetails();
        		fn_AmountVerify_Deal();
        	 }
    	catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
      }  
    
    
    
    
    public Order fn_VerifyCouponWithDeal() throws InterruptedException, IOException{
        try{
 	    Thread.sleep(3000);
        fn_Click(PizzaMenu_LK);
        Thread.sleep(2000);
     	fn_mouseOver(DeluxeVeggie_Pizza);
     	Thread.sleep(2000);
     	fn_Click(QuickAddDuluxeViggie_LK);
     	Thread.sleep(3000);
     	fn_Click(CheckOut_BT);
     	Thread.sleep(15000);
     	fn_Click(SkipPopup_BT);
     	Thread.sleep(4000);
     Assert.assertTrue(GotACoupon_LK.isDisplayed());
        fn_Click(Menu_BT);
        Thread.sleep(3000);
        fn_Click(EveryDayValueOffers_LK);	
	    Thread.sleep(2000);	
	    fn_Click(SelectOffer2_BT);
	  	Thread.sleep(3000);
	  	fn_ScrollDown500();
	  	Thread.sleep(2000);
	  	fn_Click(Customizedeal1_BT);
	  	Thread.sleep(3000);
	  	fn_ScrollDown500();
	  	Thread.sleep(2000);
	  	fn_Click(Add1stPizza_BT);
	  	Thread.sleep(2000);
	  	fn_ScrollDown500();
	  	Thread.sleep(2000);
	  	fn_Click(Customizedeal2offer2_BT);
	  	Thread.sleep(2000);
	  	fn_ScrollDown500();
	  	Thread.sleep(2000);
	  	fn_Click(Add2ndPizza_BT);
	  	Thread.sleep(15000);
     	fn_Click(SkipPopup_BT);
     	Thread.sleep(2000);
      
     Assert.assertFalse(GotACoupon_LK.isDisplayed());
        fn_DeliveryDetails();
     	fn_AmountVerify_Deal();
        }
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
     	Order orderobj = PageFactory.initElements(driver, Order.class);
 		return orderobj;
     	
       }
    
    
    
    
    public Order fn_RemoveCorePizzaWithUpsell() throws InterruptedException, IOException{
        try{
	    Thread.sleep(3000);
        fn_Click(PizzaMenu_LK);
  //  	fn_ScrollDown100();
        Thread.sleep(2000);
    	fn_mouseOver(DeluxeVeggie_Pizza);
    	Thread.sleep(2000);
    	fn_Click(QuickAddDuluxeViggie_LK);
    	Thread.sleep(3000);
    	fn_Click(CheckOut_BT);
    	Thread.sleep(15000);
    	fn_WiatUntilVisible(Upsellitem1_Add);
    	fn_Click(Upsellitem1_Add);
    	Thread.sleep(2000);
    	fn_Click(UpsellAddToCart_BT);
    	Thread.sleep(2000);
    	fn_Click(RemoveCorePizza_LK);
    	Thread.sleep(5000);
    	
    	String netpricereviewpage=NetPriceReviewPage_TX.getText().trim();	
    	assert(netpricereviewpage.equals("0.00"));
    	System.out.println("Net price after removal core pizza:"+ netpricereviewpage );
    	String totalpayablereviewpage=TotalPaybleReviewPage_TX.getText().trim();	
    	assert(totalpayablereviewpage.equals("0.00"));
    	System.out.println("Total Payable after removal core pizza:"+ totalpayablereviewpage );
    	
    	fn_Click(Menu_BT);
  //  	Thread.sleep(3000);
    	
//    	fn_DeliveryDetails();
//    	fn_AmountVerify_Pizza();
        }
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
     
    }
    
    
    
    
    public Order fn_RemoveDealwithUpsell() throws InterruptedException, IOException{
        try{
	    Thread.sleep(3000);
	    fn_Click(EveryDayValueOffers_LK);	
	    Thread.sleep(2000);	
	    fn_Click(SelectOffer2_BT);
	  	Thread.sleep(3000);
	  	fn_ScrollDown500();
	  	Thread.sleep(2000);
	  	fn_Click(Customizedeal1_BT);
	  	Thread.sleep(3000);
	  	fn_ScrollDown500();
	  	Thread.sleep(2000);
	  	fn_Click(Add1stPizza_BT);
	  	Thread.sleep(2000);
	  	fn_ScrollDown500();
	  	Thread.sleep(2000);
	  	fn_Click(Customizedeal2offer2_BT);
	  	Thread.sleep(2000);
	  	fn_ScrollDown500();
	  	Thread.sleep(2000);
	  	fn_Click(Add2ndPizza_BT);
	  	Thread.sleep(15000);
	  	fn_Click(Upsellitem1_Add);
    	Thread.sleep(2000);
    	fn_Click(UpsellAddToCart_BT);
    	Thread.sleep(2000);
        fn_Click(RemoveDeal_LK);
    	Thread.sleep(5000);
    	String cartamount=CartAmount_TX.getText().trim();	
    	assert(cartamount.equals("0.00"));
    	System.out.println("Amount to cart after removal deal:"+ cartamount );
  //  	fn_Click(Menu_BT);
    	
    	}
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
     } 
    
    
    
    
    public Order fn_OrderPizzabyReplaceTopping() throws InterruptedException, IOException{
        try{
 	    Thread.sleep(3000);
         fn_Click(PizzaMenu_LK);
        Thread.sleep(2000);
     	fn_mouseOver(DeluxeVeggie_Pizza);
     	Thread.sleep(2000);
     	fn_Click(CustomizePizza1_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown500();
    	fn_Click(ReplaceTopping_LK);
    	Thread.sleep(2000);
    	fn_ScrollUP500();
    	fn_Click(ReplaceTopping1_LK);
    	Thread.sleep(2000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(BuyNow_BT);
     	Thread.sleep(15000);
     	fn_Click(SkipPopup_BT);
     	Thread.sleep(4000);
     	fn_DeliveryDetails();
     	fn_AmountVerify_Pizza();
        }
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
     	Order orderobj = PageFactory.initElements(driver, Order.class);
 		return orderobj;
     	
       }  
    
    
    
    
    public Order fn_OrderDealbyReplaceTopping() throws InterruptedException, IOException{
    
   try{
	Thread.sleep(2000);
    fn_Click(EveryDayValueOffers_LK);	
	Thread.sleep(2000);	
   	fn_Click(SelectOffer2_BT);
	Thread.sleep(3000);
	fn_ScrollDown500();
	Thread.sleep(2000);
	fn_Click(Customizedeal1_BT);
	Thread.sleep(3000);
	fn_ScrollDown500();
	fn_Click(ReplaceTopping_LK);
	Thread.sleep(2000);
	fn_ScrollUP500();
	fn_Click(ReplaceTopping1_LK);
	Thread.sleep(2000);
	fn_ScrollDown500();
	Thread.sleep(2000);
	fn_Click(Add1stPizza_BT);
	Thread.sleep(2000);
	fn_ScrollDown500();
	Thread.sleep(2000);
	fn_Click(Customizedeal2offer2_BT);
	Thread.sleep(3000);
	fn_ScrollDown500();
	fn_Click(ReplaceTopping_LK);
	Thread.sleep(2000);
	fn_ScrollUP500();
	fn_Click(ReplaceTopping1_LK);
	Thread.sleep(2000);
	fn_ScrollDown500();
	Thread.sleep(2000);
	fn_Click(Add2ndPizza_BT);
	Thread.sleep(15000);
	fn_Click(SkipPopup_BT);
 	Thread.sleep(4000);
 	fn_DeliveryDetails();
 	fn_AmountVerify_Deal();
    }
    catch(NoSuchElementException e){
   	fn_Click(Menu_BT);
   	Thread.sleep(3000);
   }
	Order orderobj = PageFactory.initElements(driver, Order.class);
	return orderobj;
  
   }   
    
    
    
    public Order fn_VerifyErrorMessageReplaceTopping() throws InterruptedException, IOException{
        try{
 	    Thread.sleep(3000);
        fn_Click(PizzaMenu_LK);
        Thread.sleep(2000);
     	fn_mouseOver(DeluxeVeggie_Pizza);
     	Thread.sleep(2000);
     	fn_Click(CustomizePizza1_BT);
    	Thread.sleep(3000);
    	fn_ScrollDown500();
    	fn_Click(ReplaceTopping_LK);
    	Thread.sleep(2000);
    	fn_ScrollUP500();
    	fn_Click(ReplaceTopping1_LK);
    	Thread.sleep(2000);
    	fn_Click(ReplaceTopping2_LK);
    	Thread.sleep(2000);
    	fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(BuyNow_BT);
     	Thread.sleep(2000);
     	Assert.assertTrue(ToppingPopupOk_BT.isDisplayed());
     	fn_Click(ToppingPopupOk_BT);
     	Thread.sleep(2000);
     	fn_Click(Menu_BT);
     	
      }
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
     	Order orderobj = PageFactory.initElements(driver, Order.class);
 		return orderobj;
     	
       }  
    
    
    
    
    
    public Order fn_VerifyErrorMessageReplaceToppingDeal() throws InterruptedException, IOException{
        try{
        	fn_Click(EveryDayValueOffers_LK);	
        	Thread.sleep(2000);	
           	fn_Click(SelectOffer2_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Customizedeal1_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	fn_Click(ReplaceTopping_LK);
        	Thread.sleep(2000);
        	fn_ScrollUP500();
        	fn_Click(ReplaceTopping1_LK);
        	Thread.sleep(2000);
        	fn_Click(ReplaceTopping2_LK);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Add1stPizza_BT);
        	Thread.sleep(2000);
        	
        	Assert.assertTrue(ToppingPopupOk_BT.isDisplayed());
         	fn_Click(ToppingPopupOk_BT);
         	Thread.sleep(2000);
         	fn_ScrollUP500();
         	fn_Click(ReplaceTopping1_LK);
        	Thread.sleep(2000);
        	fn_Click(Add1stPizza_BT);
        	Thread.sleep(2000);
        	
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Customizedeal2offer2_BT);
        	Thread.sleep(3000);
        	fn_ScrollDown500();
        	fn_Click(ReplaceTopping_LK);
        	Thread.sleep(2000);
        	fn_ScrollUP500();
        	fn_Click(ReplaceTopping1_LK);
        	Thread.sleep(2000);
        	
        	fn_Click(ReplaceTopping2_LK);
        	Thread.sleep(2000);
        	fn_ScrollDown500();
        	Thread.sleep(2000);
        	fn_Click(Add2ndPizza_BT);
     	    Thread.sleep(2000);
     	    
     	   Assert.assertTrue(ToppingPopupOk_BT.isDisplayed());
        	fn_Click(ToppingPopupOk_BT);
        	Thread.sleep(2000);
//        	fn_Click(ReplaceTopping1_LK);
//       	    Thread.sleep(2000);
//       	    fn_Click(Add2ndPizza_BT);
//  	        Thread.sleep(2000);
     	    
     	    
     	    fn_Click(Menu_BT);
     	
      }
        catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
     	Order orderobj = PageFactory.initElements(driver, Order.class);
 		return orderobj;
     	
       }  
    
    
    
    
    public Order AmountVerify_CartandReviewPage() throws InterruptedException, IOException{
 	   try{
 		  Thread.sleep(3000);
 	        fn_Click(PizzaMenu_LK);
 	        Thread.sleep(2000);
 	     	fn_mouseOver(DeluxeVeggie_Pizza);
 	     	Thread.sleep(2000);
 	     	fn_Click(QuickAddDuluxeViggie_LK);
 	     	Thread.sleep(2000);
 	     String cartamount=CartAmount_TX.getText().trim();
 	     	Thread.sleep(3000);
 	     	fn_Click(CheckOut_BT);
 	     	Thread.sleep(15000);
 	     	fn_Click(SkipPopup_BT);
 	     	Thread.sleep(4000);
 	     String totalamountreviewpage=TotalPaybleReviewPage_TX.getText().trim();
 	     	Assert.assertTrue(cartamount.equals(totalamountreviewpage));
 	     	driver.navigate().refresh();
	 	    Thread.sleep(5000);
	     	fn_Click(Upsellitem1_Add);
	     	Thread.sleep(2000);
	     	fn_Click(UpsellAddToCart_BT);
	     	Thread.sleep(3000);
	     String totalamountreviewpageafterupsell=TotalPaybleReviewPage_TX.getText().trim();
	     	fn_Click(Menu_BT);
     	    Thread.sleep(2000);
     	 String cartamountafterupsell=CartAmount_TX.getText().trim();
     	    Assert.assertTrue(totalamountreviewpageafterupsell.equals(cartamountafterupsell));
     	    fn_Click(CheckOut_BT);
	     	Thread.sleep(3000);
	     	fn_DeliveryDetails();
	     	fn_AmountVerify_Pizza();
 	   }
 	   catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
         Order orderobj = PageFactory.initElements(driver, Order.class);
 		return orderobj;
     	
     	} 
    
    
    
    public Order fn_VerifyAlertonStep2() throws InterruptedException, IOException{
      try{
    	Thread.sleep(3000);
    	fn_Click(SelectOffer1_BT);
    	Thread.sleep(3000);
    	fn_Click(Step2_LK);
    	Thread.sleep(3000);    	
     Assert.assertTrue(AlertOk_BT.isDisplayed());
        Thread.sleep(2000);
        fn_Click(AlertOk_BT);
        Thread.sleep(2000);
        fn_ScrollDown500();
    	Thread.sleep(2000);
    	fn_Click(Customizedeal1_BT);
    	Thread.sleep(3000);
    	fn_Click(Step2_LK);
    	Thread.sleep(3000);
      Assert.assertTrue(AlertOk_BT.isDisplayed());
        Thread.sleep(2000);
        fn_Click(AlertOk_BT);
        Thread.sleep(2000);
        fn_Click(Menu_BT);
    	Thread.sleep(3000);
      }
      catch(Exception e){
    	  fn_Click(Menu_BT);
      }
    	Order orderobj = PageFactory.initElements(driver, Order.class);
		return orderobj;
    	
    	}
          
    
      
    
    public Order fn_VerifyEveryDayValueOfferText() throws InterruptedException, IOException{
       try{
 	    Thread.sleep(3000);
 	    String text=Everydayvalueoffer_TX.getText();
 	    Thread.sleep(2000);
 	   verifyText(text,"EVERYDAY VALUE OFFERS");
 	    fn_Click(Menu_BT);
     	}
       catch(NoSuchElementException e){
        	fn_Click(Menu_BT);
        	Thread.sleep(3000);
        }
     	Order orderobj = PageFactory.initElements(driver, Order.class);
 		return orderobj;
     	
        }  
    
    
    public Order fn_MandatoryfieldsValidation() throws InterruptedException{
    	fn_Click(CheckOut_BT);
    	Thread.sleep(2000);
    	fn_Click(PlaceOrder_BT);
    	Thread.sleep(2000);
    	
    	fn_AlertHandle("Please enter your first name, your last name, a valid email address, a valid mobile number, your flat no. and street name.");
  //  	fn_AlertHandle();
    	Thread.sleep(2000);
    	fn_Input(FirstName_TB, "Jay");
    	Thread.sleep(2000);
    	fn_Click(PlaceOrder_BT);
    	Thread.sleep(2000);
    	fn_AlertHandle("Please enter your last name, a valid email address, a valid mobile number, your flat no. and street name.");
    	Thread.sleep(2000);
    	fn_Input(LastName_TB, "Prakash");
    	Thread.sleep(2000);
    	fn_Click(PlaceOrder_BT);
    	Thread.sleep(2000);
    	fn_AlertHandle("Please enter a valid email address, a valid mobile number, your flat no. and street name.");
    	Thread.sleep(2000);
    	fn_Input(EmailId_TB, "jay.prakash@incaendo.com");
    	Thread.sleep(2000);
    	fn_Click(PlaceOrder_BT);
    	Thread.sleep(2000);
    	fn_AlertHandle("Please enter a valid mobile number, your flat no. and street name.");
    	fn_Input(Mobile_TB, "8285335139");
    	Thread.sleep(2000);
    	fn_Click(PlaceOrder_BT);
    	Thread.sleep(2000);
    	fn_AlertHandle("Please enter your flat no. and street name.");
    	Thread.sleep(2000);
    	fn_Input(Flat_TB, "14 A");
    	Thread.sleep(2000);
    	fn_Click(PlaceOrder_BT);
    	Thread.sleep(2000);
    	fn_AlertHandle("Please enter street name.");
    	Thread.sleep(2000);
    	fn_Input(Street_TB, "Mayur Vihar");
    	Thread.sleep(2000);
    	fn_Click(PlaceOrder_BT);
    	Thread.sleep(2000);
    	fn_AlertHandle("Please add atleast one product before you proceed.");
    	Thread.sleep(2000);
        fn_Click(Menu_BT);
  //  	Thread.sleep(3000);
    	
    	Order orderobj = PageFactory.initElements(driver, Order.class);
 		return orderobj;
    }
    
    
    
    
    
    
    
    

    }
