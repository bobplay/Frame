package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class textDetail {
	
	@FindBy(className="to-detail-page")
	private WebElement subtextDetail;
	public void textContent(){
		subtextDetail.click();
	}
}
