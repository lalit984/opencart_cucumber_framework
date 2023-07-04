package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(

        //features= {".//Features//Login.feature"},
		//features= {".//Features/"},
        //features= {".//Features//LoginDDT.feature"},
        features= {".//Features//LoginDDTExcel.feature"},
        //featuress= {"@target/rerun.txt"},//Runs only Failures
        tags = "@sanity"	//Scenarios tagged with @sanity,
      )
public class TestRunner 
{

}
