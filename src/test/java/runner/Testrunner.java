package runner;





import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Login.feature",glue={"stepdefinitions","Hooks"}
        ,publish = true
        ,plugin = {"pretty","html:target/CucumberReports/CucumberReport.html"})
public class Testrunner {
}
