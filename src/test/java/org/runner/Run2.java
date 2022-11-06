package org.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Hp\\eclipse-workspace\\CucuFlip\\src\\test\\java\\org\\flip\\feature\\FlipKart.feature",glue="stepDefinition",dryRun=false,monochrome=true,
publish=true,tags="@TVandAppliance")

public class Run2 {

}
