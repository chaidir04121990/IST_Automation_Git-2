import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber


@RunWith(Cucumber.class)
@CucumberOptions(features = "Track_Invoice_System_Correction", glue = "", tags="@tag3")

public class Runner {
}