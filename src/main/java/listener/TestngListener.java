package listener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hamcrest.generator.qdox.tools.QDoxTester.Reporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty7.util.log.Log;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.apache.commons.*;

import com.peilei.framework.BaseCase;
import com.sun.jna.platform.FileUtils;

//用户1.IResultListener2测试结果监听，2.IConfigurationListener2配置监听3.ITestListener测试用例结果监听
public class TestngListener extends TestListenerAdapter {
	// 当用例失败，跳过
	// 测试结果监听，配置方法监听 I
	String dirName = "./src/test/resources";

	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		System.out.println("failed");
		super.onTestFailure(tr);
		org.testng.Reporter.log(tr.getName() + " Failure");
		captureBitmap(null);
	}

	public void captureBitmap(String fileName) {
		if (!(new File(dirName).isDirectory())) {
			new File(dirName).mkdir();
		}

		String imgsrc;
		if (fileName == null || fileName.isEmpty()) {
			imgsrc = dirName + File.separator + System.currentTimeMillis() + ".png";	
		} else {
			imgsrc = dirName + File.separator + fileName + System.currentTimeMillis() + ".png";
		}

		File from = BaseCase.driver.getScreenshotAs(OutputType.FILE);

		copyFile(from, new File(imgsrc));
	}

	private boolean copyFile(File from, File to) {

		int byteread = 0;
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(from);
			out = new FileOutputStream(to);
			byte[] buffer = new byte[1024];

			while ((byteread = in.read(buffer)) != -1) {
				out.write(buffer, 0, byteread);
			}
			return true;
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		} finally {
			try {
				if (out != null)
					out.close();
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
