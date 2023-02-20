package MasterPagePack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QdmsLoginPage {

	@FindBy(xpath="//*[@id ='usernameOrEmail']")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(xpath= "//button[@type]")
	public static WebElement login;
	
}
