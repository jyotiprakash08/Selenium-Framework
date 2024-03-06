package com.Ebays.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CellPhonesSmartphone {

	private WebDriver driver;
	private By allFilter=By.xpath("//button[contains(text(),'All Filters')]");
    private By condition=By.id("c3-mainPanel-condition");
	private By New=By.cssSelector("input[id='c3-subPanel-LH_ItemCondition_New_cbx']");
	private By price=By.id("c3-mainPanel-price");
	private By lowerLimit=By.cssSelector("input[aria-label*='Minimum Value']");
	private By upperLimit=By.cssSelector("input[aria-label*='Maximum Value']");
	private By itemLocation=By.id("c3-mainPanel-location");
	private By defaultRadioButton=By.cssSelector("input[aria-label='US Only']");
	private By apply=By.cssSelector("button[aria-label='Apply']");
	private By textLocation=By.cssSelector("span[data-aspecttype='location']");
	private By textPrice=By.cssSelector("span[data-aspecttype='price']");
	private By textCondition=By.cssSelector("span[data-aspecttype='LH_ItemCondition']");
	
	public CellPhonesSmartphone(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement filter() {
		return driver.findElement(allFilter);
	}
	
	public WebElement conditionButton() {
		return driver.findElement(condition);
	}
	
	public WebElement newCheckbox() {
		return driver.findElement(New);
	}
	
	public WebElement priceButton() {
		return driver.findElement(price);
	}
	
	public WebElement minimumValue() {
		return driver.findElement(lowerLimit);
	}
	
	public WebElement maximumValue() {
		return driver.findElement(upperLimit);
	}
	
	public WebElement itemLocations() {
		return driver.findElement(itemLocation);
	}
	
	public WebElement Default() {
		return driver.findElement(defaultRadioButton);
	}
	
	public WebElement ApplyButton() {
		return driver.findElement(apply);
	}
	
	public WebElement filterText() {
		return driver.findElement(textLocation);
	}
	
	public WebElement filterPrice() {
		return driver.findElement(textPrice);
	}
	
	public WebElement filterItemLocation() {
		return driver.findElement(textCondition);
	}
	
}
