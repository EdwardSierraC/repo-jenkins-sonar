package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/scenarios.feature"},
        tags = "@Login",
        glue = "stepdefinitions",
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json"},
        snippets= CucumberOptions.SnippetType.CAMELCASE)
public class MyRunner { }
