package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.cucumberoptions;


@RunWith(cucumber.class)
@cucumberoptions(features = {"src\\test\\resources"} glue = {"com\\stepdefenition"},
   monochrome = true,dryRun=false,plugin = {"pretty"}


public class TestRunnerclass {

}
