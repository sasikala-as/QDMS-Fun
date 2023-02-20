package MasterTestPack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import MasterDriverBasePack.SbuDriverInitial;
import MasterPagePack.AddSbuButtonUIPage;
import MasterPagePack.AddSbuPopupScreenPage;

public class AddSbuPopupScreenTest extends SbuDriverInitial{
	AddSbuPopupScreenPage sbumodel = new AddSbuPopupScreenPage();
	
	@Test(priority = 0)
	public static void addsbumodel() throws InterruptedException {	
// check "Add Sbu Popup screen" window visibility 
		
		AddSbuPopupScreenPage sbumodel = new AddSbuPopupScreenPage();
		PageFactory.initElements(driver, sbumodel);
		//Model Window visible 
	 			 Thread.sleep(4000);
			
				boolean AcctualVisible = AddSbuPopupScreenPage.addsbumodel.isDisplayed();
				boolean ExpectedVisible = true;

				testCase = extent.createTest("001.ADD-SBU-POPUP-SCREEN-Window-Visible");
				try {
					AssertJUnit.assertEquals(AcctualVisible, ExpectedVisible);
					testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
					testCase.log(Status.INFO, "Element Available");
					testCase.log(Status.PASS, "Correct element");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
					testCase.log(Status.INFO, "Element not available");
					testCase.log(Status.FAIL, "No Element");
				}
				
			
				 Thread.sleep(4000);
 
// check "Add Sbu Popup screen" position 
				 
				Point ActualLocation = AddSbuPopupScreenPage.addsbumodel.getLocation();

				int actual_x = ActualLocation.getX();
				int actual_y = ActualLocation.getY();

				System.out.println("X axis: " + actual_x);
				System.out.println("Y axis: " + actual_y);

				Point ExpectedLocation = new Point(383, 100);

				testCase = extent.createTest("002-ADD-SBU-POPUP-SCREEN-POSITION");
				try {
					AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);
					testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
					testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
					testCase.log(Status.PASS, "Correct Location");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
					testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
					testCase.log(Status.FAIL, "Wrong Location");
				}
				
				Thread.sleep(2000);

// check "Add Sbu Popup screen" size 
				
				Dimension ActualSize = AddSbuPopupScreenPage.addsbumodel.getSize();
				System.out.println("Size : " + ActualSize);
				Dimension ExpectedSize = new Dimension(600, 230);

				testCase = extent.createTest("003-ADD-SBU-POPUP-SCREEN-SIZE");
				try {
					AssertJUnit.assertEquals(ActualSize, ExpectedSize);
					testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
					testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.PASS, "Correcrt size");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
					testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.FAIL, "Wrong Size");
				}
			
				Thread.sleep(2000);

	// Model Window background-color

				String ActualButtonColor = AddSbuPopupScreenPage.addsbumodel.getCssValue("background-color");
				System.out.println("rgb :" + ActualButtonColor);
				String ExpectedButtonColor = "rgba(255, 255, 255, 1)";

				testCase = extent.createTest("004-ADD-SBU-POPUP-SCREEN-BACKGROUND-COLOR");
				try {
					AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);
					testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
					testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
					testCase.log(Status.PASS, "Correct Button Color");

				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
					testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
					testCase.log(Status.FAIL, "Wrong Button Color");
				}
				
				Thread.sleep(2000);

	// Model Window border-color
				
				String ActualBorderColor = AddSbuPopupScreenPage.addsbumodel.getCssValue("border-color");
				System.out.println("rgb :" + ActualBorderColor);
				String ExpectedBorderColor = "rgba(0, 0, 0, 0.85)";

				testCase = extent.createTest("005-ADD-SBU-POPUP-SCREEN-BORDER-COLOR");
				try {
					AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);
					testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
					testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
					testCase.log(Status.PASS, "Correct Border Color");

				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
					testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
					testCase.log(Status.FAIL, "Wrong Border Color");
				}
				
				Thread.sleep(2000);
	
	// Model Window overflow
	
				String ActualOverflow = AddSbuPopupScreenPage.addsbumodel.getCssValue("overflow");
				System.out.println("overflow :" + ActualOverflow);
				String ExpectedOverflow = "visible";

				testCase = extent.createTest("006-ADD-SBU-POPUP-SCREEN-OVERFLOW-TYPE");
				try {
					AssertJUnit.assertEquals(ActualOverflow, ExpectedOverflow);
					testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
					testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
					testCase.log(Status.PASS, "Correct overflow");

				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
					testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
					testCase.log(Status.FAIL, "Wrong overflow");
				}
			
				Thread.sleep(2000);

	// Model element margin

				String ActualMargin = AddSbuPopupScreenPage.addsbumodel.getCssValue("margin");
				System.out.println("margin :" + ActualMargin);
				String ExpectedMargin = "0px";

				testCase = extent.createTest("007-ADD-SBU-POPUP-SCREEN-MARGIN-TYPE");
				try {
					AssertJUnit.assertEquals(ActualMargin, ExpectedMargin);
					testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
					testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
					testCase.log(Status.PASS, "Correct Margin");

				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
					testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
					testCase.log(Status.FAIL, "Wrong Margin");
				}
				
				Thread.sleep(2000);

	// ***** element cursor

				String ActualActions = AddSbuPopupScreenPage.addsbumodel.getCssValue("cursor");
				System.out.println("cursor :" + ActualActions);
				String ExpectedActions = "auto";

				testCase = extent.createTest("008-ADD-SBU-POPUP-SCREEN-CURSOR-TYPE");
				try {
				
					AssertJUnit.assertEquals(ActualActions, ExpectedActions);
					testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
					testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
					testCase.log(Status.PASS, "correct cursor type");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
					testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
					testCase.log(Status.FAIL, "wrong cursor type");
				}
				
				Thread.sleep(2000);

	// ***** element z- index

				String ActualZindex = AddSbuPopupScreenPage.addsbumodel.getCssValue("z-index");
				System.out.println("z-index :" + ActualZindex);
				String ExpectedZindex = "auto";

				testCase = extent.createTest("009-ADD-SBU-POPUP-SCREEN-Z-INDEX-TYPE");
				try {
					AssertJUnit.assertEquals(ActualZindex, ExpectedZindex);
					testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
					testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
					testCase.log(Status.PASS, "correct z-index  type");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
					testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
					testCase.log(Status.FAIL, "wrong z-index type");
				}
				
				Thread.sleep(2000);
		
				
	//  click on outside of modal
				
				Actions action = new Actions(driver);
		        action.moveByOffset(0, 0).click().build().perform();
		    	boolean AcctualAfterClick = AddSbuPopupScreenPage.addsbumodel.isDisplayed();
				boolean ExpectedAfterClick = true;
				
				testCase = extent.createTest("010-ADD-SBU-POPUP-SCREEN-INVISIBLE-ONCLICK-OUTSIDE");
				try {
					AssertJUnit.assertEquals(AcctualAfterClick, ExpectedAfterClick);
					testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClick);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
					testCase.log(Status.FAIL, "Modal visible ");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
					testCase.log(Status.PASS, "Modal invisible");
				}
				
				Thread.sleep(2000); 
				
			}
	  
}
