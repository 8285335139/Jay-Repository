package com.dominos.generic.pkg;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Jay_Class1 extends Generic_Methods {

	
	
	
	//public static void main(String[] args) {
//		launch_browser();
//		method1();
	//}
	
	
//	@BeforeClass
//	public void launch_browser(){
//		
//		launchBrowser("CH");
//	}
//	
//	@Test
//	public void method1(){
//		driver.get("https://lte.tarikatechnologies.com");
	
	
	
	@FindBy(id = "ContentPlaceHolder1_ACHCapableCheckBox")
	public WebElement ACHCapable_CkBox;

	@FindBy(id = "ctl00_ContentPlaceHolder1_FISScoreRadNumericTextBox")
	public WebElement FISScore_TextBox;

	@FindBy(id = "ctl00_ContentPlaceHolder1_TTINQALL06RadNumericTextBox")
	public WebElement TTINQALL06_TextBox;

	@FindBy(id = "ctl00_ContentPlaceHolder1_SkipGuardAlertRadNumericTextBox")
	public WebElement SkipGuardAlert_TextBox;

	@FindBy(id = "ctl00_ContentPlaceHolder1_EventCodeRadNumericTextBox")
	public WebElement EventCode_TextBox;

	@FindBy(id = "ContentPlaceHolder1_DealerTypeRadioButtonList_0")
	public WebElement Furniture_RB;

	@FindBy(id = "ContentPlaceHolder1_DealerTypeRadioButtonList_1")
	public WebElement Tires_RB;

	@FindBy(id = "ContentPlaceHolder1_LeaseTermRadioButtonList_0")
	public WebElement Months12_RB;

	@FindBy(id = "ContentPlaceHolder1_LeaseTermRadioButtonList_1")
	public WebElement Months18_RB;

	@FindBy(id = "ctl00_ContentPlaceHolder1_DealerRiskRadComboBox_Arrow")
	public WebElement DealerRisk_Select;

	@FindBy(xpath = "//div[@id='ctl00_ContentPlaceHolder1_DealerRiskRadComboBox_DropDown']/div/ul/li[5]")
	public WebElement Preferred_DealerRisk;

	@FindBy(id = "ctl00_ContentPlaceHolder1_AmountRadTextBox")
	public WebElement LeaseGMI_TextBox;

	@FindBy(id = "ctl00_ContentPlaceHolder1_IDScoreRadNumericTextBox")
	public WebElement IDScore_TextBox;

	@FindBy(id = "ctl00_ContentPlaceHolder1_NegativeLandlordCourtRecordsRadNumericTextBox")
	public WebElement NegativeLandlord_TextBox;

	@FindBy(id = "ctl00_ContentPlaceHolder1_TTOCALL12RadNumericTextBox")
	public WebElement TTOCALL12_TextBox;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ACHConditionCodeRadTextBox")
	public WebElement ACHCondition_TextBox;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ClarityFraudScoreRadNumericTextBox")
	public WebElement CFScore_TextBox;

	@FindBy(id = "ctl00_ContentPlaceHolder1_CalculateRadButton_input")
	public WebElement Calculate_BT;

	@FindBy(id = "ContentPlaceHolder1_TotalScoreLabel")
	public WebElement Decision_Text;

	@FindBy(id = "ContentPlaceHolder1_DecisionDiv")
	public WebElement Message_Text;

	@FindBy(id = "ContentPlaceHolder1_OptionalApprovalSubmitButton")
	public WebElement Submits_BT;

	@FindBy(id = "ContentPlaceHolder1_AutomaticApprovalRadioButton")
	public WebElement AA_RB;

	@FindBy(id = "ContentPlaceHolder1_ConditionalApprovalRadioButton")
	public WebElement CA_RB;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ClearRadButton_input")
	public WebElement Clear_BT;

	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_DecisionDiv']/ul/li")
	public WebElement DocMsg1;

	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_DecisionDiv']/ul/li[2]")
	public WebElement DocMsg2;

	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_DecisionDiv']/ul/li[3]")
	public WebElement DocMsg3;

	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_RAScreenDiv']/ol/li")
	public WebElement DocRa1;

	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_RAScreenDiv']/ol/li[2]")
	public WebElement DocRa2;

	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_RAScreenDiv']/ol/li[3]")
	public WebElement DocRa3;

	@FindBy(xpath = "//div[@id='ContentPlaceHolder1_RAScreenDiv']/ol/li[4]")
	public WebElement DocRa4;

	@FindBy(id = "ContentPlaceHolder1_DecisionDiv")
	public WebElement DecisionDesc_Text;

	
	
	
	
	public Preferred fn_AA1_Furn12Months(String FISScore, String TTINQALL06,
			String SkipGuardAlert, String EventCode, String LeaseGMI,
			String IDScore, String NegativeLandlord, String TTOCALL12,
			String ACHCondition, String ClarityFraudScore, String DecisionText,
			String AAamt, String CAamt, String Doc)
			throws InterruptedException, IOException {

		if (ACHCapable_CkBox.isSelected()) {
			System.out.println("ACH status is Selected");
		} else {
			ACHCapable_CkBox.click();
		}
		FISScore_TextBox.sendKeys(FISScore);
		TTINQALL06_TextBox.sendKeys(TTINQALL06);
		
		SkipGuardAlert_TextBox.sendKeys(SkipGuardAlert);
		EventCode_TextBox.sendKeys(EventCode);
		Thread.sleep(2000);
		fn_ScrollUP500();
		Thread.sleep(2000);
		Furniture_RB.click();
		Thread.sleep(3000);
		Months12_RB.click();
		Thread.sleep(3000);
		DealerRisk_Select.click();
		Thread.sleep(4000);
		Preferred_DealerRisk.click();
		Thread.sleep(4000);
		LeaseGMI_TextBox.sendKeys(LeaseGMI);
		IDScore_TextBox.sendKeys(IDScore);
		NegativeLandlord_TextBox.sendKeys(NegativeLandlord);
		TTOCALL12_TextBox.sendKeys(TTOCALL12);
		ACHCondition_TextBox.sendKeys(ACHCondition);
		CFScore_TextBox.sendKeys(ClarityFraudScore);
		Thread.sleep(1000);
		Calculate_BT.click();
		
		Thread.sleep(4000);
		try {
			if (Submits_BT.isDisplayed()) {
				AA_RB.click();
				Submits_BT.click();
				Thread.sleep(2000);
				
			if(Decision_Text.isDisplayed()){
				String resultext = Decision_Text.getText();
				System.out.println(resultext);
				Thread.sleep(2000);
				if (resultext.equals(DecisionText)) {

					System.out.println("AA Decision text matched :" + "Passed");
				} else {
					System.out.println("AA Decision text not matched :"
							+ "Failed");
					
				}
				}
				else{
					System.out.println("Decision text not available ");
				}
				
			
			Thread.sleep(2000);
				String AAmessageText = Message_Text.getText().trim();

				String amtMsg = AAmessageText;
				amtMsg = amtMsg.substring(amtMsg.indexOf('$') + 1);
				amtMsg = amtMsg.substring(0,
						amtMsg.indexOf(".", amtMsg.indexOf(".") + 1));
				amtMsg = amtMsg.replace(",", "");
				amtMsg = amtMsg.trim();
				// System.out.println(AAmessageText);
				if (amtMsg.contains(AAamt)) {
					Thread.sleep(2000);
					System.out
							.println("AA1 Furniture Months12 Amount Matched :"
									+ "Passed");
					System.out.println(AAamt);
				} else {
					System.out
							.println("AA1 Furniture Months12 Amount Not Matched :"
									+ "Failed");
					
				}
				Thread.sleep(2000);
				Calculate_BT.click();
				Thread.sleep(2000);
				CA_RB.click();
				Thread.sleep(2000);
				Submits_BT.click();
				Thread.sleep(2000);
				
				
			 if(Decision_Text.isDisplayed()){
				String restextCA = Decision_Text.getText();
				Thread.sleep(2000);
				System.out.println(restextCA);
				// Thread.sleep(2000);
				if (restextCA.equals("CA(1)")) {
					Thread.sleep(2000);
					System.out.println("CA Decision text matched :" + "Passed");
				} else {
					System.out.println("CA Decision text not matched :"
							+ "Failed");
					
				}
				}
			 else{
					System.out.println("Decision text not available ");
				}
				Thread.sleep(2000);
				String CAmessageText = Message_Text.getText().trim();
				Thread.sleep(2000);
				String CAamtMsg = CAmessageText;
				CAamtMsg = CAamtMsg.substring(CAamtMsg.indexOf('$') + 1);
				CAamtMsg = CAamtMsg.substring(0,
						CAamtMsg.indexOf(".", CAamtMsg.indexOf(".") + 1));
				CAamtMsg = CAamtMsg.replace(",", "");
				CAamtMsg = CAamtMsg.trim();
				if (CAamtMsg.contains(CAamt)) {
					Thread.sleep(2000);
					System.out.println(CAamt);
					System.out.println("CA Amount Matched :" + "Passed");
				} else {
					System.out.println("CA Amount Not Matched :" + "Failed");
					
				}

				String poimsg = DocMsg1.getText();
				if (poimsg.equals(Doc)) {
					System.out.println("Document is " + poimsg + ": Passed");
				} else {
					System.out
							.println("Document is not available :" + "Failed");
				}

				String poira = DocRa1.getText();
				if (poira.equals(Doc)) {
					System.out.println("RA Screen Document is " + poira
							+ ": Passed");
				} else {
					System.out
							.println("Document is not available :" + "Failed");
				}

				
				Thread.sleep(4000);
				Clear_BT.click();
				Thread.sleep(5000);
			//	fn_ScrollUP1500();
			}
		}

		catch (Exception e) {
			
		 if(Decision_Text.isDisplayed()){
			String restext = Decision_Text.getText();
			Thread.sleep(2000);
			System.out.println(restext);

			if (restext.equals(DecisionText)) {
				Thread.sleep(2000);
				System.out.println("Decision matched :" + "Passed");
			} else {
				System.out.println("Decision not matched :" + "Failed");
				
			}
			}
		 else{
				System.out.println("Decision text not available ");
			}
			Thread.sleep(2000);
			String AAmessageText = Message_Text.getText().trim();
			Thread.sleep(2000);
			String amtMsg = AAmessageText;
			amtMsg = amtMsg.substring(amtMsg.indexOf('$') + 1);
			amtMsg = amtMsg.substring(0,
					amtMsg.indexOf(".", amtMsg.indexOf(".") + 1));
			amtMsg = amtMsg.replace(",", "");
			amtMsg = amtMsg.trim();
			if (amtMsg.contains(AAamt)) {
				Thread.sleep(2000);
				System.out.println(AAamt);
				System.out.println("AA1 Furniture Months12 Amount Matched :"
						+ "Passed");
			} else {
				System.out
						.println("AA1 Furniture Months12 Amount Not Matched :"
								+ "Failed");
				
			}}

			Clear_BT.click();
			Thread.sleep(5000);
			
		

		Preferred preobj = PageFactory.initElements(driver, Preferred.class);
		return preobj;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

