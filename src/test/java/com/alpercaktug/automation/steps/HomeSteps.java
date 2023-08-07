package com.alpercaktug.automation.steps;

import com.alpercaktug.automation.models.TestUserDetails;
import com.alpercaktug.automation.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps {

    @Autowired
    public LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
        //var data = table.asList();
        //Use scenario scope
        loginPage.login(testUserDetails.getUserDetails().getUsername(), testUserDetails.getUserDetails().getPassword());
    }
}
