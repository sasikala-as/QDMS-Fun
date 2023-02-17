package SBUTestPack;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import SBUDriverBasePack.SbuDriverInitial;
import SBUPagePack.TableSbuUIPage;

public class AddSbuUITest extends SbuDriverInitial{

	TableSbuUIPage table = new TableSbuUIPage();
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
		//****************** Add SBU Button

		//Add SBU Button Text Visible
		@Test
		public static void addsbubutton()throws InterruptedException{ 
		{
			TableSbuUIPage table = new TableSbuUIPage();
			PageFactory.initElements(driver, table);
				try {
					boolean ExpectedTextVisible=true;
					System.out.println("IsVisible");
					boolean ActualTextVisible=TableSbuUIPage.AddSBUbutton.isDisplayed();
					testCase = extent.createTest("1-ADD-SBU-VISIBLE-UI");
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
					testCase = extent.createTest("1-ADD-SBU-VISIBLE");
					testCase.log(Status.FAIL, "No element");
				}



		//Add SBU Button FONT COLOR

				try {	
					String ActualTitleFontColor = TableSbuUIPage.AddSBUbutton.getCssValue("color");
					System.out.println("Font color of button: " + ActualTitleFontColor);
					String ExpectedTitleFontColor ="rgba(255, 255, 255, 1)";
					testCase = extent.createTest("2.ADD-SBU-FONT-COLOUR-UI");
					
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
					testCase = extent.createTest("2.ADD SBU-FONT-COLOUR");
					testCase.log(Status.FAIL, "No element");
				}

		//Add SBU Button FONTSIZE

			
			try {
						String ActualTitleFontsSize = TableSbuUIPage.AddSBUbutton.getCssValue("font-size");
						System.out.println("Font Size: " + ActualTitleFontsSize);
						String ExpectedTitleFontsSize = "14px";
						testCase = extent.createTest("3.ADD SBU-FONT- SIZE-UI");
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


		//Add SBU Button Font Family 


				try {
					String ActualElementfamily = TableSbuUIPage.AddSBUbutton.getCssValue("font-family");
					System.out.println("FONT-FAMILY: "+ActualElementfamily);
					String ExpectedElementFamily = "Roboto, sans-serif";
					testCase = extent.createTest("4.ADD-SBU-FONT-FAMILY-UI");
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



		//Add SBU Button Spelling	

			try {
					  String AcctualTitleText = TableSbuUIPage.AddSBUbutton.getText();
					  String ExpectedTitleText = "Add SBU";
					  System.out.println(" Text:" + AcctualTitleText);
					  testCase = extent.createTest("5.ADD-SBU-SPELLING-TEXT-UI");
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
					  testCase = extent.createTest("5.ADD-SBU-SPELLING-TEXT-UI");
					  testCase.log(Status.FAIL, "No Element");
				}

		//Add SBU Button Position

				try {
						Point ActulalLocation = TableSbuUIPage.AddSBUbutton.getLocation();        
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
					 testCase = extent.createTest("6.ADD-SBU-POSITION");
					 testCase.log(Status.FAIL, "NO ELEMENT");
					
				} 
			 
			
		//Add SBU Button Padding 

				try { 
							String Actualpadding = TableSbuUIPage.AddSBUbutton.getCssValue("padding");
							System.out.println("PADDING: "+Actualpadding);
							String Expectedpadding = "0px";
							testCase = extent.createTest("7.ADD-SBU-TEXT PADDING-UI");
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


			
		//Add SBU Button Shadow


		try {
				String Actualshadow = TableSbuUIPage.AddSBUbutton.getCssValue("box-shadow");
				System.out.println("Text Shadow :" + Actualshadow);
				String ExpectedShadow = "none";
				testCase = extent.createTest("8.ADD-SBU-BOX-SHADOW-UI");
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
					testCase = extent.createTest("8.ADD-SBU-BOX-SHADOW");
					testCase.log(Status.FAIL, "No Element");
				}


		//Add SBU Button BACKGROUND COLOR


		try {
				String Actualbackground = TableSbuUIPage.AddSBUbutton.getCssValue("color");
				System.out.println("BACKGROUND COLOR:" + Actualbackground);
				String Expectedbackground= "rgba(255, 255, 255, 1)";
				
		
				testCase = extent.createTest("9.ADD-SBU-BACKGROUND COLOR-UI");
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
					testCase = extent.createTest("9.ADD-SBU-BACKGROUND COLOR-UI");
				}
			

		//Add SBU Button BORDER COLOR
		 
		 

				try {		 
						String actualbordercolor = TableSbuUIPage.AddSBUbutton.getCssValue("border-color");
						System.out.println(" border-color:" + actualbordercolor);
						String Expectedbordercolor = "rgb(255, 255, 255)";
						testCase = extent.createTest("10.ADD-SBU-BORDER-COLOR-UI");
						try {
							AssertJUnit.assertEquals(actualbordercolor, Expectedbordercolor);
							testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
							testCase.log(Status.INFO, "Expectedbordercolor :- " + Expectedbordercolor);
							testCase.log(Status.PASS, "correct");
						} catch(AssertionError e) {
							// TODO: handle exception
						} {
							testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
							testCase.log(Status.INFO, "Expectedbordercolor :- " +Expectedbordercolor);
							testCase.log(Status.FAIL, "wrong");
						}
					}
					catch(Exception e) {
							testCase.log(Status.FAIL, "NO ELEMENT");
							testCase = extent.createTest("10.ADD-SBU-BORDER-COLOR");
						}
			 
			 
		//Add SBU Button CURSER POINT	 

				try {	 
						String ActualCursor = TableSbuUIPage.AddSBUbutton.getCssValue("cursor");
						System.out.println("cursor :" + ActualCursor);
						String Expectedcursor = "pointer";
						testCase = extent.createTest("11.ADD-SBU-CURSOR-UI");
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
							testCase = extent.createTest("11.ADD-SBU-CURSOR-UI");
						}
			 
			 
		//Add SBU Button OPACITY 

				try {
						String Actualopacity = TableSbuUIPage.AddSBUbutton.getCssValue("opacity");
						System.out.println("OPACITY :" + Actualopacity);
						
						String Expectedopacity = "1";
						testCase = extent.createTest("12.ADD-SBU-OPACITY-UI");
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
							testCase = extent.createTest("12.ADD-SBU-OPACITY-UI");
							testCase.log(Status.FAIL,  "No Element");
						}
				 
			
		//Add SBU Button HEIGHT

				try {	 
						String ActualHeight =TableSbuUIPage.AddSBUbutton.getCssValue("height");
						System.out.println("Height :" + ActualHeight);
						String ExpectedHeight = "22px";
						testCase = extent.createTest("13.ADD-SBU-HEIGHT-UI");
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
							testCase = extent.createTest("13.ADD-SBU-HEIGHT-UI");
							testCase.log(Status.FAIL, "No element");	
						}
			

			
		//Add SBU Button WIDTH


				try {	 
						String Actualwidth =TableSbuUIPage.AddSBUbutton.getCssValue("width");
						System.out.println("width :" + Actualwidth);
					
						String Expectedwidth = "54.5px";
						testCase = extent.createTest("14.ADD-SBU-WIDTH-UI");
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
						testCase = extent.createTest("14.ADD-SBU-WIDTH-UI");
						testCase.log(Status.FAIL, "No element");	
					}
				
			

		//Add SBU Button Font-weight

				try {
						String Actualweight = TableSbuUIPage.AddSBUbutton.getCssValue("font-weight");
						System.out.println("16.Font-weight :" + Actualweight);
						String Expectedweight = "400";
						testCase = extent.createTest("15.ADD-SBU-FONT-WEIGHT-UI");
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
					testCase = extent.createTest("15.ADD-SBU-FONT-WEIGHT-UI");
				}

		}	
  }
}

