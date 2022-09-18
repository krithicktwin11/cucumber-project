package com.flipsteps;

import javax.swing.text.html.HTML;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\krith\\workspace\\cum-pro\\src\\test\\resources\\Features",
                   glue ="com.flipsteps",
                   monochrome =true,
                     plugin ="html:target",
                     dryRun =false,
                     tags="@mobile")
public class TestRunner {

}
