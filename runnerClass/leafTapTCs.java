package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Extend TestNG class to implement TestNG runner class
//This will support (@Given,@when) annotations at backend


//To connect runner class with Cucumber file and use TestNG as runner 
@CucumberOptions(features = {"src/test/resources/FeatureFiles/login.feature"} , glue = {"stepDefinitions"} , dryRun = false)
//feature represent feature file path
//glue will link step definition to runner file 
//dryRun as true will make sure all lines in feature file is having step definition. when run, this will not execute the test cases
//dryRun as false will enable test run


public class leafTapTCs extends AbstractTestNGCucumberTests{

	
}
