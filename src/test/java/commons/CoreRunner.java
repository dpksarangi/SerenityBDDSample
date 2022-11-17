package commons;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefs"},
        tags = "@run",
        plugin = {"html:target/cucumber/reports"}

)
public class CoreRunner {
}
