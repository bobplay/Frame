package com.peilei.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsWait {
	//窗口等待
	public  void windowsWait(WebElement element){
		new WebDriverWait(BaseCase.driver, 3000).until(ExpectedConditions.visibilityOf(element));
	}
}
