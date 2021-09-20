package com.mfs.qa.pages;

import org.openqa.selenium.By;

import com.mfs.qa.base.TestBase;

public class ObjectClasses extends TestBase {
	//Faded Short Sleeve T-shirts
	String str= driver.findElement(By.className(".product-name")).getText();

}
