package driver;

import java.io.File;

import java.util.Set;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactoryImpl implements IDriverFactory{

	@Override
	public RemoteWebDriver getDriver(Browser brower) {
		RemoteWebDriver driver = null;
		switch (brower) {
		case CHROM_BROWER:
			return getChromeWebDriver();
		case FIREFOX_BROWER:
			return getFirefoxWebDriver();
		case IE_BROWER:
			return getIEWebDriver();
		}
		
		return driver;

	}

	/**
	 * ����ҳ
	 * 
	 * @param webDriver
	 *            ���������driver
	 */
	public RemoteWebDriver getChromeWebDriver(){
		if(!System.getProperties().containsKey("webdriver.chrome.driver")){
			System.setProperty("webdriver.chrome.driver",
					"./src/test/resources/chromedriver.exe");
		
		}
		return new ChromeDriver();
	}
	public RemoteWebDriver getIEWebDriver(){
		if(!System.getProperties().containsKey("webdriver.ie.driver")){
			System.setProperty("webdriver.ie.driver",
					"./src/test/resources/IEDriverServer.exe");
		}
		return new InternetExplorerDriver(2035);
	}
	public RemoteWebDriver getFirefoxWebDriver(){
		FirefoxBinary binary = new FirefoxBinary(new File(
				System.getProperty("webdriver.firefox.FirefoxBinary", "D:\\Mozilla Firefox\\firefox.exe")));
		return new FirefoxDriver(binary, null);
	}

}
