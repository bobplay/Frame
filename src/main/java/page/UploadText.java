package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.peilei.framework.BaseCase;
import com.sun.org.apache.bcel.internal.ExceptionConstants;

public class UploadText extends BaseCase{
	@FindBy(how=How.ID,using="text-conent")
	private WebElement textConent;
	@FindBy(id="up-file")
	private WebElement file;
	@FindBy(className="btn")
	private WebElement suBtn;
	public  void commitText(String text){
		textConent.sendKeys(text);
		file.sendKeys("C:\\Users\\Administrator\\Desktop\\奇妙能力歌.jpg");
		suBtn.click();
	}
	
}
