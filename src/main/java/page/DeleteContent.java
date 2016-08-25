package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteContent {
	
	@FindBy(id="del-text")
	private WebElement delete;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/a[1]")
	private WebElement confrim;
	public void delContent(){
		delete.click();
	}
	public void clickConfrim(){
		confrim.click();
	}
}
