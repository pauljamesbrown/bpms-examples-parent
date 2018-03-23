package cucumberJava;

import org.junit.runner.RunWith; 
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"}, features="src/test/java/cucumberJava/")

public class RunCucumberTest {

	public class runTest { }
}
