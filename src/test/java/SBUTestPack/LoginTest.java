package SBUTestPack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SBUDriverBasePack.SbuDriverInitial;
import SBUPagePack.LoginPage;


public class LoginTest extends SbuDriverInitial{
	
LoginPage loginpg = new LoginPage();
	
	@Test
	public void logincheck() throws InterruptedException, IOException {
		PageFactory.initElements(driver, loginpg);

		SoftAssert sa = new SoftAssert();
		Thread.sleep(2000);
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\SBUDataPack\\SBUData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("login");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(0);

			String uName = (String) row.getCell(0).getStringCellValue();
			String pWord = (String) row.getCell(1).getStringCellValue();
			String expec = (String) row.getCell(2).getStringCellValue();

			LoginPage.username.sendKeys(uName);
			LoginPage.password.sendKeys(pWord);
			LoginPage.login.click();
			
			Thread.sleep(2500);
			String actualurl = driver.getCurrentUrl();
			System.out.println(actualurl);

			System.out.println(expec);

			sa.assertEquals(expec, actualurl);
		}
	}
}
