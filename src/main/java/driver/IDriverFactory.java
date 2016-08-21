package driver;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface IDriverFactory {
	RemoteWebDriver getDriver(Browser browser);
}
