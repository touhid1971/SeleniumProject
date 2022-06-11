package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features", 
glue = "steps",
plugin = {"html:reports"},
snippets = SnippetType.CAMELCASE)
public class RunerFile extends AbstractTestNGCucumberTests{
	


}
