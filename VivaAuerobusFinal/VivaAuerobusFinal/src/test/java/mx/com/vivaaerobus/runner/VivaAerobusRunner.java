package mx.com.vivaaerobus.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/mx/com/vivaaerobus/feature/VivaAerobus.feature", 
                 glue="mx.com.vivaaerobus.stepsdefinitions",
                 snippets=SnippetType.CAMELCASE)

public class VivaAerobusRunner {

}
