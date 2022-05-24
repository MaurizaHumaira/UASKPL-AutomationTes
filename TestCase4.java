package AppiumTest;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase4 extends base {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Daftar']").click();
		
		driver.findElementByXPath("//android.widget.EditText[@text='Nama Lengkap']").sendKeys("Mauriza Humaira");
		driver.findElementByXPath("//android.widget.EditText[@text='Email']").sendKeys("mauri@gmail.com");
		driver.findElementByXPath("//android.widget.EditText[@text='Nomor HP']").sendKeys("08236054");
		driver.findElementByXPath("//android.widget.EditText[@text='Kata sandi']").sendKeys("bebetter");
		driver.findElementByXPath("//android.widget.EditText[@text='Konfirmasi kata sandi']").sendKeys("bebetter");
		driver.findElementByXPath("//android.widget.Button[@text='DAFTAR']").click();
	}
}
