package driver;

import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	
	static DriverFactoryImpl impl = null;
	public static RemoteWebDriver getDriver(Browser browser){
		if(impl == null){
			
			impl = new DriverFactoryImpl();
		}
		return impl.getDriver(browser);
	}
}
