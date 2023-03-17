package com.aqa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
                     glue = "com.aqa.steps",
                     tags = "@smoke")


public class RunnerTest extends AbstractTestNGCucumberTests {
}
