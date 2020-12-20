import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		
		AndroidDriver<WebElement> driver;
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Appium");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 8 Pro");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10 QP1A.190711.020");
		caps.setCapability(MobileCapabilityType.UDID, "8ddeh6ijzpusuorg");

		caps.setCapability("appPackage", "com.miui.calculator");
		caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	    driver = new AndroidDriver<WebElement>(url, caps);
		Thread.sleep(5000);
		
		WebElement Eight = driver.findElement(By.id("com.miui.calculator:id/btn_8_s"));
		Eight.click();
//		WebElement Plus = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
//		Plus.click();
		WebElement Mul = driver.findElement(By.id("com.miui.calculator:id/btn_mul_s"));
		Mul.click();
		WebElement Three = driver.findElement(By.id("com.miui.calculator:id/btn_3_s"));
		Three.click();
		WebElement Equals = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")); 
		Equals.click();
		String result = driver.findElement(By.className("android.widget.TextView")).getText();	
		//String result = driver.findElement(By.id("com.miui.calculator:id/result")).getText();	
		
//		if(result.equals("24"))  
//		{
//			System.out.println("Test is passed");
//		}
//		else 
//		{
//			System.out.println("Test Failed");
//		}
		Thread.sleep(5000);
		driver.quit();
	}
	}

