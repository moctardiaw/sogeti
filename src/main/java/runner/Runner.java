package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //dryRun = true,
        features = "src/test/resources/features",
        glue = {"steps"},
        tags={"@prod","@test"},
        plugin = {"pretty","html:target/cucumberreports","json:target/cucumber.json"}
)

public class Runner {



}
