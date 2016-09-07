package page;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.peilei.framework.BaseCase;

public class UploadJob {
	
	@FindBy(id="job-name")
	private WebElement title;
	@FindBy(id="show-date")
	private WebElement date;
	@FindBy(id="default-btn")
	private WebElement btncover;
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/img")
	private WebElement cover;
	@FindBy(id="confirm")
	private WebElement btnconfirm;
	@FindBy(id="cate-select")
	private WebElement category;
	@FindBy(id="province")
	private WebElement city;
	@FindBy(id="job-sub")
	private WebElement su;
	
	
	public void setJob(String t){
		Actions actions = new Actions(BaseCase.driver);
//		actions.keyDown(Keys.ARROW_DOWN).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		title.sendKeys(t);
		btncover.click();
		cover.click();
		btnconfirm.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		category.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actions.moveToElement(su).perform();
//		actions.moveByOffset(600, 1000).perform();
		select(category);
		select(city);
		
		
	}
	public void select(WebElement ele){
		MySelect sel = new MySelect(ele);
		List<WebElement> options = sel.getOptions();
		Random rd = new Random();
		int nextInt = rd.nextInt(options.size()-1)+1;
		if(options != null && options.size()>0){		
//			sel.selectByIndex(1);
			options.get(nextInt).click();
//			sel.deselectByValue("55");
		}	
	}
}
