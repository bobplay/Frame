package page;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UploadJob {
	
	private WebElement title;
	@FindBy(id="show-date")
	private WebElement date;
	@FindBy(xpath="//*[@id=\"default-btn\"]")
	private WebElement btncover;
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/img")
	private WebElement cover;
	@FindBy(id="confirm")
	private WebElement btnconfirm;
	@FindBy(id="cate-select")
	private WebElement category;
	@FindBy(id="province")
	private WebElement city;
	public void setJob(){
		btncover.click();
		cover.click();
		btnconfirm.click();
		select(category);
		select(city);
	}
	public void select(WebElement ele){
		Select sel = new Select(ele);
		List<WebElement> options = sel.getOptions();
		Random rd = new Random();
		int nextInt = rd.nextInt(options.size()-1)+1;
		if(options != null && options.size()>0){		
			sel.selectByIndex(nextInt);
		}	
	}
}
