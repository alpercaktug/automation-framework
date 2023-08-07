package com.alpercaktug.automation.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Hooks {

    @Autowired
    private WebDriver webDriver;

    @Value("${app.url}")
    private String appUrl;

    @Before
    public void initializeTest(Scenario scenario){
        webDriver.navigate().to(appUrl);
    }

    @After
    public void tearDownTest(Scenario scenario){
        if (scenario.isFailed()){
            // Take Screenshot
            System.out.println(scenario.getName());
        }
        webDriver.quit();
    }
}
