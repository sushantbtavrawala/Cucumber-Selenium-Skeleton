package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/UatTask",
        glue = {"StepsDefination/UatTaskPage"},
        plugin = {"pretty","html:target/cucumber","json:target/cucumber/jsonReport.json","junit:target/cucumber/xmlReport.xml"},
      //  tags = {"@Edit-Roles-Permissions"},
        dryRun = false)

public class UATTestRun {

}