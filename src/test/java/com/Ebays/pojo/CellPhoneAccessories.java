package com.Ebays.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CellPhoneAccessories {

private WebDriver driver;
private By link=By.linkText("Cell Phones & Smartphones");
	
	public CellPhoneAccessories(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement CellPhonesSmartphone() {
		return driver.findElement(link);
	}
	
}
