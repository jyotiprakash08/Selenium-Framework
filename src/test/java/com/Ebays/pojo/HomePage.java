package com.Ebays.pojo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Ebays.base.BaseTest;
import com.Ebays.steps.Scenario1stSteps;

public class HomePage {

	private WebDriver driver;
    private By submitButton=By.id("gh-btn");
	private By Categories=By.id("gh-cat");
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement categories() {
	return driver.findElement(Categories);
  }
	
	public WebElement submit() {
		return driver.findElement(submitButton);
	}
	
	
	
	
	
	
}