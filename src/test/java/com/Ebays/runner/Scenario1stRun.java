package com.Ebays.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features= {"src/test/resources/feature/1stScenario.feature"},
            glue={"com.Ebays.steps"})
	public class Scenario1stRun extends AbstractTestNGCucumberTests{


}
