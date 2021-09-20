package com.mfs.qa.pages;

import java.util.List;

import org.apache.poi.hssf.record.DConRefRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mfs.qa.base.TestBase;

public class SetLabel extends TestBase {
	
	@FindBy(xpath = "//select[@id='selectProductSort']")
	WebElement dropdownselect;

	public SetLabel() {
		PageFactory.initElements(driver, this);
	}

	public void SetLabelPrint() {
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600)");
		
		String strpathRows="//*[@id='center_column']/div";
		List<WebElement> listtotal=driver.findElements(By.xpath(strpathRows));
		
		//System.out.println("total no rows:"+ listtotal.size());
		
	
		
		//driver.get("http://automationpractice.com/index.php?id_category=10&controller=category");
		
		//Select dropdown = new Select(dropdownselect);
		
		//dropdown.selectByIndex(1);
		//System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
