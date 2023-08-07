package com.alpercaktug.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/com/alpercaktug/automation/features"},
        glue = "com.alpercaktug.automation.steps"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
