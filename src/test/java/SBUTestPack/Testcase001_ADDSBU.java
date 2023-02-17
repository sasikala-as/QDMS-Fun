/*
 * @Author:- Sasi
 * Date:- 17-02-2023
 * Time :- 12:00 PM
 * Test case:- Add SBU
 */


package SBUTestPack;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import SBUPagePack.CancelFunPage;
import SBUPagePack.TableSbuUIPage;
import SBUPagePack.addsbumodelPage;

public class Testcase001_ADDSBU extends CancelFunTest{
	CancelFunTest canfuntest = new CancelFunTest();
	static AddSbuUITest addsbubtn = new AddSbuUITest();
	addsbumodelTest sbumodels = new addsbumodelTest();
	 
@Test

public static void  Addsbu() throws InterruptedException, IOException {
//Test case :- 0001 --- Add Sub Business Unit with Data
	
		CancelFunTest canfuntest = new CancelFunTest();
		PageFactory.initElements(driver, canfuntest);
		PageFactory.initElements(driver, addsbubtn);
		
	
//Step-01 :- Click Master card
		CancelFunTest.Masterclick();
		
//Step-02 :- Click SBU 
		CancelFunTest.SbusitebarbuttonClick();
		
//Step-03 :- Check Add SBU Button UI
		AddSbuUITest.addsbubutton();
		
//Step-04 :- Click Add Sbu Button
		CancelFunTest.addsbubuttonclickMethod();
		
				
//Step-05:-View SBU Model 
		CancelFunTest.openSBUaddmodelMethod();
		
//Step-06:-Check SBU Model UI
		addsbumodelTest.addsbumodel();
		
		
//Step-07:-Add data to SBU & DESC  
		CancelFunTest.AddSbuDataMethod();
		
//Step-09:-Click Save Button
		CancelFunTest.savebtnMethod();

	
}
	
	

		
		
		

		
			
	
	
	
	
	
}
