package demo.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        strict = true,
        format = {"pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-json-report.json"}
)
public class CucumberDemoTest {}
