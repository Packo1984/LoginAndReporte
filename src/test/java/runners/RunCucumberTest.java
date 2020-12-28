package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue={"steps"},
        features = {"src/test/resources/AltaCliente.feature"},
        //plugin = {"html:target/cucumber-html-report"}
        plugin= {"html:target/report/cucumber-report.html"}
        //plugin={"json:target/cucumber.json"}
        )

public class RunCucumberTest {
}
