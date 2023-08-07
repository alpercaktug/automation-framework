package com.alpercaktug.automation.steps;

import com.alpercaktug.automation.models.TestUserDetails;
import com.alpercaktug.automation.models.UserDetails;
import com.alpercaktug.automation.pages.HomePage;
import com.alpercaktug.automation.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import javax.xml.crypto.Data;
import java.util.List;

public class LoginSteps {

    @Autowired
    public HomePage homePage;
    @Autowired
    public LoginPage loginPage;
    @Autowired
    private TestUserDetails testUserDetails;



    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        homePage.clickLogin();
        //Scenario Scope
        testUserDetails.setUserDetails(new UserDetails("admin", "password"));
    }


    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.submitLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        Assert.assertTrue(homePage.isEmployeeDetailsExist());
    }

    @Then("I should see the userform page wrongly")
    public void iShouldSeeTheUserformPageWrongly() {
    }
}
