package com.cgi.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src/test/resources/feature/" }
		, glue = { "com.cgi.steps" }
		//,publish = true
		,plugin = {"html:target/cucumber-report.html"}
//		,monochrome = true
//		,dryRun = true
		,tags = "@employee"
		)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
