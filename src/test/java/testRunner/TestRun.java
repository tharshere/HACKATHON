package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Features/"},glue="stepDefinitions",tags="@smoke",
plugin= {"pretty", "html:reports/myreport.html", 
		  "rerun:target/rerun.txt",
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		
dryRun=false,    // checks mapping between scenario steps and step definition methods
monochrome=true,    // to avoid junk characters in output
publish=true   // to publish report in cucumber server

// To rerun the failed testcase--->@target/rerun.txt

//".//Features/TC_01.feature",".//Features/TC_02.feature",".//Features/TC_03.feature",".//Features/TC_04.feature",
//".//Features/TC_05.feature"

)

public class TestRun {
   
}

//https://github.com/tharshere/HACKATHON.git