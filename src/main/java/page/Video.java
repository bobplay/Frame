package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Video {
	@FindBy(id="vid")
	private WebElement file;
	@FindBy(id="des")
	private WebElement describe;
	@FindBy(id="sub-btn")
	private WebElement sub;
	public void vidUpload(String text){
		file.sendKeys("C:\\Users\\Administrator\\Desktop\\bob.mp4");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		describe.sendKeys(text);
		sub.click();
		
	}
	
}
