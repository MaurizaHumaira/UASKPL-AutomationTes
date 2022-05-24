package AppiumTest;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class testCase1 extends base {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.findElementByXPath("//android.widget.EditText[@text='Email']").sendKeys("mauri@gmail.com");
		driver.findElementByXPath("//android.widget.Button[@text='MASUK']").click();
	}
}
