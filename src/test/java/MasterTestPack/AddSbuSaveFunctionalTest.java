package MasterTestPack;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aventstack.extentreports.Status;

import MasterPagePack.AddSbuSaveFunctionalPage;


public class AddSbuSaveFunctionalTest extends QdmsLoginTest{
	AddSbuSaveFunctionalPage canfunpg = new AddSbuSaveFunctionalPage();
	static int ActualTotalPage = 1;
	static boolean TableData = false;
	
	@Test(priority =0)
	public static void  Masterclick() throws InterruptedException {
		
//  Click "Master card" HomePage QDMS Screen
		
	AddSbuSaveFunctionalPage canfunpg = new AddSbuSaveFunctionalPage();
	PageFactory.initElements(driver, canfunpg);
	Thread.sleep(5000);
	//CancelFunPage.mastercard.click();
	boolean AcctualmasterclickElement=AddSbuSaveFunctionalPage.mastercard.isEnabled();
    boolean ExpectedmasterElement=true;
    Thread.sleep(5000);
    AddSbuSaveFunctionalPage.mastercard.click();
    boolean elementvisible = true;
    testCase = extent.createTest("001.MASTER-CARD-VISIBLE");
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
	
	
//	Click "SBU Button" in Master Screen	
	
	@Test(priority =1)
	public static void  SbusitebarbuttonClick() throws InterruptedException {

	AddSbuSaveFunctionalPage canfunpg = new AddSbuSaveFunctionalPage();
	PageFactory.initElements(driver, canfunpg);
	Thread.sleep(3000); 
	AddSbuSaveFunctionalPage.sbusite.click();
	boolean AcctualsbuElement=AddSbuSaveFunctionalPage.sbusite.isEnabled();
    boolean ExpectedsbuElement=true;

    boolean elementvisible = true;
    testCase = extent.createTest("002. SBU-BUTTON-VISIBLE");
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
	
	
//	Check  "ADD SBU Button" VISIBLE in Master Screen		
	
	@Test(priority =2)
	public static void  addsbubuttonclickMethod() throws InterruptedException {
	
	AddSbuSaveFunctionalPage canfunpg = new AddSbuSaveFunctionalPage();
	PageFactory.initElements(driver, canfunpg);
	Thread.sleep(2000);
	AddSbuSaveFunctionalPage.addsbubtn.click();
	Thread.sleep(2000);
	boolean AcctualsbubtnElement=AddSbuSaveFunctionalPage.addsbubtn.isEnabled();
    boolean ExpectedsbubtnElement=true;

    boolean elementvisible = true;
    testCase = extent.createTest("003.ADD SBU-BUTTON-VISIBLE");
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
	
// Check the pop-up visibility
	
	@Test(priority = 3)
	public static void  openSBUaddmodelMethod() throws InterruptedException {
		AddSbuSaveFunctionalPage canfunpg = new AddSbuSaveFunctionalPage();
		PageFactory.initElements(driver, canfunpg);
		Thread.sleep(3000);
		//CancelFunPage.addsbubtn.click();
		//Thread.sleep(2000);
		boolean AcctualbtnaddsbuclickElement=AddSbuSaveFunctionalPage.sbumodel.isEnabled();
        boolean ExpectedaddsbuclickopenElement=true;

        boolean elementvisible = true;
        testCase = extent.createTest("004.VIEW SBU MODEl-VISIBLE");
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
		AddSbuSaveFunctionalPage canfunpg = new AddSbuSaveFunctionalPage();
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
		
		AddSbuSaveFunctionalPage.sbufield.sendKeys("SBU SASI"); 
		AddSbuSaveFunctionalPage.desfield.sendKeys("Sasi DESC");
	}
	
// Check the Add Sbu button save enable
	
		@Test(priority = 5)
public static void  savebtnMethod() throws InterruptedException, IOException {
			AddSbuSaveFunctionalPage canfunpg = new AddSbuSaveFunctionalPage();
			PageFactory.initElements(driver, canfunpg);
			//CancelFunPage.Sbusavebutton.click();
		Thread.sleep(2000);	
		boolean AcctualcancelElement=AddSbuSaveFunctionalPage.Sbusavebutton.isEnabled();
        boolean ExpectedcancelElement=true;
        AddSbuSaveFunctionalPage.Sbusavebutton.click();
        boolean elementvisible = true;
        testCase = extent.createTest("DATA ADDED & SAVED DATA");
		try {
			AssertJUnit.assertEquals(AcctualcancelElement,ExpectedcancelElement);
		} catch (AssertionError e) {
			elementvisible=false;
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
/*		
		public static void PageCount() throws InterruptedException {
			
			CancelFunPage canfunpg = new CancelFunPage();
			PageFactory.initElements(driver, canfunpg);
			boolean Enablity = CancelFunPage.NextPageBtn.isEnabled();
			while (Enablity) {
				Thread.sleep(1000);
				CancelFunPage.NextPageBtn.click();
				ActualTotalPage = ActualTotalPage + 1;
				Enablity = CancelFunPage.NextPageBtn.isEnabled();
			}
			Thread.sleep(000);
			driver.navigate().refresh();
			Thread.sleep(1000);
		}

		public static void CheckDataTable() throws InterruptedException {
			CancelFunPage canfunpg = new CancelFunPage();
			PageFactory.initElements(driver, canfunpg);
			for (int i = 1; i <= ActualTotalPage; i++) {
				for (WebElement ele1 : CancelFunPage.SbuNameColumn) {
					String value1 = ele1.getText();
					// System.out.println(value);
					if (value1.contains(value1)) {
						TableData = true;
						break;
					} 
				}
				if (TableData) {
					break;
				}
				if (CancelFunPage.NextPageBtn.isEnabled()) {
					Thread.sleep(1000);
					CancelFunPage.NextPageBtn.click();
				}
			}
			}
*/
		}

		


	