package MasterPagePack;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddSbuSaveFunctionalPage {


	@FindBy(xpath="//*[@id ='usernameOrEmail']")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(xpath= "//button[@type]")
	public static WebElement login;
	
	@FindBy (xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/plantlevel']")
    public static WebElement mastercard;
	
	@FindBy(xpath= "//div[@class='sc-dnqmqq bxMwVY']")
	public static WebElement sbusite;
	
	@FindBy(xpath= "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button/span")
	public static WebElement addsbubtn;
	
	@FindBy(xpath= "//*[@id='sub_business_unit']")
	public static WebElement sbufield;
	
	@FindBy(xpath= "//*[@id='description']")
	public static WebElement desfield;
	
	@FindBy(xpath= "//button[@Type='button'][@class='ant-btn']/span")
	public static WebElement cancelbtn;
	
	@FindBy(xpath= "/html/body/div[3]/div/div[2]")
	public static WebElement sbumodel;
	
	
	@FindBy(xpath= "//*[@id=\"rcDialogTitle0\"]/div/span")
	public static WebElement sbuclose;
			
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]")
	public static WebElement sbuoutside;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]")
	public static WebElement Sbusavebutton;

	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
	public static List<WebElement> SbuNameColumn;
	@FindBy(xpath = "//li[@title='Next Page']/button")
	public static WebElement NextPageBtn;
	
	
	
}
