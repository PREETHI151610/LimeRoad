package com.Runner;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.Base.Base_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Preethi Venkatesan\\eclipse-workspace\\LimeRoad\\src\\test\\java\\com\\Feature\\lime.feature" ,
glue = "com.step", 
monochrome = true,
dryRun = false,
strict = true
,

//tags = "@smokeTest",
plugin = { "pretty",                 		 "json:Resources/lime.json",
		"html:Res/limeroad.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
		)
public class Test_Runner extends Base_class {

	@BeforeClass
	public static void browserLauncher()
	{
		launchBrowser("chrome");
	}

}


