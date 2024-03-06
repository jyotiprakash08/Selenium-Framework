package com.Ebays.steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ebays.base.BaseTest;
import com.Ebays.pojo.CellPhoneAccessories;
import com.Ebays.pojo.CellPhonesSmartphone;
import com.Ebays.pojo.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1stSteps extends BaseTest {

	HomePage hp;
	CellPhoneAccessories Cpa;
	CellPhonesSmartphone Cps;
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() {
		init();
		driver.manage().window().maximize();		
	}
	
	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String strArg) {
	driver.get(strArg);
	}
	
	@When("Navigate to search by {string}")
	public void navigate_to_search_by(String string) throws InterruptedException {
	   
		hp=new HomePage(driver);
		hp.categories().click();
		
		Select drpFilter=new Select(hp.categories());
		drpFilter.selectByVisibleText(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		hp.submit().click();		
	}
	
	@Then("Click on All Filters")
	public void click_on_all_filters() {
		
		Cpa=new CellPhoneAccessories(driver);
	    Cpa.CellPhonesSmartphone().click();
	    Cps=new CellPhonesSmartphone(driver);
	    Cps.filter().click();
	}
	
	@Then("Add filters as Condition, Price & Item Location")
	public void add_filters_as_condition_price_item_location() {
	   
		Cps.conditionButton().click();
		Cps.newCheckbox().click();
		Cps.priceButton().click();
		Cps.minimumValue().sendKeys("10");
		Cps.maximumValue().sendKeys("50");
		Cps.itemLocations().click();
		Cps.Default().click();
		
		System.out.println(Cps.filterText().getText());
		Assert.assertEquals(Cps.filterText().getText(), "US Only");
		
		System.out.println(Cps.filterItemLocation().getText());
		Assert.assertEquals(Cps.filterItemLocation().getText(), "New");
		
		System.out.println(Cps.filterPrice().getText());
		Assert.assertEquals(Cps.filterPrice().getText(), "$10 - $50");
			
	}
	
	@Then("Click on apply")
	public void click_on_apply() {
		Cps.ApplyButton().click();
	}
	
	
	
}
