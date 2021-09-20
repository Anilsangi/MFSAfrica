package com.mfs.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mfs.qa.base.TestBase;

public class ProductAddToCart extends TestBase {

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	WebElement image;
	@FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
	WebElement txtQuantity;
	@FindBy(xpath = "//*[@id=\"group_1\"]")
	WebElement selectSize;
	
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
	WebElement addToCart;

	public ProductAddToCart() {
		PageFactory.initElements(driver, this);
		
	}
	public void performMousehover(WebElement element,WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();;
		
	}
	public void clear(WebElement element)
	{
		element.clear();
	}
	public void setText(String text,WebElement element)
	{
		element.sendKeys(text);
	}
	public void selectByVisibleText(WebElement selectSize,String text) {
		Select s=new Select(selectSize);
		s.selectByVisibleText(text);
	}
	public void clickUsingJsScript(WebElement element,WebDriver driver) {
		JavascriptExecutor  js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click();", element);
	}

	public void CartAdd() {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-600)");
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement newele=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]"));
		List<WebElement> listele= newele.findElements(By.tagName("a"));
				
		for(WebElement menu:listele)
		{
			if(menu.getText().equals("Evening Dresses"))
			{
				menu.click();
				break;
			}
		}
	
	
		performMousehover(image, driver);
		WebElement morebutton=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]"));
		morebutton.click();
		clear(txtQuantity);
		setText("3",txtQuantity);
		selectByVisibleText(selectSize, "M");
		//colorCheck.getAttribute("checked");
		clickUsingJsScript(addToCart, driver);
		
			

	}

}
