package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexDynamic {
	@FindBy(className="text-icon")
	private WebElement dynamic;
	@FindBy(className="to-detail-page")
	private WebElement subtextDetail;
	public void index(){
		dynamic.click();
	}
	public void textContent(){
		subtextDetail.click();
	}
}
