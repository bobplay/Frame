package page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.peilei.framework.BaseCase;
import com.peilei.framework.WindowsWait;

public class UploadMusic {
	@FindBy(xpath="//*[@id=\"mp3\"]")
	public WebElement musicFile;
	public void musicCommit(){
		new WindowsWait().windowsWait(musicFile);
		musicFile.click();
		autoClick("C:\\Users\\zhangpeilei\\Desktop\\uploadMusic.exe");
	}
	public static void autoClick(String path){
		try {
			Runtime.getRuntime().exec(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
