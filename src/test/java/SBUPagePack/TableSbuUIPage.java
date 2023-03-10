package SBUPagePack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TableSbuUIPage {

	@FindBy(id = "usernameOrEmail")
	public static WebElement Username;
	
	@FindBy(id = "password")
	public static WebElement Password;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button")
	public static WebElement LoginButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div")
	public static WebElement master;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]")
	public static WebElement sbutable;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button/span")
	public static WebElement AddSBUbutton;
	
}
