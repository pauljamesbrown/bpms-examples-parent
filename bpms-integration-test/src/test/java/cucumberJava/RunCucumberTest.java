package cucumberJava;

import org.junit.runner.RunWith; 
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}, features="src/test/java/cucumberJava/")

public class RunCucumberTest {

	public class runTest { }
}
