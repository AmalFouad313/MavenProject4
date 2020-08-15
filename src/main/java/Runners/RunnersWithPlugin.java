package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },

        tags = {"@SmokeTest"},
        features = {"src/test/java/Featurefile"},
        glue = {"StepDefinition"},
        dryRun = false

)


public class RunnersWithPlugin extends AbstractTestNGCucumberTests {

}

