package org.inmakestest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Firsttest {
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
 DesiredCapabilities cap = new DesiredCapabilities();
 cap.setCapability("platformName", "Android");
 cap.setCapability("platformVersion", "10");

 cap.setCapability("deviceName", "MiA2");

 cap.setCapability("udid", "890750d");

 cap.setCapability("appPackage", "com.google.android.calculator\r");

 cap.setCapability("appActivity", "com.android.calculator2.Calculator ");

URL url = new URL("http:// 0.0.0.0:4723/wd/hub");
 driver = new AndroidDriver(url,cap);

	}

}
