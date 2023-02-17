package SBUTestPack;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aventstack.extentreports.Status;

import SBUPagePack.CancelFunPage;


public class CancelFunTest extends LoginTest{
	CancelFunPage canfunpg = new CancelFunPage();

	@Test(priority =0)
	public static void  Masterclick() throws InterruptedException {
		
	CancelFunPage canfunpg = new CancelFunPage();
	PageFactory.initElements(driver, canfunpg);
	Thread.sleep(2000);
	//CancelFunPage.mastercard.click();
	boolean AcctualmasterclickElement=CancelFunPage.mastercard.isEnabled();
    boolean ExpectedmasterElement=true;
    CancelFunPage.mastercard.click();
    boolean elementvisible = true;
    testCase = extent.createTest("MASTER-CARD-VISIBLE");
	try {
		AssertJUnit.assertEquals(AcctualmasterclickElement,ExpectedmasterElement);
	} catch (AssertionError e) {
		elementvisible=false;
	}
	if (elementvisible) {
		testCase.log(Status.INFO,"ActualElement :- " + AcctualmasterclickElement);
		testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedmasterElement);
		testCase.log(Status.INFO,"Element Available");
		testCase.log(Status.PASS,"Correct element");
	} else {
		testCase.log(Status.INFO,"ActualElement :- " + AcctualmasterclickElement);
		testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedmasterElement);
		testCase.log(Status.INFO,"Element not available");
		testCase.log(Status.FAIL,"No Element");
	}
		Thread.sleep(2000);	
	
	}
	
	
	@Test(priority =1)
	public static void  SbusitebarbuttonClick() throws InterruptedException {
	
	CancelFunPage canfunpg = new CancelFunPage();
	PageFactory.initElements(driver, canfunpg);
	Thread.sleep(3000); 
	CancelFunPage.sbusite.click();
	boolean AcctualsbuElement=CancelFunPage.sbusite.isEnabled();
    boolean ExpectedsbuElement=true;

    boolean elementvisible = true;
    testCase = extent.createTest("SBU-BUTTON-VISIBLE");
	try {
		AssertJUnit.assertEquals(AcctualsbuElement,ExpectedsbuElement);
	} catch (AssertionError e) {
		elementvisible=false;
	}
	if (elementvisible) {
		testCase.log(Status.INFO,"ActualElement :- " + AcctualsbuElement);
		testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedsbuElement);
		testCase.log(Status.INFO,"Element Available");
		testCase.log(Status.PASS,"Correct element");
	} else {
		testCase.log(Status.INFO,"ActualElement :- " + AcctualsbuElement);
		testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedsbuElement);
		testCase.log(Status.INFO,"Element not available");
		testCase.log(Status.FAIL,"No Element");
	}
		Thread.sleep(2000);	
	}
	
	@Test(priority =2)
	public static void  addsbubuttonclickMethod() throws InterruptedException {
	
	CancelFunPage canfunpg = new CancelFunPage();
	PageFactory.initElements(driver, canfunpg);
	Thread.sleep(2000);
	CancelFunPage.addsbubtn.click();
	Thread.sleep(2000);
	boolean AcctualsbubtnElement=CancelFunPage.addsbubtn.isEnabled();
    boolean ExpectedsbubtnElement=true;

    boolean elementvisible = true;
    testCase = extent.createTest("ADDSBU-BUTTON-VISIBLE");
	try {
		AssertJUnit.assertEquals(AcctualsbubtnElement,ExpectedsbubtnElement);
	} catch (AssertionError e) {
		elementvisible=false;
	}
	if (elementvisible) {
		testCase.log(Status.INFO,"ActualElement :- " + AcctualsbubtnElement);
		testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedsbubtnElement);
		testCase.log(Status.INFO,"Element Available");
		testCase.log(Status.PASS,"Correct element");
	} else {
		testCase.log(Status.INFO,"ActualElement :- " + AcctualsbubtnElement);
		testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedsbubtnElement);
		testCase.log(Status.INFO,"Element not available");
		testCase.log(Status.FAIL,"No Element");
	}
		Thread.sleep(2000);	
	}
	
	
	@Test(priority = 3)
	public static void  openSBUaddmodelMethod() throws InterruptedException {
		CancelFunPage canfunpg = new CancelFunPage();
		PageFactory.initElements(driver, canfunpg);
		Thread.sleep(3000);
		//CancelFunPage.addsbubtn.click();
		//Thread.sleep(2000);
		boolean AcctualbtnaddsbuclickElement=CancelFunPage.sbumodel.isEnabled();
        boolean ExpectedaddsbuclickopenElement=true;

        boolean elementvisible = true;
        testCase = extent.createTest(" VIEW SBU MODEl-VISIBLE");
		try {
			AssertJUnit.assertEquals(AcctualbtnaddsbuclickElement,ExpectedaddsbuclickopenElement);
		} catch (AssertionError e) {
			elementvisible=false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO,"ActualElement :- " + AcctualbtnaddsbuclickElement);
			testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedaddsbuclickopenElement);
			testCase.log(Status.INFO,"Element Available");
			testCase.log(Status.PASS,"Correct element");
		} else {
			testCase.log(Status.INFO,"ActualElement :- " + AcctualbtnaddsbuclickElement);
			testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedaddsbuclickopenElement);
			testCase.log(Status.INFO,"Element not available");
			testCase.log(Status.FAIL,"No Element");
		}
			Thread.sleep(2000);	
		
		
			
	}
	
	
	
	
	
	@Test(priority = 4)
	public static void  AddSbuDataMethod() throws InterruptedException, IOException {
		CancelFunPage canfunpg = new CancelFunPage();
		PageFactory.initElements(driver, canfunpg);
		
		/*FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\SBUDataPack\\SBUData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sbuadd");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			
			
			XSSFRow row = sheet.getRow(i);

			String sbu = (String) row.getCell(0).getStringCellValue();
			String description = (String) row.getCell(1).getStringCellValue();
			
			Thread.sleep(2000);
			//CancelFunPage.addsbubtn.click();
		

			CancelFunPage.sbufield.sendKeys(sbu); 
			CancelFunPage.desfield.sendKeys(description);
	
			*/
		
		CancelFunPage.sbufield.sendKeys("SBU SASI"); 
		CancelFunPage.desfield.sendKeys("Sasi DESC");
	}
	
		
		@Test(priority = 5)
public static void  savebtnMethod() throws InterruptedException, IOException {
			CancelFunPage canfunpg = new CancelFunPage();
			PageFactory.initElements(driver, canfunpg);
			CancelFunPage.Sbusavebutton.click();
			
		boolean AcctualcancelElement=CancelFunPage.Sbusavebutton.isSelected();
        boolean ExpectedcancelElement=false;

        boolean elementvisible = true;
        testCase = extent.createTest("DATA ADDED & SAVED DATA");
		try {
			AssertJUnit.assertEquals(AcctualcancelElement,ExpectedcancelElement);
		} catch (AssertionError e) {
			elementvisible=true;
		}
		if (elementvisible) {
			testCase.log(Status.INFO,"ActualElement :- " + AcctualcancelElement);
			testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedcancelElement);
			testCase.log(Status.INFO,"Element Available");
			testCase.log(Status.PASS,"Correct element");
		} else {
			testCase.log(Status.INFO,"ActualElement :- " + AcctualcancelElement);
			testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedcancelElement);
			testCase.log(Status.INFO,"Element not available");
			testCase.log(Status.FAIL,"No Element");
		}
			Thread.sleep(2000);	
		}
		
	
	
}