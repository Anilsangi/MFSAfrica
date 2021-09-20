package com.mfs.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mfs.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath="//input[@id='email']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement Password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement Login;
	
	@FindBy(xpath = "//a[@class='home']")
	WebElement LandingPage;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage Login(String un,String pw) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("login")).click();

		Username.sendKeys(un);
		Password.sendKeys(pw);
		Login.click();
		LandingPage.click();
		return new HomePage();
	}

}
