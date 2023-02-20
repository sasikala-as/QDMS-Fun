/*

***********************************************************************************
* Description
*------------

* Add Sbu functionaltiy
***********************************************************************************

* Author           : @Sasikala Ambalavanar
* Date Written     : 17/02/2023
 


* Test Case Number       Date         Intis        Comments
* ================       ====         =====        ========
*   0001                17/02/2023   Sasikala     Orginal Version

************************************************************************************

*/

package MasterTestPack;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import MasterPagePack.AddSbuSaveFunctionalPage;
import MasterPagePack.AddSbuButtonUIPage;
import MasterPagePack.AddSbuPopupScreenPage;

public class Testcase001_ADDSBU extends AddSbuSaveFunctionalTest{
	AddSbuSaveFunctionalTest canfuntest = new AddSbuSaveFunctionalTest();
	static AddSbuButtonUITest addsbubtn = new AddSbuButtonUITest();
	AddSbuPopupScreenTest sbumodels = new AddSbuPopupScreenTest();
	 
@Test

public static void  Addsbu() throws InterruptedException, IOException {
//Test case :- 0001 --- Add Sub Business Unit with Data
	
		AddSbuSaveFunctionalTest canfuntest = new AddSbuSaveFunctionalTest();
		PageFactory.initElements(driver, canfuntest);
		PageFactory.initElements(driver, addsbubtn);
		
	
//Step-01 :- Click "Master card" HomePage QDMS Screen
		AddSbuSaveFunctionalTest.Masterclick();
	/*
	*001.MASTER-CARD-VISIBLE 
	*/
		
//Step-02 :- Click "SBU Button" in Master Screen
		AddSbuSaveFunctionalTest.SbusitebarbuttonClick();
		/*
		*002. SBU-BUTTON-VISIBLE
		*003.ADD SBU-BUTTON-VISIBLE
		*/
			
//Step-03 :- Check "Add SBU" Button UI Properties
/*
 
 	//1-ADD-SBU-BUTTON-VISIBLE-UI, 2.ADD-SBU-BUTTON-FONT-COLOUR-UI,3.ADD SBU-BUTTON-FONT- SIZE-UI, 4.ADD-SBU-BUTTON-FONT-FAMILY-UI
	//5.ADD-SBU-BUTTON-SPELLING-TEXT-UI, 6.ADD-SBU-BUTTON-POSITION-UI ,7.ADD-SBU-BUTTON-TEXT PADDING-UI,8.ADD-SBU-BUTTON-BOX-SHADOW-UI
	//9.ADD-SBU-BUTTON-BACKGROUND COLOR-UI,10.ADD-SBU-BUTTON-BORDER-COLOR-UI,11.ADD-SBU-BUTTON-CURSOR-UI,12.ADD-SBU-BUTTON-OPACITY-UI
	//13.ADD-SBU-BUTTON-HEIGHT-UI,14.ADD-SBU-BUTTON-WIDTH-UI,15.ADD-SBU-BUTTTON-FONT-WEIGHT-UI
		
*/
	AddSbuButtonUITest.addsbubutton();
		
//Step-04 :- Click "Add Sbu" Button in SBU Screen
		AddSbuSaveFunctionalTest.addsbubuttonclickMethod();
		
		
//Step-05:- View "Add SBU" Pop-up Screen  
		AddSbuSaveFunctionalTest.openSBUaddmodelMethod();
		
//Step-06:-Check "Add Sbu" Pop-up Screen UI Properties
		AddSbuPopupScreenTest.addsbumodel();
/*
 * 001.ADD-SBU-POPUP-SCREEN-Window-Visible,002-ADD-SBU-POPUP-SCREEN-POSITION,003-ADD-SBU-POPUP-SCREEN-SIZE,
 * 004-ADD-SBU-POPUP-SCREEN-BACKGROUND-COLOR,005-ADD-SBU-POPUP-SCREEN-BORDER-COLOR,006-ADD-SBU-POPUP-SCREEN-OVERFLOW-TYPE
 * 007-ADD-SBU-POPUP-SCREEN-MARGIN-TYPE,008-ADD-SBU-POPUP-SCREEN-CURSOR-TYPE,009-ADD-SBU-POPUP-SCREEN-Z-INDEX-TYPE
 * 010-ADD-SBU-POPUP-SCREEN-INVISIBLE-ONCLICK-OUTSIDE,		
 */
		
//Step-07:- Add data to the "SBU Filed" & "Description Filed"  
		AddSbuSaveFunctionalTest.AddSbuDataMethod();
		
//Step-09:- Click Save Button in "Add Sbu" Screen
		AddSbuSaveFunctionalTest.savebtnMethod();

	//CancelFunTest.PageCount();
	//CancelFunTest.CheckDataTable();
}
	
	

		
		
		

		
			
	
	
	
	
	
}
