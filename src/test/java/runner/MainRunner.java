package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
    features = {"src/test/java/features"},
        glue = {"classpath:steps"},
        monochrome = true,
        plugin = {"pretty", "html:build/cucumber.html",
        "json:build/cucumber.json"}
)
public class MainRunner {
}
