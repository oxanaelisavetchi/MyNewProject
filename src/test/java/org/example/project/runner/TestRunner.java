package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.example.project.ui.steps", "org.example.project.hooks"},
        // plugin = {"pretty", "html:target/HtmlReports"},
        // plugin = {"pretty", "json:target/JSONReports/report.json"}
        //plugin = {"pretty", "junit:target/JUnitReports/report.xml"}
        tags = "@ValidCredentials"

)
public class TestRunner {


}