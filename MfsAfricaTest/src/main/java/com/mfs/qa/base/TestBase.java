package com.mfs.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\DELL\\eclipse-workspace\\MfsAfricaTest\\src\\main\\java\\com\\mfs\\qa\\config\\config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.silentOutput", "true");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\MfsAfricaTest\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		
		//else if(browserName.equalsIgnoreCase("FF")) {
			
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\Test.Discovery\\Drivers\\geckodriver.exe");
			//driver = new FirefoxDriver();
						
	//	}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		
		
		driver.get(prop.getProperty("url"));
		
			

	}

}
