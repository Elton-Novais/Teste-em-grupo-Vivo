package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Sempre IT\\IdeaProjects\\br.com.vivo-GrupoVivo\\src\\test\\java\\feature",
        glue = "stepsDefinidos",
        snippets = CucumberOptions.SnippetType.CAMELCASE, plugin = {"pretty"})

public class RunnerTest {
}
