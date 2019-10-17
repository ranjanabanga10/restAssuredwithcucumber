package Options;

//import java.io.File;

//import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions; 
import cucumber.api.junit.Cucumber; 



@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty"},
		glue = {"stepDefinationTest"},
		features="src/test/java/Features/getstatuscode.feature"
		
		)
public class TestRunnerfile {

}
