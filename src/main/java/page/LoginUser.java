package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginUser {
	@FindBy(xpath="//*[@id=\"form-login\"]/div[1]/div/input")
	private WebElement username;
	@FindBy(xpath="//*[@id=\"form-login\"]/div[2]/div/input")
	private WebElement password;
	@FindBy(xpath="//*[@id=\"form-login\"]/input[1]")
	private WebElement su;
	public void loginYule(String name,String pass){
		username.sendKeys(name);
		password.sendKeys(pass);
		su.click();
	}
}
