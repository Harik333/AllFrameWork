package cucumberRunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\EclipseProject\\AllFrameWork\\features",
                 glue = "cucumberTest",
                 tags = "@APITest and @GUITest", //tags = "@APITest or @GUITest",
                 monochrome = true)

public class RunnerClass {

}
