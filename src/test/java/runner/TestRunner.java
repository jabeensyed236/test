package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\workspace\\MyDemoProject1\\src\\test\\resources\\features\\Registration.feature",
        glue= {"steps"},
        plugin = {"json:target/cucumber.json"})


public class TestRunner {
}
