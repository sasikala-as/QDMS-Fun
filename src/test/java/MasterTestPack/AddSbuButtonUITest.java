package MasterTestPack;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import MasterDriverBasePack.SbuDriverInitial;
import MasterPagePack.AddSbuButtonUIPage;

public class AddSbuButtonUITest extends SbuDriverInitial{

	AddSbuButtonUIPage table = new AddSbuButtonUIPage();
	@Test
	public void Menu() throws InterruptedException {

	/*	PageFactory.initElements(driver, table);
		TableSbuUIPage.Username.sendKeys("admin");
		TableSbuUIPage.Password.sendKeys("tokyo@admin");
		TableSbuUIPage.LoginButton.click();
		
		Thread.sleep(4000);
		TableSbuUIPage.master.click();
		
		Thread.sleep(3000);
		TableSbuUIPage.sbutable.click();
	}
	*/
	}
//****************** Add SBU Button UI *****************************

//Check "Add SBU Button" Visible in Overview Screen
		@Test
		public static void addsbubutton()throws InterruptedException{ 
		{
			System.out.println("Start Add Sbu Button Checking UI");
			AddSbuButtonUIPage table = new AddSbuButtonUIPage();
			PageFactory.initElements(driver, table);
				try {
					boolean ExpectedTextVisible=true;
					System.out.println("IsVisible");
					boolean ActualTextVisible=AddSbuButtonUIPage.AddSBUbutton.isDisplayed();
					testCase = extent.createTest("1-ADD-SBU-BUTTON-VISIBLE-UI");
					try {
						Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
						testCase.log(Status.INFO, "Actual Visible :- " + ActualTextVisible);
						testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
						testCase.log(Status.PASS, " Correct");
					} catch (AssertionError e) {
						testCase.log(Status.INFO, "ActualVisible :- " + ActualTextVisible);
						testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
						testCase.log(Status.FAIL, "Wrong");
					}
				}
				catch(Exception e) {
					testCase = extent.createTest("1-ADD-SBU-BUTTON-VISIBLE");
					testCase.log(Status.FAIL, "No element");
				}




//Check "Add SBU Button"  FONT COLOR check in Overview Screen
				try {	
					String ActualTitleFontColor = AddSbuButtonUIPage.AddSBUbutton.getCssValue("color");
					System.out.println("Font color of button: " + ActualTitleFontColor);
					String ExpectedTitleFontColor ="rgba(255, 255, 255, 1)";
					testCase = extent.createTest("2.ADD-SBU-BUTTON-FONT-COLOUR-UI");
					
					try {
					  AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);
					  testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
					  testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
					  testCase.log(Status.INFO, "Correct font Colour");
					  testCase.log(Status.PASS, "Correct font Colour");
					
					} catch(AssertionError e){
					  testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
					  testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
					  testCase.log(Status.INFO, "wrong font Colour");
					  testCase.log(Status.FAIL, "wrong font Colour");
					}
				}
				catch(Exception e) {
					testCase = extent.createTest("2.ADD SBU-BUTTON-FONT-COLOUR");
					testCase.log(Status.FAIL, "No element");
				}

		
//Check "Add SBU Button" FONT Size in Overview Screen
			
			try {
						String ActualTitleFontsSize = AddSbuButtonUIPage.AddSBUbutton.getCssValue("font-size");
						System.out.println("Font Size: " + ActualTitleFontsSize);
						String ExpectedTitleFontsSize = "14px";
						testCase = extent.createTest("3.ADD SBU-BUTTON-FONT- SIZE-UI");
					try{
					  AssertJUnit.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
					  testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
					  testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
					  testCase.log(Status.PASS, "Correct font-size");
					  testCase.log(Status.PASS, " Font-size Correct");
					}catch(AssertionError e) {
					  testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
					  testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
					  testCase.log(Status.INFO, "Wrong font-size");
					  testCase.log(Status.FAIL, "Font-size Wrong");
					
					}
				}
				catch(Exception e) {
					testCase = extent.createTest("3.ADD SBU FONT- SIZE");
					testCase.log(Status.FAIL, "No Element");
				}


//Check "Add SBU Button"  Font Family in Overview Screen
			
				try {
					String ActualElementfamily = AddSbuButtonUIPage.AddSBUbutton.getCssValue("font-family");
					System.out.println("FONT-FAMILY: "+ActualElementfamily);
					String ExpectedElementFamily = "Roboto, sans-serif";
					testCase = extent.createTest("4.ADD-SBU-BUTTON-FONT-FAMILY-UI");
				try {
					  Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
					  testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
					  testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
					  testCase.log(Status.PASS, "Correct Text");
				} catch (AssertionError e) {
					  testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
					  testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
					  testCase.log(Status.FAIL, "wrong Text");
				}
				}
				catch(Exception e) {
					testCase = extent.createTest("4.FONT-FAMILY");
					 testCase.log(Status.FAIL, "NO ELEMENT");
				}


//Check "Add SBU Button"  Spelling in Overview Screen
		
			try {
					  String AcctualTitleText = AddSbuButtonUIPage.AddSBUbutton.getText();
					  String ExpectedTitleText = "Add SBU";
					  System.out.println(" Text:" + AcctualTitleText);
					  testCase = extent.createTest("5.ADD-SBU-BUTTON-SPELLING-TEXT-UI");
				  try {
				
				      testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
				      testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
				
				      testCase.log(Status.PASS, "Correct element");
				  } catch(AssertionError e) {
				      testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
				      testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
				 
				      testCase.log(Status.FAIL, "Wrong Element");
				  }
				} catch (Exception find9) {
					  testCase = extent.createTest("5.ADD-SBU-BUTTON-SPELLING-TEXT-UI");
					  testCase.log(Status.FAIL, "No Element");
				}

	// Check "Add SBU Button"  Position in Overview Screen		

				try {
						Point ActulalLocation = AddSbuButtonUIPage.AddSBUbutton.getLocation();        
						int actual_x = ActulalLocation.getX();
						int actual_y = ActulalLocation.getY();
						System.out.println("X axis: " + actual_x);
						System.out.println("Y axis: " + actual_y);
						Point ExpectedLocation = new Point(651, 98);
					
					testCase = extent.createTest("6.ADD-SBU-BUTTON-POSITION-UI");
					try {
						  AssertJUnit.assertEquals(ActulalLocation, ExpectedLocation);
						  testCase.log(Status.INFO, "ActualFontSize :- " + ActulalLocation);
						  testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
						  testCase.log(Status.PASS, "Correct Location");
					} catch(AssertionError e){
						  testCase.log(Status.INFO, "ActualSize :- " + ActulalLocation);
						  testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
						  testCase.log(Status.FAIL, "Wrong Location");
					}
				 }
				catch(Exception e) {
					 testCase = extent.createTest("6.ADD-SBU-BUTTON-POSITION");
					 testCase.log(Status.FAIL, "NO ELEMENT");
					
				} 
			 
			
	// Check "Add SBU Button"  Padding in Overview Screen	 

				try { 
							String Actualpadding = AddSbuButtonUIPage.AddSBUbutton.getCssValue("padding");
							System.out.println("PADDING: "+Actualpadding);
							String Expectedpadding = "0px";
							testCase = extent.createTest("7.ADD-SBU-BUTTON-TEXT PADDING-UI");
						try {
							  Assert.assertEquals(Actualpadding, Expectedpadding);
							  testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
							  testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
							  testCase.log(Status.PASS, "padding is Correct");
						} catch (AssertionError e) {
							  testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
							  testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
							  testCase.log(Status.FAIL, "padding is Wrong");
						}
					}
				catch(Exception e) {
					 testCase = extent.createTest("7.ADD-SBU-PADDING");
					 testCase.log(Status.FAIL, "NO ELEMENT");
				}	 


			
 // Check "Add SBU Button"  Shadow in Overview Screen	


		try {
				String Actualshadow = AddSbuButtonUIPage.AddSBUbutton.getCssValue("box-shadow");
				System.out.println("Text Shadow :" + Actualshadow);
				String ExpectedShadow = "none";
				testCase = extent.createTest("8.ADD-SBU-BUTTON-BOX-SHADOW-UI");
				try {
				  AssertJUnit.assertEquals(Actualshadow, ExpectedShadow);
				  testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
				  testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
				  testCase.log(Status.PASS, "Shadow available");
				} catch(AssertionError e){
				  testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
				  testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
				  testCase.log(Status.FAIL, "Shadow not available");
				}
			}
				catch(Exception find6) {
					testCase = extent.createTest("8.ADD-SBU-BUTTON-BOX-SHADOW");
					testCase.log(Status.FAIL, "No Element");
				}


		// Check "Add SBU Button"  BACKGROUND COLOR in Overview Screen 


		try {
				String Actualbackground = AddSbuButtonUIPage.AddSBUbutton.getCssValue("color");
				System.out.println("BACKGROUND COLOR:" + Actualbackground);
				String Expectedbackground= "rgba(255, 255, 255, 1)";
				
		
				testCase = extent.createTest("9.ADD-SBU-BUTTON-BACKGROUND COLOR-UI");
				try {
					AssertJUnit.assertEquals(Actualbackground, Expectedbackground);
					
					testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
					testCase.log(Status.INFO, "Expectedbackgroundcolor :- " + Expectedbackground);
					testCase.log(Status.PASS, "correct");
				} catch(AssertionError e) {
					testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
					testCase.log(Status.INFO, "Expectedbackgroundcolor:- " + Expectedbackground);
					testCase.log(Status.FAIL, "wrong");
				}
			}
				catch(Exception e) {
					testCase.log(Status.FAIL, "No Element");
					testCase = extent.createTest("9.ADD-SBU-BUTTON-BACKGROUND COLOR-UI");
				}
			

		// Check "Add SBU Button"  BORDER COLOR in Overview Screen 
		 
		 

				try {		 
						String actualbordercolor = AddSbuButtonUIPage.AddSBUbutton.getCssValue("border-color");
						System.out.println(" border-color:" + actualbordercolor);
						String Expectedbordercolor = "rgb(255, 255, 255)";
						testCase = extent.createTest("10.ADD-SBU-BUTTON-BORDER-COLOR-UI");
						try {
							AssertJUnit.assertEquals(actualbordercolor, Expectedbordercolor);
							testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
							testCase.log(Status.INFO, "Expectedbordercolor :- " + Expectedbordercolor);
							testCase.log(Status.PASS, "correct");
						} catch(AssertionError e) 
							 {
							testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
							testCase.log(Status.INFO, "Expectedbordercolor :- " +Expectedbordercolor);
							testCase.log(Status.FAIL, "wrong");
						}
					}
					catch(Exception e) {
							testCase.log(Status.FAIL, "NO ELEMENT");
							testCase = extent.createTest("10.ADD-SBU-BUTTON-BORDER-COLOR");
						}
			 
			 
		// Check "Add SBU Button"  CURSER POINT in Overview Screen  	 

				try {	 
						String ActualCursor = AddSbuButtonUIPage.AddSBUbutton.getCssValue("cursor");
						System.out.println("cursor :" + ActualCursor);
						String Expectedcursor = "pointer";
						testCase = extent.createTest("11.ADD-SBU-BUTTON-CURSOR-UI");
						try {
							AssertJUnit.assertEquals(ActualCursor, Expectedcursor);
							testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
							testCase.log(Status.INFO, "ActualCursor:- " + Expectedcursor);
							testCase.log(Status.PASS, "correct");
						}  catch(AssertionError e) {
							testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
							testCase.log(Status.INFO, "ActualCursor :- " + Expectedcursor);
							testCase.log(Status.FAIL, "wrong");
						}
					}
						catch(Exception e) {
							testCase.log(Status.FAIL, "No Element");
							testCase = extent.createTest("11.ADD-SBU-BUTTON-CURSOR-UI");
						}
			 
			 
		// Check "Add SBU Button" OPACITY in Overview Screen 	

				try {
						String Actualopacity = AddSbuButtonUIPage.AddSBUbutton.getCssValue("opacity");
						System.out.println("OPACITY :" + Actualopacity);
						
						String Expectedopacity = "1";
						testCase = extent.createTest("12.ADD-SBU-BUTTON-OPACITY-UI");
						try {
							AssertJUnit.assertEquals(Actualopacity, Expectedopacity);
							testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
							testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
							testCase.log(Status.PASS,  "correct");
						}
						catch(AssertionError e) {
							testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
							testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
							testCase.log(Status.FAIL,  "wrong");
						}
					}
					catch (Exception e) {
							testCase = extent.createTest("12.ADD-SBU-BUTTON-OPACITY-UI");
							testCase.log(Status.FAIL,  "No Element");
						}
				 
			
	// Check "Add SBU Button" HEIGHT in Overview Screen 

				try {	 
						String ActualHeight =AddSbuButtonUIPage.AddSBUbutton.getCssValue("height");
						System.out.println("Height :" + ActualHeight);
						String ExpectedHeight = "22px";
						testCase = extent.createTest("13.ADD-SBU-BUTTON-HEIGHT-UI");
						try {
							AssertJUnit.assertEquals(ActualHeight, ExpectedHeight);
							testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
							testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
							testCase.log(Status.PASS, "correct");
						} catch(AssertionError e) {
							testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
							testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
							testCase.log(Status.FAIL, "wrong");
						}
					}
					catch(Exception e) {
							testCase = extent.createTest("13.ADD-SBU-BUTTON-HEIGHT-UI");
							testCase.log(Status.FAIL, "No element");	
						}
			

			
		// Check "Add SBU Button" WIDTH in Overview Screen 		


				try {	 
						String Actualwidth =AddSbuButtonUIPage.AddSBUbutton.getCssValue("width");
						System.out.println("width :" + Actualwidth);
					
						String Expectedwidth = "54.5px";
						testCase = extent.createTest("14.ADD-SBU-BUTTON-WIDTH-UI");
						try {
							AssertJUnit.assertEquals(Actualwidth, Expectedwidth);
							testCase.log(Status.INFO, "Actualwidth :- " + Actualwidth);
							testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
							testCase.log(Status.PASS, "correct");
						} catch(AssertionError e) {
							testCase.log(Status.INFO, "Actualwidth  :- " + Actualwidth);
							testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
							testCase.log(Status.FAIL, "wrong");
						}
				   }
				    catch(Exception e) {
						testCase = extent.createTest("14.ADD-SBU-BUTTON-WIDTH-UI");
						testCase.log(Status.FAIL, "No element");	
					}
				
			

				// Check "Add SBU Button" Font-weight in Overview Screen 		
				try {
						String Actualweight = AddSbuButtonUIPage.AddSBUbutton.getCssValue("font-weight");
						System.out.println("16.Font-weight :" + Actualweight);
						String Expectedweight = "400";
						testCase = extent.createTest("15.ADD-SBU-BUTTTON-FONT-WEIGHT-UI");
						try {
							AssertJUnit.assertEquals(Actualweight, Expectedweight);
							testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
							testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
							testCase.log(Status.PASS, "correct");
						} catch(AssertionError e) {
							testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
							testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
							testCase.log(Status.FAIL, "wrong");
						}
					} 
				catch(Exception e) {
					testCase.log(Status.FAIL, "No Element");
					testCase = extent.createTest("15.ADD-SBU-BUTTON-FONT-WEIGHT-UI");
				}
				System.out.println("END Add Sbu Button Checking UI");
		}	
  }
}

