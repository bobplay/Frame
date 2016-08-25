package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadTrip {
	@FindBy(id="publish-time")
	private WebElement DatePicker;
	@FindBy(id="journey-active")
	private WebElement active;
	@FindBy(className="btn")
	private WebElement sub;
	public void commitTrip(String time,String at){	
		
		DatePicker.sendKeys(time);
		active.sendKeys(at);
		sub.click();
	}
}
